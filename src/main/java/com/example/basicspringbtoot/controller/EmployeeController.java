package com.example.basicspringbtoot.controller;

import org.springframework.web.bind.annotation.*;
@RestController
public class EmployeeController {

    @GetMapping("/")
    public String getEmployee() throws Exception {
        return "Initial Azure message ";
    }

    @GetMapping("/showMessage")
    public String showMessage(@RequestParam String name) throws Exception {
        return "Another message for: "+name;
    }

}
