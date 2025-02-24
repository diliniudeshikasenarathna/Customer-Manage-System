package edu.icet.ecom.service;

import edu.icet.ecom.dto.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);
    void deleteCustomer(int id);
    void updateCustomer(Customer customer);
    Customer searchCustomer(int id);
    List<Customer> getAll();
}
