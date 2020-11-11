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
public class HranaPice extends Entitet{
    private String naziv;
    private String cijena;
    
      
    @OneToMany//(mappedBy = "hranaPice")
   private List<PojeoPopio> pojeliPopili = new ArrayList<>();

    public List<PojeoPopio> getPojeliPopili() {
        return pojeliPopili;
            }
    public void setPojeliPopili(List<PojeoPopio> pojeliPopili) {
        this.pojeliPopili = pojeliPopili;
    }
    
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getCijena() {
        return cijena;
    }

    public void setCijena(String cijena) {
        this.cijena = cijena;
    }
    
}
