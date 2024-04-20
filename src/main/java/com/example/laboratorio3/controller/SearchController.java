package com.example.laboratorio3.controller;

import com.example.laboratorio3.entity.Employees;
import com.example.laboratorio3.entity.JobHistory;
import com.example.laboratorio3.repository.EmployeesRepository;
import com.example.laboratorio3.repository.JobHistoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/search")
public class SearchController {
    final EmployeesRepository employeesRepository;

    public SearchController(EmployeesRepository employeesRepository){
        this.employeesRepository = employeesRepository;
    }
    @GetMapping(value = {"","/"})
    public String indice(){
        return "Search/indice";
    }

    @GetMapping("/mayorSalario")
    public String listarMayorSalario(Model model){
        List<Employees> lista = employeesRepository.listarPorMayorSalario();
        model.addAttribute("lista",lista);
        return "mayorSalario";
    }

}
