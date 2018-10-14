package problemSet_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WeightedUniformStrings2 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        Set<Integer> validValues = new HashSet<Integer>();
        int previousInteger = 0;
        int previousIntegerValue = 0;
        
        for(char c : s.toCharArray()){
        	if(previousInteger == (int)c ){
        		previousIntegerValue = previousIntegerValue + (int)c - 96;
        		validValues.add(previousIntegerValue);

        	}
        	else {
        		validValues.add((int)c-96);
        		previousInteger = (int)c;
        		previousIntegerValue = (int)c-96;
        	}
        }
        
        int n = in.nextInt();
    	int[] x = new int[n];
        for(int a0 = 0; a0 < n; a0++){
        	x[a0] = in.nextInt();
        }
        
        for(int k : x){
        	String print = validValues.contains(k) ? "Yes" : "No";
        	System.out.println(print);
        }
        

	}

}
