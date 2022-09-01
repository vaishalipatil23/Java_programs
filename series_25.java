package assignment;

class demo3{
	int i,a,b;
	void show() {
	for(i=2; i<=8; i++) {
		a=i*i*i;
		b=i*i;
		System.out.println(a-b);
	}
  }
}  

public class series_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo3 d1 = new demo3();
		d1.show();

	}

}
