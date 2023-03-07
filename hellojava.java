import java.util.Scanner;
class hellojava
{
public static void main(String args[])
{
Scanner pr=new Scanner(System.in);
int n,i,add=0;
System.out.println("Enter the n");
n=pr.nextInt();
for(i=1; i<=n; i++)
{
add=add+i;
}
System.out.println("Sum of n numbers are= "+add);
}
}