// write a program to the maximum of two integer numbers using method

import java.util.*;
class Test1{

static int max(int x,int y){
if(x>y) return x;
else return y;
}


public static void main(String args[]){

Scanner sc =new Scanner(System.in);
System.out.println("write the numbers");
int a =sc.nextInt();
int b =sc.nextInt();
int z=max(a,b);


System.out.println("maximum is :"+z);
}
}





