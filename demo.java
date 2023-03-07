import java.util.Scanner;
class student
{
int roll;
String name;
static String cname="Acharya Prafulla Chandra College";
student(int x, String y)
{
roll=x;
name=y;
}
void showdata()
{
System.out.println("Roll="+roll+" Name-"+name);
System.out.println("College name="+cname);
}
}
class demo
{
public static void main(String args[])
{
student aa=new student(101,"Pramit");
student bb=new student(102,"Tatai");
aa.showdata();
bb.showdata();
}
}