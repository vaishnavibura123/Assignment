package com.example.Visitor.controller;

import com.example.Visitor.model.Visitor;
import com.example.Visitor.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/visit")
public class VisitorController {
    @Autowired
    public VisitorService visitorService;

    @GetMapping(value = "username/{username}/count")
    public Visitor getCount(@PathVariable String username){
        return visitorService.getVisits(username);
    }
}
