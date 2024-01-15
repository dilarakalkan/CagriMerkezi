package com.ogm.CagriMerkezi.service;
import com.ogm.CagriMerkezi.model.Kullanici;


import java.util.List;

public interface KullaniciService {

    Kullanici createKullanici(Kullanici kullanici);

    List<Kullanici> getKullanici();

    Kullanici getKullanici(Long id);

    Kullanici updateKullanici(Long id, Kullanici kullanici);

    Boolean deleteKullanici(Long id);

    Boolean getKullaniciMailParolaKontrol(String mail, String parola);
}






