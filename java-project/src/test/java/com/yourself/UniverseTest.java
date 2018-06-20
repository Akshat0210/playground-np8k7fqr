// { autofold
 

package com.yourself;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


// }
public class UniverseTest {

	@Test
	public void test() throws FileNotFoundException {
		try {
			assertEquals("text", "text","failure - strings are not equal");
			
		} catch (AssertionError ae) {
			// { autofold

			success(false);
			msg("Oops! 🐞", ae.getMessage());
			msg("Hint 💡", "Did you properly accumulate all stars into 'totalStars'? 🤔");
			//}
		}
	}

	private static void success(boolean success) {
		System.out.println(String.format("TECHIO> success %s", success));
	}
	private static void msg(String channel, String msg) {
		System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
	}

}
