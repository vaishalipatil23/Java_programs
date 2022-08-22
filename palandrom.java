// WRITE A JAVA PROGRAM TO CHECK THE GIVEN NUMBER IS PALINDROM OR NOT ....

package assignment;

import java.util.Scanner;

class  demo2{

        int no, div, sum, temp_no;
	Scanner p1 = new Scanner(System.in);
	
	void get() {
		System.out.print("Enter Number :-");
		no = p1.nextInt();
	}
	
	void put() {
		temp_no = no;
		sum = 0;
		
		while(no>0) {
			div = no%10;
			sum = sum*10+div;
			no = no/10;
		}
		  if(temp_no == sum) {
			  System.out.println("Number is Palindrom");
		  }
		  else {
			  System.out.println("Number is not palindrom");
		  }
	}
}


public class palandrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          demo2 p2 = new demo2();
          p2.get();
          p2.put();
	}

}
