package com.rake.gisbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Operator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "operatorId")
    private int operatorId;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "pwd")
    private String pwd;

    public Operator(String name, String email, String pwd) {
        this.name = name;
        this.email = email;
        this.pwd = pwd;
    }

    public Operator(Operator operator){
        this.name = operator.name;
        this.email = operator.email;
        this.pwd = operator.pwd;
        this.operatorEntry = operator.operatorEntry;
    }

    @OneToOne(mappedBy = "id.operator")
    private OperatorEntry operatorEntry;
}

