/*Create a class Emp with fields like empId, name,dept,salary,address.
  Write required constructors for initialization
  Write a method displayEmpDetails() in the same class.
  
  Write another test class , where you have to take emp details from user using Scanner and create object and call methods.
 */

package com.tester;

public class Emp {
	double empId;
	String empName;
	String empDept;
	String empAddress;
	double empSalary;

      public Emp(double empId, String empName, String empDept, String empAddress, double empSalary) {
                      this.empId = empId;
                      this.empName = empName;
                      this.empDept = empDept;
                      this.empAddress = empAddress;
                      this.empSalary = empSalary;
               }
              
            public void displayEmpDetails() {
                
         		
           	 System.out.println(" empId " +empId);
           	 System.out.println(" empName " +empName);
           	 System.out.println(" empDept " +empDept);
           	 System.out.println(" empAddress " +empAddress);
           	 System.out.println(" empSalary " +empSalary);
           	 
           	 
            }
}
              
     
     