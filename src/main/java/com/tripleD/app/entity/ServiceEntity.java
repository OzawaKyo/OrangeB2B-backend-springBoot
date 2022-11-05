package com.tripleD.app.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "sevice")
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;


    @Column
    private String typeService;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "service", cascade=CascadeType.ALL)
    private List<EquipementEntity> equipement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "offre_id")
    private OffreEntity offre;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public OffreEntity getOffre() {
        return offre;
    }

    public void setOffre(OffreEntity offre) {
        this.offre = offre;
    }


    public List<EquipementEntity> getEquipement() {
        return equipement;
    }

    public void setEquipement(List<EquipementEntity> equipement) {
        this.equipement = equipement;
    }
}
