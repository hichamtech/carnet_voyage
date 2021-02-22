package com.brightcoding.app.ws.services;

import com.brightcoding.app.ws.shared.dto.SejourDto;

import java.util.List;

public interface SejourService {

    List<SejourDto> getAllSejours();

    SejourDto createSejour(SejourDto sejour);

    SejourDto updateSejour(SejourDto sejour,String codeSejour);

    void deleteSejour(String codeSejour);

    SejourDto getSejour(String codeSejour);

}
