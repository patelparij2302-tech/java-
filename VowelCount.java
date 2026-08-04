import java.util.Scanner;
public class VowelCount
{
public static void main(String[] args)
{
Scanner ob1 = new Scanner(System.in);

while(true)
{
System.out.print("enter sentence or quit for exit:");
String str = ob1.nextLine();

if(str.equalsIgnoreCase("quit"))
break;

int a=0,e=0,i=0,o=0,u=0,A=0,E=0,I=0,O=0,U=0;

for(int j=0 ; j<str.length(); j++)
{
char ch = str.charAt(j);
if (ch=='a')
a++;
else if (ch=='e')
e++;
else if (ch=='i')
i++;
else if (ch=='o')
o++;
else if (ch=='u')
u++;
else if (ch=='A')
A++;
else if (ch=='E')
E++;
else if (ch=='I')
I++;
else if (ch=='O')
O++;
else if (ch=='U')
U++;
}


System.out.println("a =" + a);
System.out.println("e =" + e);
System.out.println("i =" + i);
System.out.println("o =" + o);
System.out.println("u =" + u);
System.out.println("A =" + A);
System.out.println("E =" + E);
System.out.println("I =" + I);
System.out.println("O =" + O);
System.out.println("U =" + U);
}
}
}
