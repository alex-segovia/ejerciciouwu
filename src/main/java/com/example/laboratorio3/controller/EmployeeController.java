package com.example.laboratorio3.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//COMPLETAR
public class EmployeeController {

    @GetMapping("/listaEmpleado")
    public String listar() {
        return "employee/lista";
    }


    //COMPLETAR

    public String listaEmployee(){
        return "employee/lista";
    }

    public String nuevoEmployeeForm( ) {
        return "employee/newFrm";
    }


    public String guardarEmployee() {
        //COMPLETAR
    }


    public String editarEmployee() {
        return "employee/editFrm";
    }


    public String borrarEmpleado() {

       //COMPLETAR

    }

    //COMPLETAR

}
