package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jessi on 4/25/2017.
 */

@Entity
public class Menu {

    @NotNull
    @Size (min=3, max=15)
    private String name;

    @Id
    @GeneratedValue
    private int id;

    @ManyToMany
    private List<Cheese> cheeses = new ArrayList<>();

    //add items to our menu
    public void addItem(Cheese item){
    }

    //default constructor for menu
    public Menu () {}

    //constructor that accepts value for and sets name
    public Menu (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
