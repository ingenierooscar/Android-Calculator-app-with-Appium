# Twilio test Appium Android

Tools

     IDE: Intellij
     Emulator: AVD manager on android studio
     Automation tool: Appium, Testng, Java
     Dependencies: Maven
     browserstack Cloud
     
     
Setup

     On win
     Install Intellij
     Install Android studio
     Install Appium
     Install Java 
     Create Environment Variables path java and Android ADV
     Android Emulator
     
     
Run project
     
     Local:
     Open android emulator using AVD on android studio with this "Nexus S API 2", ver android 9.0
     Open appium with number of server 0.0.0.0 and port 4723
     Open Intellij/Eclipse
     Clone repository
     Run TestNG of file /src/test/java/src_Appium/twilioTest.java
     
     On browserstack Cloud:
     Clone repository https://github.com/ingenierooscar/Twilio-Test
     Run TestNG of file /src/test/java/src_Appium/TwillioTestOncloud.java
     
     
  Suggestions of improvements to the project structure
  
      Add design pattern Page object model, Page object Factory
      Add BDD Gherkin using a tool like Cucumber
      Configurate to run parallel execution of test cases
      Run test cases on Android and IOS on paralel
      Add CI Feature Github Action, Jenkis, Azure to maintenance automation framework
      Integrate framework to execute real devices or emulators on cloud (Experitest, browserstack...) with CI
      Add reports of executions
      
 
Video link Run local
     https://1drv.ms/v/s!Ap2u4mvCZvk0zxRS7xK4TWKlmMe2?e=qnEOVU

Video link Run browserstack invitation to join the project or please share your email
https://accounts.browserstack.com/jointeam/bbfd635bbe95aced73d5c71de1e305db
         

