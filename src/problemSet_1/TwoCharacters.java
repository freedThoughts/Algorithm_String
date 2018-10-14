package problemSet_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoCharacters {
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        in.close();
        
        StringBuilder result = new StringBuilder();
        Set<Character> setFirstLoop = new HashSet<Character>();
        for(int i = 0; i<len; i++){
        	if(setFirstLoop.contains(s.charAt(i)))
        		continue;
        	
        	setFirstLoop.add(s.charAt(i));
        	StringBuilder innerStringBuilder = new StringBuilder();
/*        	if(i+1 >= len || s.charAt(i) == s.charAt(i+1))
        		continue;*/
        	
        	//innerStringBuilder.append(s.charAt(i)).append(s.charAt(i+1));
        	innerStringBuilder.append(s.charAt(i));
        	Set<Character> setSecondLoop = new HashSet<Character>();
        	
        	Integer firstcharToOutIndex = null;
        	
        	for(int j = i+1; j<=len; j++){
        		if(j == len){
        			if(innerStringBuilder.length()> result.length())
        				result = innerStringBuilder;
        			break;
        		}
        		
        		if(setSecondLoop.contains(s.charAt(j)))
        			continue;
        		
        		if(s.charAt(j) != innerStringBuilder.charAt(0) && (
        				innerStringBuilder.length()>1 ?  s.charAt(j) != innerStringBuilder.charAt(1) : false)
        				){
        			setSecondLoop.add(s.charAt(j));
        			if(firstcharToOutIndex == null) firstcharToOutIndex = j;
        			continue;
        		}
        		
        		if(s.charAt(j) == innerStringBuilder.charAt(innerStringBuilder.length()-1)) {
        			if(firstcharToOutIndex != null) j = firstcharToOutIndex-1;
        			break;
        		}

        		
        		if(
        				innerStringBuilder.length()>1 ? s.charAt(j) == innerStringBuilder.charAt(innerStringBuilder.length()-2) : true
        				
        				){
        			innerStringBuilder.append(s.charAt(j));
        			if(firstcharToOutIndex != null) j = firstcharToOutIndex-1;
        		}
        		
        		System.out.println(innerStringBuilder);
        	}
        }
    	System.out.println(result.length()>1 ? result.length() : 0); 
    }
	
	

/*    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        in.close();
        
        //StringBuilder builder = s;
        
        StringBuilder finalString = new StringBuilder();
        for(int i = 0; i< len; i++){
        	StringBuilder tempString = new StringBuilder();
        	char[] charSq = new char[2];
        	charSq[0] = s.charAt(i);
        	if(i+1 < len && s.charAt(i) != s.charAt(i+1)){
        		charSq[1] = s.charAt(i+1); 
        		tempString.append(charSq);
        		
            	for(int k = i+2; k<len; k++){
            		if(s.charAt(k) == tempString.charAt(tempString.length()-1))
            			break;
            		else if(s.charAt(k) != charSq[0] && s.charAt(k) != charSq[1])
            			continue;
            		else if(s.charAt(k) == tempString.length()-2)
            			tempString.append(s.charAt(k));
            	}
        	}
        	else {
        		continue;
        	}
        	

        	
        	
        	
        	for(int j = i+1; j<len; j++){
        		if(s.charAt(j-1) != s.charAt(j)){
        			tempString.append(s.substring(0, 2));
        			
        		}
        	}
        }
        
    }*/
}
