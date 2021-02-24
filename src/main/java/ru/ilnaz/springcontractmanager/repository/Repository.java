package ru.ilnaz.springcontractmanager.repository;

public interface Repository<T>{
    void add (T item);
    void delete (T item);
    void update (T item);
    T getById (int id);
}
