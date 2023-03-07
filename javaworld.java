import java.util.Scanner;
class javaworld
{
public static void main(String args[])
{
int a;
System.out.println("Enter a number");
Scanner pr=new Scanner(System.in);
a=pr.nextInt();
if(a%2==0)
System.out.println(a+" is a even number");
else
System.out.println(a+" is a odd number");
}
}