import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
Scanner pr=new Scanner(System.in);
int a,temp,rev=0;
System.out.println("Enter the number to check");
a=pr.nextInt();
temp=a;
while(temp>0)
{
rev=(rev*10)+temp%10;
temp=temp/10;
}
if(rev==a)
System.out.println("It is a palindorme");
else
System.out.println("It is not a palindrome");
}
}