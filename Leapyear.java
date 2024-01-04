import java.util.*;
public class Leap
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int y;
	    System.out.println("Enter a year");
	    y=s.nextInt();
	    if(y%4==0&&(y%100!=0||y%400==0))
	    {
	        System.out.println("Leap year");
	    }
	    else
	    {
	        System.out.println("Not a Leap year");
	    }
	
	}
}
