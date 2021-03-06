
public class checkPalindrome {
	
	private String string;
	
	/*
	 * constructor
	 */
	checkPalindrome() {
		this.string = null;
	}
	checkPalindrome(String string) {
		this.string = string;
	}
	
	public boolean isPalindrome() {
		if(string == null)
			return false;
		
		string = string.trim().replaceAll("\\s", "");
		int i = 0, j = string.length() - 1;
		
		while(i < j) {
			
			//Punctuation marks NOT acceptable
			if(!Character.isLetterOrDigit(string.charAt(i)) || !Character.isLetterOrDigit(string.charAt(j)))
				return false;
			
			//Capitalization IS acceptable
			if(Character.isLetter(string.charAt(i)) && Character.isLetter(string.charAt(j)) 
					&& Math.abs(string.charAt(i) - string.charAt(j)) == 32) {
				i++;
				j--;
				continue;
			}
			else if(string.charAt(i) != string.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		if(string.length() == 0 || string == null)				return true;
		if(!Character.isLetterOrDigit(string.charAt(i)))		return false;
		return true;
	}
}
