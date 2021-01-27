package com.brightcoding.app.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brightcoding.app.ws.entities.ActiviteEntity;
@Repository
public interface ActiviteRepository extends CrudRepository<ActiviteEntity,Long>
{
	ActiviteEntity findByCodeActivite(String codeActivite);
}
