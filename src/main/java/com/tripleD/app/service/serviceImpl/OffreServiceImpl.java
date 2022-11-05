package com.tripleD.app.service.serviceImpl;

import com.tripleD.app.dto.OffreDto;
import com.tripleD.app.entity.OffreEntity;
import com.tripleD.app.repository.OffreRepository;
import com.tripleD.app.service.OffreService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OffreServiceImpl implements OffreService {

    @Autowired
    OffreRepository offreRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public OffreDto getOffreById(long id) {

        OffreEntity offreEntity = offreRepository.findById(id);

        OffreDto offreDto = modelMapper.map(offreEntity,OffreDto.class);

        return offreDto;
    }

    @Override
    public void deleteOffre(long id) {

        OffreEntity offreEntity = offreRepository.findById(id);

        offreRepository.delete(offreEntity);


    }

}
