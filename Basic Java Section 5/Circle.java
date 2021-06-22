/* Create a class Circle, it will have only one constructor which accepts radius as an argument. Write two methods in the class - calcuateArea(), calculatePermiter(). 
Write test class to test method calls.

class Circle{
  int rad;
  Circle(int r){this.rad = r;}
  double calArea(){}
  double calPerimeter(){}
}
*/


package com.tester;

public class Circle {
	  double rad;
	 
	  public Circle(double rad) {
		  this.rad = rad;
	  }

  public void calArea() {
	  double area = 0;
	  area = 3.14 * rad * rad;
	  System.out.println("The Area of Circle is :" +area);
	 }
   
  public void calPerimeter() {
	  double perimeter = 0;
	  perimeter = 2 * 3.14 * rad ;
	  System.out.println("The Area of Circle is :" +perimeter);
	 }
  
  
}