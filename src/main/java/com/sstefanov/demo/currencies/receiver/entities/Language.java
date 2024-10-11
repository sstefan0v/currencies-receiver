package com.sstefanov.demo.currencies.receiver.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;

@Entity
@Table(name = "languages_2")
@Getter
@Setter
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @JsonIgnore
    private Long id;

    @Column
    private Integer gold;

    @Column
    private String name;

    @Column
    private String code;

    @Column(name = "lang_code")
    private String langCode;

    @Column
    private String ratio;

    @Column(name = "reverse_rate")
    private String reverseRate;

    @Column
    private String rate;

    @Column(name = "extra_info",  columnDefinition = "TEXT")
    private String extraInfo;

    @Column(name = "curr_date")
    private String currDate;

    @Column( columnDefinition = "TEXT")
    private String title;

    @Column(name = "f_star")
    private Integer fStar;

    @ManyToMany
    @JoinTable(
            name = "languages_currencies_2",
            joinColumns = @JoinColumn(name = "language_id"),
            inverseJoinColumns = @JoinColumn(name = "currency_id")
    )
    @Cascade({CascadeType.ALL})
    private List<Currency> currencies;

}
