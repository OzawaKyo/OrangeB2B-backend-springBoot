package com.tripleD.app.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity(name = "offre")
public class OffreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column
    private String OffreName;

    @Column
    private String PicPath;

    public String getPicPath() {
        return PicPath;
    }

    public void setPicPath(String picPath) {
        PicPath = picPath;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "offre", cascade=CascadeType.ALL)
    private List<ServiceEntity> service ;

    public List<ServiceEntity> getService() {
        return service;
    }

    public void setService(List<ServiceEntity> service) {
        this.service = service;
    }

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "catalogue_id")
    private CatalogueEntity catalogue;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOffreName() {
        return OffreName;
    }

    public void setOffreName(String offreName) {
        OffreName = offreName;
    }



    public void setCatalogue(CatalogueEntity catalogue) {
        this.catalogue = catalogue;
    }

}
