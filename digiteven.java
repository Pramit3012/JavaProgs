import java.util.Scanner;
class digiteven
{
public static void main(String args[])
{
Scanner pr=new Scanner(System.in);
int a,temp,sum=0,count=0;
System.out.println("Enter a number");
a=pr.nextInt();
while(a>0)
{
temp=a%10;
a=a/10;
if(temp%2==0)
{
sum=sum+temp;
count++;
}
}
if(count>0)
System.out.println("The sum of even digits are "+sum);
}
}
