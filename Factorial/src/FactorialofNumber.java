import java.util.Scanner;

public class FactorialofNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}

}
