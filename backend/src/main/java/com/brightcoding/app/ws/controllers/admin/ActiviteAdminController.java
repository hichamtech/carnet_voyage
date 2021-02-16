package com.brightcoding.app.ws.controllers.admin;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brightcoding.app.ws.requests.ActiviteRequest;
import com.brightcoding.app.ws.responses.ActiviteResponse;
import com.brightcoding.app.ws.services.ActiviteService;
import com.brightcoding.app.ws.shared.dto.ActiviteDto;

@RestController
@RequestMapping("/admin/activite")
public class ActiviteAdminController {
	
	@Autowired
	ActiviteService activiteService;
	
	//list
	@GetMapping("/list")
	public ResponseEntity<List<ActiviteResponse>> getActivites() {

		List<ActiviteDto> activites = activiteService.getAllActivite();

		Type listType = new TypeToken<List<ActiviteResponse>>() {
		}.getType();
		List<ActiviteResponse> activiteResponse = new ModelMapper().map(activites, listType);

		return new ResponseEntity<List<ActiviteResponse>>(activiteResponse, HttpStatus.OK);

	}
	//add activite
	
	@PostMapping("/create")
	
	public ResponseEntity<ActiviteResponse> createActivite(@RequestBody ActiviteRequest activiteRequest
			) {

		ModelMapper modelMapper = new ModelMapper();

		ActiviteDto activieDto = modelMapper.map(activiteRequest, ActiviteDto.class);
		ActiviteDto createActivite = activiteService.createActivite(activieDto);

		ActiviteResponse newActivite = modelMapper.map(createActivite, ActiviteResponse.class);

		return new ResponseEntity<ActiviteResponse>(newActivite, HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public  ResponseEntity<ActiviteResponse> getOneActivite(@PathVariable(name="id") String codeActivite) {
		
		ActiviteDto activiteDto = activiteService.getActivite(codeActivite);
		
		ModelMapper modelMapper = new ModelMapper();
		
		ActiviteResponse activiteResponse = modelMapper.map(activiteDto, ActiviteResponse.class);
		
		return new ResponseEntity<ActiviteResponse>(activiteResponse, HttpStatus.OK);
	}
	
	//updateActivite
	
	@PutMapping("update/{id}")
	public ResponseEntity<ActiviteResponse> updateActivite(@PathVariable(name = "id") String codeActivite,
			@RequestBody ActiviteRequest activiteRequest) {

		ActiviteDto activiteDto = new ActiviteDto();

		BeanUtils.copyProperties(activiteRequest, activiteDto);

		ActiviteDto updateActivite = activiteService.updateActivite(activiteDto, codeActivite) ;

		ActiviteResponse activiteResponse = new ActiviteResponse();

		BeanUtils.copyProperties(updateActivite, activiteResponse);

		return new ResponseEntity<ActiviteResponse>(activiteResponse, HttpStatus.ACCEPTED);
	}
	
	//deleteActivite
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteActivite(@PathVariable(name = "id") String codeActivite) {

		activiteService.deleteActivite(codeActivite);

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
