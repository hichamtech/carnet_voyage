package com.brightcoding.app.ws.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity(name="domaine_activite")
public class DomaineActivite implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 2840349150134215298L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDomaine;
    private String  name;

	@OneToMany
	@JoinColumn(name="idActivite")
	private Collection<ActiviteEntity> activite ;

	public DomaineActivite(Long idDomaine, String name, Collection<ActiviteEntity> activite) {
		super();
		this.idDomaine = idDomaine;
		this.name = name;
		this.activite = activite;
	}

	public DomaineActivite() {
		super();
	}

	public Long getIdDomaine() {
		return idDomaine;
	}

	public void setIdDomaine(Long idDomaine) {
		this.idDomaine = idDomaine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<ActiviteEntity> getActivite() {
		return activite;
	}

	public void setActivite(Collection<ActiviteEntity> activite) {
		this.activite = activite;
	}

	@Override
	public String toString() {
		return "DomaineActivite [idDomaine=" + idDomaine + ", name=" + name + ", activite=" + activite + "]";
	}
	
	
	
}
