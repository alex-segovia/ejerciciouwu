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

    public String listaEmployee(   ){
        //COMPLETAR
    }

    public String nuevoEmployeeForm( ) {
        //COMPLETAR
    }


    public String guardarEmployee() {
        //COMPLETAR
    }


    public String editarEmployee() {
        //COMPLETAR
    }


    public String borrarEmpleado() {

       //COMPLETAR

    }

    //COMPLETAR

}
