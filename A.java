import java.util.*;
class A{
	A(){
		System.out.println("we are in default constructor");
		System.out.println("The value of this keyword is "+this);
	}
	public static void main(String args[]){
	A obj1 = new A();
	System.out.println("The value of obj1 is "+obj1);
	}
}