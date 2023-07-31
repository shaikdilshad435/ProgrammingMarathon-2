
public class Pattern25 {
public static void main(String[] args) {
	int ch=65;
	for(int i=5;i>=0;i--) {
		for(int k=0;k<i;k++) {
			System.out.print(" ");
		}
		for(int j=i;j<=5;j++) {
			System.out.print((char)(ch+j)+" ");
		}
		System.out.println();
	}
}
}
