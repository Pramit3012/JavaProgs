import java.util.Scanner;
class greatest
{
public static void main(String args[])
{
int a,b,c;
Scanner pr=new Scanner(System.in);
System.out.println("Enter 3 numbers");
a=pr.nextInt();
b=pr.nextInt();
c=pr.nextInt();
if(a>b && a>c)
System.out.println(a+" is the greatest no.");
else if(b>a && b>c)
System.out.println(b+" is th greatest no.");
else
System.out.println(c+" is the greatest no.");
}
}