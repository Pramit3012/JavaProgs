//Why interface variables are final
interface customer
{
int amt=9;//public + static + final
void show();//public + abstract
}
class dealer implements customer
{
//amt=3;//The amt variable is final variable so we cannot update the value of it
public void show()
{
System.out.println("Pramit needs "+amt+"kg rice");
}
}
class Interfacing1
{
public static void main(String args[])
{
customer obj=new dealer();
obj.show();
}
}