package problemSet_1;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        in.close();
        
        StringBuilder result = new StringBuilder();
        int newK = k % 26;
        for(char c : s.toCharArray()){
        	int value = (int)c + newK;
        	if( c >= 97 && c <= 122){
        		//System.out.println("small 97 122 in loop : " + value);
        		if(value > 122) value = value - 122 + 96;
        		result.append((char)value);
        	} else if( c >= 65 && c <= 90){
        		//System.out.println(" Capital 65 90 in loop : " + value);
        		if(value > 90) value = value - 90 + 64;
        		result.append((char)value);
        	} else {
        		result.append(c);
        	}
        }
        
        System.out.println(result);

	}

}
