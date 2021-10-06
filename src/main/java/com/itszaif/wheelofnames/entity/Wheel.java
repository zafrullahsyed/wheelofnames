package com.itszaif.wheelofnames.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalTime;

@Entity(name = "WHEEL")
@Data
public class Wheel extends AbstractEntity{

    @CreationTimestamp
    @Column(name = "INSERT_TIME")
    private LocalTime insertTime;

    // TODO: add mapping to User table


}
