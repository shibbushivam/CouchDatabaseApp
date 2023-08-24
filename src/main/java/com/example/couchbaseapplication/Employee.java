package com.example.couchbaseapplication;



import org.springframework.data.annotation.Id;
        import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class Employee {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    // Other fields, getters, setters, etc.

    // Getters and setters for firstName and lastName
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
}
