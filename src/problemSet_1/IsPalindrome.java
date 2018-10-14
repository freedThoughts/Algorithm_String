package problemSet_1;

public class IsPalindrome {

	public static void main(String[] args) {
		String str = "abcdnvndcba";
		int length = str.length();
		boolean isEven = length % 2 == 0;
		int firstPartEndIndex;
		int secondPartStartIndex;
		if(isEven){
			firstPartEndIndex = length/2 -1;
			secondPartStartIndex = length/2;
		} else {
			firstPartEndIndex = length/2 - 1;
			secondPartStartIndex = length/2 + 1;
		}
		
		boolean isPalindrome = isPalindrome(str, firstPartEndIndex, secondPartStartIndex);
		System.out.println(isPalindrome);
	}
	
	private static boolean isPalindrome(String str, int firstPartEndIndex, int secondPartStartIndex){
		while(firstPartEndIndex >= 0){
			if(str.charAt(firstPartEndIndex) != str.charAt(secondPartStartIndex))
				return false;
			
			firstPartEndIndex --;
			secondPartStartIndex ++;
			
		}
		return true;
	}
	
	

}
