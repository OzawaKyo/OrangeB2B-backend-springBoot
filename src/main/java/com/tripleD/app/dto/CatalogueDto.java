package com.tripleD.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tripleD.app.enums.CategorieEnum;

import java.io.Serializable;
import java.util.List;

public class CatalogueDto implements Serializable {

    private static final long serialVersionUID = 6683326251877528185L;

    private long id;

    private CategorieEnum categorie;

    private List<OffreDto> offre;

    public List<OffreDto> getOffre() {
        return offre;
    }

    public void setOffre(List<OffreDto> offre) {
        this.offre = offre;
    }

    public CategorieEnum getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieEnum categorie) {
        this.categorie = categorie;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
