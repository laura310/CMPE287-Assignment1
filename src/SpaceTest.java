import static org.junit.Assert.*;

import org.junit.Test;

public class SpaceTest {

	@Test
	public void test() {
		checkPalindrome test1 = new checkPalindrome("ab3 ba  ");
		boolean result1 = test1.isPalindrome();
		assertEquals(true, result1);
	}

}
