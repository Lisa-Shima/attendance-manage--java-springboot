package com.example.attendance_manage__java_springboot.controllers;

import com.example.attendance_manage__java_springboot.entity.Class;
import com.example.attendance_manage__java_springboot.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/classes")
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping
    public List<Class> getAllClasses(){
        return classService.getAllClasses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Class> getClassById(@PathVariable Long id){
        Optional<Class> class1 = classService.getClassById(id);
        return class1.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Class createClass(@RequestBody Class class1){
        return classService.saveClass(class1);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClassById(@PathVariable Long id){
        classService.deleteClass(id);
        return ResponseEntity.noContent().build();
    }
}
