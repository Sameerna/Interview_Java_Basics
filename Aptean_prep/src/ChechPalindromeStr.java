
public class ChechPalindromeStr {

	public static void main(String[] args) {
		
		checkStrPalindrome("dad");
		checkStrPalindrome("abababc");
		}
	private static void checkStrPalindrome(String inp) {
		boolean result = true;
		int len = inp.length();
		for(int i = 0; i< len/2;i++) {
			if(inp.charAt(i)!= inp.charAt(len-i-1) ) {
				result=false;
				break;
				
			}
		}
		System.out.println(inp  + " is a palindrome " + result );
		
	}

}
