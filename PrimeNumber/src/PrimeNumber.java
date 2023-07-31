import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		if(n<2) {
			System.out.println("nort prime");
		}
		else {
			for(int i=2;i*i<=n;i++) {
				if(n%i==0) {
					System.out.println("not prime");
					return;
				}
				else {
					System.out.println("prime number");
				return;
				}
			}
		}
	}

}
