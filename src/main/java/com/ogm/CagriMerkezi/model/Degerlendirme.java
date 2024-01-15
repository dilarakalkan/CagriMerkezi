package com.ogm.CagriMerkezi.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Degerlendirme", schema = "deneme")
public class Degerlendirme {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
