
import java.util.*;
public class Array
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int a[],i,n,Sno;
	    System.out.println("Enter  the size of array");
	    n=s.nextInt();
	    a= new int[n];
	    System.out.println("Enter n Elements");
	    for (i=0;i<n;i++)
	    {
	    a[i]=s.nextInt();
	    }
	    System.out.println("Enter search element");
	    Sno=s.nextInt();
	    int r=Arrays.binarySearch(a,Sno);
	    if(r<0)
	    {
	        System.out.println("Search element is not found ");
	    }
	    else
	    {
	        System.out.println("Element is found\n position="+(r+1));
	    }
	}
}
	   
