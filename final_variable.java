//Java program to demonstrate final variable. 

class A
{
	final int a;
	a=10;
void put()
{
	a=a+10;
	System.out.print("A="+a);
}
}
public class finalvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A o=new A();
o.put();
	}

}
