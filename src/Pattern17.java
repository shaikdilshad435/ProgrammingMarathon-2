
public class Pattern17 {
public static void main(String[] args) {
	
	for(int i=0;i<=5;i++) {
		char ch='A';
		for(int k=0;k<i;k++) {
			System.out.print(" ");
		}
		for(int j=0;j<2*(5-i)-1;j++) {
			System.out.print(ch);
			ch++;
		}
		System.out.println();

	}
}
}
