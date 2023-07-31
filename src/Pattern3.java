
public class Pattern3 {
public static void main(String[] args) {
	for(int i=5;i>=1;i--) {
		for(int k=5-i;k>=1;k--) {
			System.out.print(" ");
		}
		for(int j=2*i-1;j>=1;j--) {
			if(j==1||j==2*i-1) {
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
