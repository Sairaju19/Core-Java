
public class AmStronG {

	public static void main(String[] args) {
		int n=153;
		int t=n,r,sm=0;
		while(n!=0)
		{
			r=n%10;
			sm=sm+(r*r*r);
			n=n/10;
		}
		if(sm==t)
		{
			System.out.println("Amstrong Number :"+t);
		}
		else
		{
			System.out.println("Not A Amstrong Number :"+t);
		}
	}

}
//Amstrong Number :153
//Not A Amstrong Number :154