import java.util.Scanner;
class control
{
public static void main(String args[])
{
int age;
Scanner pr=new Scanner(System.in);
System.out.println("Enter your age");
age=pr.nextInt();
if(age<18)
System.out.println("You are not eligible to vote");
else
System.out.println("You are eligible to vote");
}
}
