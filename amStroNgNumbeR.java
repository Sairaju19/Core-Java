import java.util.Scanner;
public class amStroNgNumbeR {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A No :");
		int n=s.nextInt();
		int t=n,r,sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==t)
		{
			System.out.println("AmStrong NO :"+t);
		}
		else
		{
			System.out.println("Not AmStrong No :"+t);
		}
	}

}
