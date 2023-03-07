import java.util.Scanner;
class world
{
public static void main(String args[])
{
Scanner pr=new Scanner(System.in);
int a,rev=0;
System.out.println("Enter the number to reverse");
a=pr.nextInt();
while(a>0)
{
rev=(rev*10)+a%10;
a=a/10;
}
System.out.println("Reverse="+rev);
}
}
