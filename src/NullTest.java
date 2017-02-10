import static org.junit.Assert.*;

import org.junit.Test;

public class NullTest {

	@Test
	public void test() {
		checkPalindrome test1 = new checkPalindrome();
		boolean result1 = test1.isPalindrome();
		assertFalse(result1);
	}
}
