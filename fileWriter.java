import java.util.Scanner;
import java.io.*;
class fileWriter
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
String str;
System.out.println("Enter a message to write in the file");
str=sc.nextLine();
FileWriter f=new FileWriter("C:\\Users\\Admin\\Desktop\\hello.txt");
try
{
f.write(str);
}
finally
{
f.close();
}
System.out.println("File written successfully..");
}
catch(IOException i)
{
System.out.println(i);
}
}}