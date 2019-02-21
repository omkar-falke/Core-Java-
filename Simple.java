class Simple
{
	int x;// Globally Declaration;
	public void m1()
	{
		System.out.println("X initialized = "+x);
	}
	 public static void main(String[] args) {
	 	Simple s1=new Simple();
	 	s1.m1();
	 	Simple s2=new Simple();
	 	s2.x=100;
	 	s2.m1();	
	}
}