package com.example.attendance_manage__java_springboot.service;

import com.example.attendance_manage__java_springboot.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.attendance_manage__java_springboot.entity.Class;

import java.util.List;
import java.util.Optional;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public List<Class> getAllClasses(){
        return classRepository.findAll();
    }

    public Optional<Class> getClassById(Long id){
        return classRepository.findById(id);
    }

    public Class saveClass(Class class1){
        return classRepository.save(class1);
    }

    public void deleteClass(Long id){
        classRepository.deleteById(id);
    }
}
