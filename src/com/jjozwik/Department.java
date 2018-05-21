package com.jjozwik;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Empolyee> empolyees;

    public Department(String name) {
        this.name = name;
        this.empolyees = new ArrayList<>();
    }

    public void addEmployee(Empolyee empolyee) {
        empolyees.add(empolyee);
    }

    public List<Empolyee> getEmpolyees(){
        return empolyees;
    }
}
