import java.util.Scanner;
public class MagicNumber
{
public static void main(String args[])
{
Scanner pr=new Scanner(System.in);
int number, temp, sum=0, remainder;
number=pr.nextInt();
while(number>9)
{
temp=number;
while(temp>0){
remainder=temp%10;
sum=sum+remainder;
temp=temp/10;
}
number=sum;
sum=0;
}
if(number==1)
{
System.out.println("This is a magic number");
}
else
System.out.println("This is not a magic number");
}
}
