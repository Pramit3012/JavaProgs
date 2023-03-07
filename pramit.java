import java.util.Scanner;
class pramit
{
public static void main(String args[])
{
Scanner pr=new Scanner(System.in);
int i,a;
System.out.println("Enter the last number of the series");
a=pr.nextInt();
i=1;
do
{
System.out.println(i);
i++;
}while(i<=a);
}
}
