package com.example.attendance_manage__java_springboot.repository;

import com.example.attendance_manage__java_springboot.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
