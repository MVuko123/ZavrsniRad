/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.vuko.ljetnizadatak;

import hr.edunova.vuko.ljetnizadatak.model.Film;
import hr.edunova.vuko.ljetnizadatak.view.Autorizacija;
import hr.edunova.vukoljetnizadatak.utility.HibernateUtil;
import hr.edunova.vukoljetnizadatak.utility.PocetniInsert;
import hr.edunova.vuko.ljetnizadatak.view.SplashScreen;
import hr.edunova.vukoljetnizadatak.utility.ZavrsniException;
import hr.edunova.vukoljetnizadatal.controller.ObradaFilm;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Marin
 */
public class Start {
    public static void main(String[] args) {
        SplashScreen sC = new SplashScreen();
        sC.setLocationRelativeTo(null);
        sC.setVisible(true);
//        
 //       new Autorizacija().setVisible(true);
        
//        HibernateUtil.getSessionFactory().openSession();
//        PocetniInsert.izvedi();
//        
//        PocetniInsert.adminOperater();
//      
       
//       Film f;
//       
//        ObradaFilm obradaFilm = new ObradaFilm();
//        List<Film> lista = new ArrayList<>();
//        long pocetak = System.currentTimeMillis();
//        for(int i = 0; i < 1000; i++){
//            f = new Film();
//            f.setNaziv("Lorem ipsum dolor sit amet");
//            f.setRedatelj("Lorem ipsum dolor sit amet");
//            f.setZanr("Lorem ipsum dolor sit amet");
//            f.setGodina("2000");
//            f.setOcjena("8");
//            lista.add(f);
//        }
//        try {
//            obradaFilm.createAll(lista);
//        } catch (ZavrsniException ex) {
//            System.out.println(ex.getPoruka());
//        }
//        
//        long kraj = System.currentTimeMillis();
//        
//        System.out.println(kraj - pocetak);
       
    }
    
}
