//Demonstrate method overriding 

class A
{  
  void run()
  {
     System.out.println("This Is Base Class");}  
}  
class B extends A
{  
  void run()
  {
      super .run();
      System.out.println("This is Derived Class");
      }  
}
class methodoverriding
{
  public static void main(String args[])
  {  
  B obj = new B();  
  obj.run();
  }  
}
