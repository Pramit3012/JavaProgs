import java.util.Scanner;
class addi
{
int a,b;
void getdata()
{
Scanner pr=new Scanner(System.in);
System.out.println("Enter first data");
a=pr.nextInt();
System.out.println("Enter second number");
b=pr.nextInt();
}
void showdata()
{
System.out.println("Add= "+a+b);
}
public static void main(String args[])
{
addi aa=new addi();
aa.getdata();
aa.showdata();
}
}