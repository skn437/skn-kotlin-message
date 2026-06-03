# SKN Kotlin Message Library

<img width="150px" src="./public/letter-open.svg" alt="kotlin" />

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

- 👩‍🎨`Logno` & 🧛‍♀️`Atoshi`: The two most special ladies of my life. My best wishes will always be with you two.
- 💯`My Parents`: The greatest treasures of my life ever.
- 👩`Trina`: The lady who resides deep inside my heart. Our paths got separated, perhaps it was fate and I accepted it. But you are always in each and every moments of my life. May you be healthy and happy always.

&nbsp;

## **_License:_**

Copyright (C) 2024 SKN Shukhan

Licensed under the Apache License, Version 2.0
