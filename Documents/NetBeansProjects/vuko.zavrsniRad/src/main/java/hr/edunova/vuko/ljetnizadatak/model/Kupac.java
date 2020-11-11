/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.vuko.ljetnizadatak.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Marin
 */
@Entity
public class Kupac extends Entitet {
    private String ime;
    private String prezime;
    private String spol;
    private String dob;
    
   
    
    @OneToMany//(mappedBy = "kupac")
    private List<Karta> karte = new ArrayList<>();

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public List<Karta> getKarte() {
        return karte;
    }

    public void setKarte(List<Karta> karte) {
        this.karte = karte;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getSpol() {
        return spol;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
   
    
}
