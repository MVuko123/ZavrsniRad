/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.vukoljetnizadatal.controller;

import hr.edunova.vuko.ljetnizadatak.model.Projekcija;
import hr.edunova.vukoljetnizadatak.utility.ZavrsniException;
import java.util.List;

/**
 *
 * @author Marin
 */
public class ObradaProjekcija extends Obrada<Projekcija>{

     public ObradaProjekcija(Projekcija projekcija){
        super(projekcija);
    }
    
    public ObradaProjekcija(){
        super();
    }
    
    @Override
    public List<Projekcija> getPodaci() {
        return session.createQuery("from Projekcija").list();
    }

    @Override
    protected void kontrolaCreate() throws ZavrsniException {
        kontrolaDatum();
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniException {
        
    }

    @Override
    protected void kontrolaDelete() throws ZavrsniException {
        if(entitet.getKarte().size() > 0){
            throw new ZavrsniException("Projekcija se ne mze obrisati jer se nalazi u Karti");
        }
    }
    
    private void kontrolaDatum() throws ZavrsniException {
        if(entitet.getDatum() == null){
            throw new ZavrsniException(" Datum nije defnirian! ");
        }
        if(entitet.getDatum().equals(0)){
            throw new ZavrsniException(" Morate unijeti datum! ");
            
        }
    }
    
}
