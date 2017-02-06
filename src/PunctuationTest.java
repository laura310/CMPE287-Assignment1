import static org.junit.Assert.*;

import org.junit.Test;

public class PunctuationTest {

	@Test
	public void test() {
		checkPalindrome test1 = new checkPalindrome("ab,ba");
		boolean result1 = test1.isPalindrome();
		assertEquals(false, result1);
	}

}
