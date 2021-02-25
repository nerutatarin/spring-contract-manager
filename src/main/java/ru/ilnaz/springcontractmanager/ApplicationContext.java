package ru.ilnaz.springcontractmanager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.ilnaz.springcontractmanager.models.Contract;
import ru.ilnaz.springcontractmanager.models.Customer;
import ru.ilnaz.springcontractmanager.repository.DBRepositoryContract;
import ru.ilnaz.springcontractmanager.repository.DBRepositoryCustomer;
import ru.ilnaz.springcontractmanager.repository.Repository;

@Configuration
public class ApplicationContext {
    @Bean
    public Repository<Customer> customerRepository() {
        return new DBRepositoryCustomer();
    }
    public Repository<Contract> contractRepository() {
        return new DBRepositoryContract();
    }
}
