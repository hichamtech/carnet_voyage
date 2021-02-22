package com.brightcoding.app.ws.controllers;

import com.brightcoding.app.ws.responses.ActiviteResponse;
import com.brightcoding.app.ws.services.ActiviteService;
import com.brightcoding.app.ws.shared.dto.ActiviteDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;
import java.util.List;

@RestController
@RequestMapping("/activites")
public class ActiviteController {

    @Autowired
    ActiviteService activiteService;

    @GetMapping("/list")
    public ResponseEntity<List<ActiviteResponse>> getActivites() {

        List<ActiviteDto> activites = activiteService.getAllActivite();

        Type listType = new TypeToken<List<ActiviteResponse>>() {
        }.getType();
        List<ActiviteResponse> activiteResponse = new ModelMapper().map(activites, listType);

        return new ResponseEntity<List<ActiviteResponse>>(activiteResponse, HttpStatus.OK);

    }

}
