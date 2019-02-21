package com.cjc.demo;
import com.cjc.demo1.*;
public class Test
{
	public void m1()
	{
		System.out.println("---------------- m1 call");
	}
	 public static void main(String[] args) {
	 	System.out.println("Main Start ----");
	 	Test t=new Test();
	 	Test1 t1=new Test1();
	 	Test3 t3=new Test3();
	 	t.m1();		
	 	t1.m2();
	 	t3.m3();

	}
}