import java.util.Scanner;
class reverse
{
int getdata(int i)
{
int rev=0;
while(i>0)
{
rev=(rev*10)+i%10;
i=i/10;
}
return(rev);
}
public static void main(String args[])
{
int m;
reverse x=new reverse();
Scanner pr=new Scanner(System.in);
System.out.println("Enter a number to reverse");
m=pr.nextInt();
int answer=x.getdata(m);
System.out.println("The reverse of the number is "+answer);
}
}
