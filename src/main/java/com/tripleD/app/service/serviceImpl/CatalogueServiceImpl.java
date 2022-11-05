package com.tripleD.app.service.serviceImpl;


import com.tripleD.app.Shared.Utils;
import com.tripleD.app.configuration.exception.ElementNotFoundException;
import com.tripleD.app.dto.CatalogueDto;
import com.tripleD.app.dto.OffreDto;
import com.tripleD.app.dto.ServiceDto;
import com.tripleD.app.entity.*;
import com.tripleD.app.enums.CategorieEnum;
import com.tripleD.app.repository.CatalogueRepository;
import com.tripleD.app.repository.OffreRepository;
import com.tripleD.app.service.CatalogueService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogueServiceImpl implements CatalogueService {

    @Autowired
    Utils utils;

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    CatalogueRepository catalogueRepository;




    @Override
    public CatalogueDto createCatalogue(CatalogueDto catalogueDto){
        CatalogueEntity catalogueEntity = catalogueRepository.findAllBycategorie(catalogueDto.getCategorie())
                .orElse(new CatalogueEntity(catalogueDto.getCategorie()));



        CatalogueEntity catalogueEntities = modelMapper.map(catalogueDto,CatalogueEntity.class);



        catalogueEntities.setId(catalogueEntity.getId());

        for (int i=0;i < catalogueEntities.getOffre().size();i++) {

            OffreEntity offre = catalogueEntities.getOffre().get(i);
            offre.setCatalogue(catalogueEntities);
            catalogueEntities.getOffre().set(i, offre);

            for (int j = 0; j < offre.getService().size(); j++) {

                ServiceEntity service = offre.getService().get(j);
                service.setOffre(offre);
                offre.getService().set(j, service);

                for (int k = 0; k < service.getEquipement().size(); k++) {

                    EquipementEntity equipement = service.getEquipement().get(k);
                    equipement.setService(service);
                    service.getEquipement().set(k, equipement);

                    for (int l = 0; l < equipement.getCaracteristique().size(); l++) {

                        CaracteristiqueEntity caracteristique = equipement.getCaracteristique().get(k);
                        caracteristique.setEquipement(equipement);
                        equipement.getCaracteristique().set(k, caracteristique);
                    }
                }
            }
        }
        catalogueRepository.save(catalogueEntities);


        CatalogueEntity newCatalogueEntity = modelMapper.map(catalogueEntities,CatalogueEntity.class);
        CatalogueDto newCatalogueDto = modelMapper.map(newCatalogueEntity,CatalogueDto.class);

        return newCatalogueDto;

}

    @Override
    public List<CatalogueDto> getAllCatalogue(int page, int limit) {
        if(page > 0) page = page - 1;

        List<CatalogueDto> catalogueDto = new ArrayList<>();

        Pageable pageableRequest = PageRequest.of(page, limit);

        Page<CatalogueEntity> cataloguePage;

        cataloguePage = catalogueRepository.findAllCatalogue(pageableRequest);


        List<CatalogueEntity> catalogues = cataloguePage.getContent();

        for(CatalogueEntity catalogueEntity: catalogues) {

            ModelMapper modelMapper = new ModelMapper();
            CatalogueDto catalogue = modelMapper.map(catalogueEntity, CatalogueDto.class);

            catalogueDto.add(catalogue);
        }

        return catalogueDto;
    }


}
