import java.util.Scanner;

public class Main {

	public
	static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter  3 numbers ");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
largest(n1, n2, n3);
	}
	public static  void largest(int n1,int n2,int n3) {
		if(n1==n2 && n2==n3) {
			System.out.println(" numbers are equal ");
		}
		else {
			if(n1>n2 && n1>n3) {
				System.out.println(n1+" is larger");
			}
			else if(n2>n3) {
				System.out.println(n2+" is larger");
			}
			else {
				System.out.println(n3+" is larger");
			}
		}
	}

}
