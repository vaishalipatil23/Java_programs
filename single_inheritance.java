package assignment;
import java.util.Scanner;
class get {
	int no;
	Scanner s1 = new Scanner (System.in);
	void get_number() {
	System.out.print("Enter Number :-");
	no = s1.nextInt();
	}
}

class print extends get {
	void put() { 
	int i = 1;
	while(i<=10) {
		System.out.println(i*no);
		i++;
	}
  }
}
public class single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
print t1 = new print();
t1.get_number();
t1.put();
	}
}
