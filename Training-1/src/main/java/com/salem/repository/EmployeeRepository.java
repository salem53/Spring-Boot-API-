package com.salem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.salem.model.Employee;

@Repository
//@Repository est une annotation Spring pour indiquer que la classe est un bean
//et que son rôle est
//de communiquer avec une source de données (en l'occurrence la base de données).
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}