package com.brightcoding.app.ws.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity(name="activite")
public class ActiviteEntity  implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -1315227053390274675L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActivite;
    private  String name;
    private double price;
    private String description;
    
    @Lob
	private Byte[] photo;
    
    @ManyToOne
	@JoinColumn(name="idDomaine")
    private DomaineActivite domaineActivite;
    
    @OneToMany(mappedBy = "activite")
    Set<> ratings;
    
}
