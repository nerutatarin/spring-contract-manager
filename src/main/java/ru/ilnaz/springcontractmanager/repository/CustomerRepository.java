package ru.ilnaz.springcontractmanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ilnaz.springcontractmanager.models.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
