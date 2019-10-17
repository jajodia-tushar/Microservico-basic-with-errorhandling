package com.tavisca.validateDB.repository;

import com.tavisca.validateDB.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Employee,Integer> {
}
