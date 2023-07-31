
public class Pattern23 {
public static void main(String[] args) {
	int ch=65;
	for(int i=0;i<=5;i++) {
		for(int j=0;j<=5-i;j++) {
			System.out.print((char)(ch+j));
		}
		for(int k=1;k<=2*i;k++) {
			System.out.print(" ");
		}
		for(int l=5-i;l>=0;l--) {
			System.out.print((char)(ch+l));
		}
		System.out.println();
	}
}
}
