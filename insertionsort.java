//Insertion sort
import java.util.Scanner;
class Insertion
{
int a[]=new int[10];
void getdata()
{
Scanner pr=new Scanner(System.in);
int i;
System.out.println("Enter elements to be sorted");
for(i=0; i<10; i++)
{
a[i]=pr.nextInt();
}
}
void output()
{
int i;
System.out.println("The sorted elements are");
for(i=0; i<10; i++)
{
System.out.print(a[i]+" ");
}
}
void sort()
{
int i,temp,j;
for(i=1; i<10; i++)
{
temp=a[i];
j=i-1;
while(temp<a[j])
{
a[j+1]=a[j];
j--;
if(j==-1)
break;
}
a[j+1]=temp;
}
}
}
class insertionsort
{
public static void main(String args[])
{
Insertion obj=new Insertion();
obj.getdata();
obj.sort();
obj.output();
}
}