package com.sstefanov.demo.currencies.receiver.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "currencies_2")
@Getter
@Setter
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @Column
    private Integer gold;

    @Column
    private String code;

    @Column
    private Integer ratio;

    @Column(name = "reverse_rate")
    private Double reverseRate;

    @Column
    private Double rate;

    @Column(name = "f_star" )
    private Integer fStar;

    @Column(name = "curr_date")
    private LocalDate currDate;

    @ManyToMany(mappedBy = "currencies")
    @Cascade({CascadeType.ALL})
    private List<Language> languages;
}
