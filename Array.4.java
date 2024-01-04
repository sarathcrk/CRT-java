
import java.util.*;
public class Array
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int a[],i,n,big;
	    System.out.println("Enter  the size of array");
	    n=s.nextInt();
	    a= new int[n];
	    System.out.println("Enter n Elements");
	    for (i=0;i<n;i++)
	    {
	    a[i]=s.nextInt();
	    }
	    big=a[0];
	    for(i=0;i<n;i++)
        {
          if(big<a[i])
          big=a[i];
        }
	    System.out.println("Biggest element="+big);
	   
	}
}
	   
