class Cal
{
	 p
	public void addition(int no1 ,int no2 )
	{
		System.out.println("Addition of Two number ="+(no1+no2));//Do Addition
	}
	public void substration(int no1 ,int no2 )
	{
		System.out.println("Substration of Two number ="+(no1-no2));//Do Substration 
	}
	public void multipication(int no1 ,int no2 )
	{
		System.out.println("Multipication of Two number = "+no1*no2);//Do Multipication 
	}
	public void division(int no1 ,int no2 )
	{
		System.out.println("Division of Two number ="+no1/no2);//Do Division 
	}

 public static void main(String[] args)//Main Program Start 
 {
 	 //Create An Object
 	Cal a=new Cal();
 	//Call The Method
 	a.addition(10,20); 
 	a.substration(20,10);
 	a.multipication(10,20);
 	a.division(20,10);
 }	
}