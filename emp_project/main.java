package com.emp_project;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***Welcom to Employee Managemnet Application");
		
		do {
			
		System.out.println("\n***************");
			System.out.println("1.Add Employee\n"+
			"2.Show Employee\n"+
			"3.Show Employee Based on Id\n"+
			"4. Update the Employee\n"+
			"5. Delete the Employee\n"+
			"6. Exit");
			System.out.println("Enter Your Choice");
			
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				Employee emp=new Employee();
				System.out.println("Enter Id");
				int id=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter Salary");
				double salary=sc.nextDouble();
				System.out.println("Enter Age");
				int age=sc.nextInt();
				
				
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				emp.setAge(age);
				
				dao.createEmployee(emp);				
				break;
			case 2:
				dao.showAllEmployee();
				System.out.println("Show Employee Details");
				break;
			case 3:
				System.out.println("Enter id to show the detail of the employee");
				int empid=sc.nextInt();
				dao.showEmployeeBasedOnId(empid);
				break;
			case 4:
				System.out.println("For Updating data");
				System.out.println("Enter id");
				int empid1=sc.nextInt();
				System.out.println("Enter name");
				String empname1=sc.next();
				dao.updateEmployee(empid1, empname1);
				System.out.println("Update Employee Details");
				break;
			case 5:
				System.out.println("Enter id for Delete data of employee");
				int del_emp_id=sc.nextInt();
				dao.deleteEmployee(del_emp_id);
				break;
			case 6:
				System.out.println("Thank you to use this application");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				
			
			}
			
			
			
		}while(true);
		
	}

}
