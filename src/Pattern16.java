
public class Pattern16 {
public static void main(String[] args) {
	for(int i=3;i<=6;i+=2) {
		for(int k=1;k<6-i;k+=2) {
			System.out.print(" ");
		}
		
		for(int j=1;j<i+1;j++) {
			System.out.print("*");
		}
		for(int l=1;l<=6-i+1;l++) {
			System.out.print(" ");
		}
		for(int j=1;j<i+1;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=6;i>0;i--) {
		for(int k=0;k<=6-i;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<i*2;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
