import java.util.Scanner;
class javahello
{
public static void main(String args[])
{
int i,a,b;
Scanner pr=new Scanner(System.in);
System.out.println("Enter the starting number");
a=pr.nextInt();
System.out.println("Enter the last element");
b=pr.nextInt();
i=a;
System.out.println("The numbers are");
while(i<=b)
{
System.out.print(i+" ");
i++;
}
}
}