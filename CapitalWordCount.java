import java.util.Scanner;
public class CapitalWordCount
{

public static void main(String[] args)
{
int i;
Scanner ob1 = new Scanner(System.in);
System.out.println("enter a line:");
String str = ob1.nextLine();

String[] word = str.split(" ");
int count = 0;

for(i=0; i < word.length ; i++)
{
char ch = word[i].charAt(0);

if(ch >= 'A' && ch<='Z')
{
count ++;
}
}

System.out.println("number of words starting with capital letter:" + count);
}
}