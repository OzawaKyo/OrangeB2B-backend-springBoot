package com.tripleD.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ServiceDto {

    private long id;

    private String typeService;

    private List<EquipementDto> equipement;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private OffreDto offre;

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }
    

    public OffreDto getOffre() {
        return offre;
    }

    public void setOffre(OffreDto offre) {
        this.offre = offre;
    }

    public List<EquipementDto> getEquipement() {
        return equipement;
    }

    public void setEquipement(List<EquipementDto> equipement) {
        this.equipement = equipement;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
