import java.util.Scanner;

public class Main {
public static void identifyCharacte(char ch) {
	if(Character.isUpperCase(ch)&& "AEIOU".indexOf(ch)!=-1) {
		System.out.println("Uppercase vowel");
	}
	else if(Character.isLowerCase(ch)&&"aeiou".indexOf(ch)!=-1) {
		System.out.println("Lowercase vowel");
	}
	else if (Character.isLowerCase(ch) && Character.isLetter(ch)) {
		System.out.println("Lowercase Consonant");
	}
	else if (Character.isUpperCase(ch) && Character.isLetter(ch)) {
System.out.println("Uppercase Consonant");
	}
	else if(Character.isDigit(ch)) {
		System.out.println("is digit");
	}
	else {
		System.out.println("special character");
	}
	
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
	}

	public static void identifyCharacter(char ch) {
		if(Character.isDigit(ch)) {
			System.out.println(" Enterd character"+ch+" is Digit");
		}
		else if(!Character.isLetter(ch)) {
			System.out.println("Entered character "+ch+" is a special character" );
		}
		else {
			switch(Character.toLowerCase(ch)){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					if(Character.isLowerCase(ch	)) {
						System.out.println("Enetered character "+ch+" is Lowercase VOwel");
					}
					else {
						System.out.println("entered character "+ch+" is Uppercase Vowel ");
					}
					break;
				default:
					if(Character.isLowerCase(ch	)) {
						System.out.println("Enetered character "+ch+" is Lowercase Consonent");
					}
					else {
						System.out.println("entered character "+ch+" is Uppercase Consonent ");
					}
			}
		}
	}
}
