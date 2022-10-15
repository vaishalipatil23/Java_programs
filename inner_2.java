class outer{
	public void outermethod(){
		System.out.println("outer class method");

		class inner{
			public void innermethod(){
				System.out.println("Inner class method");
			}
		}
		inner i = new inner();
		i.innermethod();
	}
}
class inner_2{
	public static void main(String []args){
		outer o = new outer();
		o.outermethod();
	}
}