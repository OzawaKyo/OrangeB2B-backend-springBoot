package com.tripleD.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OffreDto {

    private long id;

    private String OffreName;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private CatalogueDto catalogue;

    private List<ServiceDto> service;

    private String PicPath;

    public String getPicPath() {
        return PicPath;
    }

    public void setPicPath(String picPath) {
        PicPath = picPath;
    }

    public List<ServiceDto> getService() {
        return service;
    }

    public void setService(List<ServiceDto> service) {
        this.service = service;
    }

    public String getOffreName() {
        return OffreName;
    }

    public void setOffreName(String offreName) {
        OffreName = offreName;
    }


    public CatalogueDto getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(CatalogueDto catalogue) {
        this.catalogue = catalogue;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
