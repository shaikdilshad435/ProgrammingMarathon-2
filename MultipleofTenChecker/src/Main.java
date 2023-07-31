import java.util.Scanner;

public class Main {
public static void checkMultipleOfTen(int n,int m) {
	if(n%m==0) {
		System.out.println(n+" is a multiple of "+m);
	}
	else {
		System.out.println(n+" is not a multiple of "+m);
	}
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter 2 numbers");
	int n=scan.nextInt();
	int m=scan.nextInt();
	checkMultipleOfTen(n,m);
}

}
