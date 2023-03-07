import java.util.Scanner;
class addition
{
int a,b,c;
addition()
{
a=0;
b=0;
}
addition(int x, int y)
{
a=x;
b=y;
}
void getdata()
{
Scanner pr=new Scanner(System.in);
System.out.println("Enter first number");
a=pr.nextInt();
System.out.println("Enter second number");
b=pr.nextInt();
}
void add()
{
c=a+b;
}
void showdata()
{
System.out.println("The addition= "+c);
}
}
class demo2
{
public static void main(String args[])
{
addition pramit=new addition();
pramit.getdata();
pramit.add();
pramit.showdata();
Scanner tf=new Scanner(System.in);
int f,g;
System.out.println("Enter a number");
f=tf.nextInt();
System.out.println("Enter a number again");
g=tf.nextInt();
addition tatai=new addition(f,g);
tatai.add();
tatai.showdata();
}
}