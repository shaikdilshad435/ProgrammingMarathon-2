
public class Pattern5 {
public static void main(String[] args) {
	//pascals triangle
	int temp=1;
	for(int i=0;i<5;i++) {
		for(int k=1;k<=5-i;k++) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			if(j==0||i==0)
				temp=1;
			else
				temp=temp*(i-j+1)/j;
			System.out.print(" "+temp);
		}
		System.out.println();
	}
}
}
