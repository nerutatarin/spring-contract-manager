package ru.ilnaz.springcontractmanager.repository;

import ru.ilnaz.springcontractmanager.utils.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractRepository<T> implements Repository<T> {
    @Override
    public void add(T item) {

        String query = "insert into " + this.getTableName() + this.insertQuery();

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            insertFields(ps);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(T item) {

        String query = "update " + this.getTableName() + this.updateQuery();

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            updateFields(ps);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(T item) {

        String query = "delete from " + this.getTableName() + " where id=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            deleteFields(ps);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
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

    public abstract String insertQuery();
    public abstract String updateQuery();

    public abstract T getModel(ResultSet rs) throws SQLException;

    public abstract void insertFields(PreparedStatement ps) throws SQLException;

    public abstract void updateFields(PreparedStatement ps) throws SQLException;

    public  abstract void deleteFields(PreparedStatement ps) throws SQLException;

}
