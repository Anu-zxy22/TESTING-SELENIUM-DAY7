package com.DaySeven;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CalClass {
	int a,b,c;
	@BeforeSuite
	void getdata()
	{
//		System.out.println("Enter the values to calculte");
//		Scanner sc=new Scanner(System.in);
//		
		a=7;
		b=4;
	}
  @Test(priority=1)
  public void add() {
	  c=a+b;
	  Assert.assertEquals(c, 11);
	  
	  
  }
  @Test(priority=3)
  public void subtract() {
	  c=a-b;
	  Assert.assertEquals(c, 3);
  }
  @Test(priority=2)
  public void multiply() {
	  c=a*b;
	  Assert.assertEquals(c, 28);
	  
  }
  @Test(priority=4)
  public void divide() {
	  c=a/b;
	  Assert.assertEquals(c, 1);
  }
  
}

