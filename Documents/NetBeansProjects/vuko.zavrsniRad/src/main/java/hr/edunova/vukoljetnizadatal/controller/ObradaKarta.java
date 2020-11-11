/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.vukoljetnizadatal.controller;

import hr.edunova.vuko.ljetnizadatak.model.Karta;
import hr.edunova.vukoljetnizadatak.utility.ZavrsniException;
import java.util.List;

/**
 *
 * @author Marin
 */
public class ObradaKarta  extends Obrada<Karta>{
   
    public ObradaKarta(Karta karta){
        super(karta);
    }
    
    public ObradaKarta(){
        super();
    }
    
    @Override
    public List<Karta> getPodaci() {
        return session.createQuery("from Karta").list();
    }

    @Override
    protected void kontrolaCreate() throws ZavrsniException {
        kontrolaCijena();
       kontrolaSjedalo();
       kontrolaRed();
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniException {
        
    }

    @Override
    protected void kontrolaDelete() throws ZavrsniException {
       if(entitet.getPojedenoPopijeno().size() > 0){
           throw new ZavrsniException(" Karta se ne moe obrisati jer se nalazi u PojeoPopio");
       }
    }
    
    private void kontrolaCijena() throws ZavrsniException {
         if (entitet.getCijena() == null) {
            throw new ZavrsniException(" Cijena nije definirana, morate ju unijeti! ");
        }
    }

    private void kontrolaSjedalo() throws ZavrsniException{
        if (entitet.getSjedalo() == null) {
            throw new ZavrsniException(" Sjedalo nije defeinirano morate ga unijeti! ");
        }
   
    }

    private void kontrolaRed() throws ZavrsniException{
       if (entitet.getRed() == null) {
            throw new ZavrsniException(" Red nije definiran! ");
        }
       if(entitet.getRed().isEmpty()){
           throw new ZavrsniException(" Morate unijeti jedno slovo za red! ");
       }
       if(entitet.getRed().length() > 1){
           throw new ZavrsniException(" Morate unijeti samo jedno slovo za red! ");
       }
    }
    
}
