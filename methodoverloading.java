//Demonstrate method overloading. 

class overloading
{
   void read(int x)
  {
    System.out.println("Value of X="+x);
  }

  void read(int a,int b,int c)
    {
      System.out.println("Value of A="+a);
      System.out.println("Value of B="+b);
      System.out.println("Value of C="+c);
      System.out.println("Multiplication of A*B*C="+a*b*c);

  }
}
class methodoverloading
{
 public static void main(String args[])
 {
  overloading obj=new overloading();
  obj.read(10);
  obj.read(20,30,40);
}
 }
