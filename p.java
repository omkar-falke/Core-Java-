class p
{
	public Object m1()
	{
		return "1 -------------- m1 call";
	}
}

class A extends p
{
	public String m1()
	{
		return "2-------------------- m1 call";
	}
 public static void main(String[] args) 
 {
    A a=new A();
String result= a.m1();	
System.out.println(result);

 }
}