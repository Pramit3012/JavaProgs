import java.util.Scanner;
class javastring7
{
public static void main(String args[])
{
String s1=new String();
String s2=new String();
Scanner pr=new Scanner(System.in);
System.out.println("Enter two Strings");
s1=pr.nextLine();
s2=pr.nextLine();
if(s1.equals(s2))
System.out.println("The strings are equal");
else
System.out.println("The strings are not equal");
if(s1.equalsIgnoreCase(s2))
System.out.println("The strings are equal");
else
System.out.println("The strings are not equal");
}
}