import java.io.*;
class fileRename
{
public static void main(String args[])
{
File f=new File("C:\\Users\\Admin\\Desktop\\hello.txt");
File r=new File("C:\\Users\\Admin\\Desktop\\tatti.txt");
if(f.exists())
{
f.renameTo(r);
System.out.println("File reanmed successfully");
}
else
{
System.out.println("File doesn't exists");
}
}}
