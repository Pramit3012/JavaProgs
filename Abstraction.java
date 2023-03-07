abstract class animal
{
animal()
{
System.out.println("All animals...");
}
public abstract void sound();
}
class Dog extends animal
{
Dog()
{
super();
}
public void sound()
{
System.out.println("Dog is barking");
}
}
class Lion extends animal
{
public void sound()
{
System.out.println("Lion is roaring");
}
}
class Abstraction
{
public static void main(String args[])
{
Dog obj=new Dog();
Lion onj=new Lion();
obj.sound();
onj.sound();
}
}