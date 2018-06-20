// { autofold
package com.tu.code.junit5;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
//}
class AssestionsInJUnitFiveTest {
	
	@Test
	public void test() throws FileNotFoundException {
		try {
			assertEquals("text", "text","failure - strings are not equal");
			success(true);
		} catch (AssertionError ae) {
			// { autofold
			success(false);
			//}
		}
	}
	// { autofold
	private static void success(boolean success) {
		System.out.println(String.format("TECHIO> success %s", success));
	}
	private static void msg(String channel, String msg) {
		System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
	}
	// { autofold

}
