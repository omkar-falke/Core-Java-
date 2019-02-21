public class test
{
	public void m1()
	{
		System.out.println("1----  Hello");
	}
	public int  m2(int a)
	{
		int c=a;
		return c;
	}
    public float  m3(float b)
    {
    	float c=b;
   	  	return c;
    }
    public String  m4(String d)
     {
     	String c=d;
    	 return c;
     }
    private double  m5(double e)
     {
       double c=e;
       return c;
     }

    public static void main(String[] args) 
    {
       test t1=new test();
       t1.m1();
       int w=t1.m2(12);
       float s=t1.m3(12.2f);
       String d=t1.m4("yash");
       double v=t1.m5(12.3097718895);
       System.out.println("Integer"+w);
       System.out.println("Float"+s);
       System.out.println("String"+d);
       System.out.println("double"+v);
    }

}