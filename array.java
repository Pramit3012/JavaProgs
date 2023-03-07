import java.util.Scanner;
class array
{
public static void main(String args[])
{
int a[]= new int[10];
Scanner pr=new Scanner(System.in);
System.out.println("Enter 10 numbers");
for(int i=0; i<10; i++)
{
a[i]=pr.nextInt();
}
for(int i=0; i<10; i++)
{
System.out.println(a[i]);
}
}
}