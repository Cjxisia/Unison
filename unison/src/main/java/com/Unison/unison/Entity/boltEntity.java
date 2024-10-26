package com.Unison.unison.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;

@Entity
@Table(name = "unisonboltdistance")
@Data
public class boltEntity {
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

    @Column(name = "Date")
    private BigInteger date;

    @Column(name = "Distance")
    private Double distance;

    @Column(name = "dT")
    private Double dT;

    @Column(name = "Temperature")
    private Double temperature;

    public String getFormattedDate() {
        String dateStr = date.toString(); // 예: 20241010113737
        return dateStr.substring(0, 4) + "-" + dateStr.substring(4, 6) + "-" + dateStr.substring(6, 8); // "YYYY-MM-DD" 형식
    }
}
