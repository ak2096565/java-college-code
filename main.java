//write a program to demonstrate method  overriding
import java.lang.*;
import java.util.*;

class Father{
	void home(){
		System.out.println("we are in father's home");
		}
	void car(){
		System.out.println("We are using father's car");
		}
	}
class Son extends Father{
	void car(){
		System.out.println("we are using own car");
		}
	}
class Main{
	public static void main(String args[]){
		Son s1=new Son();
		s1.car();
		s1.home();
		Father f1=new Father();
		f1.home();
		f1.car();
		}
	}