import java.util.Scanner;

public class SumOfNumbers {
public static void main(String[] args) {
	int sum=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the natural number");
	int n=scan.nextInt();
	for(int i=1;i<=n;i++) {
		sum=sum+i;
	}
	System.out.println(sum);
}
}
