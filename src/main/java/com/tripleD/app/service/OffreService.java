package com.tripleD.app.service;

import com.tripleD.app.dto.OffreDto;

public interface OffreService {

    OffreDto getOffreById(long id);

    void deleteOffre(long id);

}
