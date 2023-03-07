import java.util.Scanner;
class demo
{
int a;
void getdata()
{
Scanner pr=new Scanner(System.in);
System.out.println("Enter a number to check");
a=pr.nextInt();
}
void check()
{
int i,sum=0;
for(i=1; i<a; i++)
{
if(a%i==0)
{
sum=sum+i;
}
}
if(sum==a)
System.out.println("This is a perfect number");
else
System.out.println("This isn't a perfect number");
}
}
class perfect
{
public static void main(String args[])
{
demo obj=new demo();
obj.getdata();
obj.check();
}
}