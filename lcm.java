import java.util.Scanner;
class lcm
{
public static void main(String args[])
{
Scanner pr=new Scanner(System.in);
int input1, input2,lcm=0;
boolean m=true;
System.out.println("Enter the numbers");
input1=pr.nextInt();
input2=pr.nextInt();
if(input1>input2)
lcm=input1;
else
lcm=input2;
while(m)
{
if(lcm%input1==0 && lcm%input2==0)
{
System.out.println("The lcm is "+lcm);
m=false;
}
lcm++;
}
}
}

