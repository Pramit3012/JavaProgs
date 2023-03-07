import java.util.Scanner;
class digit
{
public static void main(String args[])
{
Scanner pr=new Scanner(System.in);
int a,b;
System.out.println("Enter a number");
a=pr.nextInt();
while(a>0)
{
b=a%10;
a=a/10;
System.out.println("The digits are"+b);
}
}
}