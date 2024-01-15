package com.ogm.CagriMerkezi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Personel", schema = "deneme")
public class Personel{


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonel_id() {
        return personel_id;
    }

    public void setPersonel_id(Long personel_id) {
        this.personel_id = personel_id;
    }

    public Long getModul_id() {
        return modul_id;
    }

    public void setModul_id(Long modul_id) {
        this.modul_id = modul_id;
    }

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }

    public String getBaslangic_tarihi() {
        return baslangic_tarihi;
    }

    public void setBaslangic_tarihi(String baslangic_tarihi) {
        this.baslangic_tarihi = baslangic_tarihi;
    }

    public String getBitis_tarihi() {
        return bitis_tarihi;
    }

    public void setBitis_tarihi(String bitis_tarihi) {
        this.bitis_tarihi = bitis_tarihi;
    }

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long personel_id;

    private Long modul_id;
    private Boolean aktif;

    private String baslangic_tarihi;
    private String bitis_tarihi;

}
