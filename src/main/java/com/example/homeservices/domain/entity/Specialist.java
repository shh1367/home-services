package com.example.homeservices.domain.entity;


import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Specialist extends BaseUser {
    @Lob
    @Column(name = "specialistPic")
    private MultipartFile spcialistPicture ;
    private Float rate;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_SUBFAVOR_ID")
    private List<SubFavor> subFavor;
    private SpecialistFieldTitle specialistFieldTitle;
    private Double creditAmount;





}
