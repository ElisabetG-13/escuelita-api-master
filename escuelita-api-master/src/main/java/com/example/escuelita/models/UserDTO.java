package com.example.escuelita.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {

    public Long id;
    public String name;
    public String lastname;
    public String area;
    public Integer edad;
    public Boolean status;

    public UserDTO(String name, String lastname, String area, Integer edad, Boolean status) {
        this.name = name;
        this.lastname = lastname;
        this.area = area;
        this.edad = edad;
        this.status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setId(Object id2) {
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

    public Long getId() {
        return null;
    }

}
