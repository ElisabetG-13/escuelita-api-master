package com.example.escuelita.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="user")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false)
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name ="apellido")
    private String lastname;

    @Column(name = "area")
    private String area;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "status")
    private Boolean status;

    public Object getId() {
        return null;
    }

    public Object getName() {
        return null;
    }

    public Object getLastname() {
        return null;
    }

    public Object getArea() {
        return null;
    }

    public Object getEdad() {
        return null;
    }

    public Object getStatus() {
        return null;
    }

    public void setName(Object name2) {
    }

    public void setLastname(Object lastname2) {
    }

    public void setArea(Object area2) {
    }

    public void setEdad(Object edad2) {
    }

    public void setStatus(Object status2) {
    }
}
