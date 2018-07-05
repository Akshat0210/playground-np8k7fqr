# Welcome!
This playground lets you get started quickly with a simple working example using Maven and JUnit5. 
# Hands-on Exercise 
+ Write an assertion to compare two String are equal.
+ Write an assertion to check null.
+ Write an assertion to check equality of two byte array.

@[Assertions in JUnit5 ]({"stubs": ["src/test/java/com/tu/code/junit5/AssertionsInJUnitFiveTest.java"], "command": "mvn test -Dtest=com.tu.code.junit5.AssertionsInJUnitFiveTest"})

# HamCrest API Matchers
+ Write a HamCrest Matcher to check Map has key “John”
+ Write a HamCrest Matcher to check Map has entry “John ,  J”

@[Using HamCrest in JUnit5 ]({"stubs": ["src/test/java/com/tu/code/junit5/HamcrestMatchersTest.java"], "command": "mvn test -Dtest=com.tu.code.junit5.HamcrestMatchersTest"})

# Mockito in JUnit 5
+ Write Mockito Based test case for Messenger class

@[Mockito in JUnit5 ]({"stubs": ["src/test/java/com/tu/code/junit5/MessengerTest.java", "src/main/java/com/tu/code/junit5/Messenger.java", "src/main/java/com/tu/code/junit5/MailServer.java", "src/main/java/com/tu/code/junit5/Client.java", "src/main/java/com/tu/code/junit5/Template.java", "src/main/java/com/tu/code/junit5/TemplateEngine.java"], "command": "mvn test -Dtest=com.tu.code.junit5.MessengerTest"})


