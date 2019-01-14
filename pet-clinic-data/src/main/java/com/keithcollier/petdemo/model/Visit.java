package com.keithcollier.petdemo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{

    @Column(name = "time_stamp")
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    private LocalDate date;

    @Column(name = "desc")
    private String desc;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
