#ARYAN JAWLA E21CSEU0221
package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTestFunctions junitstring = new jUnitTestFunctions();
		String result = junitstring.testaddStrings("capstone","project");
		assertEquals("capstoneproject",result);
	}

}
