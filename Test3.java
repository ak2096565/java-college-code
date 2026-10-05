// write a program to demonstrate method returning object 

import java.lang.*;
import java.util.*;

class CallBr{
	private int a;
	
	public void CallBr(){
		a=0;
		}
	public void CallBr(int x){
		a=x;
		}
	public CallBr IncBTen(){
		CallBr obj=new CallBr(a+10);
		return obj;
		}
	public void Show(){
		System.out.println("The value of a is "+a);
		}
	}
class Test3{
	public static void main(String args[]){
		CallBr a1=new CallBr(2);
		CallBr b1=new CallBr();
		b1=a1.IncBTen();
		a1.Show();
		b1.Show();
		}
	}
		
	