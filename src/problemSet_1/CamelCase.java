package problemSet_1;

import java.util.Scanner;

public class CamelCase {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        
        int count = 0;
        for(Character c : s.toCharArray()){
        	if(Character.isUpperCase(c)) count ++;
        }
        
        System.out.println(++count);
    }
}
