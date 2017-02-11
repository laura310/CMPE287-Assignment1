import static org.junit.Assert.*;

import org.junit.Test;

public class PunctuationTest {

	@Test
	public void test() {
		
		//This test is for further testing.
		checkPalindrome test0 = new checkPalindrome("abba");
		boolean result0 = test0.isPalindrome();
		assertTrue(result0);
		
		String[] punctuations = {";", ",", ".", ":", "\"", "...", "!", "?", "(", ")", "[", "]", "-", "'",
				"{", "}", "/"}; 
		for(String punctuation : punctuations) {
			checkPalindrome test = new checkPalindrome("ab" + punctuation + "ba");
			boolean result = test.isPalindrome();
			assertEquals(false, result);
		}
	}
}
