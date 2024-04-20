package com.example.laboratorio3.controller;


import com.example.laboratorio3.repository.EmployeesRepository;
import jdk.internal.classfile.impl.BufferedCodeBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HistoryController {

    final EmployeesRepository employeesRepository;

    private HistoryController(EmployeesRepository employeesRepository){
        this.employeesRepository=employeesRepository;
    }

    @GetMapping(value = "historial")
    public String historial(Model model){
        return "historial";
    }

}
