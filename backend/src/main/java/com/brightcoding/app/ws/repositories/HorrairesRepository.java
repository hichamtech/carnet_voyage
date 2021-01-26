package com.brightcoding.app.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brightcoding.app.ws.entities.HorrairesEntity;
@Repository
public interface HorrairesRepository extends CrudRepository<HorrairesEntity,Long> {
}
