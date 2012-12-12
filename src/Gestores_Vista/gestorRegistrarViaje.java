/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores_Vista;

import Clases_Modulo_Carga.SolicitudPorHistorial;
import Clases_Modulo_Carga.SolicitudRetiro;
import Clases_Modulo_Cliente.Establecimiento;
import Clases_Modulo_Viaje.*;
import Hibernate.GestorHibernate;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ale
 */
public class gestorRegistrarViaje extends GestorHibernate {
    
     public void ActualizarDatos(String seleccion, JPanel panelPuerto, JPanel panelEstablecimiento, JLabel labelPuerto, JLabel labelEstablecimiento, JLabel labelProvincia, JLabel labelDepartamento,
                                   JTable tblEstablecimiento, JScrollPane scpEstablecimiento, JTable tblRetiro){
        if (seleccion.equalsIgnoreCase("Traslado a Puerto")){
        panelPuerto.setVisible(true);
        panelEstablecimiento.setVisible(false);
        labelDepartamento.setVisible(false);
        labelProvincia.setVisible(true);
        labelEstablecimiento.setVisible(false);
        labelPuerto.setVisible(true);
        tblEstablecimiento.setVisible(true);
        DefaultTableModel modelo= (DefaultTableModel) tblEstablecimiento.getModel();
        modelo.setRowCount(0);
        Iterator ite = this.listarClase(SolicitudRetiro.class).iterator();
        while(ite.hasNext()){
            SolicitudRetiro sol = (SolicitudRetiro) ite.next();
            if(sol.getTipoSolicitud().getIdTipoSolicitud()==2){
            Object fila[]= {sol.getNumeroSolicitud(), sol.getProductor(), sol.getProductor().getNumeroDocumento()};
            modelo.addRow(fila);
            tblEstablecimiento.setModel(modelo);
            }
        }
//        scpEstablecimiento.setVisible(true);

        
        }if(seleccion.equalsIgnoreCase("Retiro de Establecimiento")){
        panelPuerto.setVisible(false);
        panelEstablecimiento.setVisible(true);
          DefaultTableModel modelo= (DefaultTableModel) tblRetiro.getModel();
           modelo.setRowCount(0);
        Iterator ite = this.listarClase(SolicitudRetiro.class).iterator();
        while(ite.hasNext()){
            SolicitudRetiro sol = (SolicitudRetiro) ite.next();
            if(sol.getTipoSolicitud().getIdTipoSolicitud()==1){
            Object fila[]= {sol.getNumeroSolicitud(), sol.getProductor(), sol.getProductor().getNumeroDocumento()};
            modelo.addRow(fila);
            tblEstablecimiento.setModel(modelo);
            }
        }
       }
        
        if(seleccion.equalsIgnoreCase("Traslado a Establecimiento")){
        panelPuerto.setVisible(true);
        panelEstablecimiento.setVisible(false);
        labelDepartamento.setVisible(true);
        labelProvincia.setVisible(false);
        labelEstablecimiento.setVisible(true);
        labelPuerto.setVisible(false);
        tblEstablecimiento.setVisible(true);
        DefaultTableModel modelo= (DefaultTableModel) tblEstablecimiento.getModel();
         modelo.setRowCount(0);
        Iterator ite = this.listarClase(SolicitudRetiro.class).iterator();
        while(ite.hasNext()){
            SolicitudRetiro sol = (SolicitudRetiro) ite.next();
            if(sol.getTipoSolicitud().getIdTipoSolicitud()==2){
            Object fila[]= {sol.getNumeroSolicitud(), sol.getProductor(), sol.getProductor().getNumeroDocumento()};
            modelo.addRow(fila);
            tblEstablecimiento.setModel(modelo);
            }
        }
//        scpEstablecimiento.setVisible(true);
  
        }
       }
       
     public DefaultComboBoxModel AgregarProductor(String productor){
         DefaultComboBoxModel modelo = new DefaultComboBoxModel();
         Iterator ite = this.listarClase(Establecimiento.class).iterator();
         while(ite.hasNext()){
             Establecimiento establecimiento = (Establecimiento) ite.next();
             if(establecimiento.getProductor().toString() == productor){
                 modelo.addElement(establecimiento);
             }
         }
         return modelo;
     }
     
     public DefaultComboBoxModel AgregarTipoViaje(){
         DefaultComboBoxModel modelo = new DefaultComboBoxModel();
         Iterator ite = this.listarClase(TipoViaje.class).iterator();
         while(ite.hasNext()){
             TipoViaje tviaje = (TipoViaje) ite.next();
             modelo.addElement(tviaje);
         }
         return modelo;
     }
     
        }
    
