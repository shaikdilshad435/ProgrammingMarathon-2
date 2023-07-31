import java.util.Scanner;

public class ArmstrongApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		Armstrong armstrong=new Armstrong();
		int n=scan.nextInt();
	int arm=armstrong.checkArmstrong(n);
	
	if(arm==n) {
		System.out.println("Enterd number "+n+" is Armstrong Number");
	}
	else {
		System.out.println("Enterd number "+n+" is Not Armstrong Number");
	}

	}

}
