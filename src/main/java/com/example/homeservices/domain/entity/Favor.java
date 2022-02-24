package com.example.homeservices.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Favor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer favorId;
    @Column(nullable = false)
    private FavorTitle favorTitle;
}
