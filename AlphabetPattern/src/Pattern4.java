
public class Pattern4 {

	public static void main(String[] args) {
		
		int a=65;
		for(int i=5;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				System.out.print((char)(a+j));
			}
			
			System.out.println();
		}
		for(int i=0;i<=5;i++) {
			for(int j=i;j>=0;j--) {
				System.out.print((char)(a+j));
			}
			
			System.out.println();
		}
	}

}
