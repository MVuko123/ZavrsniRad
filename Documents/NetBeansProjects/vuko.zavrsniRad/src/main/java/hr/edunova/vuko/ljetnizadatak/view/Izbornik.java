/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.vuko.ljetnizadatak.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marin
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        jmNaslovGrana.setText(Aplikacija.NASLOV_APP);
        setTitle(Aplikacija.operater.getIme() + " " + Aplikacija.operater.getPrezime());

        jmiOperater.setVisible(Aplikacija.isAdmin());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmNaslovGrana = new javax.swing.JMenu();
        jmiFilm = new javax.swing.JMenuItem();
        jmiHranaPice = new javax.swing.JMenuItem();
        jmiKarta = new javax.swing.JMenuItem();
        jmiKupac = new javax.swing.JMenuItem();
        jmiOperater = new javax.swing.JMenuItem();
        jmiPojeoPopio = new javax.swing.JMenuItem();
        jmiProjekcija = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiIzlaz = new javax.swing.JMenuItem();
        jmGradovi = new javax.swing.JMenu();
        jmiZagreb = new javax.swing.JMenuItem();
        jmiSplit = new javax.swing.JMenuItem();
        jmiRijeka = new javax.swing.JMenuItem();
        jmiPula = new javax.swing.JMenuItem();
        jmiZadar = new javax.swing.JMenuItem();
        jmiSibenik = new javax.swing.JMenuItem();
        jmiOsijek = new javax.swing.JMenuItem();
        jmiVarazdin = new javax.swing.JMenuItem();
        jmiDubrovnik = new javax.swing.JMenuItem();
        jmiSlavonskiBrod = new javax.swing.JMenuItem();
        jmiVukovar = new javax.swing.JMenuItem();
        jmPonuda = new javax.swing.JMenu();
        jmiIMAX = new javax.swing.JMenuItem();
        jmi4DX = new javax.swing.JMenuItem();
        jmiGoldClass = new javax.swing.JMenuItem();
        jmiDjeca = new javax.swing.JMenuItem();
        jmiExtreme = new javax.swing.JMenuItem();
        jmi4K = new javax.swing.JMenuItem();
        jmi3D = new javax.swing.JMenuItem();
        jmiNajavaFilmova = new javax.swing.JMenuItem();
        jmPodaci = new javax.swing.JMenu();
        jmiKiRv = new javax.swing.JMenuItem();
        jmiONama = new javax.swing.JMenuItem();
        jmiPodaci = new javax.swing.JMenuItem();
        jmiHZJZ = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/28472049_10155243496438021_3911687425277034496_o.jpg"))); // NOI18N

        jmNaslovGrana.setText("NASLOV");

        jmiFilm.setText("Film");
        jmiFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFilmActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiFilm);

        jmiHranaPice.setText("HranaPice");
        jmiHranaPice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiHranaPiceActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiHranaPice);

        jmiKarta.setText("Karta");
        jmiKarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiKartaActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiKarta);

        jmiKupac.setText("Kupac");
        jmiKupac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiKupacActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiKupac);

        jmiOperater.setText("Operater");
        jmiOperater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiOperaterActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiOperater);

        jmiPojeoPopio.setText("PojeoPopio");
        jmiPojeoPopio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPojeoPopioActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiPojeoPopio);

        jmiProjekcija.setText("Projekcija");
        jmiProjekcija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProjekcijaActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiProjekcija);
        jmNaslovGrana.add(jSeparator1);

        jmiIzlaz.setText("Izlaz");
        jmiIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIzlazActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiIzlaz);

        jMenuBar1.add(jmNaslovGrana);

        jmGradovi.setText("Gradovi");

        jmiZagreb.setText("Zagreb-sva kina");
        jmiZagreb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiZagrebActionPerformed(evt);
            }
        });
        jmGradovi.add(jmiZagreb);

        jmiSplit.setText("Split-sva kina");
        jmiSplit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSplitActionPerformed(evt);
            }
        });
        jmGradovi.add(jmiSplit);

        jmiRijeka.setText("Rijeka");
        jmiRijeka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRijekaActionPerformed(evt);
            }
        });
        jmGradovi.add(jmiRijeka);

        jmiPula.setText("Pula");
        jmiPula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPulaActionPerformed(evt);
            }
        });
        jmGradovi.add(jmiPula);

        jmiZadar.setText("Zadar");
        jmiZadar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiZadarActionPerformed(evt);
            }
        });
        jmGradovi.add(jmiZadar);

        jmiSibenik.setText("Šibenik");
        jmiSibenik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSibenikActionPerformed(evt);
            }
        });
        jmGradovi.add(jmiSibenik);

        jmiOsijek.setText("Osijek");
        jmiOsijek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiOsijekActionPerformed(evt);
            }
        });
        jmGradovi.add(jmiOsijek);

        jmiVarazdin.setText("Varaždin");
        jmiVarazdin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVarazdinActionPerformed(evt);
            }
        });
        jmGradovi.add(jmiVarazdin);

        jmiDubrovnik.setText("Dubrovnik");
        jmiDubrovnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDubrovnikActionPerformed(evt);
            }
        });
        jmGradovi.add(jmiDubrovnik);

        jmiSlavonskiBrod.setText("Slavonski Brod");
        jmiSlavonskiBrod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSlavonskiBrodActionPerformed(evt);
            }
        });
        jmGradovi.add(jmiSlavonskiBrod);

        jmiVukovar.setText("Vukovar");
        jmiVukovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVukovarActionPerformed(evt);
            }
        });
        jmGradovi.add(jmiVukovar);

        jMenuBar1.add(jmGradovi);

        jmPonuda.setText("Ponuda");

        jmiIMAX.setText("IMAX");
        jmiIMAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIMAXActionPerformed(evt);
            }
        });
        jmPonuda.add(jmiIMAX);

        jmi4DX.setText("4DX");
        jmi4DX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi4DXActionPerformed(evt);
            }
        });
        jmPonuda.add(jmi4DX);

        jmiGoldClass.setText("GoldClass");
        jmiGoldClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGoldClassActionPerformed(evt);
            }
        });
        jmPonuda.add(jmiGoldClass);

        jmiDjeca.setText("Kids");
        jmiDjeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDjecaActionPerformed(evt);
            }
        });
        jmPonuda.add(jmiDjeca);

        jmiExtreme.setText("Extreme");
        jmiExtreme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExtremeActionPerformed(evt);
            }
        });
        jmPonuda.add(jmiExtreme);

        jmi4K.setText("4K");
        jmi4K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi4KActionPerformed(evt);
            }
        });
        jmPonuda.add(jmi4K);

        jmi3D.setText("3D");
        jmi3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi3DActionPerformed(evt);
            }
        });
        jmPonuda.add(jmi3D);

        jmiNajavaFilmova.setText("Najava Filmova");
        jmiNajavaFilmova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNajavaFilmovaActionPerformed(evt);
            }
        });
        jmPonuda.add(jmiNajavaFilmova);

        jMenuBar1.add(jmPonuda);

        jmPodaci.setText("Podaci");

        jmiKiRv.setText("Kontakti i radno vrijem");
        jmiKiRv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiKiRvActionPerformed(evt);
            }
        });
        jmPodaci.add(jmiKiRv);

        jmiONama.setText("O Nama");
        jmiONama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiONamaActionPerformed(evt);
            }
        });
        jmPodaci.add(jmiONama);

        jmiPodaci.setText("Osnovni Podaci");
        jmiPodaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPodaciActionPerformed(evt);
            }
        });
        jmPodaci.add(jmiPodaci);

        jmiHZJZ.setText("Preporuke HZJZ");
        jmiHZJZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiHZJZActionPerformed(evt);
            }
        });
        jmPodaci.add(jmiHZJZ);

        jMenuBar1.add(jmPodaci);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFilmActionPerformed
         new Filmovi().setVisible(true);
    }//GEN-LAST:event_jmiFilmActionPerformed

    private void jmiHranaPiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiHranaPiceActionPerformed
       new HranaPica().setVisible(true);
    }//GEN-LAST:event_jmiHranaPiceActionPerformed

    private void jmiKartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiKartaActionPerformed
         new Karte().setVisible(true);
    }//GEN-LAST:event_jmiKartaActionPerformed

    private void jmiKupacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiKupacActionPerformed
         new Kupci().setVisible(true);
    }//GEN-LAST:event_jmiKupacActionPerformed

    private void jmiOperaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiOperaterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiOperaterActionPerformed

    private void jmiPojeoPopioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPojeoPopioActionPerformed
        new PojeliPopili().setVisible(true);
    }//GEN-LAST:event_jmiPojeoPopioActionPerformed

    private void jmiProjekcijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProjekcijaActionPerformed
         new Projekcije().setVisible(true);
    }//GEN-LAST:event_jmiProjekcijaActionPerformed

    private void jmiIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIzlazActionPerformed
         dispose();
    }//GEN-LAST:event_jmiIzlazActionPerformed

    private void jmiNajavaFilmovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNajavaFilmovaActionPerformed
       String url="https://www.blitz-cinestar.hr/najave-filmova/1";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiNajavaFilmovaActionPerformed

    private void jmiPodaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPodaciActionPerformed
      String url="https://www.blitz-cinestar.hr/default.aspx?id=4268";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiPodaciActionPerformed

    private void jmiSplitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSplitActionPerformed
        String url="https://www.blitz-cinestar.hr/split";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiSplitActionPerformed

    private void jmiZagrebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiZagrebActionPerformed
        String url="https://www.blitz-cinestar.hr/zagreb";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiZagrebActionPerformed

    private void jmiRijekaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRijekaActionPerformed
       String url="https://www.blitz-cinestar.hr/cinestar-rijeka-4dx";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiRijekaActionPerformed

    private void jmiPulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPulaActionPerformed
         String url="https://www.blitz-cinestar.hr/cinestar-pula";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiPulaActionPerformed

    private void jmiZadarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiZadarActionPerformed
         String url="https://www.blitz-cinestar.hr/cinestar-zadar";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiZadarActionPerformed

    private void jmiSibenikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSibenikActionPerformed
          String url="https://www.blitz-cinestar.hr/cinestar-sibenik";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiSibenikActionPerformed

    private void jmiOsijekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiOsijekActionPerformed
            String url="https://www.blitz-cinestar.hr/cinestar-osijek";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiOsijekActionPerformed

    private void jmiVarazdinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVarazdinActionPerformed
           String url="https://www.blitz-cinestar.hr/cinestar-varazdin";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiVarazdinActionPerformed

    private void jmiDubrovnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDubrovnikActionPerformed
        String url="https://www.blitz-cinestar.hr/cinestar-dubrovnik";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiDubrovnikActionPerformed

    private void jmiSlavonskiBrodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSlavonskiBrodActionPerformed
         String url="https://www.blitz-cinestar.hr/cinestar-slavonski-brod";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiSlavonskiBrodActionPerformed

    private void jmiVukovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVukovarActionPerformed
            String url="https://www.blitz-cinestar.hr/cinestar-vukovar";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiVukovarActionPerformed

    private void jmiIMAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIMAXActionPerformed
         String url="https://www.blitz-cinestar.hr/imax";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiIMAXActionPerformed

    private void jmi4DXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi4DXActionPerformed
        String url="https://www.blitz-cinestar.hr/4dx";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmi4DXActionPerformed

    private void jmiGoldClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGoldClassActionPerformed
        String url="https://www.blitz-cinestar.hr/goldclass";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiGoldClassActionPerformed

    private void jmiDjecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDjecaActionPerformed
         String url="https://www.blitz-cinestar.hr/kids-dvorana";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiDjecaActionPerformed

    private void jmiExtremeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExtremeActionPerformed
         String url="https://www.blitz-cinestar.hr/extreme";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiExtremeActionPerformed

    private void jmi4KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi4KActionPerformed
         String url="https://www.blitz-cinestar.hr/auro-3d-zvuk";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmi4KActionPerformed

    private void jmi3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi3DActionPerformed
        String url="https://www.blitz-cinestar.hr/reald-3d";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmi3DActionPerformed

    private void jmiKiRvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiKiRvActionPerformed
        String url="https://www.blitz-cinestar.hr/kontakt-i-radno-vrijeme-4330";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiKiRvActionPerformed

    private void jmiONamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiONamaActionPerformed
       String url="https://www.blitz-cinestar.hr/o-nama";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiONamaActionPerformed

    private void jmiHZJZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiHZJZActionPerformed
         String url="https://www.blitz-cinestar.hr/sigurnost-na-prvom-mjestu";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiHZJZActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu jmGradovi;
    private javax.swing.JMenu jmNaslovGrana;
    private javax.swing.JMenu jmPodaci;
    private javax.swing.JMenu jmPonuda;
    private javax.swing.JMenuItem jmi3D;
    private javax.swing.JMenuItem jmi4DX;
    private javax.swing.JMenuItem jmi4K;
    private javax.swing.JMenuItem jmiDjeca;
    private javax.swing.JMenuItem jmiDubrovnik;
    private javax.swing.JMenuItem jmiExtreme;
    private javax.swing.JMenuItem jmiFilm;
    private javax.swing.JMenuItem jmiGoldClass;
    private javax.swing.JMenuItem jmiHZJZ;
    private javax.swing.JMenuItem jmiHranaPice;
    private javax.swing.JMenuItem jmiIMAX;
    private javax.swing.JMenuItem jmiIzlaz;
    private javax.swing.JMenuItem jmiKarta;
    private javax.swing.JMenuItem jmiKiRv;
    private javax.swing.JMenuItem jmiKupac;
    private javax.swing.JMenuItem jmiNajavaFilmova;
    private javax.swing.JMenuItem jmiONama;
    private javax.swing.JMenuItem jmiOperater;
    private javax.swing.JMenuItem jmiOsijek;
    private javax.swing.JMenuItem jmiPodaci;
    private javax.swing.JMenuItem jmiPojeoPopio;
    private javax.swing.JMenuItem jmiProjekcija;
    private javax.swing.JMenuItem jmiPula;
    private javax.swing.JMenuItem jmiRijeka;
    private javax.swing.JMenuItem jmiSibenik;
    private javax.swing.JMenuItem jmiSlavonskiBrod;
    private javax.swing.JMenuItem jmiSplit;
    private javax.swing.JMenuItem jmiVarazdin;
    private javax.swing.JMenuItem jmiVukovar;
    private javax.swing.JMenuItem jmiZadar;
    private javax.swing.JMenuItem jmiZagreb;
    // End of variables declaration//GEN-END:variables
}