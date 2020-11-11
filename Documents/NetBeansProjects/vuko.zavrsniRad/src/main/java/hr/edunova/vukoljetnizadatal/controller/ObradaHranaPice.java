/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.vukoljetnizadatal.controller;

import hr.edunova.vuko.ljetnizadatak.model.HranaPice;
import hr.edunova.vukoljetnizadatak.utility.ZavrsniException;
import java.util.List;

/**
 *
 * @author Marin
 */
public class ObradaHranaPice extends Obrada<HranaPice>{

    
    public ObradaHranaPice(HranaPice hranaPice){
        super(hranaPice);
    }
    
    public ObradaHranaPice(){
        super();
    }
    
    @Override
    public List<HranaPice> getPodaci() {
        return session.createQuery("from HranaPice").list();
    }

    @Override
    protected void kontrolaCreate() throws ZavrsniException {
        kontrolaNaziv();
        kontrolaCijena();
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniException {
       
    }

    @Override
    protected void kontrolaDelete() throws ZavrsniException {
        if(entitet.getPojeliPopili().size() > 0){
            throw new ZavrsniException(" Hrana i Pice se ne moze obrisati jer se nalazi u PojeoPopio");
        }
    }

   private void kontrolaNaziv() throws ZavrsniException {
        if (entitet.getNaziv() == null) {
            throw new ZavrsniException(" Naziv nije definiran! ");
        }
        if (entitet.getNaziv().isEmpty()) {
            throw new ZavrsniException(" Morate unijeti naziv! ");
        }
        if (entitet.getNaziv().length() > 50) {
            throw new ZavrsniException(" Naziv ne smije sadržavati više od 50 znakova. ");
        }
    }

    private void kontrolaCijena() throws ZavrsniException {
        if (entitet.getCijena() == null) {
            throw new ZavrsniException(" Cijena nije definirana, morate ju unijeti! ");
        }
    }
    
}
