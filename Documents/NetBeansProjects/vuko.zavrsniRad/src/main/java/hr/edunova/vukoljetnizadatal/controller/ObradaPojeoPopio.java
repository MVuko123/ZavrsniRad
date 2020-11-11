/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.vukoljetnizadatal.controller;

import hr.edunova.vuko.ljetnizadatak.model.PojeoPopio;
import hr.edunova.vukoljetnizadatak.utility.ZavrsniException;
import java.util.List;

/**
 *
 * @author Marin
 */
public class ObradaPojeoPopio extends Obrada<PojeoPopio>{

    public ObradaPojeoPopio(PojeoPopio pojeoPopio){
        super(pojeoPopio);
    }
    
    public ObradaPojeoPopio(){
        super();
    }
    
    @Override
    public List<PojeoPopio> getPodaci() {
        return session.createQuery("from PojeoPopio").list();
    }

    @Override
    protected void kontrolaCreate() throws ZavrsniException {
       kontrolaKolicina();
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniException {
        
    }

    @Override
    protected void kontrolaDelete() throws ZavrsniException {
        if(entitet.getHranaPica().size() > 0){
            throw new ZavrsniException(" PojeoPopio se ne moze obrisati jer se nalazi u HranaPice");
        }
        if(entitet.getKarte().size() > 0){
            throw new ZavrsniException("PojeoPopio se ne moze obrisati jer se nalazi u Karti");
        }
    }
    
    private void kontrolaKolicina() throws ZavrsniException{
        if(entitet.getKolicina() == null){
            throw new ZavrsniException(" Kolicina nije definirana! ");
        }
        if(entitet.getKolicina().isEmpty()){
            throw new ZavrsniException(" Unesite kolicinu! ");
        }
    }
}
