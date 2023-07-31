

public class Pattern21 {
public static void main(String[] args) {
	
	int ch=65;
	for(int i=0;i<5;i++) {
		for(int j=0;j<=i;j++) {
			if(j%2==0) {
				System.out.print((char)(ch +j*5-(j-1)*j/2+i-j) +" ");
			}
			else {
				System.out.print((char)(ch+j*5-(j-1)*j/2+5-1-i)+" ");
			}
		}
		System.out.println();
	}

}
}
