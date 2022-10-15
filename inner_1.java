//Java program to demonstarate inner class.
class outer{
	class inner{
		public void show(){
			System.out.println("In a nested class method");
		}
	}
}
class inner_1{
	public static void main(String []args){
	   //obj creation
		outer.inner obj = new outer().new inner();
		obj.show();
	}
}
