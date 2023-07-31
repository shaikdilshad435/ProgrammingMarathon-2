
public class Pattern20 {
public static void main(String[] args) {
	int ch=65;
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++) {
			if(j%2==0) {
				System.out.print((char)(ch+(5*(j))+i)+" ");
			}
			else {
				System.out.print((char)(ch+(5*(j+1))-i-1)+" ");
			}
		}
		System.out.println();
	}
}
}
