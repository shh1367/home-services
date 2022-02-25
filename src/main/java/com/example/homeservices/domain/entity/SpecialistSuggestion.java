package com.example.homeservices.domain.entity;

import com.example.homeservices.domain.entity.core.AbstractBaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SpecialistSuggestion  extends AbstractBaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long suggestionId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_SPECIALIST_ID")
    private Specialist specialist;
    @Column(nullable = false )
    private Date date;
    @Column(nullable = false )
    private Double suggestedPrice;
    @Column(nullable = false )
    private Float taskRequaireTime;
    @Column(nullable = false )
    private Float taskStartTime;





}
