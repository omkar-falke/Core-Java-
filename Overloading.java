//Method Overloading Example

public class Overloading
 {
	public void m1()
	{
		System.out.println(" No args m1 ");
	}

	public void m1( int a)
	{
		System.out.println(" One args m1 call ");
	}

	public void m1(int a,int b)
	{
		System.out.println(" Two args m1 call ");
	}

	 public static void main(String[] args) 
	{
		System.out.println("1---------------");
	 	Overloading m1=new Overloading();
	 	//To Create An Object
	 	m1.m1();
	 	m1.m1(10);
	 	m1.m1(14,13);		
	}
}