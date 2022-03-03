//count occurrence of a given character in String

import java.util.*;
public class charactercount {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int value=0;
		String sentence = sc.nextLine();
		char ch = sc.next().charAt(0);
		for(int i=0;i<sentence.length();i++) {
			if(text.charAt(i) == ch) {
				value+=1;
			}
		}
		
		System.out.println("The character "+ch+" occured "+value+" number of times.");
	}
	

}