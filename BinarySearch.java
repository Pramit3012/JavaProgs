import java.util.Scanner;
class demo
{
int a[]=new int[10];
int key;
void input()
{
int i;
Scanner pr=new Scanner(System.in);
System.out.println("Enter 10 numbers in ascending order");
for(i=0; i<10; i++)
{
a[i]=pr.nextInt();
}
System.out.println("Enter a number to search");
key=pr.nextInt();
}
void search()
{
int i=0,j=9,mid,flag=0,pos=0;
while(i<=j && flag==0)
{
mid=(i+j)/2;
if(a[mid]==key)
{
flag=1;
pos=mid+1;
}
else if(a[mid]<key)
i=mid+1;
else if(a[mid]>key)
j=mid-1;
}
if(flag==1)
System.out.println("The number is at "+pos+" position");
}
}
class BinarySearch
{
public static void main(String args[])
{
demo obj=new demo();
obj.input();
obj.search();
}
}