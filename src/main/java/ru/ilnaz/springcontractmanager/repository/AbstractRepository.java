package ru.ilnaz.springcontractmanager.repository;

import ru.ilnaz.springcontractmanager.utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractRepository<T> implements Repository<T> {
    @Override
    public void add(T item) {

    }

    @Override
    public void delete(T item) {

    }

    @Override
    public void update(T item) {

    }

    @Override
    public T getById(int id) {

        String query = "select * from " + this.getTableName() + " where id=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return getModel(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public abstract String getTableName();

    public abstract T getModel(ResultSet rs) throws SQLException;
}
