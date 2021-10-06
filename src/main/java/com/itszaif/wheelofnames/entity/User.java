package com.itszaif.wheelofnames.entity;

import liquibase.pro.packaged.S;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;


@Data
@Entity (name = "USER")
@EqualsAndHashCode(callSuper = true)
public class User extends AbstractEntity {

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "USERNAME")
    private String userName;
}
