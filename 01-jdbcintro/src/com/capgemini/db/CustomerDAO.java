package com.capgemini.db;

import java.sql.SQLException;
import java.util.List;

import com.capgemini.bussiness.Customer;

public interface CustomerDAO {
 boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException;
 boolean removeCustomer(int customerId) throws ClassNotFoundException, SQLException;
 boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException;
 Customer findCustomer(int customerId);
 List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException;
}
