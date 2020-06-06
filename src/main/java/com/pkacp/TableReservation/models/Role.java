package com.pkacp.TableReservation.models;

import com.pkacp.TableReservation.models.enums.Roles;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Roles name;

    public Role(){}

    public Role(Roles name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Roles getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(Roles name) {
        this.name = name;
    }
}
