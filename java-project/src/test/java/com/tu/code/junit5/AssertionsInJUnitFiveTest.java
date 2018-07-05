// { autofold
package com.tu.code.junit5;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
//}
class AssertionsInJUnitFiveTest {
	
	@Test
	public void test() throws FileNotFoundException {
		try {
			success(true);
		} catch (AssertionError ae) {
			// { autofold
			success(false);
			msg("Oops! 🐞", ae.getMessage());
			//}
		}
	}
	// { autofold
	private static void success(boolean success) {
		if(success)
		msg("👍" ," Awesome");
		System.out.println(String.format("TECHIO> success %s", success));
		System.out.println("TECHIO> terminal");
		
		
	}
	private static void msg(String channel, String msg) {
		System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
	}
	//}

}
