//Java program to demonstrate hirachical inheritance. 

class A
{
  int a,b;
  void read()
  {
    a=20;
    b=30;
  }
  }
  class B extends A
  {
   void show()
   {
     System.out.println("value of A="+a);
     System.out.println("value of B="+b);
   }
  }
    class C extends A
    {
     void display()
     {
       System.out.println("Multiplication Is:-"+a*b);
     }
  }
  class hirachical
  {
    public static void main(String args[])
    {
     B obj=new B();
     obj.read();
     obj.show();

     C obj1=new C();
          obj1.read();
          obj1.display();
}
  }
