package com.tripleD.app.entity;

import com.tripleD.app.enums.CategorieEnum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "catalogue")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CatalogueEntity implements Serializable {

    private static final long serialVersionUID= -5197283328938044978L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;


    @Enumerated(EnumType.STRING)
    private CategorieEnum categorie;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "catalogue", cascade=CascadeType.ALL)
    private List<OffreEntity> offre;

    public List<OffreEntity> getOffre() {
        return offre;
    }

    public void setOffre(List<OffreEntity> offre) {
        this.offre = offre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CategorieEnum getCategorie() {
        return categorie;
    }

    public CatalogueEntity( CategorieEnum categorie)
    {
        this.offre = offre;
    }
    public CatalogueEntity() {

    }
    public void setCategorie(CategorieEnum categorie) {
        this.categorie = categorie;
    }


}
