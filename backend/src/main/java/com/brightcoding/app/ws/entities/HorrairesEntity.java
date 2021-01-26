package com.brightcoding.app.ws.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="horraires")
public class HorrairesEntity implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 2119717408424209072L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHorraire;
    private String dateDebut;
    private String dateFin;
    
    @OneToMany(mappedBy = "horraire")
    Set<PlanActiviteEntity> planHorraire;
    
    

	public HorrairesEntity(Long idHorraire, String dateDebut, String dateFin, Set<PlanActiviteEntity> plan) {
		super();
		this.idHorraire = idHorraire;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.planHorraire = plan;
	}

	public HorrairesEntity() {
		super();
	}

	public Long getIdHorraire() {
		return idHorraire;
	}

	public void setIdHorraire(Long idHorraire) {
		this.idHorraire = idHorraire;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public Set<PlanActiviteEntity> getPlan() {
		return planHorraire;
	}

	public void setPlan(Set<PlanActiviteEntity> plan) {
		this.planHorraire = plan;
	}

	@Override
	public String toString() {
		return "HorrairesEntity [idHorraire=" + idHorraire + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", plan=" + planHorraire + "]";
	}
    
    

}
