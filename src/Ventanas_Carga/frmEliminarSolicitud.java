/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Carga;

import Clases_Modulo_Carga.EstablecimientoPorSolicitud;
import Clases_Modulo_Carga.PuertoPorSolicitud;
import Clases_Modulo_Carga.SolicitudRetiro;
import Clases_Modulo_Carga.ToneladasPorCereal;
import Clases_Modulo_Cliente.Establecimiento;
import Gestores_Vista.gestorRegistrarSolicitud;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Carolina
 */
public class frmEliminarSolicitud extends javax.swing.JInternalFrame {
gestorRegistrarSolicitud gestorS = new gestorRegistrarSolicitud();
    /**
     * Creates new form frmEliminarSolicitud
     */
    public frmEliminarSolicitud() {
        initComponents();
        
        txtFecha.setEnabled(false);
        txtFecha.setEditable(false);
        txtHora.setEditable(false);
        txtHora.setEnabled(false);
        //setear el campo de fecha con la del sistema
        GregorianCalendar gc=new GregorianCalendar();
        GregorianCalendar.getInstance();
        gc.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        gc.get(Calendar.DAY_OF_WEEK);
        gc.get(Calendar.MONTH);
        gc.get(Calendar.YEAR);
        SimpleDateFormat formateador= new SimpleDateFormat("dd-MM-yyyy");
        txtFecha.setText(formateador.format(gc.getTime()));
        //setear el campo de hora con la del sistema
        GregorianCalendar calendario=new GregorianCalendar();
        GregorianCalendar.getInstance();
        gc.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        calendario.get(Calendar.HOUR);
        calendario.get(Calendar.MINUTE);
        SimpleDateFormat formateadorHora=new SimpleDateFormat("HH:mm");
        txtHora.setText(formateadorHora.format(calendario.getTime()));
        
        //redimensionar columnas tabla
        tblSolicitudes.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblSolicitudes.getColumnModel().getColumn(1).setPreferredWidth(50);
        //centrar cabecera jtable
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tblSolicitudes.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);

        
        //Las siguientes lineas son para dar a la pantalla el tamaño requerido y luego centrarla en la pantalla.
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = kit.getScreenSize();
        int ancho = 630;
        int alto = 450;
//        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(300, 50);
        gestorS.cargaTabla(tblSolicitudes);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        labelusuario = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSolicitudes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTipoSolicitud = new javax.swing.JTextField();
        btnAgregarSolicitud = new javax.swing.JButton();
        txtEstadoSolicitud = new javax.swing.JTextField();
        txtEstablecimiento = new javax.swing.JTextField();
        txtFechaEstimada = new javax.swing.JTextField();
        txtProductor = new javax.swing.JTextField();
        txtNumSolicitud5 = new javax.swing.JTextField();
        txtFechaSolicitud = new javax.swing.JTextField();
        txtCereal = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Solicitud Retiro");

        jPanel3.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("Fecha");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(10, 8, 70, 20);
        jPanel3.add(txtFecha);
        txtFecha.setBounds(50, 10, 80, 20);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("Hora");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(200, 10, 50, 20);
        jPanel3.add(txtHora);
        txtHora.setBounds(230, 10, 80, 20);

        labelusuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelusuario.setText("Usuario");
        jPanel3.add(labelusuario);
        labelusuario.setBounds(510, 10, 50, 15);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N
        jPanel3.add(jLabel19);
        jLabel19.setBounds(560, 0, 30, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solicitud Retiro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel1.setLayout(null);

        tblSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Solicitud", "Tipo Solicitud"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSolicitudes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(90, 30, 437, 136);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Nº Solicitud");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 180, 90, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Tipo Solicitud");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 180, 120, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Productor");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 210, 100, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Destino");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(350, 210, 110, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Tipo Cereal");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 240, 90, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Estado");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(450, 180, 80, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Fecha Estimada de Viaje");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(260, 240, 160, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Fecha Solicitud");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 270, 120, 20);
        jPanel1.add(txtTipoSolicitud);
        txtTipoSolicitud.setBounds(280, 180, 160, 20);

        btnAgregarSolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        btnAgregarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSolicitudActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarSolicitud);
        btnAgregarSolicitud.setBounds(540, 90, 40, 30);
        jPanel1.add(txtEstadoSolicitud);
        txtEstadoSolicitud.setBounds(490, 180, 100, 20);
        jPanel1.add(txtEstablecimiento);
        txtEstablecimiento.setBounds(400, 210, 190, 20);
        jPanel1.add(txtFechaEstimada);
        txtFechaEstimada.setBounds(400, 240, 90, 20);
        jPanel1.add(txtProductor);
        txtProductor.setBounds(100, 210, 190, 20);
        jPanel1.add(txtNumSolicitud5);
        txtNumSolicitud5.setBounds(100, 180, 90, 20);
        jPanel1.add(txtFechaSolicitud);
        txtFechaSolicitud.setBounds(100, 270, 90, 20);
        jPanel1.add(txtCereal);
        txtCereal.setBounds(100, 240, 90, 20);

        btnEliminar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 209, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Confirma que desea salir?");
        if (respuesta == 0) {
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSolicitudActionPerformed
     DefaultTableModel modeloT = (DefaultTableModel) tblSolicitudes.getModel();
     int fila = tblSolicitudes.getSelectedRow();
     Iterator ite = gestorS.listarClase(SolicitudRetiro.class).iterator();
     while(ite.hasNext()){
         SolicitudRetiro sol = (SolicitudRetiro) ite.next();
         if(sol.getNumeroSolicitud() == Double.parseDouble(modeloT.getValueAt(fila,0).toString())){
             txtNumSolicitud5.setText(String.valueOf(sol.getNumeroSolicitud()));
             txtTipoSolicitud.setText(sol.getTipoSolicitud().toString());
             txtEstadoSolicitud.setText(sol.getEstado());
             txtProductor.setText(sol.getProductor().toString());
             txtCereal.setText(sol.getTipoCereal().toString());
             txtFechaSolicitud.setText(sol.getFechaSolicitud());
             Iterator ite1 = gestorS.listarClase(Establecimiento.class).iterator();
             while(ite1.hasNext()){
                 Establecimiento e = (Establecimiento) ite1.next();
                 if(e.getProductor().toString().equalsIgnoreCase(txtProductor.getText())){
                      txtEstablecimiento.setText(e.getNombreEstablecimiento());
                 }
             }
        
             txtFechaEstimada.setText(sol.getFechaEstimadaViaje());
             
         }
     }
    }//GEN-LAST:event_btnAgregarSolicitudActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    Iterator ite = gestorS.listarClase(SolicitudRetiro.class).iterator();
    DefaultTableModel modeloT = (DefaultTableModel) tblSolicitudes.getModel();
    double ton = 0;
    while(ite.hasNext()){
        SolicitudRetiro sol = (SolicitudRetiro) ite.next();
        Iterator ite1 = gestorS.listarClase(ToneladasPorCereal.class).iterator();
        while(ite1.hasNext()){
        ToneladasPorCereal t = (ToneladasPorCereal) ite1.next();
        if((sol.getNumeroSolicitud() == Double.parseDouble(txtNumSolicitud5.getText())) && (t.getHistorial().getIdHistorial() == sol.getProductor().getIdProductor()) && (t.getTipoCereal().getIdTipoCereal() == sol.getTipoCereal().getIdTipoCereal())){
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Confirma que desea eliminar la solicitud?");
                    if (respuesta==0){
                         sol.setEstado("Cancelada");
                         gestorS.actualizarObjeto(sol);
                         Iterator ite2 = gestorS.listarClase(EstablecimientoPorSolicitud.class).iterator();
                         while(ite2.hasNext()){
                         EstablecimientoPorSolicitud e = (EstablecimientoPorSolicitud) ite2.next();
                         if(e.getSolicitud().getNumeroSolicitud() == sol.getNumeroSolicitud()){
                         t.setToneladas(e.getToneladasAExtraer() + t.getToneladas());
                         gestorS.actualizarObjeto(t);
                         }
                         }
                         Iterator ite3 = gestorS.listarClase(PuertoPorSolicitud.class).iterator();
                         while(ite3.hasNext()){
                         PuertoPorSolicitud e = (PuertoPorSolicitud) ite3.next();
                         if(e.getSolicitud().getNumeroSolicitud() == sol.getNumeroSolicitud()){
                         t.setToneladas(e.getToneladasAExtraer() + t.getToneladas());
                         gestorS.actualizarObjeto(t);
                         }
                         }
                         
                         txtEstadoSolicitud.setText(sol.getEstado());
//                         modeloT.setRowCount(0);
//                         tblSolicitudes.setModel(modeloT);
//                         gestorS.cargaTabla(tblSolicitudes);
//                         txtCereal.setText("");
//                         txtEstablecimiento.setText("");
//                         txtFechaSolicitud.setText("");
//                         txtNumSolicitud5.setText("");
//                         txtProductor.setText("");
//                         txtTipoSolicitud.setText("");
//                         txtFechaEstimada.setText("");
                        }
           
            
        }
        }
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarSolicitud;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelusuario;
    private javax.swing.JTable tblSolicitudes;
    private javax.swing.JTextField txtCereal;
    private javax.swing.JTextField txtEstablecimiento;
    private javax.swing.JTextField txtEstadoSolicitud;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaEstimada;
    private javax.swing.JTextField txtFechaSolicitud;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNumSolicitud5;
    private javax.swing.JTextField txtProductor;
    private javax.swing.JTextField txtTipoSolicitud;
    // End of variables declaration//GEN-END:variables
}
