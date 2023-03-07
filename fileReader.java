import java.io.*;
class fileReader
{
public static void main(String args[])
{
try
{
FileReader r=new FileReader("C:\\Users\\Admin\\Desktop\\hello.txt");
try
{
int i;
while((i=r.read())!=-1)
{
System.out.print((char)i);
}
}
finally
{
r.close();
System.out.println("\nFile closed");
}
}
catch(IOException i)
{
System.out.println("\nSystem handled.....");
}
}
}