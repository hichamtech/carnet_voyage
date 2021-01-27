package com.brightcoding.app.ws.services;

import java.util.List;

import com.brightcoding.app.ws.shared.dto.DomaineActiviteDto;

public interface DomaineActiviteService {
	
	List<DomaineActiviteDto> getAllDomaine();
	
	DomaineActiviteDto createDomaine(DomaineActiviteDto domaine,String name);
	
	DomaineActiviteDto updateDomaine(DomaineActiviteDto domaine,String codeDomaine);
	
	DomaineActiviteDto getDomaine(String codeDomaine);
	
	void deleteDomaine(String codeDomaine);

}
