package com.example.couchbaseapplication;


import org.springframework.data.couchbase.repository.CouchbaseRepository;

public interface EmployeeRepository extends CouchbaseRepository<Employee, String> {
}
