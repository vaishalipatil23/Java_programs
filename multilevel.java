package assignment;
import java.util.Scanner;

class demo5{
	Scanner s1 =new Scanner(System.in);
	int a,b;
	void read() {
	System.out.println("Enter value of a :-");
	a = s1.nextInt();
	System.out.println("Enter value of b :-");
	b = s1.nextInt();
	}
}
class add extends demo5{
	int c;
	void show() {
	c=a+b;
	System.out.println("Addition of a & b is :-"+c);
	}
}
class add2 extends add{
	int d;
	void display() {
      d=c+a;
      System.out.println("addition of a & c is :-"+d);
	}
}
public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add2 a1 = new add2();
		a1.read();
		a1.show();
		a1.display();

	}

}
