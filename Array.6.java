
import java.util.*;
public class Array
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int a[],i,n;
	    System.out.println("Enter  the size of array");
	    n=s.nextInt();
	    a= new int[n];
	    System.out.println("Enter n Elements");
	    for (i=0;i<n;i++)
	    {
	        System.out.println("The Elements before sorting");
	        for(i=0;i<n;i++)
	        System.out.print(a[i]+"");
	    }
	    System.out.println();
	    Arrays.sort(a);
	    System.out.println("the elements after sorting");
	   for(i=0;i<n;i++)
	   {
	       System.out.print(a[i]+"");
	   }
	}
}
