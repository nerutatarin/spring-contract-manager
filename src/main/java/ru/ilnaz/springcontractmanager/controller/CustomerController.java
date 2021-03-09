package ru.ilnaz.springcontractmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.ilnaz.springcontractmanager.models.Customer;
import ru.ilnaz.springcontractmanager.repository.CustomerRepository;
import ru.ilnaz.springcontractmanager.repository.Repository;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/customer")
@Validated
public class CustomerController {

    @Autowired
    private Repository<Customer> customerRepository1;

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/get/{id}")
    @Transactional
    public Customer getById(@PathVariable @Min(1) int id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("customer not found"));
    }

    @PostMapping("/add")
    public void addCustomer(@RequestBody @Valid Customer customer) { customerRepository1.add(customer); }

    @PostMapping("/del")
    public void delCustomer(@RequestBody @Valid Customer customer) {
        repository.delete(customer);
    }

    @PostMapping("/upd")
    public void updateCustomer(@RequestBody @Valid Customer customer) {
        customerRepository1.update(customer);
    }
}