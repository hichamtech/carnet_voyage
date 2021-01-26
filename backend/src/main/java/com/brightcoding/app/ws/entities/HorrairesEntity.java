package com.brightcoding.app.ws.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    public HorrairesEntity() { }
    public HorrairesEntity(Long id, String dateDebut, String dateFin) {
        this.idHorraire = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Long getId() {
        return idHorraire;
    }

    public void setId(Long id) {
        this.idHorraire = id;
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

    @Override
    public String toString() {
        return "Horraires{" +
                "id=" + idHorraire +
                ", dateDebut='" + dateDebut + '\'' +
                ", dateFin='" + dateFin + '\'' +
                '}';
    }
}
