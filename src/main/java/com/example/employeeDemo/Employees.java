package com.example.employeeDemo;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Employees  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int  entryNumber;
    private String lastName;
    private String firstName;
    private String address;
    private int phone;
    private int hireDate;
    private  Date fireDate;
    private String status;
    private String contract;

    @ManyToOne
    private Company company;

    @ManyToOne
    private Business business;

    @ManyToOne
    private Department department;

    @ManyToOne
    private Units units;

    private String position;


    public Employees(){

    }

    public Employees(int entryNumber, String lastName, String firstName, String address, int phone, Date hireDate, Date fireDate, String status, String contract, String position) {
        this.entryNumber = entryNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.phone = phone;
        this.hireDate = hireDate;
        this.fireDate = fireDate;
        this.status = status;
        this.contract = contract;
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(int entryNumber) {
        this.entryNumber = entryNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    public Date getFireDate() {
        return fireDate;
    }

    public void setFireDate(Date fireDate) {
        this.fireDate = fireDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Units getUnits() {
        return units;
    }

    public void setUnits(Units units) {
        this.units = units;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

