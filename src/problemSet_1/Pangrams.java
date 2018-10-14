package problemSet_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		
/*		Set<Character> alphabetes = new HashSet<Character>();
		for(int i = 97; i<=122; i++)
			alphabetes.add((char)i);*/

		
		Set<Character> inputCharacters = new HashSet<Character>();
		
		for(char c : s.toCharArray()){
			if( (c >= 65 && c <= 90) || (c >=97 && c <= 122)){
				c = ((Character)c).isUpperCase(c)  ? ((Character)c).toLowerCase(c) : c;
				inputCharacters.add(c);
			}
		}
		
		String print = inputCharacters.size() == 26 ? "pangram" : "not pangram";
		//String print = inputCharacters.containsAll(alphabetes) ? "pangram" : "not pangram";
		System.out.println(print);

	}

}
