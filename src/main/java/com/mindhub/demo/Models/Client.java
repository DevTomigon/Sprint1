package com.mindhub.demo.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Client {   



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName, lastName, email;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private List<Account> accounts = new ArrayList<>();


    public Client() {
    }

    public Client(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public String getFirstName () {
            return firstName;
        }



        public String getLastName () {
            return lastName;
        }



        public String getEmail () {
            return email;
        }






        public void addAccount(Account account){
        account.setClient(this);
        this.accounts.add(account);
        }

    @Override
        public String toString () {
            return "Cliente{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    ", id=" + id +
                    '}';
        }


    public Long getId() {
        return null;
    }
}


