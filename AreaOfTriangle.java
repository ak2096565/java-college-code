// write a program to calculate area of triangle if three sides are given

import java.lang.*;
import java.util.*;

class AreaOfTriangle{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the sides of triangle :");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
if(a+b>c && b+c>a && a+c>b)
{
double s=(a+b+c)/2;
double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("the area of the triangle is :"+area);
}
else{
System.out.println("values are wrong\nthe value of the sides of the triangle is not correct:");
}
}
}

