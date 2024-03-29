package com.brightcoding.app.ws.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity(name="domaine_activite")
public class DomaineActiviteEntity implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 2840349150134215298L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDomaine;
	
	private String codeDomaine;
    private String  name;

	@OneToMany(mappedBy="domaineActivite", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<ActiviteEntity> activite ;
	

	public DomaineActiviteEntity(Long idDomaine, String codeDomaine,String name, List<ActiviteEntity> activite) {
		super();
		this.idDomaine = idDomaine;
		this.name = name;
		this.activite = activite;
		this.codeDomaine  = codeDomaine;
	}

	public DomaineActiviteEntity() {
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

	public List<ActiviteEntity> getActivite() {
		return activite;
	}

	public void setActivite(List<ActiviteEntity> activite) {
		this.activite = activite;
	}

	public String getCodeDomaine() {
		return codeDomaine;
	}

	public void setCodeDomaine(String codeDomaine) {
		this.codeDomaine = codeDomaine;
	}

	
	
	
}
