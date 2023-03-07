//Print the words of a string in reverse order
import java.util.Scanner;
class javastring10
{
public static void main(String args[])
{
String a=new String();
Scanner pr=new Scanner(System.in);
System.out.println("Enter a string");
a=pr.nextLine();
int i,j,k;
i=a.length()-1;
while(i>=0)
{
j=i;
while(a.charAt(j)!=' ' && j>0)
j--;
if(j==0)
k=0;
else
k=j+1;
System.out.print(a.substring(k,i+1)+" ");
i=j-1;
}
}
}