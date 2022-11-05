package com.tripleD.app.repository;

import com.tripleD.app.entity.CatalogueEntity;
import com.tripleD.app.entity.OffreEntity;
import com.tripleD.app.enums.CategorieEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CatalogueRepository extends PagingAndSortingRepository<CatalogueEntity,Long> {

    Optional<CatalogueEntity> findAllBycategorie(CategorieEnum categorieEnum);

    @Query("SELECT catalogue FROM CatalogueEntity catalogue")
    Page<CatalogueEntity> findAllCatalogue(Pageable pageableRequest);

    CatalogueEntity findById(long id);


}
