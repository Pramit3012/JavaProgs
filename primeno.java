//WAP a program to print all prime nubers between 1 to 100
import java.util.Scanner;
class primeno
{
public static void main(String args[])
{
int n,count=0,i,j;
Scanner pr=new Scanner(System.in);
System.out.println("Enter no. to find primes");
n=pr.nextInt();
for(i=1; i<=n; i++)
{
count=0;
for(j=1; j<=i; j++)
{
if(i%j==0)
count++;
}
if(count==2)
System.out.println("Prime="+i);
}
}
}