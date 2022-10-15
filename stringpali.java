// Java program to check the string is palindrome or not.

import java.util.Scanner;
class demo
{
void get()
{
String original,reverse="";

Scanner in=new Scanner(System.in);

System.out.println("Enter Number");

original =in.nextLine();

int length =original .length();

for (int i=length -1;i>=0;i--)
	
	reverse=reverse + original.charAt(i);

if(original.equals(reverse))
	
	System.out.println("Number is Palindrome");
else
	System.out.println("Number is not palindrome");


}


void get1()
{
String original,reverse="";

Scanner in=new Scanner(System.in);

System.out.println("Enter String");

original =in.nextLine();

int length =original .length();

for (int i=length -1;i>=0;i--)
	
	reverse=reverse + original.charAt(i);

if(original.equals(reverse))
	
	System.out.println("String is Palindrome");
else
	System.out.println("String is not palindrome");

}
}


public class stringpali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo D=new demo();
D.get();
D.get1();
	}

}
