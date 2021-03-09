package ru.ilnaz.springcontractmanager;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.ilnaz.springcontractmanager.models.Contract;
import ru.ilnaz.springcontractmanager.models.Customer;
import ru.ilnaz.springcontractmanager.repository.DBRepositoryContract;
import ru.ilnaz.springcontractmanager.repository.DBRepositoryCustomer;
import ru.ilnaz.springcontractmanager.repository.Repository;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories("ru.ilnaz.springcontractmanager.repository")
public class ApplicationContext {

    @Primary
    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSourceProperties getDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean
    public DataSource getDataSource() {
        return getDataSourceProperties().initializeDataSourceBuilder().build();
    }


    @Bean
    public Repository<Customer> customerRepository1() {
        return new DBRepositoryCustomer(getDataSource());
    }

    @Bean
    public Repository<Contract> contractRepository() {
        return new DBRepositoryContract(getDataSource());
    }
}
