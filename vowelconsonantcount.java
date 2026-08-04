import java.util.Scanner;
public class vowelconsonantcount
{
public static void main(String[]args)
{
int i;
Scanner sc = new Scanner(System.in);
System.out.print("enter a line:");
String str = sc.nextLine();

int vowels=0;
int consonant = 0;

str = str.toLowerCase();

for(i=0;i<str.length();i++)
{
char ch = str.charAt(i);
if(ch>='a' && ch<='z')
{
if(ch=='a' || ch=='e'||ch=='i'|| ch=='o'|| ch=='u')
   vowels++;
else
   consonant++;
}
}

System.out.println("number of vowels:" + vowels);
System.out.println("number of consonant:" + consonant);
 

}
}
