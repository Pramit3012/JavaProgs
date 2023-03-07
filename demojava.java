import java.util.Scanner;
class demojava
{
public static void main(String args[])
{
int len, bre, area,peri;
Scanner pr=new Scanner(System.in);
System.out.println("Enter length");
len=pr.nextInt();
System.out.println("Enter breadth");
bre=pr.nextInt();
area=len*bre;
peri=2*(len+bre);
System.out.println("The area is ="+area);
System.out.println("The perimeter is="+peri);
}
}