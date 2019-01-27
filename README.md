<!--
  Title: Keyword Driven Automation Framework
  Description: A Keyword Driven Automation Framework with support for parallel execution and multi browser/device execution
  Author: Prashant Sajjan
  -->
# Bug Hunt Automation Framework (Keyword Driven Framework)

Bug Hunt Framework is a Java based keyword driven framework which supports any Java based automation tool.
It supports executing test cases in parallel, running test cases on multiple browsers/ devices.

## Installation
From your repositories folder on your local machine:

  - git clone https://github.com/prashant-sajjan/bug-hunt.git
  - If using selenium add drivers for chrome, IE and Firefox in src\main\resources\Drivers
  - import bug-hunt project as maven project in any JAVA IDE of your choice

## Running the tests
- Select tests to be executed in TestManager.xls
- Running through IDE - Open BugHuntRunner.java and run as Java application
- Command Line - mvn clean compile exec:java -Dexec.mainClass="com.bughunt.runner.BugHuntRunner"

## Automating Tests
- Follow steps in [User_Guide.doc](../master/User_Guide.docx)



