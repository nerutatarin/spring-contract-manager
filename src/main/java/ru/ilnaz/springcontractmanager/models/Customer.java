package ru.ilnaz.springcontractmanager.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "customer")
public class Customer extends Id {

    @javax.persistence.Id
    private int id;
    @NotEmpty(message = "Не указана структура управления контрагента")
    private String managementStructure;
    @NotEmpty(message = "Не указано имя контрагента")
    private String name;
    @NotEmpty(message = "Не указан индекс")
    private String postalCode;
    @NotEmpty(message = "Не указан субъект")
    private String subject;
    @NotEmpty(message = "Не указан город")
    private String city;
    @NotEmpty(message = "Не указана улица")
    private String street;
    @NotEmpty(message = "Не указан номер дома")
    private String house;
    private String office;
    private String flat;
    @NotEmpty(message = "Не указан номер телефона")
    @Pattern(regexp = "^8\\d{10}$", message = "Неправильный формат телефона")
    private String phone;
    private String contactPerson;
    private String email;

    public Customer(int id) {
        super(id);
    }

    public Customer() {

    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getManagementStructure() {
        return managementStructure;
    }

    public void setManagementStructure(String managementStructure) {
        this.managementStructure = managementStructure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", managementStructure='" + managementStructure + '\'' +
                ", name='" + name + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", subject='" + subject + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", office='" + office + '\'' +
                ", flat='" + flat + '\'' +
                ", phone='" + phone + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
