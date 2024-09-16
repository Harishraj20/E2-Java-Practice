package com.Inheritance;
class Employee{
	private int salary;
	private int dob;

	protected  Employee(int salary,int dob) {
		super();
		this.salary = salary;
		this.dob = dob;
	}

	protected int getSalary() {
		return salary;
	}

	protected void name() {
		
	} void setSalary(int salary) {
		this.salary = salary;
	}
	 protected int getDob() {
	        return dob;
	    }
	
	protected void work() {
		System.out.println("Working as employee!!");
	}
}

class HRManager extends Employee{

	protected HRManager(int salary,int dob) {
		super(salary, dob);
	}
	
	protected void work() {
		System.out.println("Working as HR Manager");
		
	}
	protected void recruitEmployee() {
		System.out.println("Recruiting new employees");
	}
	protected void displaySalary() {
		System.out.println("The salary of the employee is: "+getSalary());
	}
	
}
public class Example2 {
	public static void main(String[] args) {
		 HRManager hr= new HRManager(50000,90);

	        hr.work();
	        hr.recruitEmployee();
	        hr.displaySalary(); 
	}
}
