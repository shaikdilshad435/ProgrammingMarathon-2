
public class Pattern4 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int k=1;k<=5-i;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++) {
			if(i%2!=0) {
				System.out.print("*");
			}
			else {
				System.out.print("-");
			}
		}
		System.out.println();
	}
	for(int i=4;i>=1;i--) {
		for(int k=5-i;k>=1;k--) {
			System.out.print(" ");
		}
		for(int j=2*i-1;j>=1;j--) {
			if(i%2!=0) {
				System.out.print("*");
			}
			else {
				System.out.print("-");
			}
		}
		System.out.println();
	}
}
}
