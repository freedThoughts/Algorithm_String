package problemSet_1;

import java.util.Scanner;

public class HackerRankInAString {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        char [] originalString = new char[] {'h','a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int originalStringIndex = 0;
            for(int i = 0; i<s.length() && originalStringIndex < originalString.length ; i++){
            	
            	if(originalString[originalStringIndex] == s.charAt(i))
            		originalStringIndex ++;

            }
            if(originalStringIndex == originalString.length) System.out.println("YES");
            else System.out.println("NO");

        }
        
        in.close();

	}

}
