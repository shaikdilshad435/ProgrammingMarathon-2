import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the soft drink code");
	String productCode=scan.nextLine();
	getProduct(productCode);

	}
	public static void getProduct(String productCode)

	{
		switch (productCode) {
		case "p01":
			System.out.println("its a cococola");
			break;
		case "p02":
			System.out.println("its merinda");
			break;
		case "p03":
			System.out.println("its pepsi");
			break;
		default:
			System.out.println("choose the in list drinks");
		}
		
	}
}
