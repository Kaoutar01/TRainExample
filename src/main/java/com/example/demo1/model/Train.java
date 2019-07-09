package com.example.demo1.model;

import javax.persistence.*;

@Entity
public class Train  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length=20)
    private Short number;
    private String Type;

    public Train() {
    }

    public Train(Short number, String type) {
        this.number = number;
        Type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
