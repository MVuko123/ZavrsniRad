/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.vukoljetnizadatak.utility;

import hr.edunova.vuko.ljetnizadatak.model.Film;
import hr.edunova.vuko.ljetnizadatak.model.HranaPice;
import hr.edunova.vuko.ljetnizadatak.model.Karta;
import hr.edunova.vuko.ljetnizadatak.model.Kupac;
import hr.edunova.vuko.ljetnizadatak.model.Operater;
import hr.edunova.vuko.ljetnizadatak.model.PojeoPopio;
import hr.edunova.vuko.ljetnizadatak.model.Projekcija;
import hr.edunova.vukoljetnizadatal.controller.ObradaOperater;
import java.math.BigDecimal;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Marin
 */
public class PocetniInsert {
    public static void izvedi(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Operater operater = new Operater();
        operater.setIme("Marin");
        operater.setPrezime("Vuko");
        operater.setUloga("Oper");
        operater.setEmail("vuko.marin52@gmail.com");
        operater.setLozinka(BCrypt.hashpw("m", BCrypt.gensalt()));
   
        ObradaOperater oo = new ObradaOperater();
        oo.setEntitet(operater);
        try {
            oo.create();
        } catch (ZavrsniException ex) {
            ex.printStackTrace();
        }
        
        Film film1 = new Film();
        film1.setNaziv("The Dark Knight");
        film1.setRedatelj("Christopher Nolan");
        film1.setZanr("Akcijski/Pustolovni");
        film1.setGodina("2008");
        film1.setOcjena("9");
        
        Film film2 = new Film();
        film2.setNaziv("Inception");
        film2.setRedatelj("Christopher Nolan");
        film2.setZanr("Akcijski/SF");
        film2.setGodina("2010");
        film2.setOcjena("8.8");
        
        Film film3 = new Film();
        film3.setNaziv("Gladiator");
        film3.setRedatelj("Ridley Scott");
        film3.setZanr("Akcijski/Pustolovni");
        film3.setGodina("2000");
        film3.setOcjena("8.5");
        
        Film film4 = new Film();
        film4.setNaziv("The Lord of the Rings: The Fellowship of the Ring");
        film4.setRedatelj("Peter Jacksonn");
        film4.setZanr("Fantastika/Pustolovni");
        film4.setGodina("2001");
        film4.setOcjena("8.8");
        
        Film film5 = new Film();
        film5.setNaziv("Django Unchained");
        film5.setRedatelj("Quentin Tarantino");
        film5.setZanr("Vestern/Drama");
        film5.setGodina("2012");
        film5.setOcjena("8.4");
        
         Film film6 = new Film();
        film6.setNaziv("Inglourious Basterds");
        film6.setRedatelj("Quentin Tarantino");
        film6.setZanr("Ratni/Akcijski");
        film6.setGodina("2009");
        film6.setOcjena("8.3");
        
        Film film7 = new Film();
        film7.setNaziv("The Wolf of Wall Street");
        film7.setRedatelj("Martin Scoreses");
        film7.setZanr("Komedija/Krimi-fikcija");
        film7.setGodina("2013");
        film7.setOcjena("8.2");
        
        
        Film film8 = new Film();
        film8.setNaziv("The Dark Knight Rises");
        film8.setRedatelj("Christopher Nolan");
        film8.setZanr("Akcijski/Krimi-fikcija");
        film8.setGodina("2012");
        film8.setOcjena("8.4");
        
        Film film9 = new Film();
        film9.setNaziv("Guardian of the Galaxy");
        film9.setRedatelj("James Gunn");
        film9.setZanr("Akcijski/SF");
        film9.setGodina("2014");
        film9.setOcjena("8");
        
        Film film10 = new Film();
        film10.setNaziv("The Departed");
        film10.setRedatelj("Martin Scorsese");
        film10.setZanr("Triler/Krimi");
        film10.setGodina("2006");
        film1.setOcjena("8.5");
        
       session.save(film1);
       session.save(film2);
       session.save(film3);
       session.save(film4);
       session.save(film5);
       session.save(film6);
       session.save(film7);
       session.save(film8);
       session.save(film9);
       session.save(film10);
       
       session.getTransaction().commit();
       session.beginTransaction();
       
       Kupac kupac1 = new Kupac();
       kupac1.setIme("Leona");
       kupac1.setPrezime("Vučković");
       kupac1.setSpol("Ž");
       kupac1.setDob("25");
       
       Kupac kupac2 = new Kupac();
       kupac2.setIme("Patrik ");
       kupac2.setPrezime("Kovač");
       kupac2.setSpol("M");
       kupac2.setDob("60");
       
       Kupac kupac3 = new Kupac();
       kupac3.setIme("Draženka ");
       kupac3.setPrezime("Mihaljević");
       kupac3.setSpol("Ž");
       kupac3.setDob("34");
       
       Kupac kupac4 = new Kupac();
       kupac4.setIme("Marjan ");
       kupac4.setPrezime("Jurišić");
       kupac4.setSpol("M");
       kupac4.setDob("18");
       
       Kupac kupac5 = new Kupac();
       kupac5.setIme("Nediljka ");
       kupac5.setPrezime("Pavičić");
       kupac5.setSpol("Ž");
       kupac5.setDob("55");
       
       Kupac kupac6 = new Kupac();
       kupac6.setIme("Danko ");
       kupac6.setPrezime("Grgić");
       kupac6.setSpol("M");
       kupac6.setDob("34");
       
       Kupac kupac7 = new Kupac();
       kupac7.setIme("Valentina ");
       kupac7.setPrezime("Anić");
       kupac7.setSpol("Ž");
       kupac7.setDob("16");
       
       Kupac kupac8 = new Kupac();
       kupac8.setIme("Dino ");
       kupac8.setPrezime("Galić");
       kupac8.setSpol("M");
       kupac8.setDob("27");
       
       Kupac kupac9 = new Kupac();
       kupac9.setIme("Klaudija ");
       kupac9.setPrezime("Mađar");
       kupac9.setSpol("Ž");
       kupac9.setDob("61");
       
       Kupac kupac10 = new Kupac();
       kupac10.setIme("Hrvoje");
       kupac10.setPrezime("Brajković");
       kupac10.setSpol("M");
       kupac10.setDob("14");
       
       Kupac kupac11 = new Kupac();
       kupac11.setIme("Zvjezdana ");
       kupac11.setPrezime("Bašić");
       kupac11.setSpol("Ž");
       kupac11.setDob("33");
       
       Kupac kupac12 = new Kupac();
       kupac12.setIme("Dominik");
       kupac12.setPrezime("Jukić");
       kupac12.setSpol("M");
       kupac12.setDob("37");
       
       Kupac kupac13 = new Kupac();
       kupac13.setIme("Đurđa ");
       kupac13.setPrezime("Jović");
       kupac13.setSpol("Ž");
       kupac13.setDob("20");
       
       Kupac kupac14 = new Kupac();
       kupac14.setIme("Domagoj ");
       kupac14.setPrezime("Živković");
       kupac14.setSpol("Ž");
       kupac14.setDob("49");
       
       Kupac kupac15 = new Kupac();
       kupac15.setIme("Silvija ");
       kupac15.setPrezime("Horvatinčić");
       kupac15.setSpol("Ž");
       kupac15.setDob("53");
       
       Kupac kupac16 = new Kupac();
       kupac16.setIme("Dražen ");
       kupac16.setPrezime("Kolar");
       kupac16.setSpol("M");
       kupac16.setDob("21");
       
       Kupac kupac17 = new Kupac();
       kupac17.setIme("Silvija ");
       kupac17.setPrezime("Ivanec");
       kupac17.setSpol("Ž");
       kupac17.setDob("32");
       
       Kupac kupac18 = new Kupac();
       kupac18.setIme("Branislav ");
       kupac18.setPrezime("Bilić");
       kupac18.setSpol("M");
       kupac18.setDob("44");
       
       Kupac kupac19 = new Kupac();
       kupac19.setIme("Renata ");
       kupac19.setPrezime("Tadić");
       kupac19.setSpol("Ž");
       kupac19.setDob("46");
       
       Kupac kupac20 = new Kupac();
       kupac20.setIme("Krešimir ");
       kupac20.setPrezime("Janković");
       kupac20.setSpol("M");
       kupac20.setDob("71");
       
       session.save(kupac1);
       session.save(kupac2);
       session.save(kupac3);
       session.save(kupac4);
       session.save(kupac5);
       session.save(kupac6);
       session.save(kupac7);
       session.save(kupac8);
       session.save(kupac9);
       session.save(kupac10);
       session.save(kupac11);
       session.save(kupac12);
       session.save(kupac13);
       session.save(kupac14);
       session.save(kupac15);
       session.save(kupac16);
       session.save(kupac17);
       session.save(kupac18);
       session.save(kupac19);
       session.save(kupac20);
       
       session.getTransaction().commit();
       session.beginTransaction();
       
       HranaPice hranaPice1 = new HranaPice();
       hranaPice1.setNaziv("Male Kokice");
       hranaPice1.setCijena("13.5");
       
       HranaPice hranaPice2 = new HranaPice();
       hranaPice2.setNaziv("Srednje Kokice");
       hranaPice2.setCijena("19");
       
       HranaPice hranaPice3 = new HranaPice();
       hranaPice3.setNaziv("Velike Kokice");
       hranaPice3.setCijena("24");
       
       HranaPice hranaPice4 = new HranaPice();
       hranaPice4.setNaziv("Mali Nachosi");
       hranaPice4.setCijena("22.7");
       
       HranaPice hranaPice5 = new HranaPice();
       hranaPice5.setNaziv("Srednji Nachosi");
       hranaPice5.setCijena("30");
       
       HranaPice hranaPice6 = new HranaPice();
       hranaPice6.setNaziv("Veliki Nachosi");
       hranaPice6.setCijena("38.5");
       
       HranaPice hranaPice7 = new HranaPice();
       hranaPice7.setNaziv("Mali Sok");
       hranaPice7.setCijena("12");
       
       HranaPice hranaPice8 = new HranaPice();
       hranaPice8.setNaziv("Srednji Sok");
       hranaPice8.setCijena("17.5");
       
       HranaPice hranaPice9 = new HranaPice();
       hranaPice9.setNaziv("Veliki Sok");
       hranaPice9.setCijena("23");
       
       HranaPice hranaPice10 = new HranaPice();
       hranaPice10.setNaziv("Male Kokice i Mali Sok");
       hranaPice10.setCijena("23");
       
       HranaPice hranaPice11 = new HranaPice();
       hranaPice11.setNaziv("Male Kokice i Srednji Sok");
       hranaPice11.setCijena("28");
       
       HranaPice hranaPice12 = new HranaPice();
       hranaPice12.setNaziv("Male Kokice i Veliki Sok");
       hranaPice12.setCijena("33");
       
       HranaPice hranaPice13 = new HranaPice();
       hranaPice13.setNaziv("Srednje Kokice i Mali Sok");
       hranaPice13.setCijena("29");
       
       HranaPice hranaPice14 = new HranaPice();
       hranaPice14.setNaziv("Srednje Kokice i Srednji Sok");
       hranaPice14.setCijena("33.5");
       
       HranaPice hranaPice15 = new HranaPice();
       hranaPice15.setNaziv("Srednje Kokice i Veliki Sok");
       hranaPice15.setCijena("39");
       
       HranaPice hranaPice16 = new HranaPice();
       hranaPice16.setNaziv("Velike Kokice i Mali Sok");
       hranaPice16.setCijena("34");
       
       HranaPice hranaPice17 = new HranaPice();
       hranaPice17.setNaziv("Velike Kokice i Srednji Sok");
       hranaPice17.setCijena("38.5");
       
       HranaPice hranaPice18 = new HranaPice();
       hranaPice18.setNaziv("Velike Kokice i Veliki Sok");
       hranaPice18.setCijena("44");
       
       HranaPice hranaPice19 = new HranaPice();
       hranaPice19.setNaziv("Mali Nachoci i Mali Sok");
       hranaPice19.setCijena("33");
       
       HranaPice hranaPice20 = new HranaPice();
       hranaPice20.setNaziv("Mali Nachosi i Srednji Sok");
       hranaPice20.setCijena("37.5");
       
       HranaPice hranaPice21 = new HranaPice();
       hranaPice21.setNaziv("Mali Nachosi i Veliki Sok");
       hranaPice21.setCijena("43");
       
       HranaPice hranaPice22 = new HranaPice();
       hranaPice22.setNaziv("Srednji  Nachosi i Mali Sok ");
       hranaPice22.setCijena("40");
              
       HranaPice hranaPice23 = new HranaPice();
       hranaPice23.setNaziv("Srednji  Nachosi i Srednji Sok ");
       hranaPice23.setCijena("44.5");
       
       HranaPice hranaPice24 = new HranaPice();
       hranaPice24.setNaziv("Srednji  Nachosi i Veliki Sok ");
       hranaPice24.setCijena("50");
       
       HranaPice hranaPice25 = new HranaPice();
       hranaPice25.setNaziv("Veliki  Nachosi i Mali Sok");
       hranaPice25.setCijena("47");
       
       HranaPice hranaPice26 = new HranaPice();
       hranaPice26.setNaziv("Veliki  Nachosi  i Srednji Sok");
       hranaPice26.setCijena("53");
       
       HranaPice hranaPice27 = new HranaPice();
       hranaPice27.setNaziv("Veliki  Nachosi i Veliki Sok");
       hranaPice27.setCijena("59");
       
       session.save(hranaPice1);
       session.save(hranaPice2);
       session.save(hranaPice3);
       session.save(hranaPice4);
       session.save(hranaPice5);
       session.save(hranaPice6);
       session.save(hranaPice7);
       session.save(hranaPice8);
       session.save(hranaPice9);
       session.save(hranaPice10);
       session.save(hranaPice11);
       session.save(hranaPice12);
       session.save(hranaPice13);
       session.save(hranaPice14);
       session.save(hranaPice15);
       session.save(hranaPice16);
       session.save(hranaPice17);
       session.save(hranaPice18);
       session.save(hranaPice19);
       session.save(hranaPice20);
       session.save(hranaPice21);
       session.save(hranaPice22);
       session.save(hranaPice23);
       session.save(hranaPice24);
       session.save(hranaPice25);
       session.save(hranaPice26);
       session.save(hranaPice27); 
       
       session.getTransaction().commit();
       session.beginTransaction();
       
       Projekcija projekcija1 = new Projekcija();
       projekcija1.setDatum("3.11.2020");
       projekcija1.setFilm(film1);
       
       Projekcija projekcija2 = new Projekcija();
       projekcija2.setDatum("7.11.2020");
       projekcija2.setFilm(film2);
       
       Projekcija projekcija3 = new Projekcija();
       projekcija3.setDatum("12.11.2020");
       projekcija3.setFilm(film3);
       
       Projekcija projekcija4 = new Projekcija();
       projekcija4.setDatum("15.11.2020");
       projekcija4.setFilm(film4);
       
       Projekcija projekcija5 = new Projekcija();
       projekcija5.setDatum("19.11.2020");
       projekcija5.setFilm(film5);
       
       Projekcija projekcija6 = new Projekcija();
       projekcija6.setDatum("23.11.2020");
       projekcija6.setFilm(film6);
       
       Projekcija projekcija7 = new Projekcija();
       projekcija7.setDatum("27.11.2020");
       projekcija7.setFilm(film7);
       
       Projekcija projekcija8 = new Projekcija();
       projekcija8.setDatum("30.11.2020");
       projekcija8.setFilm(film8);
       
       Projekcija projekcija9 = new Projekcija();
       projekcija9.setDatum("3.12.2020");
       projekcija9.setFilm(film9);
       
       Projekcija projekcija10 = new Projekcija();
       projekcija10.setDatum("7.12.2020");
       projekcija10.setFilm(film10);
       
       session.save(projekcija1);
       session.save(projekcija2);
       session.save(projekcija3);
       session.save(projekcija4);
       session.save(projekcija5);
       session.save(projekcija6);
       session.save(projekcija7);
       session.save(projekcija8);
       session.save(projekcija9);
       session.save(projekcija10);
       
       session.getTransaction().commit();
       session.beginTransaction();
       
       Karta karta1 = new Karta();
       karta1.setCijena("22");
       karta1.setSjedalo("5");
       karta1.setRed("A");
       karta1.setKupac(kupac1);
       karta1.setProjekcija(projekcija1);
       
       Karta karta2 = new Karta();
       karta2.setCijena("25");
       karta2.setSjedalo("8");
       karta2.setRed("C");
       karta2.setKupac(kupac2);
       karta2.setProjekcija(projekcija1);
       
       Karta karta3 = new Karta();
       karta3.setCijena("37.5");
       karta3.setSjedalo("1");
       karta3.setRed("F");
       karta3.setKupac(kupac3);
       karta3.setProjekcija(projekcija2);
       
       Karta karta4 = new Karta();
       karta4.setCijena("34.5");
       karta4.setSjedalo("13");
       karta4.setRed("D");
       karta4.setKupac(kupac4);
       karta4.setProjekcija(projekcija2);
       
       Karta karta5 = new Karta();
       karta5.setCijena("43.2");
       karta5.setSjedalo("22");
       karta5.setRed("H");
       karta5.setKupac(kupac5);
       karta5.setProjekcija(projekcija3);
       
       Karta karta6 = new Karta();
       karta6.setCijena("48.3");
       karta6.setSjedalo("6");
       karta6.setRed("G");
       karta6.setKupac(kupac6);
       karta6.setProjekcija(projekcija3);
       
       Karta karta7 = new Karta();
       karta7.setCijena("10.7");
       karta7.setSjedalo("8");
       karta7.setRed("I");
       karta7.setKupac(kupac7);
       karta7.setProjekcija(projekcija4);
       
       Karta karta8 = new Karta();
       karta8.setCijena("13.7");
       karta8.setSjedalo("19");
       karta8.setRed("J");
       karta8.setKupac(kupac8);
       karta8.setProjekcija(projekcija4);
       
       Karta karta9 = new Karta();
       karta9.setCijena("34");
       karta9.setSjedalo("19");
       karta9.setRed("B");
       karta9.setKupac(kupac9);
       karta9.setProjekcija(projekcija5);
       
       Karta karta10 = new Karta();
       karta10.setCijena("37");
       karta10.setSjedalo("14");
       karta10.setRed("K");
       karta10.setKupac(kupac10);
       karta10.setProjekcija(projekcija5);
       
       Karta karta11 = new Karta();
       karta11.setCijena("29");
       karta11.setSjedalo("15");
       karta11.setRed("D");
       karta11.setKupac(kupac11);
       karta11.setProjekcija(projekcija6);
       
       Karta karta12 = new Karta();
       karta12.setCijena("26");
       karta12.setSjedalo("3");
       karta12.setRed("A");
       karta12.setKupac(kupac12);
       karta12.setProjekcija(projekcija6);
       
       Karta karta13 = new Karta();
       karta13.setCijena("38");
       karta13.setSjedalo("9");
       karta13.setRed("G");
       karta13.setKupac(kupac13);
       karta13.setProjekcija(projekcija7);
       
       Karta karta14 = new Karta();
       karta14.setCijena("35.5");
       karta14.setSjedalo("16");
       karta14.setRed("C");
       karta14.setKupac(kupac14);
       karta14.setProjekcija(projekcija7);
       
       Karta karta15 = new Karta();
       karta15.setCijena("52");
       karta15.setSjedalo("6");
       karta15.setRed("E");
       karta15.setKupac(kupac15);
       karta15.setProjekcija(projekcija8);
       
       Karta karta16 = new Karta();
       karta16.setCijena("55");
       karta16.setSjedalo("16");
       karta16.setRed("F");
       karta16.setKupac(kupac16);
       karta16.setProjekcija(projekcija8);
       
       Karta karta17 = new Karta();
       karta17.setCijena("20");
       karta17.setSjedalo("15");
       karta17.setRed("H");
       karta17.setKupac(kupac17);
       karta17.setProjekcija(projekcija9);
       
       Karta karta18 = new Karta();
       karta18.setCijena("20");
       karta18.setSjedalo("7");
       karta18.setRed("D");
       karta18.setKupac(kupac18);
       karta18.setProjekcija(projekcija9);
       
       Karta karta19 = new Karta();
       karta19.setCijena("38.2");
       karta19.setSjedalo("6");
       karta19.setRed("A");
       karta19.setKupac(kupac19);
       karta19.setProjekcija(projekcija10);
       
       Karta karta20 = new Karta();
       karta20.setCijena("35.2");
       karta20.setSjedalo("20");
       karta20.setRed("G");
       karta20.setKupac(kupac20);
       karta20.setProjekcija(projekcija10);
       
       session.save(karta1);
       session.save(karta2);
       session.save(karta3);
       session.save(karta4);
       session.save(karta5);
       session.save(karta6);
       session.save(karta7);
       session.save(karta8);
       session.save(karta9);
       session.save(karta10);
       session.save(karta11);
       session.save(karta12);
       session.save(karta13);
       session.save(karta14);
       session.save(karta15);
       session.save(karta16);
       session.save(karta17);
       session.save(karta18);
       session.save(karta19);
       session.save(karta20);
       
       session.getTransaction().commit();
       session.beginTransaction();
       
       PojeoPopio pojeoPopio1 = new PojeoPopio();
       pojeoPopio1.setKolicina("4");
       pojeoPopio1.setKarta(karta1);
       pojeoPopio1.setHranaPice(hranaPice3);
       
       PojeoPopio pojeoPopio2 = new PojeoPopio();
       pojeoPopio2.setKolicina("2");
       pojeoPopio2.setKarta(karta2);
       pojeoPopio2.setHranaPice(hranaPice23);
       
       PojeoPopio pojeoPopio3 = new PojeoPopio();
       pojeoPopio3.setKolicina("1");
       pojeoPopio3.setKarta(karta3);
       pojeoPopio3.setHranaPice(hranaPice17);
       
       PojeoPopio pojeoPopio4 = new PojeoPopio();
       pojeoPopio4.setKolicina("3");
       pojeoPopio4.setKarta(karta4);
       pojeoPopio4.setHranaPice(hranaPice5);
       
       PojeoPopio pojeoPopio5 = new PojeoPopio();
       pojeoPopio5.setKolicina("2");
       pojeoPopio5.setKarta(karta5);
       pojeoPopio5.setHranaPice(hranaPice18);
       
       PojeoPopio pojeoPopio6 = new PojeoPopio();
       pojeoPopio6.setKolicina("3");
       pojeoPopio6.setKarta(karta6);
       pojeoPopio6.setHranaPice(hranaPice12);
       
       PojeoPopio pojeoPopio7 = new PojeoPopio();
       pojeoPopio7.setKolicina("4");
       pojeoPopio7.setKarta(karta7);
       pojeoPopio7.setHranaPice(hranaPice24);
       
       PojeoPopio pojeoPopio8 = new PojeoPopio();
       pojeoPopio8.setKolicina("2");
       pojeoPopio8.setKarta(karta8);
       pojeoPopio8.setHranaPice(hranaPice27);
       
       PojeoPopio pojeoPopio9 = new PojeoPopio();
       pojeoPopio9.setKolicina("1");
       pojeoPopio9.setKarta(karta9);
       pojeoPopio9.setHranaPice(hranaPice25);
       
       PojeoPopio pojeoPopio10 = new PojeoPopio();
       pojeoPopio10.setKolicina("3");
       pojeoPopio10.setKarta(karta10);
       pojeoPopio10.setHranaPice(hranaPice21);
       
       PojeoPopio pojeoPopio11 = new PojeoPopio();
       pojeoPopio11.setKolicina("2");
       pojeoPopio11.setKarta(karta11);
       pojeoPopio11.setHranaPice(hranaPice8);
       
       PojeoPopio pojeoPopio12 = new PojeoPopio();
       pojeoPopio12.setKolicina("5");
       pojeoPopio12.setKarta(karta12);
       pojeoPopio12.setHranaPice(hranaPice6);
       
       PojeoPopio pojeoPopio13 = new PojeoPopio();
       pojeoPopio13.setKolicina("4");
       pojeoPopio13.setKarta(karta13);
       pojeoPopio13.setHranaPice(hranaPice17);
       
       PojeoPopio pojeoPopio14 = new PojeoPopio();
       pojeoPopio14.setKolicina("3");
       pojeoPopio14.setKarta(karta14);
       pojeoPopio14.setHranaPice(hranaPice9);
       
       PojeoPopio pojeoPopio15 = new PojeoPopio();
       pojeoPopio15.setKolicina("1");
       pojeoPopio15.setKarta(karta15);
       pojeoPopio15.setHranaPice(hranaPice11);
       
       PojeoPopio pojeoPopio16 = new PojeoPopio();
       pojeoPopio16.setKolicina("4");
       pojeoPopio16.setKarta(karta16);
       pojeoPopio16.setHranaPice(hranaPice16);
       
       PojeoPopio pojeoPopio17 = new PojeoPopio();
       pojeoPopio17.setKolicina("2");
       pojeoPopio17.setKarta(karta17);
       pojeoPopio17.setHranaPice(hranaPice13);
       
       PojeoPopio pojeoPopio18 = new PojeoPopio();
       pojeoPopio18.setKolicina("1");
       pojeoPopio18.setKarta(karta18);
       pojeoPopio18.setHranaPice(hranaPice4);
       
       PojeoPopio pojeoPopio19 = new PojeoPopio();
       pojeoPopio19.setKolicina("2");
       pojeoPopio19.setKarta(karta19);
       pojeoPopio19.setHranaPice(hranaPice1);
       
       PojeoPopio pojeoPopio20 = new PojeoPopio();
       pojeoPopio20.setKolicina("4");
       pojeoPopio20.setKarta(karta20);
       pojeoPopio20.setHranaPice(hranaPice7);
       
       session.save(pojeoPopio1);
       session.save(pojeoPopio2);
       session.save(pojeoPopio3);
       session.save(pojeoPopio4);
       session.save(pojeoPopio5);
       session.save(pojeoPopio6);
       session.save(pojeoPopio7);
       session.save(pojeoPopio8);
       session.save(pojeoPopio9);
       session.save(pojeoPopio10);
       session.save(pojeoPopio11);
       session.save(pojeoPopio12);
       session.save(pojeoPopio13);
       session.save(pojeoPopio14);
       session.save(pojeoPopio15);
       session.save(pojeoPopio16);
       session.save(pojeoPopio17);
       session.save(pojeoPopio18);
       session.save(pojeoPopio19);
       session.save(pojeoPopio20);
       
       session.getTransaction().commit();
       session.beginTransaction();
       
       
    } 

    public static void adminOperater() {
        Operater operater = new Operater();
        operater.setIme("Edunova");
        operater.setPrezime("Operater");
        operater.setUloga("admin");
        operater.setEmail("edunova@edunova.hr");
        operater.setLozinka(BCrypt.hashpw("e", BCrypt.gensalt()));

        ObradaOperater oo = new ObradaOperater();
        oo.setEntitet(operater);
        try {
            oo.create();
        } catch (ZavrsniException ex) {
            ex.printStackTrace();
        
    }
    }
            
    
}