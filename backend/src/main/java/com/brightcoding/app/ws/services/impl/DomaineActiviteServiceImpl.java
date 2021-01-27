package com.brightcoding.app.ws.services.impl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brightcoding.app.ws.entities.DomaineActiviteEntity;
import com.brightcoding.app.ws.repositories.DomaineActiviteRepository;
import com.brightcoding.app.ws.services.DomaineActiviteService;
import com.brightcoding.app.ws.shared.Utils;
import com.brightcoding.app.ws.shared.dto.DomaineActiviteDto;
import org.modelmapper.TypeToken;

@Service
public class DomaineActiviteServiceImpl  implements DomaineActiviteService{

	@Autowired
	DomaineActiviteRepository domaineRespositroy;
	
	@Autowired
	Utils util;
	
	@Override
	public List<DomaineActiviteDto> getAllDomaine() {
		
		List<DomaineActiviteEntity> domaine = (List<DomaineActiviteEntity>) domaineRespositroy.findAll();
		
		Type listType = new TypeToken<List<DomaineActiviteDto>>() {}.getType();
		List<DomaineActiviteDto> domaineDto = new ModelMapper().map(domaine, listType);
		return domaineDto;
	}

	@Override
	public DomaineActiviteDto createDomaine(DomaineActiviteDto domaine,String name) {
		domaine.setCodeDomaine(util.generateStringId(30));
		ModelMapper modelMapper = new ModelMapper();
		
		DomaineActiviteEntity domaineEntity = modelMapper.map(domaine, DomaineActiviteEntity.class);
		DomaineActiviteEntity newDomaine = domaineRespositroy.save(domaineEntity);
		
		DomaineActiviteDto domaineDto = modelMapper.map(newDomaine, DomaineActiviteDto.class);
		
		
		return domaineDto;
	}

	@Override
	public DomaineActiviteDto getDomaine(String codeDomaine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDomaine(String codeDomaine) {
		DomaineActiviteEntity domaineEntity = domaineRespositroy.findByCodeDomaine(codeDomaine);
		if(domaineEntity == null) throw new RuntimeException("Domaine not found");
		
		domaineRespositroy.delete(domaineEntity);
	}

	@Override
	public DomaineActiviteDto updateDomaine(DomaineActiviteDto domaine, String codeDomaine) {
		
		DomaineActiviteEntity domaineEntity = domaineRespositroy.findByCodeDomaine(codeDomaine);
		
		if(domaineEntity == null) throw new RuntimeException("Domaine not found");
		domaineEntity.setName(domaine.getName());
		DomaineActiviteEntity domainUpdated = domaineRespositroy.save(domaineEntity);
		DomaineActiviteDto domaineDto = new DomaineActiviteDto();
		
		BeanUtils.copyProperties(domainUpdated, domaineDto);
		
		return domaineDto;
	}
	

}
