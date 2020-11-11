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
public class Film extends Entitet{
    private String naziv;
    private String redatelj;
    private String zanr;
    private String godina;
    private String ocjena;
    
 
   
   @OneToMany//(mappedBy = "film")
   private List<Projekcija> projekcije = new ArrayList<>();

    public String getNaziv() {
        return naziv;
    }

    public List<Projekcija> getProjekcije() {
        return projekcije;
    }

    public void setProjekcije(List<Projekcija> projekcije) {
        this.projekcije = projekcije;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getRedatelj() {
        return redatelj;
    }

    public void setRedatelj(String redatelj) {
        this.redatelj = redatelj;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public String getGodina() {
        return godina;
    }

    public void setGodina(String godina) {
        this.godina = godina;
    }

    public String getOcjena() {
        return ocjena;
    }

    public void setOcjena(String ocjena) {
        this.ocjena = ocjena;
    }
    
}
