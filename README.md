<!--
  Title: Keyword Driven Selenium Automation Framework
  Description: A Keyword Driven Selenium Automation Framework
  Author: Prashant Sajjan
  -->
# Bug Hunt Automation Framework (Keyword Driven Framework)

Bug Hunt Framework is a Java based keyword driven framework. It supports below features:
* Selenium Automation
* Multi Thread Execution
* Multi Browser Execution 
* Multi Device Execution
* Reporting with Screenshots for PASS/FAIL steps
* Sauce Lab video integration
* Failed Test Execution
* Rerun failed test
* Data Driven Testing
* Support for any Java based tool
## Installation
From your repositories folder on your local machine:

  - git clone https://github.com/prashant-sajjan/bug-hunt.git
  - If using selenium add drivers for chrome, IE and Firefox in src\main\resources\Drivers
  - import bug-hunt project as maven project in any JAVA IDE of your choice

## Running the tests
- Select tests to be executed in TestManager.xls
- Running through IDE - Open BugHuntRunner.java and run as Java application
- Command Line - Run below commands
  * mvn clean (First time only)
  * mvn compile exec:java -Dexec.mainClass="com.bughunt.runner.BugHuntRunner"

## Automating Tests
- Follow steps in [User_Guide.doc](https://github.com/prashant-sajjan/bug-hunt/blob/master/User_Guide.docx)



