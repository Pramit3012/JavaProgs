import java.util.Scanner;
class javastring2
{
public static void main(String args[])
{
String s1=new String();
String s2=new String();
Scanner pr=new Scanner(System.in);
System.out.println("Enter two strings");
s1=pr.nextLine();
s2=pr.nextLine();
String s3=new String();
s3=s1.concat(s2);
System.out.println("Concatinated string= "+s3);
System.out.println(s1.subString(3));
System.out.println(s1.subString(2,5));
System.out.println(s1.indexOf('i'));
System.out.println(s2.indexOf('i',2));
}
}
