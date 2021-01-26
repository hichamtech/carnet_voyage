package com.brightcoding.app.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brightcoding.app.ws.entities.DomaineActivite;
@Repository
public interface DomaineActiviteRepository extends CrudRepository<DomaineActivite,Long> {
}
