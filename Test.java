class Calculator
{
	void sum()
	{
		int sum=0;
		sum=5+5;
		System.out.println("Sum of Two Number="+""+sum);
	}
	void sub()
	{
		int sub=0;
		sub=5-5;
		System.out.println("Sum of Two Number="+""+sub);
	}
	void mul()
	{
		int mul=0;
		mul=5*5;
		System.out.println("mul of Two Number="+""+mul);
	}
	void div()
	{
		int div=0;
		div=5/5;
		System.out.println("Div of Two Number="+""+div);
	}

	public static void main(String[] args) {
	 System.out.println("BASIC MATH OPRETATION LIKE ADDITION SUBSTRATON MULTIPICATION DIVISION");
	 Calculator math=new Calculator();
	 math.sum();
	 math.sub();
	 math.mul();
	 math.div();
	}
}