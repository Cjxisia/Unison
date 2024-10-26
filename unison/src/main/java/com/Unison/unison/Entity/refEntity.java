package com.Unison.unison.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "unisonboltdistance")
@Data
public class refEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int iD;

    @Column(name = "Tubine")
    private String tubine;

    @Column(name = "Floor")
    private int floor;

    @Column(name = "Number")
    private int number;

    @Column(name = "Distance")
    private double distance;
}
