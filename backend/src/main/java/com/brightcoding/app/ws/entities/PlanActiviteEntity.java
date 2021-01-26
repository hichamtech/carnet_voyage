package com.brightcoding.app.ws.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class PlanActiviteEntity implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6174442660376113700L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idPlan;

	 @Column(name = "id_horraire")
	 private Long horraireId;

	 @Column(name = "id_activite")
	 private Long activiteId;

	public Long getIdPlan() {
		return idPlan;
	}

	public void setIdPlan(Long idPlan) {
		this.idPlan = idPlan;
	}

	public Long getHorraireId() {
		return horraireId;
	}

	public void setHorraireId(Long horraireId) {
		this.horraireId = horraireId;
	}

	public Long getActiviteId() {
		return activiteId;
	}

	public void setActiviteId(Long activiteId) {
		this.activiteId = activiteId;
	}

	public PlanActiviteEntity(Long idPlan, Long horraireId, Long activiteId) {
		super();
		this.idPlan = idPlan;
		this.horraireId = horraireId;
		this.activiteId = activiteId;
	}

	public PlanActiviteEntity() {
		super();
	}

	@Override
	public String toString() {
		return "PlanActiviteEntity [idPlan=" + idPlan + ", horraireId=" + horraireId + ", activiteId=" + activiteId
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activiteId == null) ? 0 : activiteId.hashCode());
		result = prime * result + ((horraireId == null) ? 0 : horraireId.hashCode());
		result = prime * result + ((idPlan == null) ? 0 : idPlan.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlanActiviteEntity other = (PlanActiviteEntity) obj;
		if (activiteId == null) {
			if (other.activiteId != null)
				return false;
		} else if (!activiteId.equals(other.activiteId))
			return false;
		if (horraireId == null) {
			if (other.horraireId != null)
				return false;
		} else if (!horraireId.equals(other.horraireId))
			return false;
		if (idPlan == null) {
			if (other.idPlan != null)
				return false;
		} else if (!idPlan.equals(other.idPlan))
			return false;
		return true;
	}
	 
	 
}
