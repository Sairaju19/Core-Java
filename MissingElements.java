
public class MissingElements {

	public static void main(String[] args) 
	{
			int ar[] = {1,3,5,7,9,11,13};
			int s=1,e=15,f;
			for(int i=s;i<e;i++)
			{
				f=0;
				for(int j=0;j<ar.length;j++)
				{
					if(ar[j]==i)
					{
						f=1;
						break;
					}
				}
				if(f==0)
				{
					System.out.println(i+" ");
				}
			}
		}
}
