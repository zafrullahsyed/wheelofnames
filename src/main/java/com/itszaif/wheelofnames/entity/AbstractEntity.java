package com.itszaif.wheelofnames.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AbstractEntity {

    @Id
    @GeneratedValue
    private long id;
}
