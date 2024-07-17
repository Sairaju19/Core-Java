import java.util.*;
public class Count {
public static void main(String[] args) {
	

	int n=1,cnt=0;
	
	for(n=1;n<=80;n++)
	{
		if(n==7)
		{
			n=n/10;
			cnt++;
			System.out.println(cnt);
		}
	}
}
}