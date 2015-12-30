package com.gccpacman.simplespring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
    
    @Id
    @Column(name = "ID", nullable = false)
    private String id;

    @Column(name = "NAME", nullable =false)
    private String name;

    @Column(name = "AGE", nullable = false)
    private long age;

    public Employee(){
        
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

}
