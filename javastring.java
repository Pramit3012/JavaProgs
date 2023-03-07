import java.util.Scanner;
class javastring
{
public static void main(String args[])
{
String name=new String();
Scanner pr=new Scanner(System.in);
System.out.println("Enter your name");
name=pr.nextLine();
System.out.println("Hello "+name);
}
}