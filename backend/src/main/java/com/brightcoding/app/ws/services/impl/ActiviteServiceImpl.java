package com.brightcoding.app.ws.services.impl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.brightcoding.app.ws.entities.ActiviteEntity;
import com.brightcoding.app.ws.repositories.ActiviteRepository;
import com.brightcoding.app.ws.services.ActiviteService;
import com.brightcoding.app.ws.shared.Utils;
import com.brightcoding.app.ws.shared.dto.ActiviteDto;

@Service
public class ActiviteServiceImpl implements ActiviteService {
	
	@Autowired
	ActiviteRepository activiteRespositroy;
	
	@Autowired
	Utils util;

	@Override
	public List<ActiviteDto> getAllActivite() {
		List<ActiviteEntity> activite = (List<ActiviteEntity>) activiteRespositroy.findAll();
		
		Type listType = new TypeToken<List<ActiviteDto>>() {}.getType();
		List<ActiviteDto> activiteDto = new ModelMapper().map(activite, listType);
		return activiteDto;
	}

	@Override
	public ActiviteDto createActivite(ActiviteDto activite) {
		
		activite.setCodeActivite(util.generateStringId(5));
		
		ModelMapper modelMapper = new ModelMapper();
		
		ActiviteEntity activiteEntity = modelMapper.map(activite, ActiviteEntity.class);
		ActiviteEntity newActivite = activiteRespositroy.save(activiteEntity);

		ActiviteDto activiteDto = modelMapper.map(newActivite, ActiviteDto.class);
		
		return activiteDto;
	}

	@Override
	public ActiviteDto updateActivite(ActiviteDto activite, String codeActivite) {
		ActiviteEntity domaineEntity = activiteRespositroy.findByCodeActivite(codeActivite);
		
		if(domaineEntity == null) throw new RuntimeException("Activite not found");
		domaineEntity.setName(activite.getName());
		domaineEntity.setDescription(activite.getDescription());
		domaineEntity.setPrice(activite.getPrice());
		domaineEntity.setDomaineActivite(activite.getDomaineActivite());
		ActiviteEntity activiteUpdated = activiteRespositroy.save(domaineEntity);
		ActiviteDto activiteDto = new ActiviteDto();
		
		BeanUtils.copyProperties(activiteUpdated, activiteDto);
		
		return activiteDto;	
	}

	@Override
	public void deleteActivite(String codeActivite) {

		ActiviteEntity activiteEntity = activiteRespositroy.findByCodeActivite(codeActivite);
		if(activiteEntity == null) throw new RuntimeException("Domaine not found");
		
		activiteRespositroy.delete(activiteEntity);
	}

	@Override
	public ActiviteDto getActivite(String codeActivite) {
		
		ActiviteEntity domaineEntity = activiteRespositroy.findByCodeActivite(codeActivite);
		
		ModelMapper modelMapper = new ModelMapper();
		
		ActiviteDto domaineDto = modelMapper.map(domaineEntity, ActiviteDto.class);
		
		return domaineDto;
	}
	

}
