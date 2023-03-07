import java.util.Scanner;
class javastring8
{
public static void main(String args[])
{
String s1=new String();
String s2=new String();
Scanner pr=new Scanner(System.in);
System.out.println("Enter two strings");
s1=pr.nextLine();
s2=pr.nextLine();
if(s1.compareTo(s2)==0)
System.out.println("The strings are equal");
else if(s1.compareTo(s2)<0)
System.out.println("The first string is greater");
else
System.out.println("The Second string is greater");
}
}