package com.example.Seguridad.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Usuario {

    @Id
    private Integer id;
    private String username;
    private String pass;
    private String rol;
}
