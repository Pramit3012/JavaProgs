import java.util.Scanner;
class Binary
{
public static void main(String args[])
{
Scanner pr=new Scanner(System.in);
int input,rem,b=1,sum=0;
System.out.println("Enter a positive decimal number");
input=pr.nextInt();
while(input>0)
{
rem=input%2;
if(rem==1)
sum=sum+(rem*b);
b=b*10;
input=input/2;
}
System.out.println("The binary value is "+sum);
}
}