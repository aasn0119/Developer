# Gradle Project Setup Guide

This guide will walk you through setting up a basic Gradle project using the command line interface (CLI). Follow these steps to create, build, and run a Java application with Gradle.

## Step 1: Initialize the Gradle Project

First, you need to initialize a new Gradle project. Open your terminal and run the following command:

```shell
gradle init --type java-application --dsl groovy --test-framework junit --project-name my-gradle-project
```

## Step 2: Build the Project

To compile your project and ensure everything is set up correctly, run:

```shell
./gradlew build
```

This command compiles your Java application and prepares it for execution.

## Step 3: Configure the Executable Jar

Before you can run your application, you need to specify the main class that Java will execute. Open the `build.gradle` file and add the following configuration:

```groovy
jar {
    manifest {
        attributes(
            'Main-Class': 'org.example.Main'
        )
    }
}
```

Replace `'org.example.Main'` with the fully qualified name of your main class.

## Step 4: Build the Jar File

With the main class specified, you can now create an executable jar file by running:

```shell
./gradlew jar
```

This command packages your application into a jar file located in the `build/libs` directory.

## Step 5: Run Your Application

Finally, to run your application, execute the jar file with the following command:

```shell
java -jar build/libs/my-gradle-project.jar
```

Replace `my-gradle-project.jar` with the actual name of your jar file.

Congratulations! You have successfully set up and run a basic Gradle project.
