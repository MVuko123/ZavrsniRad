/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.vuko.ljetnizadatak.view;

import hr.edunova.vuko.ljetnizadatak.model.Kupac;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Marin
 */
public class KupacCellRenderer extends JLabel implements ListCellRenderer<Kupac>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Kupac> list, Kupac value, int index, boolean isSelected, boolean cellHasFocus) {
       setText(value.getIme() + " " + value.getPrezime());
       if(isSelected){
            setBackground(Color.BLUE);
            setForeground(Color.BLUE);
        }else{
            setBackground(Color.BLUE);
            setForeground(Color.BLACK);
        }
        return this;
    }
    
}
