import java.util.Scanner;
class number
{
int a[]=new int[10];
int key;
void getdata()
{
Scanner pr=new Scanner(System.in);
int i;
System.out.println("Enter the elements of the array");
for(i=0; i<10; i++)
{
a[i]=pr.nextInt();
}
System.out.println("Enter a number to find frequency");
key=pr.nextInt();
}
int findfreq()
{
int i,count=0;
for(i=0; i<10; i++)
{
if(a[i]==key)
count++;
}
return (count);
}
}
class frequency
{
public static void main(String args[])
{
number obj=new number();
obj.getdata();
int x=obj.findfreq();
System.out.println("The frequency of the number is "+x);
}
}
