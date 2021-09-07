# Fashionette Project

** Version 1.0.0**

## Framework

Maven project

## Automation tools

Cucumber - JUnit

## Installation - Setting Up Selenium - cucumber - Java

- Install Java and seth path
- Install Maven and seth path
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
       - Github dependency
       - Cucumber Java dependency
       - Cucumber JUnit dependency
       
  -  Refresh Maven
  -  Set up VCS of the project to Github
  
  ## Framework Design
  
  Under test/java folder create .com package and create Resources Directory : this is where feature files are located. Inside feature files write scenarios.
  
  Under .com package we create Cucumber structure packages as follows:
  
  - Create Pages package: 
  - Create Runners package:
  - Create Step Definitions package:
  - Create Utilities package: 
 
  - Create configuration properties: 

## Running Steps

- Use tags inside CukesRunner class to run specific scenarios



