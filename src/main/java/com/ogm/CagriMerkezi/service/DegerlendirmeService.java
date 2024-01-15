package com.ogm.CagriMerkezi.service;
import com.ogm.CagriMerkezi.dto.DegerlendirmeDto;

import java.util.List;

public interface DegerlendirmeService {

    List<DegerlendirmeDto> getAllDegerlendirmeler();
    DegerlendirmeDto getDegerlendirmeById(Long id);
    DegerlendirmeDto createDegerlendirme(DegerlendirmeDto degerlendirmeDTO);
    DegerlendirmeDto updateDegerlendirme(Long id, DegerlendirmeDto degerlendirmeDTO);
    boolean deleteDegerlendirme(Long id);

}