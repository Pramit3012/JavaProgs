import java.util.Scanner;
class javastring3
{
public static void main(String args[])
{
String name=new String();
Scanner pr=new  Scanner(System.in);
System.out.println("Enter your name");
name=pr.nextLine();
System.out.println("The lenghts of your name is="+name.length());
System.out.println("The character at 3rd index is "+ name.charAt(3));
}
}