
public class Pattern22 {
public static void main(String[] args) {
	int ch=65;
	int temp=10;
	for(int i=0;i<5;i++) {
		temp=temp-i;
		for(int j=1;j<=i;j++) {
			
			System.out.print((char)(ch+temp+j-1));
		}
		System.out.println();
	}
}
}
