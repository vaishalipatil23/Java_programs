final class demo{
  void show(){
	  System.out.print("This is Final class method");
  }
}
class final_class extends demo{
	void show_1(){
		System.out.println("This is base class method");
	}
	public static void main(String []args){
		final_class f1 = new final_class();
		f1.show();
		f1.show_1();
	}
}
