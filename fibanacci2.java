import java.util.*;
public class Fibonacci
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int i,n,n1=0,n2=1,n3=0;
	    n=s.nextInt();
	    for(i=1;i<=n-2;i++)
	    {
	       n3=n1+n2;
	       n1=n2;
	       n2=n3;
	    }
	    System.out.println(n3);
	}
}
