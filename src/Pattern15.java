
public class Pattern15 {
public static void main(String[] args) {
	int a=1;
	int t=4;
	
	for(int i=1;i<=4;i++) {
		
			if(i%2!=0) {
				for(int j=1;j<=i&&j<=2;j++) {
				System.out.print((a++)+"*");
			
				}
				
			
				}
			else {
				for(int j=1;j<=i+1&&j<=4;j++) {
					System.out.print((t++)+"*");
					
				}
			}
		
		System.out.println();
	}
	

}
}
