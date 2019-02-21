public class Calcu
{
	public void operation()
	{
         System.out.println(" Math's Operation Like + - * /");
	}
	 public static void main(String[] args) 
	{
       Calcu c=new Calcu();
       c.operation();
       Add a=new Add();
       System.out.println("a="+a);
       a.add(10,20);
       sub s=new sub();
       s.sub(20,10);
       Mul m=new Mul();
       m.mul(10,10);
       Div d=new Div();
       d.div(20,10);		 
    }
}