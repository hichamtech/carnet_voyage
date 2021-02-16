package com.brightcoding.app.ws.controllers.admin;

import java.lang.reflect.Type;
import java.security.Principal;
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
import com.brightcoding.app.ws.requests.DomaineActiviteRequest;
import com.brightcoding.app.ws.responses.ActiviteResponse;
import com.brightcoding.app.ws.responses.DomaineActiviteResponse;
import com.brightcoding.app.ws.services.DomaineActiviteService;
import com.brightcoding.app.ws.shared.dto.ActiviteDto;
import com.brightcoding.app.ws.shared.dto.DomaineActiviteDto;

@RestController
@RequestMapping("/admin/domaine")
public class DomaineActiviteAdminController {

	@Autowired
	DomaineActiviteService domaineService;

	// get all domaine

	@GetMapping("/list")
	public ResponseEntity<List<DomaineActiviteResponse>> getCategories() {

		List<DomaineActiviteDto> domaines = domaineService.getAllDomaine();

		Type listType = new TypeToken<List<DomaineActiviteResponse>>() {
		}.getType();
		List<DomaineActiviteResponse> domaineResponse = new ModelMapper().map(domaines, listType);

		return new ResponseEntity<List<DomaineActiviteResponse>>(domaineResponse, HttpStatus.OK);

	}

	// add domaine
	@PostMapping("/create")
	
	public ResponseEntity<DomaineActiviteResponse> createDomaine(@RequestBody DomaineActiviteRequest domaineRequest,
			Principal principal) {

		ModelMapper modelMapper = new ModelMapper();

		DomaineActiviteDto domaineDto = modelMapper.map(domaineRequest, DomaineActiviteDto.class);
		DomaineActiviteDto createDomaine = domaineService.createDomaine(domaineDto, principal.getName());

		DomaineActiviteResponse newDomaine = modelMapper.map(createDomaine, DomaineActiviteResponse.class);

		return new ResponseEntity<DomaineActiviteResponse>(newDomaine, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public  ResponseEntity<DomaineActiviteResponse> getOneDomaine(@PathVariable(name="id") String codeDomaine) {
		
		DomaineActiviteDto addressDto = domaineService.getDomaine(codeDomaine);
		
		ModelMapper modelMapper = new ModelMapper();
		
		DomaineActiviteResponse activiteResponse = modelMapper.map(addressDto, DomaineActiviteResponse.class);
		
		return new ResponseEntity<DomaineActiviteResponse>(activiteResponse, HttpStatus.OK);
	}

	// update domaine
	
	@PutMapping("update/{id}")
	public ResponseEntity<DomaineActiviteResponse> updateDomaine(@PathVariable(name = "id") String codeDomaine,
			@RequestBody DomaineActiviteRequest domaineRequest) {

		DomaineActiviteDto domaineDto = new DomaineActiviteDto();

		BeanUtils.copyProperties(domaineRequest, domaineDto);

		DomaineActiviteDto updateDomaine = domaineService.updateDomaine(domaineDto, codeDomaine) ;

		DomaineActiviteResponse domaineResponse = new DomaineActiviteResponse();

		BeanUtils.copyProperties(updateDomaine, domaineResponse);

		return new ResponseEntity<DomaineActiviteResponse>(domaineResponse, HttpStatus.ACCEPTED);
	}

	// delete domaine
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteDomaine(@PathVariable(name = "id") String codeDomaine) {

		domaineService.deleteDomaine(codeDomaine);

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
