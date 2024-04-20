package com.example.laboratorio3.controller;

import com.example.laboratorio3.entity.Employees;
import com.example.laboratorio3.repository.EmployeesRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


import org.springframework.stereotype.Controller;

@Controller
//COMPLETAR
@RequestMapping(value = {"/EmployeeIndex"}, method = RequestMethod.GET)
public class EmployeeController {

    final EmployeesRepository employeesRepository;
    private EmployeeController(EmployeesRepository employeesRepository){
        this.employeesRepository=employeesRepository;
    }
    @GetMapping("/listaEmpleado")
    public String listar(Model model) {
        List<Employees> lista = employeesRepository.findAll();
        model.addAttribute("listaEmpleado", lista);
        return "employee/lista";
    }


    //COMPLETAR
    @GetMapping(value = {"/nuevoEmpleado"})
    public String nuevoEmployeeForm( ) {
        return "employee/newFrm";
    }




    @GetMapping(value = {"/editarEmpleado"})
    public String editarEmployee() {
        return "employee/editFrm";
    }


    //COMPLETAR

}
