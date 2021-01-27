package com.brightcoding.app.ws.services;

import java.util.List;

import com.brightcoding.app.ws.shared.dto.ActiviteDto;

public interface ActiviteService {

	List<ActiviteDto> getAllActivite();
	
	ActiviteDto createActivite(ActiviteDto activite);
	
	ActiviteDto updateActivite(ActiviteDto activite,String codeActivite);
	
	void deleteActivite(String codeActivite);
}
