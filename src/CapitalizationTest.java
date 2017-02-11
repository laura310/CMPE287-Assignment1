import static org.junit.Assert.*;

import org.junit.Test;

public class CapitalizationTest {

	@Test
	public void test() {
		checkPalindrome test1 = new checkPalindrome("aToyota");
		boolean result1 = test1.isPalindrome();
		assertEquals(true, result1);
	}

}
