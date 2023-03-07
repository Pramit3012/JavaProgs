import java.util.Scanner;
interface client
{
void input();
void output();
}
class A implements client
{
String name; int sal;
public void input()
{
Scanner pr=new Scanner(System.in);
System.out.println("Enter your name");
name=pr.nextLine();
System.out.println("Enter your Salary");
sal=pr.nextInt();
}
public void output()
{
System.out.println(name+"\n"+sal);
}
}
class Interfacing
{
public static void main(String args[])
{
A obj=new A();
obj.input();
obj.output();
}
}
