import static org.junit.Assert.*;

import org.junit.Test;

public class NumberTest {

	@Test
	public void test() {
		checkPalindrome test1 = new checkPalindrome("12321");
		boolean result1 = test1.isPalindrome();
		assertEquals(true, result1);
		
		checkPalindrome test2 = new checkPalindrome("12345");
		boolean result2 = test2.isPalindrome();
		assertEquals(false, result2);
		
		checkPalindrome test3 = new checkPalindrome("ab3443ba");
		boolean result3 = test3.isPalindrome();
		assertEquals(true, result3);
	}

}
