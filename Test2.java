// write a program to demonstrate a static function calling a non static function through object

import java.util.*;
class Test2{
int maximum(int x, int y){
if(x>y) return x;
else return y;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
int a=sc.nextInt();
int b=sc.nextInt();
Test2 obj=new Test2();
int z=obj.maximum(a,b);
System.out.println("The maximum is :"+z);
}
}