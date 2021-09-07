# Fashionette Project

** Version 1.0.0**

## Build tool

Maven project

## Automation tools

Cucumber - JUnit 

## Installation 

- Install Java and set path
- Install Maven and set path
- Install Cucumber plugins:
  - Open IntelliJ IDEA
  - Go to preferences and click Plugins
  - Click Marketplace 
  - Search "Gherkin" plugin and install it
  - Search "Cucumber for Java" plugin and install it
  - If is needed restart IDE
  
## Project Creation
  
  - Inside IntelliJ IDEA click on File/New/Project
  - Choose Maven project
  - Inside Project SDK choose Java ( in this case version 1.8) and click Next
  - Write the project name, choose location and fill the Artifact Coordinates 
  
  
## POM implementation
 
  - Add properties inside POM.xml :
  
              <properties>
                    <maven.compiler.source>1.8</maven.compiler.source>
                    <maven.compiler.target>1.8</maven.compiler.target>
                </properties>
                
  -  Add dependencies to POM.xml :
  
       - Selenium dependency
       
                       <dependency>
                          <groupId>org.seleniumhq.selenium</groupId>
                          <artifactId>selenium-java</artifactId>
                          <version>3.141.59</version>
                      </dependency>   
                      
       - Github dependency
       
                        <dependency>
                            <groupId>io.github.bonigarcia</groupId>
                            <artifactId>webdrivermanager</artifactId>
                            <version>3.8.0</version>
                        </dependency>
                        
       - Cucumber Java dependency
       
                <dependency>
                          <groupId>io.cucumber</groupId>
                          <artifactId>cucumber-java</artifactId>
                          <version>4.8.1</version>
                      </dependency>
     
       - Cucumber JUnit dependency

                 <dependency>
                          <groupId>io.cucumber</groupId>
                          <artifactId>cucumber-junit</artifactId>
                          <version>4.8.1</version>
                          <scope>test</scope>
                      </dependency>

      
  -  Refresh Maven
  -  Set up VCS of the project to Github
  
## Framework Design
  
  Under test/java folder create .com package and create Resources Directory : this is where feature files are located. Inside feature files write scenarios using Gherkin language.
  
  Under .com package we create Cucumber structure packages as follows:
  
  - ## Pages package: It has been used Page Object Model as a design pattern for creating an Object Repository for web UI elements. Each web page in the application is required to       have it’s own corresponding page class. The page class is thus responsible for finding the WebElements in that page and then perform operations with these WebElements.
  - ## Runners package: Inside we create CukesRunner class and FailedTestRunner. Inside CukesRunner is where we run all of the tests with JUnit. This class includes                       @CucumberOptions which includes plugin, tags, features, glue, etc. The purpose of FailedTestRunner is rerun the failed tests only.
  - Step Definitions package:is where we write the codes and implement automation for the scenarios in the feature files. Inside this package, also create Hooks class which           are blocks of code that run before and after each scenario (test case) and implement screenshots for the failing tests.
  - Utilities package: is where we create Driver, Configuration Reader and BrowserUtils.
 
  - Configuration properties: is where we include url, browser, username and password.

## Running Steps

1. Create a feature file and write scenarios
2. Use tags inside CukesRunner class to run specific scenarios
3. Generate Step definitions and write test cases and codes in there
4. Configure Cukes Runner:
        a. @RunWith(Cucumber.class)
        b. glue
        c. features
        d. Tags
5. Run as JUnit

## Maven-Cucumber-Reporting

1. Add the json option in my CukesRunners
2. Add the maven-cucumber-reporting to the pom file.
3. In the configuration of the maven-cucumber-reporting plugin, point to the json from step 1. This will specify the location of the report.
                <configuration>
                < projectName> Cucumber HTML Reports</projectName>
                < outputDirectory> ${project.build.directory}</outputDirectory>
4. Run as maven command mvn verify to execute the tests and generate reports.



