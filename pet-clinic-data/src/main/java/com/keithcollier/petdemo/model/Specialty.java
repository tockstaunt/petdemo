package com.keithcollier.petdemo.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialties")
public class Specialty extends BaseEntity {

    @Column(name = "discription")
    private String description;
}
