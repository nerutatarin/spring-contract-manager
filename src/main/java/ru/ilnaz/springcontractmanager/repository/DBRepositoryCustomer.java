package ru.ilnaz.springcontractmanager.repository;

import ru.ilnaz.springcontractmanager.models.Customer;
import ru.ilnaz.springcontractmanager.models.Id;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBRepositoryCustomer extends AbstractRepository<Customer>{
    @Override
    public String getTableName() {
        return "customer";
    }

    @Override
    public String insertQuery() {
        return " (managementStructure, name, postalCode, subject, city, street, house, office, flat, phone, contactPerson, email) Values (?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override
    public String updateQuery() {
        return " set managementStructure=?, name=?, postalCode=?, subject=?, city=?, street=?, house=?, office=?, flat=?, phone=?, contactPerson=?,email=? where id=?";
    }

    @Override
    public void deleteFields(PreparedStatement ps) throws SQLException {
        Customer customer = new Customer();
        ps.setInt(1,customer.getId());
    }

    @Override
    public void insertFields(PreparedStatement ps) throws SQLException{
        Customer customer = new Customer();
        ps.setString(1, customer.getManagementStructure());
        ps.setString(2, customer.getName());
        ps.setString(3, customer.getPostalCode());
        ps.setString(4, customer.getSubject());
        ps.setString(5, customer.getCity());
        ps.setString(6, customer.getStreet());
        ps.setString(7, customer.getHouse());
        ps.setString(8, customer.getOffice());
        ps.setString(9, customer.getFlat());
        ps.setString(10, customer.getPhone());
        ps.setString(11, customer.getContactPerson());
        ps.setString(12, customer.getEmail());

    }

    @Override
    public void updateFields(PreparedStatement ps) throws SQLException {
        Customer customer = new Customer();
        ps.setString(1, customer.getManagementStructure());
        ps.setString(2, customer.getName());
        ps.setString(3, customer.getPostalCode());
        ps.setString(4, customer.getSubject());
        ps.setString(5, customer.getCity());
        ps.setString(6, customer.getStreet());
        ps.setString(7, customer.getHouse());
        ps.setString(8, customer.getOffice());
        ps.setString(9, customer.getFlat());
        ps.setString(10, customer.getPhone());
        ps.setString(11, customer.getContactPerson());
        ps.setString(12, customer.getEmail());
        ps.setInt(13, customer.getId());
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
