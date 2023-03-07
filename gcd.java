import java.util.Scanner;
class demo
{
int a,b,gcd=0;
demo(int x,int y)
{
a=x;
b=y;
}
void calculation()
{
boolean m=true;
if(a>b)
gcd=a;
else
gcd=b;
while(m)
{
if(a%gcd==0 && b%gcd==0)
{
System.out.println("The gcd is "+gcd);
m=false;
}
gcd--;
}
}
}
class gcd
{
public static void main(String args[])
{
Scanner pr=new Scanner(System.in);
int d,e;
System.out.println("Enter two numbers");
d=pr.nextInt();
e=pr.nextInt();
demo pramit=new demo(d,e);
pramit.calculation();
}
}