//package com.brightcoding.app.ws.controllers;
//
//import com.brightcoding.app.ws.exceptions.UserException;
//import com.brightcoding.app.ws.requests.SejourRequest;
//import com.brightcoding.app.ws.requests.UserRequest;
//import com.brightcoding.app.ws.responses.ErrorMessages;
//import com.brightcoding.app.ws.responses.SejourResponse;
//import com.brightcoding.app.ws.responses.UserResponse;
//import com.brightcoding.app.ws.services.SejourService;
//import com.brightcoding.app.ws.shared.dto.SejourDto;
//import com.brightcoding.app.ws.shared.dto.UserDto;
//import org.modelmapper.ModelMapper;
//import org.modelmapper.TypeToken;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.lang.reflect.Type;
//import java.util.List;
//
//@RestController
//@RequestMapping("/sejours")
//public class SejourController {
//
//    @Autowired
//    SejourService sejourService;
//
////    @GetMapping("/list")
////    public ResponseEntity<List<SejourResponse>> getSejours() {
////        List<SejourDto> sijours = sejourService.getAllSejours();
////        Type listType = new TypeToken<List<SejourResponse>>() {
////        }.getType();
////        List<SejourResponse> sejoursResponse = new ModelMapper().map(sijours, listType);
////        return new ResponseEntity<List<SejourResponse>>(sejoursResponse, HttpStatus.OK);
////    }
//
//    @PostMapping(
//            consumes={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
//            produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
//    )
//    public ResponseEntity<SejourResponse> createSejour(@RequestBody @Valid SejourRequest sejourRequest) throws Exception {
//
//        if(sejourRequest.getDateSejour().isEmpty()) throw new UserException(ErrorMessages.MISSING_REQUIRED_FIELD.getErrorMessage());
//
//        ModelMapper modelMapper = new ModelMapper();
//
//        SejourDto sejourDto = modelMapper.map(sejourRequest, SejourDto.class);
//
//        SejourDto createSejour = sejourService.createSejour(sejourDto);
//
//        SejourResponse sejourResponse =  modelMapper.map(createSejour, SejourResponse.class);
//
//        return new ResponseEntity<SejourResponse>(sejourResponse, HttpStatus.CREATED);
//
//    }
//
//}
