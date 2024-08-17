# SKN Kotlin Message Library

<img width="150px" src="https://firebasestorage.googleapis.com/v0/b/skn-ultimate-project-la437.appspot.com/o/GitHub%20Library%2F11-Kotlin-SKM.svg?alt=media&token=5e39668e-b018-412c-aae0-df543b7f95fb" alt="kotlin" />

> Kotlin

[![Maven Central](https://img.shields.io/maven-central/v/best.skn/skn-kotlin-message)](https://central.sonatype.com/artifact/best.skn/skn-kotlin-message) [![Kdoc](https://javadoc.io/badge2/best.skn/skn-kotlin-message/1.0.0/javadoc.svg)](https://javadoc.io/doc/best.skn/skn-kotlin-message/1.0.0) [![Apache License 2.0](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

&nbsp;

## **_KDocs:_**

### Read the Kdoc: [utils.message](https://javadoc.io/doc/best.skn/skn-kotlin-message/latest/skn-kotlin-message/utils.message/index.html)

&nbsp;

## **_Introduction:_**

### This is a simple Kotlin Library for notification message on console & server response

### I made this library so that I can use it in all of my java/kotlin projects without writing the same codes over and over again

### The main package of this library holds an object `Message` that has 6 methods for notification messages

&nbsp;

## **_Details:_**

### **`utils.message` package:**

- It has 1 object called `Message`
- `Message` object has 6 methods:
  - Error message on console
  - Error message as server response
  - Success message on console
  - Success message as server response
  - Info message on console
  - Info message as server response

&nbsp;

## **_Use Case:_**

- Java/Kotlin
- Spring Boot

&nbsp;

## **_Requirements:_**

- 💀 Minimum JDK Version: `21`
- 💀 Minimum Kotlin Version: `1.9.4`

&nbsp;

## **_Usage:_**

### For `Maven`, inside `dependencies` tag of `pom.xml`, copy the following

> ```xml
> <dependency>
>  <groupId>best.skn</groupId>
>  <artifactId>skn-kotlin-message</artifactId>
>  <version>1.0.0</version>
> </dependency>
> ```

### For `Gradle`, inside `dependencies` of `build.gradle.kts`, copy the following

> ```kotlin
> implementation("best.skn:skn-kotlin-message:1.0.0")
> ```

### Inside your Kotlin Code, import the package like this

> ```kotlin
> import best.skn.utils.message.Message
> ```

### You can use this library like this

> ```kotlin
> println(Message.errorServer("Failed to send mail!"))
>
> println(Message.successServer("Mail sent successfully!"))
>
> println(Message.infoServer("The current process can be stopped as its only purpose was to initiate the service"))
> ```

&nbsp;

## **_Dedicated To:_**

- 👩‍⚕️`Tanjila Hasan Trina`: The long lost love of my life. The course of nature separated us from our paths and put us in separate places far away from each other. But no matter how separated we are right now, each and every moment of mine is only dedicated to you. We may not see each other in this lifetime as it seems but I will find you again in the next life. I just one to say: `世界は残酷だ それでも君を愛すよ`
- 💯`My Parents`: The greatest treasures of my life ever.

&nbsp;

## **_License:_**

Copyright (C) 2024 SKN Shukhan

Licensed under the Apache License, Version 2.0
