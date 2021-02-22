//package com.brightcoding.app.ws.responses;
//
//import com.brightcoding.app.ws.entities.ActiviteEntity;
//import com.brightcoding.app.ws.entities.UserEntity;
//
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//public class SejourResponse {
//
//    private String codeSejour ;
//
//    private String dateSejour;
//
//    private ActiviteResponse activite;
//
//    private UserResponse client;
//
//    public SejourResponse(String codeSejour, String dateSejour, ActiviteResponse activite, UserResponse client) {
//        this.codeSejour = codeSejour;
//        this.dateSejour = dateSejour;
//        this.activite = activite;
//        this.client = client;
//    }
//
//    public String getCodeSejour() {
//        return codeSejour;
//    }
//
//    public void setCodeSejour(String codeSejour) {
//        this.codeSejour = codeSejour;
//    }
//
//    public String getDateSejour() {
//        return dateSejour;
//    }
//
//    public void setDateSejour(String dateSejour) {
//        this.dateSejour = dateSejour;
//    }
//
//    public ActiviteResponse getActivite() {
//        return activite;
//    }
//
//    public void setActivite(ActiviteResponse activite) {
//        this.activite = activite;
//    }
//
//    public UserResponse getClient() {
//        return client;
//    }
//
//    public void setClient(UserResponse client) {
//        this.client = client;
//    }
//}
