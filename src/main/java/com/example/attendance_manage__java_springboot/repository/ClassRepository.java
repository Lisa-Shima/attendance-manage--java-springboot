package com.example.attendance_manage__java_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.attendance_manage__java_springboot.entity.Class;

public interface ClassRepository extends JpaRepository<Class, Long>{
}
