import java.util.Scanner;
class calculation
{
int a[][]=new int[5][5];
int b[][]=new int[5][5];
int c[][]=new int[5][5];
int d[][]=new int[5][5];
void input()
{
int i,j;
Scanner pr=new Scanner(System.in);
System.out.println("Enter the elements of the first array");
for(i=0; i<5; i++)
{
for(j=0; j<5; j++)
a[i][j]=pr.nextInt();
}
System.out.println("Enter the elements of the second array");
for(i=0; i<5; i++)
{
for(j=0; j<5; j++)
b[i][j]=pr.nextInt();
}
}
void add()
{
int i,j,sum=0;
for(i=0; i<5; i++)
{
for(j=0; j<5; j++)
{
sum=sum+a[i][j]+b[i][j];
c[i][j]=sum;
sum=0;
}}}
void sub()
{
int i,j,sub=0;
for(i=0; i<5; i++)
{
for(j=0; j<5; j++)
{
sub=sub+(a[i][j]-b[i][j]);
d[i][j]=sub;
sub=0;
}}}
void output()
{
int i,j;
System.out.print("The Addtion=");
for(i=0; i<5; i++)
{
for(j=0; j<5; j++)
{
System.out.print(" "+c[i][j]);
}
}
System.out.println("The subtraction=");
for(i=0; i<5; i++)
{
for(j=0; j<5; j++)
{
System.out.print(" "+d[i][j]);
}
}}}
class 2D
{
public static void main(String args[])
{
calculation obj=new calculation();
obj.input();
obj.add();]
obj.sub();
obj.output();
}
}