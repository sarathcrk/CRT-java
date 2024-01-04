import java.util.*;

public class Smallest

{
	
public static void main(String[] args)
	
{
	 
 Scanner s=new Scanner(System.in);
	
  int a,b,c;
	  
System.out.println("Enter thre num");
	
  a=s.nextInt();
	 
 b=s.nextInt();
	 
 c=s.nextInt();
	  
if(a<b&&a<c)
	  
{
	      
System.out.println(a+"is Smallest");
	 
 }
	 
 else
	 
 if(b<c)
	
  {
	    
  System.out.println(b+"is Smallest");
	
  }  
	 
 else
	 
 {
	    
  System.out.println(c+"is Smallest");
	 
 }
	
}

}
