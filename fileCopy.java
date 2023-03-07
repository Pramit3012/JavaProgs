import java.io.*;
class fileCopy
{
public static void main(String args[]) throws IOException
{
FileInputStream r=new FileInputStream("C:\\Users\\Admin\\Desktop\\tatti.txt");
FileOutputStream w=new FileOutputStream("C:\\Users\\Admin\\Desktop\\hello.txt");
int i;
while((i=r.read())!=-1)
{
w.write((char)(i));
}
System.out.println("File copied successfully....");
}
}