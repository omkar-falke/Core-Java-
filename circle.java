public class circle
{
	float PI=3.14f;
	public void radius(int radius)
	{
		float area=PI*radius*radius;
		System.out.println("Area of circle is"+"="+area);
	}
	public int sum(int x,int y)
	{
		int sum=x+y;
		circle c=new circle();
		c.radius(sum);
		return sum;
	}
	public void display_result(float result)
	{
		System.out.println("Sum of number is ="+result);
	}
     public static void main(String[] args) {
      circle c=new circle();
      int sum=c.sum(3,3);
      c.display_result(sum);
		
	}
}