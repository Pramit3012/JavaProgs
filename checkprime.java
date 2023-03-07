import java.util.Scanner;
class checkprime
{
public static void main(String args[])
{
Scanner pr=new Scanner(System.in);
int a,i,count=0;
System.out.println("Enter a number");
a=pr.nextInt();
for(i=1;i<a;i++)
{
if(a%i==0)
count=count+1;
}
if(count>2)
System.out.println("The number is not prime");
else
System.out.println("The number is prime");
}
}