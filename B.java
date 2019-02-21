
public class B
{
	public void m2()
	{
		System.out.println("m2 method call");
		A a1=new A();
		a1.m1();
	}
	
	
  public static void main(String[] args) 
  {
  	System.out.println("main Start");
  	B b1=new B();
  	b1.m2();
 	
 }
}