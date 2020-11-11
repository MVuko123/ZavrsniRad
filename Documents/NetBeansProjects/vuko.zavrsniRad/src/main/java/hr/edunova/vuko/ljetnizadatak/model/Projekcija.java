/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.vuko.ljetnizadatak.model;

import java.util.ArrayList;
import java.util.Date;
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
public class Projekcija extends Entitet{

    private String datum;
    
   
    
    @OneToMany//(mappedBy = "projekcija")
    private List<Karta> karte = new ArrayList<>();

    

    @ManyToOne
    private Film film;

    @OneToOne
    private Karta karta;

    public Karta getKarta() {
        return karta;
    }

    public void setKarta(Karta karta) {
        this.karta = karta;
    }

    public List<Karta> getKarte() {
        return karte;
    }

    public void setKarte(List<Karta> karte) {
                this.karte = karte;
    }
    
    
    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
    
    
    
}
