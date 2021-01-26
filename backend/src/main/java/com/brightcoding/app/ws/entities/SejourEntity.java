package com.brightcoding.app.ws.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="sejour")
public class SejourEntity implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6045029996361869965L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSejour;
	
    private String dateSejour;
    
	 @ManyToOne
	 @JoinColumn(name = "idActivite")
	 private ActiviteEntity activite;
	 
	 @ManyToOne
	 @JoinColumn(name = "id")
	
	 private UserEntity client;

	public SejourEntity(Long idSejour, String dateSejour, ActiviteEntity activite,UserEntity client) {
		super();
		this.idSejour = idSejour;
		this.dateSejour = dateSejour;
		this.activite = activite;
		this.client = client;
		}
	

	public SejourEntity() {
		super();
	}


	public Long getIdSejour() {
		return idSejour;
	}

	public void setIdSejour(Long idSejour) {
		this.idSejour = idSejour;
	}

	public String getDateSejour() {
		return dateSejour;
	}

	public void setDateSejour(String dateSejour) {
		this.dateSejour = dateSejour;
	}

	public ActiviteEntity getActivite() {
		return activite;
	}

	public void setActivite(ActiviteEntity activite) {
		this.activite = activite;
	}


	public UserEntity getClient() {
		return client;
	}


	public void setClient(UserEntity client) {
		this.client = client;
	}


	@Override
	public String toString() {
		return "Sejour [idSejour=" + idSejour + ", dateSejour=" + dateSejour + ", activite=" + activite + ", client="
				+ client + "]";
	}


	
	 
	 
}
