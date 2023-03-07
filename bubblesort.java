//Bubble Sort
import java.util.Scanner;
class sorting
{
int a[]=new int[10];
void input()
{
Scanner pr=new Scanner(System.in);
int i;
for(i=0; i<10; i++)
{
a[i]=pr.nextInt();
}
}
void output()
{
int i;
for(i=0; i<10; i++)
{
System.out.print(a[i]+" ");
}
}
void sort()
{
int i,j,temp;
for(i=0; i<10; i++)
{
for(j=0; j<9; j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
}
}
class bubblesort
{
public static void main(String args[])
{
sorting obj=new sorting();
System.out.println("Enter array elements to sort");
obj.input();
obj.sort();
System.out.println("The sorted array is");
obj.output();
}
}