import java.util.Scanner;
class search
{
public static void main(String args[])
{
int a[]=new int[10];
int key,flag=0,pos=0;
Scanner pr=new Scanner(System.in);
System.out.println("Enter no.s in array");
for(int i=0; i<10; i++)
{
a[i]=pr.nextInt();
}
System.out.println("Enter the key");
key=pr.nextInt();
for(int i=0; i<10 && flag==0; i++)
{
if(a[i]==key)
{
pos=i+1;
flag++;
}
}
if(flag==1)
System.out.println("Number found at "+pos+"th position");
else
System.out.println("Number not found");
}
}