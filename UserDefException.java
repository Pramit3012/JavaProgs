import java.util.Scanner;
class InvalidAgeException extends Exception
{
InvalidAgeException(String msg)
{
System.out.println(msg);
}
}
class UserDefException
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age");
a=sc.nextInt();
try
{
vote(a);
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void vote(int age) throws InvalidAgeException
{
if(age<18)
{
throw new InvalidAgeException("You're not eligible");
}
else
{
System.out.println("You're eligible");
}
}
}