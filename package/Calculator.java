package com.app.math;
public class Calculator
{
  public static void main(String[] args) 
  {
  	System.out.println("1.Main Start --------------------");
	 Calculator c=new Calculator();
	 Display d=new Display();
	 Add a=new Add();
	 Sub s=new Sub();
	 Mul m=new Mul();
	 Div d1=new Div();
	 int add=a.add(10,20);
	 int sub=s.sub(30,20);
	 int mul=m.mul(10,20);
	 int div=d1.div(20,20);
	 d.add(add);
	 d.sub(sub);
	 d.mul(mul);
	 d.div(div);
	 // System.out.println("Addition of two number="+add);
	 // System.out.println("Substration of two Number="+sub);
	 // System.out.println("Multipication of two number="+mul);
	 // System.out.println("Division of two number is =",div);	
  }
}