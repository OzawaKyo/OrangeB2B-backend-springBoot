package com.tripleD.app.controller;

import com.tripleD.app.dto.CatalogueDto;
import com.tripleD.app.dto.OffreDto;
import com.tripleD.app.enums.CategorieEnum;
import com.tripleD.app.service.CatalogueService;
import com.tripleD.app.service.OffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/OrangeB2B/api/catalogue")
public class CatalogueController {

    @Autowired
    CatalogueService catalogueService;

    @Autowired
    OffreService offreService;



    @PostMapping("/create")
    public CatalogueDto createCatalogue(@RequestBody CatalogueDto catalogueDto){

        CatalogueDto createCatalogue =catalogueService.createCatalogue(catalogueDto);

        return catalogueDto;
    }

    @GetMapping("/voip/get")
    public List<CatalogueDto> getAllVoip(@RequestParam(value="page", defaultValue = "1") int page,@RequestParam(value="limit", defaultValue = "4")  int limit ){

        List<CatalogueDto> catalogueDto = catalogueService.getAllCatalogue(page, limit);
        List<CatalogueDto> newCatalogueDto =new ArrayList<>();
        for(int i =0;i< catalogueDto.size();i++){

            if (catalogueDto.get(i).getCategorie()== CategorieEnum.VOIP)
            newCatalogueDto.add(catalogueDto.get(i));
        }

        return newCatalogueDto;
    }
    @GetMapping("/data/get")
    public List<CatalogueDto> getAllData(@RequestParam(value="page", defaultValue = "1") int page,@RequestParam(value="limit", defaultValue = "4")  int limit ){

        List<CatalogueDto> catalogueDto = catalogueService.getAllCatalogue(page, limit);
        List<CatalogueDto> newCatalogueDto =new ArrayList<>();
        for(int i =0;i< catalogueDto.size();i++){

            if (catalogueDto.get(i).getCategorie()== CategorieEnum.DATA)
                newCatalogueDto.add(catalogueDto.get(i));
        }

        return newCatalogueDto;
    }

    @GetMapping("/wifi/get")
    public List<CatalogueDto> getAllWifi(@RequestParam(value="page", defaultValue = "1") int page,@RequestParam(value="limit", defaultValue = "4")  int limit ){

        List<CatalogueDto> catalogueDto = catalogueService.getAllCatalogue(page, limit);
        List<CatalogueDto> newCatalogueDto =new ArrayList<>();
        for(int i =0;i< catalogueDto.size();i++){

            if (catalogueDto.get(i).getCategorie()== CategorieEnum.WIFI)
                newCatalogueDto.add(catalogueDto.get(i));
        }

        return newCatalogueDto;
    }


    @GetMapping("/switch/get")
    public List<CatalogueDto> getAllSwitch(@RequestParam(value="page", defaultValue = "1") int page,@RequestParam(value="limit", defaultValue = "4")  int limit ){

        List<CatalogueDto> catalogueDto = catalogueService.getAllCatalogue(page, limit);
        List<CatalogueDto> newCatalogueDto =new ArrayList<>();
        for(int i =0;i< catalogueDto.size();i++){

            if (catalogueDto.get(i).getCategorie()== CategorieEnum.SWITCH_WIFI_TEL)
                newCatalogueDto.add(catalogueDto.get(i));
        }

        return newCatalogueDto;
    }


    @GetMapping("/get/{id}")
    public OffreDto getOffre(@PathVariable long id){

        OffreDto offreDto = offreService.getOffreById(id);
        return offreDto;
    }


    @DeleteMapping(path="/delete/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable long id) {

        offreService.deleteOffre(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
