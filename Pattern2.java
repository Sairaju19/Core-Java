
public class Pattern2{

	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
			if(i%2!=0)
			{
				int n=1;
			    for(int j=1;j<=i;j++)
			    {
				  System.out.print(n+" ");
				  n++;
				}
			}
			else
			 {
				int n=i;
				for(int j=1;j<=i;j++)
			    {
				  System.out.print(n+" ");
				  n--;
				}
		     }
			System.out.println();
		}
	}

}
