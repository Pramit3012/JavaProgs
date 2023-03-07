class thread1 extends Thread
{
public void run()
{
String str=Thread.currentThread().getName();
for(int i=1; i<=3; i++)
{
System.out.println(str);
}}}
class thread2 extends Thread
{
public void run()
{
String str=Thread.currentThread().getName();
for(int i=1; i<=3; i++)
{
System.out.println(str);
}}}
class Multithread6
{
public static void main(String args[])
{
thread1 t1=new thread1();
thread2 t2=new thread2();
t1.setName("Pramit");
t2.setName("Dishani");
t2.start();
t2.stop();
t1.start();
}}