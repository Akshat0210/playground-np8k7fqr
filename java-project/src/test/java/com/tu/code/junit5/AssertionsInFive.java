package com.tu.code.junit5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;


public class AssertionsInFive {

	  @Test
	  public void testAssertArrayEquals() {
	    byte[] expected = "trial".getBytes();
	    byte[] actual = "trial".getBytes();
	    assertArrayEquals( expected, actual,"failure - byte arrays not same");
	  }

	  @Test
	  public void testAssertEquals() {
	    assertEquals("text", "text","failure - strings are not equal");
	  }

	  @Test
	  public void testAssertFalse() {
	    assertFalse(false,"failure - should be false");
	  }

	  @Test
	  public void testAssertNotNull() {
	    assertNotNull(new Object(),"should not be null");
	  }

	  @Test
	  public void testAssertNotSame() {
	    assertNotSame( new Object(), new Object(),"should not be same Object");
	  }

	  @Test
	  public void testAssertNull() {
	    assertNull( null,"should be null");
	  }

	  @Test
	  public void testAssertSame() {
	    Integer aNumber = Integer.valueOf(768);
	    assertSame(aNumber, aNumber,"should be same");
	  }
}
