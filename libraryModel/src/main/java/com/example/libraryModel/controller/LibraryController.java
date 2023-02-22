package com.example.libraryModel.controller;

import com.example.libraryModel.model.Library;
import com.example.libraryModel.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/library")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;

    @GetMapping("/findAll")
    public List<Library> findAll(){
        return  libraryService.findAll();
    }
    @GetMapping("/findById/Id/{Id}")
    public Library findById(@PathVariable Integer id){
        return libraryService.getById(id);
    }
    @GetMapping("/findByName/libraryName/{libraryName}")
    public Library findByName(@PathVariable String libraryName){
        return libraryService.getByName(libraryName);
    }
    @PostMapping("/addLibrary")
    public void addLibrary(@RequestBody Library library){
        libraryService.addLibrary(library);
    }
    @PutMapping("/update")
    public void updateLibrary(@PathVariable int id, @RequestBody Library library){
        libraryService.update(id, library);
    }
    @DeleteMapping("/deleteLibrary")
    public void deleteLibrary(@PathVariable int id){
        libraryService.deleteLibrary(id);
    }

}
