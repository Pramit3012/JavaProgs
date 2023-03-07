//Private Constructor-In java it is possible to write a constructor as a private but according to the rule we can't access private members outside of class
//Priavate constructor is used for security purposes
class PrivateConstructor
{
int a; double b; String c;
private PrivateConstructor()
{
a=10; b=23.47; c="Pramit";
System.out.println(a+" "+b+" "+c);
}
public static void main(String args[])
{
PrivateConstructor obj= new PrivateConstructor();//In private constructor we can't create an object of the constructor in any other class
}
}