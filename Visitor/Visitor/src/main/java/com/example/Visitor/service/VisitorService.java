package com.example.Visitor.service;

import com.example.Visitor.model.Visitor;

import java.util.HashMap;

public class VisitorService {
    HashMap<String,Integer> map=new HashMap<>();
    int count=1;
    public Visitor getVisits(String username){
        count=map.getOrDefault(username,0)+1;
        map.put(username,count);
        Visitor visit=new Visitor(username,count);
        return visit;

    }
}
