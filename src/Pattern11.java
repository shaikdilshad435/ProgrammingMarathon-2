
public class Pattern11 {
public static void main(String[] args) {

	for (int i = 1; i <= 4; i++)
		
	{
		
		for (int k = i; k >= 1; k--)

		{
			System.out.print(k);
		}
		for (int l = 2; l <= i; l++) 
		{
			System.out.print(l);
		}
		System.out.println();
	}
	for (int i = 3;i>=1;i--)

	{

		for (int k = i; k >=1; k--)

		{
			System.out.print(k);
		}
		for (int l = 2; l <= i; l++) 
		{
			System.out.print(l);
		}
		System.out.println();
	}
}
}