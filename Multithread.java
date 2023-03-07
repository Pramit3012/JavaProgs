class A extends Thread
{
@Override
public void run()
{
try{
int i;
for(i=1;i<=5;i++)
{
System.out.println("Pramit");
Thread.sleep(1000);
}
}
catch(InterruptedException i)
{
System.out.println(i);
}
}
}
class Multithread
{
public static void main(String args[]) throws InterruptedException
{
A obj=new A();
obj.start();
int i;
for(i=0; i<=5; i++)
{
System.out.println("Dishani");
Thread.sleep(1000);
}
}
}