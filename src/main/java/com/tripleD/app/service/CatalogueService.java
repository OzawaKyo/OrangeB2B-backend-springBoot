package com.tripleD.app.service;

import com.tripleD.app.dto.CatalogueDto;

import java.util.List;


public interface CatalogueService {

    CatalogueDto createCatalogue (CatalogueDto catalogueDto);

    List<CatalogueDto> getAllCatalogue(int page, int limit);


}
