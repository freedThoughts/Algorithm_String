package problemSet_1;

import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close();
        
        String originalMessage = "SOS";
        int numberOfLettersChanged = 0;
        
        int baseIndex = 0;
        for(int i = 0; i<S.length(); i++){
        	if(baseIndex > originalMessage.length()-1 ) baseIndex = 0;
        	
        	if(originalMessage.charAt(baseIndex) != S.charAt(i)) numberOfLettersChanged ++;
        	
        	baseIndex ++;
        }
        
        System.out.println(numberOfLettersChanged);

	}

}
