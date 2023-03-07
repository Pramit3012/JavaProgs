import java.util.Scanner;
class sumarray
{
public static void main(String args[])
{
int a[]=new int[10];
int sum=0;
Scanner pr=new Scanner(System.in);
System.out.println("Enter elements of the array");
for(int i=0; i<10; i++)
{
a[i]=pr.nextInt();
}
for(int i=0; i<10; i++)
{
sum=sum+a[i];
}
System.out.println("Sum of the array is= "+sum);
}
}