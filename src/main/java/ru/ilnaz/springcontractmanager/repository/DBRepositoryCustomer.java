package ru.ilnaz.springcontractmanager.repository;

import ru.ilnaz.springcontractmanager.models.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBRepositoryCustomer extends AbstractRepository<Customer> {

    @Override
    public String getTableName() {
        return "customer";
    }

    @Override
    public Customer getModel(ResultSet rs) throws SQLException {
        Customer customer = new Customer();
        customer.setId(rs.getInt("id"));
        customer.setManagementStructure(rs.getString("managementStructure"));
        customer.setName(rs.getString("name"));
        customer.setPostalCode(rs.getString("postalCode"));
        customer.setSubject(rs.getString("subject"));
        customer.setCity(rs.getString("city"));
        customer.setStreet(rs.getString("street"));
        customer.setHouse(rs.getString("house"));
        customer.setOffice(rs.getString("office"));
        customer.setFlat(rs.getString("flat"));
        customer.setPhone(rs.getString("phone"));
        customer.setContactPerson(rs.getString("contactPerson"));
        customer.setEmail(rs.getString("email"));
        return customer;
    }

}
