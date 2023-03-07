class A extends Thread
{
public void run()
{
String str=Thread.currentThread().getName(); //Thread.CurrentThread().getName() this func finds the name of the thread executing on that time
for(int i=1; i<=3;  i++)
{
System.out.println(str);
}
}
}
class Multihtread3
{
public static void main(String args[])
{
A t1=new A();
A t2=new A();
A t3=new A();
t1.setName("Thread 1");
t2.setName("Thread 2");
t3.setName("Thread 3");
t1.start();
t2.start();
t3.start();
String str=Thread.currentThread().getName();
for(int i=1; i<=3;  i++)
{
System.out.println(str);
}
}
}