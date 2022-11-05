package com.tripleD.app.repository;

import com.tripleD.app.entity.OffreEntity;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OffreRepository extends PagingAndSortingRepository<OffreEntity,Long> {

    OffreEntity findById(long id);

}