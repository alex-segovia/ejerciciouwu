package com.example.laboratorio3.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//COMPLETAR
@RequestMapping(value = {"/EmployeeIndex"}, method = RequestMethod.GET)
public class EmployeeController {

    @GetMapping("/listaEmpleado")
    public String listar() {
        return "employee/lista";
    }


    //COMPLETAR
    @GetMapping(value = {"/nuevoEmpleado"})
    public String nuevoEmployeeForm( ) {
        return "employee/newFrm";
    }


    public String guardarEmployee() {
        //COMPLETAR
    }

    @GetMapping(value = {"/editarEmpleado"})
    public String editarEmployee() {
        return "employee/editFrm";
    }


    public String borrarEmpleado() {

       //COMPLETAR

    }

    //COMPLETAR

}
