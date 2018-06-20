// { autofold
package com.tu.code.junit5;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasEntry;
// }

class HamcrestMatchersTest {

    private Map<String, String> map;
    
	 @BeforeEach
     void createAndInitializeMap() {
         map = new HashMap<>();
         map.put("John", "J");
     }
     
     @Test
     @DisplayName("Should contain the correct key")
     void shouldContainCorrectKey() {
         assertThat(map, hasKey("John"));
     }
     
     @Test
     @DisplayName("Should contain the correct value")
     void shouldContainCorrectValue() {
         assertThat(map, hasEntry("John", "J"));
     }
}
