public class SimpleTest
{
	public void m1()
	{
		System.out.println("m1 call");
	}
	public String name()
	{
        return "Omkar";
	}

	public void disp(String name)
	{
		System.out.println("name "+name);
	}
	 public static void main(String[] args) {

	 	SimpleTest st=new SimpleTest();
	 	String n= st.name();
	 	// st.name(n);

	}
}