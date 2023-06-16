# Spotify Automation Project
This is simple automation project. It is support  Web UI testing.

## Supported browser
    Google Chrome

## Stack of technologies
1. Java13
2. Selenium
3. Selenide
4. Junit5
5. Serenity
6. Page Object design pattern
7. Jenkins CI
8. Allure report

## Running test and generating reports
1. Execute mvn clean test command to execute test cases
2. Execute mvn allure:serve to generate allure report
3. If you want to run specific TC you can include them in rerun_suite.xml and add needed test classes and then execute: <br /> 
mvn clean test -X -DsuiteFile=rerun_suite.xml -DsuiteThreadPoolSize=1 