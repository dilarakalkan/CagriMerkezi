package com.ogm.CagriMerkezi.service;

import com.ogm.CagriMerkezi.model.Kullanici;
import com.ogm.CagriMerkezi.repository.KullaniciRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KullaniciServiceImpl implements KullaniciService {

    private final KullaniciRepository kullaniciRepository;

    @Override
    public Kullanici createKullanici(Kullanici kullanici) {
        return kullaniciRepository.save(kullanici);
    }

    @Override
    public List<Kullanici> getKullanici() {
        return kullaniciRepository.findAll();
    }

    @Override
    public Kullanici getKullanici(Long id) {
        return kullaniciRepository.findById(id).orElse(null);
    }

    @Override
    public Kullanici updateKullanici(Long id, Kullanici kullanici) {
        if (kullaniciRepository.existsById(id)) {
            kullanici.setId(id);
            return kullaniciRepository.save(kullanici);
        }
        return null;
    }

    @Override
    public Boolean deleteKullanici(Long id) {
        if (kullaniciRepository.existsById(id)) {
            kullaniciRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Boolean getKullaniciMailParolaKontrol(String mail, String parola) {
        Kullanici kullanici = kullaniciRepository.findByMail(mail);
        if (kullanici != null) {
            if (kullanici.getParola() != null && parola != null) {
                if(kullanici.getParola().equals(parola)){
                    return true;
                }
                else{
                    //Ekrandan girilen parola ile veritabanından sorgulanan parola eşit değilse
                    return false;
                }
            }
            else{
                //Parola bilgisi bulunamadı!
                return false;
            }
        }
        //Kullanici bilgisi yoksa
        return false;
    }
}






