import java.util.Scanner;

public class Pattern12 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string ");
	String input=scan.nextLine();
	for(int i=1;i<=input.length();i++) {
		for(int k=1;k<=i;k++) {
			System.out.print(input.charAt(i-1));
		}
		System.out.println();
	}
	
}
}
