package com.ogm.CagriMerkezi.controller;

import com.ogm.CagriMerkezi.model.Kullanici;
import com.ogm.CagriMerkezi.service.KullaniciService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class KullaniciController {

    private final KullaniciService kullaniciService;

    public KullaniciController(KullaniciService kullaniciService) {
        this.kullaniciService = kullaniciService;
    }

    @PostMapping("/create")
    public ResponseEntity<Kullanici> createKullanici(@RequestBody Kullanici kullanici) {
        Kullanici resultKullanici = kullaniciService.createKullanici(kullanici);
        return ResponseEntity.ok(resultKullanici);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Kullanici> getKullanici(@PathVariable("id") Long id) {
        Kullanici kullanici = kullaniciService.getKullanici(id);
        return ResponseEntity.ok(kullanici);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Kullanici> updateKullanici(@PathVariable("id") Long id, @RequestBody Kullanici kullanici) {
        Kullanici resultKullanici = kullaniciService.updateKullanici(id, kullanici);
        return ResponseEntity.ok(resultKullanici);
    }

    @DeleteMapping("/remove/{userId}")
    public ResponseEntity<Boolean> deleteKullanici(@PathVariable("userId") Long id) {
        Boolean result = kullaniciService.deleteKullanici(id);
        return ResponseEntity.ok(result);
    }

    @PostMapping(value = "/giris")
    public ResponseEntity<Boolean> kullaniciMailParolaKontrol(
            @RequestParam("mail") String mail,
            @RequestParam("parola") String parola) {
        //Ekranda "Kullanıcı Adı" ve "Parola" kısmı için girilen bilgiler bu kısıma gelir
        Boolean parolaDogruMu = kullaniciService.getKullaniciMailParolaKontrol(mail, parola);
        return ResponseEntity.ok(parolaDogruMu);
    }
}
