package com.manta.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Data
public class Contact implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String firstName;

    private String middleName;

    private String lastName;

    private String company;

    @Temporal(TemporalType.DATE)
    private Calendar birthDate;

    private String notes;

}
