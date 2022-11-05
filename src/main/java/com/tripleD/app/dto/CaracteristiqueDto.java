package com.tripleD.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CaracteristiqueDto {

    private long id;
    private String marque;
    private String nbrPort;
    private String aplSim ;
    private String acces ;
    private String prix ;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private EquipementDto equipement;

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

    public EquipementDto getEquipement() {
        return equipement;
    }

    public void setEquipement(EquipementDto equipement) {
        this.equipement = equipement;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
