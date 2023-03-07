import java.util.Scanner;
class trycatch
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=a/(a-b);
int arr[]={30,50,47,56};
System.out.println(arr[2]);
String str="Pramit";
System.out.println(str.toUpperCase());
System.out.println(Integer.parseInt(str));
}
catch(ArithmeticException e)
{
System.out.println("Cannot divide by zero");
}
catch(ArrayIndexOutOfBoundsException a)
{
System.out.println("Array Index not found");
}
catch(NullPointerException n)
{
System.out.println("String cannot be null");
}
catch(Exception x)
{
System.out.println("Exception Handled");
}
}
}
