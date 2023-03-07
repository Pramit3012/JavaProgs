import java.util.Scanner;
class multiplication
{
int x=50;
int a[][]=new int[x][x];
int b[][]=new int[x][x];
int c[][]=new int[x][x];
int m,n,p,q;
void input()
{
Scanner pr=new Scanner(System.in);
System.out.println("Enter the row and coloumn of the 1st matrix");
m=pr.nextInt();
n=pr.nextInt();
System.out.println("Enter the row and coloumn of the 2nd matrix");
p=pr.nextInt();
q=pr.nextInt();
int i,j;
System.out.println("Enter the values of 1st matrix");
for(i=0; i<m; i++)
{
for(j=0; j<n; j++)
a[i][j]=pr.nextInt();
}
System.out.println("Enter the values of 2nd matrix");
for(i=0; i<p; i++)
{
for(j=0; j<q; j++)
b[i][j]=pr.nextInt();
}
}
void multi()
{
int sum=0;
if(n==p)
{
for(i=0; i<m; i++)
for(j=0; j<q; j++)
{
for(k=0; k<m; k++)
{
sum=sum+a[i][k]*b[k][j];
c[i][j]=sum;
sum=0;
}
}
System.out.print("The multiplication=");
for(i=0; i<m; i++)
for(j=0; j<q; j++)
System.out.print(c[i][j]+" ");
System.out.println(" ");
}
else
System.out.println("Multiplication can't be done");
}
}
class Multiply2D
{
public static void main(String args[])
{
Multiplication obj= new Multiplication();
obj.input();
obj.multi();
}
}