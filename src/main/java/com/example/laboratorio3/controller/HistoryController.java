package com.example.laboratorio3.controller;


import com.example.laboratorio3.repository.EmployeesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HistoryController {

    final EmployeesRepository employeesRepository;

    private HistoryController(EmployeesRepository employeesRepository){
        this.employeesRepository=employeesRepository;
    }

    @GetMapping(value = "historial")
    public String historial(Model model){
        model.addAttribute("listaEmployees",employeesRepository.findAll());
        return "historial";
    }

    @GetMapping(value = "historialBuscar")
    public String historialBuscar(Model model,
                                  @RequestParam("text")String text){
        model.addAttribute("listaEmployees",employeesRepository.searchEmployees(text));
        return "historial";
    }

}
