//WAP to check a string is palindrome or not
import java.util.Scanner;
class javastring6
{
public static void main(String args[])
{
String s=new String();
Scanner pr=new Scanner(System.in);
System.out.println("Enter a string to check");
s=pr.nextLine();
int i,count=0,a;
s=s.toUpperCase();
a=s.length()-1;
i=0;
while(i<a && count==0)
{
if(s.charAt(i)!=s.charAt(a))
count=1;
i++;
a--;
}
if(count==0)
System.out.println("The string is palindrome");
else
System.out.println("The string is not palindrome");
}
}