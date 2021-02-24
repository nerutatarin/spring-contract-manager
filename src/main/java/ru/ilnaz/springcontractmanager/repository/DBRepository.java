package ru.ilnaz.springcontractmanager.repository;

import ru.ilnaz.springcontractmanager.models.Customer;
import ru.ilnaz.springcontractmanager.utils.DBConnection;

import java.sql.*;

public class DBRepository implements CustomerRepository {

    @Override
    public void addCustomer(Customer customer) throws SQLException {
        Query query = new Query();
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query.getQueryInsert())) {
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
            ps.executeUpdate();
        }
    }

    @Override
    public void delCustomer(Customer customer) {
        Query query = new Query();

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query.getQueryDelete())) {
            ps.setInt(1, customer.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateCustomer(Customer customer) {
        Query query = new Query();
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query.getQueryUpdate())) {
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
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer getCustomer(int id) {
        Query query = new Query();
        Customer customer = new Customer();
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query.getQuerySelect())) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                customer.setId(id);
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
