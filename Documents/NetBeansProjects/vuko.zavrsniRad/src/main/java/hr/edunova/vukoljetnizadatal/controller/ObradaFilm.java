/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.vukoljetnizadatal.controller;

import hr.edunova.vuko.ljetnizadatak.model.Film;
import hr.edunova.vukoljetnizadatak.utility.ZavrsniException;
import java.util.List;

/**
 *
 * @author Marin
 */
public class ObradaFilm extends Obrada<Film>{

    public ObradaFilm(Film film){
        super(film);
    }
    
    public ObradaFilm(){
        super();
    }
    
    @Override
    public List<Film> getPodaci() {
        return session.createQuery("from Film").list();
    }

    @Override
    protected void kontrolaCreate() throws ZavrsniException {
        kontrolaNaziv();
        kontrolaOcjena();
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniException {
        
    }

    @Override
    protected void kontrolaDelete() throws ZavrsniException {
        if(entitet.getProjekcije().size() > 0){
            throw new ZavrsniException("Film se ne može obrisati jer se nalazi u projekciiji!");
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

    private void kontrolaOcjena() throws ZavrsniException {
              
        if (entitet.getOcjena() == null) {
            throw new ZavrsniException(" Ocjena nije defenirina! ");
        }
        if (entitet.getOcjena().isEmpty()) {
            throw new ZavrsniException(" Morate unijeti ocjenu! ");
        }
        if (entitet.getOcjena().length() > 10 && entitet.getOcjena().length() <= 0) {
            throw new ZavrsniException(" Ocjena mora biti izmedu 1 i 10! ");
        }
    }
    
}
