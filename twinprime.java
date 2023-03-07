import java.util.Scanner;
class twinprime
{
int prime(int num)
{
int f=0,i;
for(i=2; i<=num/2; i++)
{
if(num%i==0)
{
f=1;
break;
}
}
return (f);
}
}
class twin_prime
{
public static void main(String args[])
{
int input1,input2;
Scanner pr=new Scanner(System.in);
System.out.println("Enter starting and ending number");
input1=pr.nextInt();
input2=pr.nextInt();
twinprime obj=new twinprime();
int x,y;
for(int i=input1; i<=input2; i++)
{
x=obj.prime(i);
y=obj.prime(i+2);
if(x==0 && y==0)
System.out.println(i+" "+i+2+" are twin prime");
}
}
}