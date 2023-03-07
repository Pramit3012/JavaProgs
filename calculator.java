import java.util.Scanner;
class calculator
{
public static void main(String args[])
{
int a,b,c;
Scanner pr=new Scanner(System.in);
System.out.println("Enter two numbers");
a=pr.nextInt();
b=pr.nextInt();
System.out.println("Enter 1 to +, 2 to -, 3 to *, 4 to /");
c=pr.nextInt();
switch(c)
{
case 1:
System.out.println("Addition="+(a+b));
break;
case 2:
System.out.println("Substraction="+(a-b));
break;
case 3:
System.out.println("Multiplication="+(a*b));
break;
case 4:
System.out.println("Division="+(a/b));
break;
default:
System.out.println("Invalid choice");
}
}
}