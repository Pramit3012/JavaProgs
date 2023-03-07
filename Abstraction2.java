abstract class Programming
{
public abstract void developer();
public abstract void rank();
}
class HTML extends Programming
{
@Override
public void developer()
{
System.out.println("Tim Berners Lee");
}
@Override
public void rank()
{
System.out.println("3rd ranked");
}
}
class Java extends Programming
{
@Override
public void developer()
{
System.out.println("James Gosling");
}
@Override
public void rank()
{
System.out.println("2nd ranked");
}
}
class Abstraction2
{
public static void main(String args[])
{
Programming obj1=new HTML();
Programming obj2=new Java();
obj1.developer();
obj1.rank();
obj2.developer();
obj2.rank();
}
}