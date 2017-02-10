import static org.junit.Assert.*;

import org.junit.Test;

public class SpaceTest {

	@Test
	public void test() {
		checkPalindrome test1 = new checkPalindrome("  ");
		boolean result1 = test1.isPalindrome();
		assertEquals(true, result1);
		
		checkPalindrome test2 = new checkPalindrome("ab3ba  ");
		boolean result2 = test2.isPalindrome();
		assertEquals(true, result2);
		
		checkPalindrome test3 = new checkPalindrome("  ab3ba");
		boolean result3 = test3.isPalindrome();
		assertEquals(true, result3);
		
		checkPalindrome test4 = new checkPalindrome("  ab3  ba  ");
		boolean result4 = test4.isPalindrome();
		assertEquals(true, result4);
	}

}
