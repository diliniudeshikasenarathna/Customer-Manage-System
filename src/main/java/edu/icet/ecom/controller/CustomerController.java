package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.service.CustomerService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    final CustomerService service;

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
        System.out.println(customer);
    }

    @GetMapping("/get-all")
    public List<Customer> getAll(){

        return service.getAll();
    }

    @DeleteMapping("/delete-customer/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        service.deleteCustomer(id);

    }

    @PutMapping("/update-customer")
    public void updateCustomer(@RequestBody Customer customer){
        service.updateCustomer(customer);
    }

    @GetMapping("/search-customer-by-id/{id}")
    public Customer searchCustomer(@PathVariable Integer id){
        return service.searchCustomerById(id);
    }

    @GetMapping("/search-by-name/{name}")
    public List<Customer> searchByCustomerName(@PathVariable String name){
        return service.findByName(name);
    }
}
