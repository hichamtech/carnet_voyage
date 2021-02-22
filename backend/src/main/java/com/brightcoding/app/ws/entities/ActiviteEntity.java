package com.brightcoding.app.ws.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;

import javax.persistence.CascadeType;
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
    private long idActivite;
	private String codeActivite;
    private  String name;
    private double price;
    private String description;

    @Lob
	private Byte[] photo;
    
    @ManyToOne
	@JoinColumn(name="id_domaine", referencedColumnName = "idDomaine", insertable = true, updatable = true)
    private DomaineActiviteEntity domaineActivite;
    
    @OneToMany(mappedBy = "activite")
    Set<PlanActiviteEntity> planActivite;

    @ManyToOne(name="sejour_id")
	private SejourEntity sejour;

//    @OneToMany(mappedBy = "activities")
//    Set<SejourEntity>  sejour;

}
