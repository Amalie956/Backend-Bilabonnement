package ita3.car_subscription.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String firstName;
    public String lastName;
    public String cpr;
    public int accountNumber;

    //En kunde kan have mange abonnementer
    @OneToMany(mappedBy = "customer")
    public List<Subscription> subscriptions;
  
    public Customer() {
    }

    public Customer(String firstName, String lastName, String cpr, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpr = cpr;
        this.accountNumber = accountNumber;
    }

    //Getters og setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
