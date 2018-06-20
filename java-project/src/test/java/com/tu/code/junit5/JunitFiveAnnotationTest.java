package com.tu.code.junit5;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;


@DisplayName("A special test case")
public class JunitFiveAnnotationTest {

	@Test
	@DisplayName("Custom test name containing spaces")
	void testWithDisplayNameContainingSpaces() {
	}

	@Test
	@DisplayName("╯°□°）╯")
	void testWithDisplayNameContainingSpecialCharacters() {
	}

	@Test
    @Disabled("for demonstration purposes")
	void testWithDisplayNameContainingEmoji() {
		
	}
	
	@Test
    void groupedAssertions() {
        assertAll("person",
            () -> assertEquals("John","FirstName"),
            () -> assertEquals("Doe", "LastName")
        );
    }
	@Test
    void exceptionTesting() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("a message");
        });
        assertEquals("a message", exception.getMessage());
    }
	

	@Test
	@EnabledOnOs({ OS.LINUX, OS.MAC })
	void onLinuxOrMac() {
	    // ...
	}

	@Test
	@DisabledOnOs(OS.WINDOWS)
	void notOnWindows() {
	    // ...
	}
	@Test
	@EnabledOnJre(JRE.JAVA_9)
	void onlyOnJava8() {
	    // ...
	}

	@Test
	@EnabledOnJre({ JRE.JAVA_9, JRE.JAVA_11 })
	void onJava9Or10() {
	    // ...
	}

	@Test
	@DisabledOnJre(JRE.JAVA_9)
	void notOnJava9() {
	    // ...
	}

	@Test
	@EnabledIfEnvironmentVariable(named = "ENV", matches = "staging-server")
	void onlyOnStagingServer() {
	    // ...
	}

	@Test
	@DisabledIfEnvironmentVariable(named = "ENV", matches = ".*development.*")
	void notOnDeveloperWorkstation() {
	    // ...
	}
	@Test
	@EnabledIf("'CI' == systemEnvironment.get('ENV')")
	void onlyOnCiServer() {
	}

}
