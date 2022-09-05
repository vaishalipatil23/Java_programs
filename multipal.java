package assignment;

interface demo6{
	void show(); 
}

class read_value{
	int a,b;
	void read() {
		a=10;
		b=20;
	}
}
class accept extends read_value implements demo6{
	public void show() {
		System.out.println(a*b);
	}
}

public class multipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accept a1 = new accept();
		a1.read();
		a1.show();

	}

}
