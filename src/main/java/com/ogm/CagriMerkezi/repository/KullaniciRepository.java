package com.ogm.CagriMerkezi.repository;


import com.ogm.CagriMerkezi.model.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KullaniciRepository extends JpaRepository <Kullanici,Long> {
    //kullanici veri tipine göre long dedik
    // Repository metotları buraya ekle
    Kullanici findByAd(String ad);
    Kullanici findByMail(String mail);

}
