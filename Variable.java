import java.util.*;

class Variable{
	int num=10;
	static int value=20;
	void show(){
		int x=5;
		System.out.println("The value of local variable x is"+x);
		System.out.println("The value of instance variable is"+num);
		System.out.println("The value of class variable is"+value);
	}
public  static void main(String args[]){
	Variable v1=new Variable();
	v1.show();
	//System.out.println("the value of variable of x is "+x);
	System.out.println("the value of num is "+v1.num);
	System.out.println("the value of value is"+v1.value);
	System.out.println("the value of value is"+Variable.value);
	System.out.println("the value of value is"+value);
}
}




		