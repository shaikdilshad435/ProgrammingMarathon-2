import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Gcdof2Numbers  gcd=new Gcdof2Numbers();
		System.out.println("Enter two numbers to find GCD ");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int res=gcd.findGCD(m, n);
		System.out.println("GCD of "+m+" and "+n+" is "+res);

	}

}
