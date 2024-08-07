import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
  kotlin("jvm") version "2.0.10"
  id("org.jetbrains.dokka") version "1.9.20"
  id("com.vanniktech.maven.publish") version "0.28.0"
}

group = "best.skn"
version = "1.0.0"

repositories {
  mavenCentral()
}

dependencies {
  implementation("best.skn:skn-kotlin-color:1.0.1")
  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()
}

kotlin {
  jvmToolchain(21)
}

fun dokkaMd(): Array<String> {
  val path: String = "./.dokka"

  val fileNames: Array<String> = arrayOf("module", "utils_message")

  fileNames.forEachIndexed { index, element ->
    val extension: String = if (index == 0) ".md" else ".package.md"

    fileNames[index] = "$path/$element$extension"
  }

  return fileNames
}

tasks.withType<DokkaTask>().configureEach {
  dokkaSourceSets {
    named("main") {
      includes.from(*dokkaMd())
    }
  }
}

mavenPublishing {
  coordinates(
    groupId = "$group",
    artifactId = project.name,
    version = "$version",
  )

  pom {
    name = "SKN Kotlin Message"
    description = "A Simple Message Library For Kotlin"
    inceptionYear = "2024"

    url = "https://github.com/skn437/skn-kotlin-message"

    properties =
      mapOf(
        "java.version" to "21",
        "kotlin.version" to "1.9.24",
      )

    licenses {
      license {
        name = "The Apache License, Version 2.0"
        url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
      }
    }

    developers {
      developer {
        id = "skn437"
        name = "SKN Shukhan"
        email = "skn437physx@gmail.com"
        organization = "best.skn"
        organizationUrl = "https://www.skn.best"
      }
    }

    scm {
      connection = "scm:git:git://github.com/skn437/skn-kotlin-message.git"
      developerConnection = "scm:git:ssh://github.com:skn437/skn-kotlin-message.git"
      url = "http://github.com/skn437/skn-kotlin-message/tree/master"
    }
  }

  publishToMavenCentral(
    SonatypeHost.CENTRAL_PORTAL,
  )

  signAllPublications()
}
