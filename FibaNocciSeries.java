import java.util.Scanner;
public class FibaNocciSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number");
		int n=s.nextInt();
		int f1=0;
		int f2=1;
		int f3;
		System.out.println(f1);
		System.out.println(f2);
		int i=3;
		do {
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
			i++;
		}while(i<=n);
	}

}
