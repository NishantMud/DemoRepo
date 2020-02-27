package com.cg;

class Parent{
	{System.out.println("pehli line in superclass");}
	
	public String name;
	public Parent(String name) {
		System.out.println("Hello");
		this.name = name;
		
		System.out.println("Parent constructor");
		System.out.println(name);
	}
	static {
		System.out.println("Static block");
	}
	public void method1() {
		System.out.println("Parent method");
	}
	
}

public class Child extends Parent {

	private Integer id;
	
	private Child(Integer identity, String name) {
		
		super(name);
		
		this.id = identity;
		System.out.println("Child constructor");
		System.out.println(id+" "+name);
	}
	
	public void  method2() {
		System.out.println("Child method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child(23, "Ramu");
		//Parent parent = new Parent("Rahul");
		//Child c = (Child) new Parent("Sushil"); //class cast exception..
		Parent p = new Child(32,"Kohli");
		Child c1 = (Child)p;
		Parent p1 = (Parent) p;
		//(Child) p = new Child(21,"Raju");
		if(p1 instanceof Parent){
			System.out.println("Instance of child/Parent");
		}
		else {
			System.out.println("Not instance of child/Parent");
		}
		((Child)p).method2();
		
	}
	public  void method() {
		Child child= new Child(32, "Ram");;
		System.out.println("in static method "+child.id);
	}

}
