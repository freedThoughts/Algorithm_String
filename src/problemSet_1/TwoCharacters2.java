package problemSet_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoCharacters2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        in.close();
        
        StringBuilder result = new StringBuilder();
        Set<Character> setFirstLoop = new HashSet<Character>();
        for(int firstCharIndex = 0; firstCharIndex<len; firstCharIndex++){
        	if(setFirstLoop.contains(s.charAt(firstCharIndex)))
        		continue;
        	
        	setFirstLoop.add(s.charAt(firstCharIndex));
        	
        	for(int secondCharIndex = firstCharIndex+1 ; secondCharIndex< len; secondCharIndex++){
        		Set<Character> setSecondLoop = new HashSet<Character>();
        		if(s.charAt(firstCharIndex) == s.charAt(secondCharIndex) || setSecondLoop.contains(s.charAt(secondCharIndex)))
        			break;

        		setSecondLoop.add(s.charAt(secondCharIndex));
        		
        		StringBuilder charSq = new StringBuilder();
        		charSq.append(s.charAt(firstCharIndex)).append(s.charAt(secondCharIndex));
        		result = charSq.length()>result.length() ? charSq : result;
        		
        		Set<Character> setThirdLoop = new HashSet<Character>();

        		for(int nextCharIndex = secondCharIndex+1; nextCharIndex<=len; nextCharIndex++){
        			if(nextCharIndex == len){
        				result = charSq.length()>result.length() ? charSq : result;
        				break;
        			}
        			if(s.charAt(nextCharIndex) != s.charAt(firstCharIndex) && s.charAt(nextCharIndex) != s.charAt(secondCharIndex)){
        				setThirdLoop.add(s.charAt(nextCharIndex));
        				continue;
        			}

        			
        			if(s.charAt(nextCharIndex) == charSq.charAt(charSq.length()-1)){
        				StringBuilder charSq1 = new StringBuilder();
        				charSq1 = charSq;
        				break;
        			}
        			
        			if(s.charAt(nextCharIndex) == charSq.charAt(charSq.length()-2)){
        				charSq.append(s.charAt(nextCharIndex));
        			}
        			
        			System.out.println(charSq.toString());
        		}
        	}
        }
        System.out.println(result.length()>1 ? result.length() : 0);
    }
}
