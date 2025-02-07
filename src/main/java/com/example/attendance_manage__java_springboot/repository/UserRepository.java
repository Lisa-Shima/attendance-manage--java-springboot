package com.example.attendance_manage__java_springboot.repository;

import com.example.attendance_manage__java_springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
