/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.vuko.ljetnizadatak.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Marin
 */
@Entity
public class Karta extends Entitet{

       private String cijena;
       private String sjedalo;
       private String red;
       
      
    
    @OneToMany//(mappedBy = "karta")
       private List<PojeoPopio> pojedenoPopijeno = new ArrayList<>();

       

       @ManyToOne
       private Kupac kupac;
       @ManyToOne
       private Projekcija projekcija;
       
   public List<PojeoPopio> getPojedenoPopijeno() {
        return pojedenoPopijeno;
    }

    public void setPojedenoPopijeno(List<PojeoPopio> pojedenoPopijeno) {
        this.pojedenoPopijeno = pojedenoPopijeno;
    }    

    public String getCijena() {
        return cijena;
    }

    public void setCijena(String cijena) {
        this.cijena = cijena;
    }
       

    public String getSjedalo() {
        return sjedalo;
    }

    public void setSjedalo(String sjedalo) {
        this.sjedalo = sjedalo;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public Projekcija getProjekcija() {
        return projekcija;
    }

    public void setProjekcija(Projekcija projekcija) {
        this.projekcija = projekcija;
    }
    
}
