class fuck
{
int roll;
String name;
static String cname="Acharya Prafulla Chandra College";
fuck(int x,String y)
{
roll=x;
name=y;
}
void display()
{
System.out.println("Roll="+roll+" Name="+name+" College name="+cname);
}
static void change()
{
cname="ABC College";
}
}
class student
{
public static void main(String args[])
{
fuck s1=new fuck(01,"Pramit");
fuck s2=new fuck(02,"Dishani");
s1.display();
s2.display();
fuck.change();
s1.display();
s2.display();
}
}