class A implements Runnable
{
public void run()
{
try{
for(int i=1;i<5;i++)
{
System.out.println("This is child thread");
Thread.sleep(1000);
}}
catch(InterruptedException i)
{
System.out.println(i);
}
}
}
class Multithread2
{
public static void main(String args[]) throws Exception
{
A r=new A();
Thread t=new Thread(r);
t.start();
for(int i=1;i<5;i++)
{
System.out.println("This is main thread");
Thread.sleep(1000);
}
}}