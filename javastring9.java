import java.util.Scanner;
class javastring9
{
public static void main(String args[])
{
String s=new String();
Scanner pr=new Scanner(System.in);
System.out.println("Enter a string");
s=pr.nextLine();
int i,j;
char c,d;
i=s.length()-1;
while(s.charAt(i)!=' ')
i--;
j=0;
while(j<i)
{
if(j==0)
System.out.print(s.charAt(j)+".");
else
{
c=s.charAt(j);
d=s.charAt(j+1);
if(c==' ' && d!=' ')
System.out.print(d+".");
}
j++;
}
System.out.print(s.substring(i));
}
}
