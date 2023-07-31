import java.util.Scanner;

public class FibanocciApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	FibanocciSeries f=new FibanocciSeries();
	System.out.println("Enter the number to find fibanocci series");
			int n=scan.nextInt();
			f.fibanocciSeries(n);
			
	}
	
}
