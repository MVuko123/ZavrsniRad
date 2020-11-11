/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.vukoljetnizadatal.controller;

import hr.edunova.vuko.ljetnizadatak.model.Kupac;
import hr.edunova.vukoljetnizadatak.utility.ZavrsniException;
import java.util.List;

/**
 *
 * @author Marin
 */
public class ObradaKupac extends Obrada<Kupac>{
    
    public ObradaKupac(Kupac kupac){
        super(kupac);
    }
    
    public ObradaKupac(){
        super();
    }
    
     @Override
    public List<Kupac> getPodaci() {
        return session.createQuery("from Kupac").list();

    }

    @Override
    protected void kontrolaCreate() throws ZavrsniException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaSpol();
        kontrolaDob();
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniException {
        
    }

    @Override
    protected void kontrolaDelete() throws ZavrsniException {
      if(entitet.getKarte().size() > 0){
          throw new ZavrsniException("Kupac se ne može obrisati jer se nalazi u karti!");
      }
    }
     private void kontrolaIme() throws ZavrsniException {
       if (entitet.getIme() == null) {
            throw new ZavrsniException(" Ime nije definirano! ");
        }
        if (entitet.getIme().isEmpty()) {
            throw new ZavrsniException(" Morate unijeti ime! ");
        }
        if (entitet.getIme().length() > 50) {
            throw new ZavrsniException(" Ime ne smije sadržavati više od 50 znakova. ");
        }
    }
     
      private void kontrolaPrezime() throws ZavrsniException {
       if (entitet.getPrezime() == null) {
            throw new ZavrsniException(" Prezime nije definirano! ");
        }
        if (entitet.getPrezime().isEmpty()) {
            throw new ZavrsniException(" Morate unijeti prezime! ");
        }
        if (entitet.getPrezime().length() > 50) {
            throw new ZavrsniException(" Prezime ne smije sadržavati više od 50 znakova. ");
        }
    }

    private void kontrolaSpol() throws ZavrsniException {
        if (entitet.getSpol() == null) {
            throw new ZavrsniException(" Spol nije definiran! ");
        }
        if (entitet.getSpol().isEmpty()) {
            throw new ZavrsniException(" Morate unijeti spol! ");
        }
        if (entitet.getSpol().length() > 1) {
            throw new ZavrsniException(" Spol ne smije sadržavati više od 1 znaka. ");
        }
        
    }

    private void kontrolaDob() throws ZavrsniException {
         if (entitet.getDob() == null) {
            throw new ZavrsniException(" Dob nije definarana, morate ju unijeti! ");
        }
    }
    
}
