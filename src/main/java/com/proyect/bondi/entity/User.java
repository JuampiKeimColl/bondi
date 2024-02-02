package com.proyect.bondi.entity;

import com.proyect.bondi.enums.Rol;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String lastName;
    private Rol rol;
    private Date date;
    private Boolean state;


}
