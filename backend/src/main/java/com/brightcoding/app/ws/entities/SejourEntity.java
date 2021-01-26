package com.brightcoding.app.ws.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SejourEntity implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -7969948606439166006L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String id;
    private String dateSejour;

    public SejourEntity() {
    }

    public SejourEntity(String id, String dateSejour) {
        this.id = id;
        this.dateSejour = dateSejour;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateSejour() {
        return dateSejour;
    }

    public void setDateSejour(String dateSejour) {
        this.dateSejour = dateSejour;
    }

    @Override
    public String toString() {
        return "Sejour{" +
                "id='" + id + '\'' +
                ", dateSejour='" + dateSejour + '\'' +
                '}';
    }
}
