package mypackage;
import java.util.*;
public class VowelsOrConsonants {
	public static void main(String args[]) {
		String s="ansh";
		int vowel=0;
		int con=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || 
					s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				vowel+=1;
			}
			else {
				con+=1;
			}
		}
		System.out.print("Vowels:"+vowel +" Consonents:"+con );
	}
}
