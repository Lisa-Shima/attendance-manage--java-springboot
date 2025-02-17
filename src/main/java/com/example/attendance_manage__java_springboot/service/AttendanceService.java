package com.example.attendance_manage__java_springboot.service;

import com.example.attendance_manage__java_springboot.entity.Attendance;
import com.example.attendance_manage__java_springboot.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService {
    @Autowired
    private AttendanceRepository attendanceRepository;

    public List<Attendance> getAllAttendances(){
        return attendanceRepository.findAll();
    }
    public Optional<Attendance> getAttendanceById(Long id){
        return attendanceRepository.findById(id);
    }
    public Attendance saveAttendance(Attendance attendance){
        return attendanceRepository.save(attendance);
    }
    public void deleteAttendance(Long id){
        attendanceRepository.deleteById(id);
    }
}
