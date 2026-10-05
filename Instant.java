import java.util.*;
class A{
	int a=10;
}

class B extends A{
	int a=100;
	void show(){
		System.out.println("The value of a is"+super.a);
		System.out.println("The value of a is"+a);
	}
}

class Instant{
	public static void main(String args[]){
	B b1 = new B();
	b1.show();
	
	}
}