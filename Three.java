import java.util.*; 

public class Main

{
	
public static void main(String args[])
	
{
	
int a,b,c,d;
	
Scanner s=new Scanner(System.in);
	System.out.println("Enter three no");
	
a=s.nextInt();
	
b=s.nextInt();
	
c=s.nextInt();
	
d=(float)(a+b+c)/3;
	
System.out.println("average="+d);
	System.out.printf("average=%.2f",d);
	
}

}
