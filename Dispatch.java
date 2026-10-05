// dynamic method  dispatch

class A{
	void show(){
		System.out.println("we are in class A");
	}
}
class B extends A{
	void show(){
		System.out.println("we are in class B");
	}
}
class C extends A{
	void show(){
		System.out.println("we are in class C");
	}
}
class Dispatch{
	public static void main(String args[]){
		A aa=new A();
		B bb=new B();
		C cc=new C();
		aa.show();
		bb.show();
		cc.show();
		
		A a1;
		a1=new A();
		a1.show();
		a1=new B();
		a1.show();
		a1=new C();
		a1.show();


	}
}


