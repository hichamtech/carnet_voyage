//package com.brightcoding.app.ws.services.impl;
//
//import com.brightcoding.app.ws.entities.SejourEntity;
//import com.brightcoding.app.ws.entities.UserEntity;
//import com.brightcoding.app.ws.repositories.SejourRepository;
//import com.brightcoding.app.ws.services.SejourService;
//import com.brightcoding.app.ws.shared.Utils;
//import com.brightcoding.app.ws.shared.dto.SejourDto;
//import com.brightcoding.app.ws.shared.dto.UserDto;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class SejourServiceImpl implements SejourService {
//
//    @Autowired
//    SejourRepository sejourRepository;
//
//    @Autowired
//    Utils util;
//
//    @Override
//    public List<SejourDto> getAllSejours() {
//        return null;
//    }
//
//    @Override
//    public SejourDto createSejour(SejourDto sejour) {
//
//        SejourEntity checkSejour = sejourRepository.findByCodeSejour(sejour.getCodeSejour());
//
//        if(checkSejour != null) throw new RuntimeException("Sejour Already Exists !");
//
//        ModelMapper modelMapper = new ModelMapper();
//
//        SejourEntity sejourEntity = modelMapper.map(sejour, SejourEntity.class);
//
//        sejourEntity.setCodeSejour(util.generateStringId(32));
//
//        SejourEntity newSejour = sejourRepository.save(sejourEntity);
//
//        SejourDto sejourDto =  modelMapper.map(newSejour, SejourDto.class);
//
//        return sejourDto;
//    }
//
//    @Override
//    public SejourDto updateSejour(SejourDto sejour, String codeSejour) {
//        return null;
//    }
//
//    @Override
//    public void deleteSejour(String codeSejour) {
//
//    }
//
//    @Override
//    public SejourDto getSejour(String codeSejour) {
//        return null;
//    }
//}
