import java.util.*;
public class Vowel
{
	public static void main(String[] args) 
	{
	   Scanner s=new Scanner(System.in);
	   int a;
	   System.out.println("Enter a num");
	   a=s.nextInt();
	   if(a>0)
	   {
	       System.out.println(a+"is Positive");
	   }
	   else
	    if(a<0)
	   {
	       System.out.println(a+"is Negative");
	   }
	   else
	   {
	       System.out.println(a+"is Zero");
	   }
	   }
}
