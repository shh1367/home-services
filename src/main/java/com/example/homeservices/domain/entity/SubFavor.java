package com.example.homeservices.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SubFavor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subFavorId;
    @Column(nullable = false, length = 30, unique = true)
    private SubFavorTitle subFavorTitle;
    @Column(nullable = false)
    private Double subFavorPrice;
    private String subFavorDescription;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_FAVOR_ID")
    private Favor favor;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_SPECIALIST_ID")
    private List<Specialist> specialist;
}
