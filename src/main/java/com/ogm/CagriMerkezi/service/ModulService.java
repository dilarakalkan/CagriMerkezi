package com.ogm.CagriMerkezi.service;

import com.ogm.CagriMerkezi.dto.ModulDto;
import java.util.List;

public interface ModulService {
    List <ModulDto> getAllModuller();
    ModulDto getModulById(Long id);
    ModulDto createModulById(ModulDto modulDTO);
    ModulDto updateModulById(Long id, ModulDto modulDTO);
    boolean deleteModul(Long id);


}
