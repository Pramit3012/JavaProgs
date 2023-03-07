import java.util.Scanner;
class javastring5
{
public static void main(String args[])
{
String s1=new String();
Scanner pr=new Scanner(System.in);
System.out.println("Enter a string");
s1=pr.nextLine();
int count=1,i;
for(i=0; i<s1.length()-1; i++)
{
char c,d;
c=s1.charAt(i);
d=s1.charAt(i+1);
if(c==' ' && d!=' ')
count++;
}
System.out.println("The number of words are="+count);
}
}