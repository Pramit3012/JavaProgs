import java.util.Scanner;
class prime
{
void showdata(int a)
{
int i,count=0;
for(i=0; i<=a; i++)
{
if(a%i==0)
count++;
}
if(count==0)
System.out.println("It is a prime number");
else
System.out.println("It is not a prime number");
}
public static void main(String args[])
{
int b;
prime x=new prime();
Scanner pr=new Scanner(System.in);
System.out.println("Enter a number");
b=pr.nextInt();
x.showdata(b);
}
}