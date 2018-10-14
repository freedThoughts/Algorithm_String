package problemSet_1;

import java.util.Scanner;

public class SeparateTheNumbers {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            
            Long firstInteger = (long) -1;
            boolean result = false;
            for(int digit = 1; digit <= s.length()/2; digit++){
            	firstInteger = Long.valueOf(s.substring(0, digit));
            	StringBuilder expectedString = new StringBuilder(String.valueOf(firstInteger));
            	long nextValue = firstInteger+1;
            	while(expectedString.length()< s.length()){
            		expectedString.append(String.valueOf(nextValue));
            		nextValue++;
            	}
            	
            	if(s.equals(expectedString.toString())){
            		result = true;
            		break;
            	}
            }
            
            String print = result ? "YES " + firstInteger : "NO";
            System.out.println(print);
        }
            
/*            boolean result = false;
            Integer firstInteger = null;
            for(int digit = 1; digit <= s.length()/2; digit++){
            	Integer previousInteger = null; 
            	firstInteger = null;
            	boolean flag = true;
            	for(int i = 0; i<s.length(); i++){
            		if(previousInteger == null){
            			previousInteger = Integer.valueOf(s.substring(0, digit));
            			firstInteger = previousInteger;
            		}
            		else {
            			int nextExpectedValue = previousInteger +1;
            			int nextExpectedValueDigits = nextExpectedValue/10;
            			if(i+nextExpectedValueDigits > s.length()) {
            				flag = false;
            				break;
            			}
            			Integer nextInteger = Integer.valueOf(s.substring(i, i+nextExpectedValueDigits));
            			if(nextInteger != nextExpectedValue){
            				flag = false;
            				break;
            			}
            			
            			previousInteger = nextInteger;
            		}
            	}
            	result = flag;
            	if(result) break;
            }
            String print = result ? "YES " + firstInteger : "NO";
            System.out.println(print);*/


	}

}
