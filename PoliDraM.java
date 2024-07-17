import java.util.Scanner;

public class PoliDraM {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a No :");
		int n=s.nextInt();
		int t=n,r,rev=0;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==t)
		{
			System.out.println("Polidram NO :"+t);
		}
		else
		{
			System .out.println("Not A Polidram No :"+t);
		}

	}

}
//Enter A No :
//121
//Polidram NO :121
//-------------------------
//Enter A No :
//122
//Not A Polidram No :122
