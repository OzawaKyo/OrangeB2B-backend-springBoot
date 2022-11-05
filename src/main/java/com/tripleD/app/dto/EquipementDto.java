package com.tripleD.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class EquipementDto {

    private long id;
    private String typeEquipement;

    private List<CaracteristiqueDto> caracteristique ;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private ServiceDto service;


    public String getTypeEquipement() {
        return typeEquipement;
    }

    public void setTypeEquipement(String typeEquipement) {
        this.typeEquipement = typeEquipement;
    }

    public ServiceDto getService() {
        return service;
    }

    public void setService(ServiceDto service) {
        this.service = service;
    }

    public List<CaracteristiqueDto> getCaracteristique() {
        return caracteristique;
    }

    public void setCaracteristique(List<CaracteristiqueDto> caracteristique) {
        this.caracteristique = caracteristique;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
