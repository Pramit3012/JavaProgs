class A extends Thread
{
public void run()
{
String str=Thread.currentThread().getName();
for(int i=1; i<=3; i++)
{
System.out.println(str);
}}}
class Multithread4
{
public static void main(String args[]) throws InterruptedException
{
A t1=new A();
A t2=new A();
A t3=new A();
t1.setName("Thread 1");
t2.setName("Thread 2");
t3.setName("Thread 3");
t2.start();
t1.start();
t3.start();
t2.join();
}}
