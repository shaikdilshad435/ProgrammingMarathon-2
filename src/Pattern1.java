
public class Pattern1 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int k=5;k>i;k--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if(i==1 ||i==3 ||i==5) {
				System.out.print("*");
			}
			else {
				System.out.print("-");
			}
		}
		
		System.out.println();
	}
	for(int i=1;i<=4;i++) {
		for(int k=1;k<=i;k++) {
			System.out.print(" ");
		}
		for(int j=4;j>=i;j--) {
			if(i==1 ||i==3 ||i==5) {
				System.out.print("-");
			}
			else {
				System.out.print("*");
			}
		}
		
		System.out.println();
	}
}
}
