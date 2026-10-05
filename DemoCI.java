import java.util.*;
class A{
	private int a,b;
	A( int x,int y){
		a= x;
		b= y;
	}
	void sum(){
		System.out.println("The sum of a and b "+(a+b));
	}
}

class B extends A{
	private int c;
	B(int m,int n,int p){
		super(m,n);
		c= p;
	}
	void showB(){
		System.out.println("The value of c is "+c);
	}
}
class C extends B{
	private int d;
	C(int i,int j,int k,int l){
		super(i,j,k);
		d=l;
	}
	void showC(){
		System.out.println("The value of  d is "+d);
	}
}
class DemoCI {
	public static void main(String args[]){
	C c1 = new C(10,20,30,40);
	c1.showC();
	c1.showB();
	c1.sum();
	}
}