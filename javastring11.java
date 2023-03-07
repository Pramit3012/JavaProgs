//string buffer functions-- string.setCharAt(n,'character')[n=index]This function replace nth index character with given character,
//append()=string1.append(string2)-This function joins two stringbuffers
//insert string1.insert(n,string2)- it inserts a string into another string.
//setLength()=string.setLength(n)[n=length]-It can change the length of the string buffer.
import java.util.Scanner;
class javastring11
{
public static void main(String args[])
{
StringBuffer str=new StringBuffer();
Scanner pr=new Scanner(System.in);
str.append(pr.nextLine());
str.setCharAt(2,'x');
System.out.println(str);
str.insert(3,"ABCD");
System.out.println(str);
str.setLength(20);
System.out.println(str);
}
}