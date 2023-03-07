//Selection Sort
import java.util.Scanner;
class sorting
{
int a[]=new int[10];
void input()
{
Scanner pr=new Scanner(System.in);
int i;
System.out.println("Enter elements to sort");
for(i=0; i<10; i++)
{
a[i]=pr.nextInt();
}
}
void sort()
{
int i,j,temp;
for(i=0; i<9; i++)
{
for(j=i+1; j<10; j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
}
void output()
{
int i;
System.out.println("The sorted array is");
for(i=0; i<10; i++)
System.out.print(a[i]+" ");
}
}
class selectionsort
{
public static void main(String args[])
{
sorting obj=new sorting();
obj.input();
obj.sort();
obj.output();
}
}