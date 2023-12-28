package com.singleton;

public class DemoSingleThread {
	public static void main(String[] args) {
		Singleton singleton  = Singleton.getInstance("Hello");
		Singleton singleton2 = Singleton.getInstance("World");
//		Singleton singleton3 = new Singleton("new");
		System.out.println(singleton.value);
		System.out.println(singleton2.value);
	}
}
