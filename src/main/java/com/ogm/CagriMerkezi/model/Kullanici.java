package com.ogm.CagriMerkezi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Kullanici", schema = "public○")
//table name olarak yazman gereken şey veritabanında ki tablo adıyla aynı olması zorunludur
//schema yani şema ismi de denemedir
public class Kullanici {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ad")
    private String ad;

    @Column(name = "soyad")
    private String soyad;


    @Column(name = "parola")
    private String parola;


    @Column(name = "dogum_tarihi")
    private String dogumTarihi;
    @Column(name = "aktif")
    private Boolean aktif;

    @Column(name = "telefon")
    private String telefon;
    @Column(name = "mail")
    private String mail;

    //Getter setter toplu eklemek için sağ tıkla generate getter and setter seç

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
