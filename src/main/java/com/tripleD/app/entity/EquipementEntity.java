package com.tripleD.app.entity;

import com.tripleD.app.dto.CaracteristiqueDto;

import javax.persistence.*;
import java.util.List;

@Entity(name = "equipement")
public class EquipementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column
    private String typeEquipement;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "equipement" , cascade = CascadeType.ALL)
    private List<CaracteristiqueEntity> caracteristique;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_id")
    private ServiceEntity service;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getTypeEquipement() {
        return typeEquipement;
    }

    public void setTypeEquipement(String typeEquipement) {
        this.typeEquipement = typeEquipement;
    }

    public ServiceEntity getService() {
        return service;
    }

    public void setService(ServiceEntity service) {
        this.service = service;
    }

    public List<CaracteristiqueEntity> getCaracteristique() {
        return caracteristique;
    }

    public void setCaracteristique(List<CaracteristiqueEntity> caracteristique) {
        this.caracteristique = caracteristique;
    }
}
