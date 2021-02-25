package ru.ilnaz.springcontractmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.ilnaz.springcontractmanager.models.Customer;
import ru.ilnaz.springcontractmanager.repository.Repository;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequestMapping("/api/customer")
@Validated
public class CustomerController {

    @Autowired
    private Repository<Customer> customerRepository;

    @GetMapping("/get/{id}")
    public Customer getById(@PathVariable @Min(1) int id) {
        return customerRepository.getById(id);
    }

    @PostMapping("/add")
    public void addCustomer(@RequestBody @Valid Customer customer) {
        customerRepository.add(customer);
    }

    @PostMapping("/del")
    public void delCustomer(@RequestBody @Valid Customer customer) {
        customerRepository.delete(customer);
    }

    @PostMapping("/upd")
    public void updateCustomer(@RequestBody @Valid Customer customer) {
        customerRepository.update(customer);
    }
}