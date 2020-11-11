/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.vukoljetnizadatal.controller;

import hr.edunova.vuko.ljetnizadatak.model.Operater;
import hr.edunova.vukoljetnizadatak.utility.ZavrsniException;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Marin
 */
public class ObradaOperater extends Obrada<Operater>{

    public Operater autoriziraj(String email, char[] lozinka) {
        Operater operater = (Operater) session.createQuery(
                " from Operater o where o.email=:email")
                .setParameter("email", email).getSingleResult();
        if (operater == null) {
            return null;
        }
        return BCrypt.checkpw(new String(lozinka), operater.getLozinka())
                ? operater : null;
    }
    
    @Override
    public List<Operater> getPodaci() {
        return session.createQuery("from Operater").list();
    }

    @Override
    protected void kontrolaCreate() throws ZavrsniException {
        kontrolaIme();
        kontrolaPrezime();
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniException {
        
    }

    @Override
    protected void kontrolaDelete() throws ZavrsniException {
        
    }
    
    private void kontrolaIme() throws ZavrsniException {
        if(entitet.getIme() == null){
            throw new ZavrsniException(" Ime nije definirano! ");
        }
        if(entitet.getIme().isEmpty()){
            throw new ZavrsniException(" Unesite ime! ");
        }
        if(entitet.getIme().length() > 50){
            throw new ZavrsniException(" Ime mora imati manje od 50 znakova! ");
        }
    }

    private void kontrolaPrezime() throws ZavrsniException {
        if(entitet.getPrezime() == null){
            throw new ZavrsniException(" Prezime nije definirano! ");
        }
        if(entitet.getPrezime().isEmpty()){
            throw new ZavrsniException(" Unesite prezime! ");
        }
        if(entitet.getPrezime().length() > 50){
            throw new ZavrsniException(" Prezime mora imati manje od 50 znakova! ");
        }
    }
    
    
}
