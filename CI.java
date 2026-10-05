//constructor in inheritance 

class A{
	A(){
	System.out.println("we are in class A");
	}
}
class B extends A{
	B(){
	System.out.println("we are in class B");
	}
}
class CI{
	public static void  main(String args[]){
		B b1=new B();
		}
}
		