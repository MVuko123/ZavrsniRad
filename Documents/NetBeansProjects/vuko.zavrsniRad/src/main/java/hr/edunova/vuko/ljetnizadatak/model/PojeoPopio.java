/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.vuko.ljetnizadatak.model;

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
public class PojeoPopio extends Entitet {
    
    private String kolicina;
    
    
   
    @OneToMany//(mappedBy = "pojeoPopio")
    private List<Karta> karte = new ArrayList<>();
    
   
   
    @OneToMany//(mappedBy = "pojeoPopio")
    private List<HranaPice> hranaPica = new ArrayList<>();
    
    @ManyToOne
    private Karta karta;
    @ManyToOne
    private HranaPice hranaPice;

    public List<Karta> getKarte() {
        return karte;
    }

    public void setKarte(List<Karta> karte) {
        this.karte = karte;
    }

    public List<HranaPice> getHranaPica() {
        return hranaPica;
    }

    public void setHranaPica(List<HranaPice> hranaPica) {
        this.hranaPica = hranaPica;
   }
    

    public String getKolicina() {
        return kolicina;
    }

    public void setKolicina(String kolicina) {
        this.kolicina = kolicina;
    }

    public Karta getKarta() {
        return karta;
    }

    public void setKarta(Karta karta) {
        this.karta = karta;
    }

    public HranaPice getHranaPice() {
        return hranaPice;
    }

    public void setHranaPice(HranaPice hranaPice) {
        this.hranaPice = hranaPice;
    }
    
    
}
