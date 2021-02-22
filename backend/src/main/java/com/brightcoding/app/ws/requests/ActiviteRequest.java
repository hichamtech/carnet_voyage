package com.brightcoding.app.ws.requests;



import com.brightcoding.app.ws.entities.DomaineActiviteEntity;

public class ActiviteRequest {
	
    private  String name;
    private double price;
    private String description;
   
	private Byte[] photo;
 
    private DomaineActiviteEntity domaineActivite;

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
    
    

}
