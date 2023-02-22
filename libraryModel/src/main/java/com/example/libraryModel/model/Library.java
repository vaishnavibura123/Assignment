package com.example.libraryModel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Library {
    private int id;
    private String libraryName;
    private String libraryAddress;
    private String libraryNo;
    private String libraryFacility;

}
