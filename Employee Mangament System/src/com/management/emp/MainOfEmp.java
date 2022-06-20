package com.management.emp;

import java.util.Scanner;

public class MainOfEmp implements EmpInterface{
	int x;
	public static Employee[] employees;
	
	@Override
	public  void showEmpById(int id, Employee[] emps) {
		
		try {
				for (int i = 0; i < emps.length; i++) 
				{
								
					if(emps[i].id==id) {
						System.out.println();
						System.out.println("_______________________");
						System.out.println(emps[i]);
						System.out.println("________________________");
					}
								
				}
			
		} catch (Exception e) {
			
			System.out.println("----------------------------------");
			System.out.println("Ohoo!!! Id Not Found...");
			System.out.println("------------------------------------");
		}
				
			
		
	}

	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			//boolean b=true;
			while(true) {
				
				System.out.println("___________Welcome to Employee Management System!_________");
				System.out.println();
				
				System.out.println("Enter 1 for Add Employee.... ");
				System.out.println("Enter 2 for Serch Employee By ID..");
				System.out.println("Enter 3 for Exit System..!");
				System.out.println();
				int key=sc.nextInt();
				
				//-------Case started!!!
				switch (key) 
				{
				
				//Add Employee!
				case 1:
					System.out.println("Enter How Many Employee you Want to add?..");
					int length=sc.nextInt();
					employees=new Employee[length];
					
					for (int i = 0; i <length; i++) {
						System.out.println("--------------------------------");
						Employee e1=new Employee();
						System.out.println("Enter Employee ID");
						System.out.println();
						e1.id=sc.nextInt();
						
						System.out.println("Enter Employee Name");
						System.out.println();
						e1.name=sc.next();
						sc.nextLine();
						System.out.println("Enter Employee Place");
						System.out.println();
						
						e1.place=sc.next();
						sc.nextLine();
						System.out.println("Enter Employee Salary");
						System.out.println();
						e1.salary=sc.nextDouble();
						System.out.println("Enter Employee Designation?");
						System.out.println();
						e1.designation=sc.next();
						sc.nextLine();
					
						
						//Add Employee in Array
						employees[i]=e1;
						System.out.println("________________________________________");
						
					}
					
					break;
					
					case 2:
						
					System.out.println("Enter Employee Id for Find ..");
						MainOfEmp mp=new MainOfEmp();
						int id=sc.nextInt();
						mp.showEmpById(id, employees);
						System.out.println();
						System.out.println();
						
					
					break;
					
					case 3:
						
						System.out.println("Thank You for Use Employee Management System!..");

						System.exit(2);
				}
				
			}
			
		
	}
	

	

}
