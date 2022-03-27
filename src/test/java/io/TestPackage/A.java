package io.TestPackage;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class A {
	
	@Test
	public void a() {
		Class/* <? extends A> */ c = this.getClass();
		
		System.out.println(c.getSimpleName());	//Print Class name
		
		System.out.println(c.getDeclaredMethods());
		
		Method[] a = c.getDeclaredMethods();
		
		System.out.println(a.length);
	}
	
}

