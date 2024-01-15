package com.ogm.CagriMerkezi.service;
import com.ogm.CagriMerkezi.dto.PersonelDto;

import java.util.List;

public interface PersonelService {

        List<PersonelDto> getAllPersoneller();
        PersonelDto getPersonelById(Long id);
        PersonelDto createPersonel(PersonelDto personelDTO);
        PersonelDto updatePersonel(Long id, PersonelDto personelDTO);
        boolean deletePersonel(Long id);

}
