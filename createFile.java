import java.io.*;
class createFile
{
public static void main(String args[]) throws IOException
{
File f=new File("C:\\Users\\Admin\\Desktop\\hello.txt");
if(f.createNewFile())
{
System.out.println("File created Successfully");
}
else
{
System.out.println("File already Exists");
}
}}