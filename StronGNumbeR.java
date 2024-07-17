import java.util.Scanner;
public class StronGNumbeR {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number");
		int n=s.nextInt();
	
		int sum=0,fact,t=n;
		while(n!=0)
		{
			
			fact=1;
			for(int i=n;i>=1;i--)
			{
				fact=fact*i;
				sum=sum+fact;
			}
		}
		if(t==sum)
			{
				System.out.println("Strong no :" +t);
			}
			else
			{
				System.out.println("Not A Strong no :" +t);
			}
		
	
	}
}

