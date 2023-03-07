import java.util.Scanner;
class number
{
public static void main(String args[])
{
Scanner pr=new Scanner(System.in);
int a,count=0;
System.out.println("Enter a number");
a=pr.nextInt();
while(a>0)
{
a=a/10;
count++;
}
System.out.println("The no. of digits "+count);
}
}