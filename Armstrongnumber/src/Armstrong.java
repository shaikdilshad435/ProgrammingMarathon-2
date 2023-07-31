
public class Armstrong {
	
	public int checkArmstrong(int n) {
		int on=n;
		int count=0;
		while(on!=0) {
			on=on/10;
			count++;
		}
		int sum=0;
		while(n!=0) {
		int rem=n%10;
		int pow=(int) Math.pow(rem, count);
		sum=sum+pow;
		n=n/10;
		}
		return sum;
	}
}
