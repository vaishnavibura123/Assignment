package com.example.libraryModel.service;

import com.example.libraryModel.model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LibraryService {
    static List<Library> library=new ArrayList<>();
    static int id=0;

    static{
        library.add(new Library(++id ,"State Central Library","Thiruvananthapuram","52365745588", "variety of Books,Seating arrangements"));
        library.add(new Library(++id ,"City Central Library","Hyderabad","93865745588", "Wifi,Water"));
        library.add(new Library(++id ,"Mountain","warangal","93815745588", "Good environment"));
        library.add(new Library(++id ,"Memorial Library","Delhi","96865745588", "Peaceful place for reading"));
        library.add(new Library(++id ,"LalBahadur Library","Hyderabad","55266885588", "Spacious and Noise Free"));
    }
    public List<Library> findAll() {
        return library;
    }

    public Library getById(Integer id) {
        for(Library li:library){
            if(li.getId()==id){
                return li;
            }
        }
        return null;
    }

    public Library getByName(String libraryName) {
        for (Library li : library) {
            if (li.getLibraryName().equals(libraryName)) {
                return li;
            }
        }

        return null;
    }

    public void addLibrary(Library li) {
        library.add(li);
    }

    public void deleteLibrary(int id) {
        for(Library li:library){
            if(id==li.getId()){
                library.remove(id);
            }
        }
    }

    public void update(int id, Library lib) {
        Library li=getById(id);
        li.setLibraryName(lib.getLibraryName());
        li.setLibraryNo(lib.getLibraryNo());
        li.setLibraryAddress(lib.getLibraryAddress());
        li.setLibraryFacility(lib.getLibraryFacility());
    }
}
