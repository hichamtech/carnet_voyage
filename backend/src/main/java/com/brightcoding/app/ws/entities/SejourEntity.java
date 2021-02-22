//package com.brightcoding.app.ws.entities;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//@Entity(name="sejour")
//public class SejourEntity implements Serializable{
//
//	private static final long serialVersionUID = 6045029996361869965L;
//
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//	private String codeSejour ;
//    private String dateSejour;
//
//	@OneToMany(mappedBy="sejour", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
//	private List<ActiviteEntity> activities;
//
//	@ManyToOne(name="user_id")
//	private UserEntity user;
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getCodeSejour() {
//		return codeSejour;
//	}
//
//	public void setCodeSejour(String codeSejour) {
//		this.codeSejour = codeSejour;
//	}
//
//	public String getDateSejour() {
//		return dateSejour;
//	}
//
//	public void setDateSejour(String dateSejour) {
//		this.dateSejour = dateSejour;
//	}
//
//	public List<ActiviteEntity> getActivities() {
//		return activities;
//	}
//
//	public void setActivities(List<ActiviteEntity> activities) {
//		this.activities = activities;
//	}
//
//	public UserEntity getUser() {
//		return user;
//	}
//
//	public void setUser(UserEntity user) {
//		this.user = user;
//	}
//
//	/* @ManyToOne
//	 @JoinColumn(name = "idActivite")
//	 private ActiviteEntity activities;
//
//	 @ManyToOne
//	 @JoinColumn(name = "id" , insertable = true, updatable = true)
//	 private UserEntity client;
//
//	@OneToMany(mappedBy="user", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
//	private List<AddressEntity> addresses;*/
//
//
//}
