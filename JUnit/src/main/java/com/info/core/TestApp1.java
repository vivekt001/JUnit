package com.info.core;




import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestApp1 {

	@Test
	public void testPrintHelloWorld() {
		
		Assert.assertEquals(App.getHelloWorld(), "Hello World");
		System.out.println("Test 1");
	}	
	@Test
	public void testPrintHelloWorld3() {

		Assert.assertEquals(App.getHelloWorld3(), "Hello World 3");
		System.out.println("Test 2");
	}
	
	@Before
	public void before(){
		System.out.println("Before");
	}
	
	@After
	public void after(){
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("AfterClass");
	}
}

