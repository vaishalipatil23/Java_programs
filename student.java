package assignment;

import java.util.Scanner;
import java.lang.Number;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=3; i++) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name :- ");
		String name=sc.nextLine();
		
		System.out.println("Enter Mobile Number :-");
		long mono=sc.nextLong();
		
		System.out.println("Enter class name :-");
		String classn=sc.next();
		
		System.out.println("Enter Roll no. :-");
		int rollno=sc.nextInt();
		
		System.out.println("..........................................");
		
		System.out.println("Name is :-"+name);
		System.out.println("Mobile Number is :-"+mono);
		System.out.println("Class name  is :-"+classn);
		System.out.println("Roll Number is :-"+rollno);
		System.out.println("---------------------------------------------------------------------");
		}
	}

}
