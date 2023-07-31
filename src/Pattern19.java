
public class Pattern19 {
public static void main(String[] args) {
	int temp=0;
	int ch=65;
	for(int i=5;i>=1;i--) {
		for(int j=5;j>=i;j--) {
			System.out.print((char)(ch+j-1)+"");
			temp=j;
		}
		for(int k=5-i+1;k<5;k++) {
			System.out.print((char)(ch+temp-1)+"");
		}
		System.out.println();
	}
}
}
