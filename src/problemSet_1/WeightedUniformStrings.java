package problemSet_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

// For Non contiguous senarios also 

public class WeightedUniformStrings {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(char c : s.toCharArray()){
        	if(map.containsKey((int)c)) map.put((int)c, map.get((int)c)+1);
        	else map.put((int)c, 1);
        }
        
        Set<Integer> validValues = new HashSet<Integer>();
                
        for(Entry<Integer, Integer> e : map.entrySet()){
        	//System.out.println(e.getKey() +"  "+ e.getValue());
        	for(int i = 1; i<= e.getValue(); i++)
        		validValues.add((e.getKey()-96) * i);
        }
        
/*        System.out.println();
        for(Integer m : validValues)
        	System.out.println(m + ",  ");*/
      
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
