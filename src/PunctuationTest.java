import static org.junit.Assert.*;

import org.junit.Test;

public class PunctuationTest {

	@Test
	public void test() {
		
		String[] punctuations = {";", ",", ".", ":", "\"", "...", "!", "?", "(", ")", "[", "]", "-", "'",
				"{", "}", "/"}; 
		for(String punctuation : punctuations) {
			checkPalindrome test = new checkPalindrome("ab" + punctuation + "ba");
			boolean result = test.isPalindrome();
			assertEquals(false, result);
		}
	}

}
