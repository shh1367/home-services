package com.example.homeservices.domain.entity;

import com.example.homeservices.domain.entity.core.AbstractBaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Favor extends AbstractBaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer favorId;
    @Column(nullable = false)
    private FavorTitle favorTitle;
}
