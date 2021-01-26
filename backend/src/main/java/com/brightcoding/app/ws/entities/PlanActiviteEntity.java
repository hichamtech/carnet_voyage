package com.brightcoding.app.ws.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="plan_activite")
public class PlanActiviteEntity implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6174442660376113700L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idPlan;

	 @ManyToOne
	 @JoinColumn(name = "idActivite")
	 private ActiviteEntity activite;

	  @ManyToOne
	  @JoinColumn(name = "idHorraire")
	    private HorrairesEntity horraire;

		public PlanActiviteEntity(Long idPlan, ActiviteEntity activite, HorrairesEntity horraire) {
			super();
			this.idPlan = idPlan;
			this.activite = activite;
			this.horraire = horraire;
		}

		public PlanActiviteEntity() {
			super();
		}

		public Long getIdPlan() {
			return idPlan;
		}

		public void setIdPlan(Long idPlan) {
			this.idPlan = idPlan;
		}

		public ActiviteEntity getActivite() {
			return activite;
		}

		public void setActivite(ActiviteEntity activite) {
			this.activite = activite;
		}

		public HorrairesEntity getHorraire() {
			return horraire;
		}

		public void setHorraire(HorrairesEntity horraire) {
			this.horraire = horraire;
		}

		@Override
		public String toString() {
			return "PlanActiviteEntity [idPlan=" + idPlan + ", activite=" + activite + ", horraire=" + horraire + "]";
		}
	 
	 
}
