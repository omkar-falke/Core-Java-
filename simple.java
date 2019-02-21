public class simple
{
	public int m1(int v)
	{
         return v;
	}

	public void display(int s)
	{
		System.out.println("display="+s);
	}

	 public static void main(String[] args) {
	 	simple s1=new simple();
	 	int temp=s1.m1(10);
	 	s1.display(temp);
	}
}