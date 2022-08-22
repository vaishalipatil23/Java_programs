package assignment;

import java.util.Scanner;

class demo{
	
	int t1, t2, no, nextno;
	Scanner sc  = new Scanner(System.in);
	  void read() {
		  System.out.print("Enter Number :-");
		  no = sc.nextInt();
	  }
	  void show() {
		  t1 = 0;
		  t2 = 1;
		  System.out.println(t1);
		  System.out.println(t2);
		  
		   for(int i=2; i<no; i++) {
			   nextno = t1+t2;
			   System.out.println(nextno);
			   t1 = t2;
			   t2 = nextno;
			   
			   
		   }
	  }
}

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d1 = new demo();
		d1.read();
		d1.show();

	}

}
