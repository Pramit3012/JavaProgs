import java.util.Scanner;
class javastring4
{
public static void main(String args[])
{
String s1=new String();
Scanner pr=new Scanner(System.in);
System.out.println("Enter a string");
s1=pr.nextLine();
s1=s1.toUpperCase();
int i,vowel=0,consonant=0;
for(i=0; i<s1.length(); i++)
{
char c=s1.charAt(i);
if(c!=' ')
{
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
vowel++;
}
else
{
consonant++;
}
}
}
System.out.println("The no. of vowels are "+vowel);
System.out.println("The no. of consonants are "+consonant);
}
}