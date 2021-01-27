package com.brightcoding.app.ws.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="activite")
public class ActiviteEntity  implements Serializable{
	
    
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -352684298890014489L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActivite;
	
	private String codeActivite;
    private  String name;
    private double price;
    private String description;
    
    
    @Lob
	private Byte[] photo;
    
    @ManyToOne
	@JoinColumn(name="idDomaine")
    private DomaineActiviteEntity domaineActivite;
    
    @OneToMany(mappedBy = "activite")
    Set<PlanActiviteEntity> planActivite;
    
    @OneToMany(mappedBy = "activite")
    Set<SejourEntity>  sejour;
    

	public ActiviteEntity(Long idActivite, String name, double price, String description, Byte[] photo,
			DomaineActiviteEntity domaineActivite, Set<PlanActiviteEntity> plan, Set<SejourEntity>  sejour
			,String codeActivite
			) {
		super();
		this.idActivite = idActivite;
		this.name = name;
		this.price = price;
		this.description = description;
		this.photo = photo;
		this.domaineActivite = domaineActivite;
		this.planActivite = plan;
		this.sejour = sejour;
		this.codeActivite = codeActivite;
	}
	

	public ActiviteEntity() {
		super();
	}


	public Long getIdActivite() {
		return idActivite;
	}

	public void setIdActivite(Long idActivite) {
		this.idActivite = idActivite;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(Byte[] photo) {
		this.photo = photo;
	}

	public DomaineActiviteEntity getDomaineActivite() {
		return domaineActivite;
	}

	public void setDomaineActivite(DomaineActiviteEntity domaineActivite) {
		this.domaineActivite = domaineActivite;
	}

	public Set<PlanActiviteEntity> getPlan() {
		return planActivite;
	}

	public void setPlan(Set<PlanActiviteEntity> plan) {
		this.planActivite = plan;
	}
	


	public Set<SejourEntity> getSejour() {
		return sejour;
	}


	public void setSejour(Set<SejourEntity> sejour) {
		this.sejour = sejour;
	}

	

	public String getCodeActivite() {
		return codeActivite;
	}


	public void setCodeActivite(String codeActivite) {
		this.codeActivite = codeActivite;
	}


	@Override
	public String toString() {
		return "ActiviteEntity [idActivite=" + idActivite + ", codeActivite=" + codeActivite + ", name=" + name
				+ ", price=" + price + ", description=" + description + ", photo=" + Arrays.toString(photo)
				+ ", domaineActivite=" + domaineActivite + ", planActivite=" + planActivite + ", sejour=" + sejour
				+ "]";
	}


	


	
    
    
}
