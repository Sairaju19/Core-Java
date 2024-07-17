import java.util.*;
public class PerfectNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A No:");
		int n=s.nextInt();
		int t=n;
		int i=1;
		int sum=0;
		while(i<n)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==n)
		{
			System.out.println(n+"=Perfect No");
		}
		else
		{
			System.out.println(n+"=Not a Perfect No");
		}
	}

}
