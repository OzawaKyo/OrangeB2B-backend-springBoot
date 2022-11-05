package com.tripleD.app.entity;

import javax.persistence.*;

@Entity(name = "caracteristique")
public class CaracteristiqueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String marque;
    @Column
    private String nbrPort;
    @Column
    private String aplSim ;
    @Column
    private String acces ;
    @Column
    private String prix ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipement_id")
    private EquipementEntity equipement;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getNbrPort() {
        return nbrPort;
    }

    public void setNbrPort(String nbrPort) {
        this.nbrPort = nbrPort;
    }

    public String getAplSim() {
        return aplSim;
    }

    public void setAplSim(String aplSim) {
        this.aplSim = aplSim;
    }

    public String getAcces() {
        return acces;
    }

    public void setAcces(String acces) {
        this.acces = acces;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public EquipementEntity getEquipement() {
        return equipement;
    }

    public void setEquipement(EquipementEntity equipement) {
        this.equipement = equipement;
    }

}
