import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Palindrome palindrome=new Palindrome();
		System.out.println("Enter a Number");
		int n=scan.nextInt();
		int rev=palindrome.checkPalindrome(n);
		System.out.println(rev);
		if(rev==n) {
			System.out.println("Enytered number "+n+" is Palindrome");
		}
		else {
			System.out.println("Enytered number "+n+" is Not Palindrome");
		}
		
	}

}
