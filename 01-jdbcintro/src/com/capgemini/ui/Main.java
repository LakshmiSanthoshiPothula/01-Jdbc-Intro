package com.capgemini.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.bussiness.Customer;
import com.capgemini.db.CustomerDAO;
import com.capgemini.db.CustomerDAOImpl;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		while(true){
      System.out.println("Customer Application");
      System.out.println("....................");
      System.out.println("1.Add New Customer");
      System.out.println("2.Update Customer");
      System.out.println("3.Display All Customers");
      System.out.println("4.Delete Customer");
      System.out.println("5.Exit");
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter option");
      int choice=scanner.nextInt();
		switch (choice) {
			case 1:add();
                 
				  break;

			case 2:update();
				
				   break;
			case 3:displayAll();
				
				  break;
			case 4:remove();
				
			      break;
			case 5:System.exit(0);
				
				  break;
		}
	
		}
	}
	public static void add() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int id=0;
		String name=null;
		String city=null;
		double amount=0.0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Id:");
		id=scanner.nextInt();
		System.out.println("Enter name");
		name=scanner.next();
		System.out.println("Enter city");
		city=scanner.next();
		System.out.println("Enter amount");
		amount=scanner.nextDouble();
		
		Customer customer=new Customer();
		customer.setId(id);
		customer.setCity(city);
		customer.setName(name);
		customer.setOutStandingAmount(amount);
		CustomerDAO dao=new CustomerDAOImpl();
		boolean result=dao.addCustomer(customer);
		if(result==true){
			System.out.println("Customer Added Successfully");
		}else{
			System.out.println("Error in adding");
		}
		
		
	}

	public static void update() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int id=0;
		String name=null;
		String city=null;
		double amount=0.0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter id you want to update :");
		id=scanner.nextInt();
		System.out.println("Enter name");
		name=scanner.next();
		System.out.println("Enter city");
		city=scanner.next();
		System.out.println("Enter amount");
		amount=scanner.nextDouble();
		
		Customer customer=new Customer();
		customer.setId(id);
		customer.setCity(city);
		customer.setName(name);
		customer.setOutStandingAmount(amount);
		CustomerDAO dao=new CustomerDAOImpl();
		boolean result=dao.updateCustomer(customer);
		if(result==true){
			System.out.println("Customer Updated Successfully");
		}else{
			System.out.println("Error in Updating");
		}
		
	}

	public static void remove() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int inp_id=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter id to remove");
		inp_id=scanner.nextInt();
		
		CustomerDAO dao=new CustomerDAOImpl();
		boolean result=dao.removeCustomer(inp_id);
		if(result==true){
			System.out.println("Customer Deleted Successfully");
		}else{
			System.out.println("Error in Deletion");
		}
		

		
		
		
		
	}

	public static void displayAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		CustomerDAO dao=new CustomerDAOImpl();
		List<Customer> customerList=dao.getAllCustomers();
		
	/*	System.out.println(customers);*/
   for(Customer customer:customerList)	{
	   System.out.print(customer.getId()+"\t");
	   System.out.print(customer.getName()+"\t");
	   System.out.print(customer.getCity()+"\t");
	   System.out.println(customer.getOutStandingAmount());
	   
   }
	}

	
}
