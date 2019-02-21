public class MethodOver
{
	public void marry()
	{
		System.out.println("1----------------------- Method Overriding");
	}
}
class Over extends MethodOver
{
	public void marry()
	{
	   System.out.println("2----------------------- Method Overriding");	
	}
 public static void main(String args[])
 {
 	MethodOver mo=new MethodOver();
 	mo.marry();

 	Over o=new Over();
 	o.marry();

 	MethodOver temp=new Over();
 	temp.marry();
 }
}


/* Output of Above Program
1----------------------- Method Overriding
2----------------------- Method Overriding
2----------------------- Method Overriding 
*/
