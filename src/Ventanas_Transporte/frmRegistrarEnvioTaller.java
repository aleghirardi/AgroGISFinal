/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package Ventanas_Transporte;

import Clases_Modulo_Transporte.ArregloEfectuado;
import Clases_Modulo_Transporte.DetalleEnvio;
import Clases_Modulo_Transporte.EnvioTaller;
import Clases_Modulo_Transporte.OrdenServicio;
import Gestores_Vista.gestorRegistrarEnvioAlTaller;
import Hibernate.GestorHibernate;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
*
* @author Carolina
*/
public class frmRegistrarEnvioTaller extends javax.swing.JInternalFrame {
gestorRegistrarEnvioAlTaller gRegistro = new gestorRegistrarEnvioAlTaller();
Double total;
GestorHibernate gestorH = new GestorHibernate();
    /**
* Creates new form frmRegistrarEnvioTaller
*/
    public frmRegistrarEnvioTaller() {
        initComponents();
        
        //deshabilitar componentes de fecha y hora
        txtFecha.setEnabled(false);
        txtHora.setEnabled(false);
        txtFecha.setEditable(false);
        txtHora.setEditable(false);
        txtTotal.setEditable(false);
        txtTotal.setEnabled(false);
        
        //configurar hora y fecha
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
        SimpleDateFormat formateadorHora=new SimpleDateFormat("hh:mm");
        txtHora.setText(formateadorHora.format(calendario.getTime()));
        
         //redimensionar columnas de la tabla
        tblDetalleRep.getColumnModel().getColumn(0).setPreferredWidth(40);
        tblDetalleRep.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblDetalleRep.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblDetalleRep.getColumnModel().getColumn(3).setPreferredWidth(80);
        tblDetalleRep.getColumnModel().getColumn(4).setPreferredWidth(100);
        
        
        
        //establecer tamaño pantalla
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = kit.getScreenSize();
        int ancho = 800;
        int alto = 630;
        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
// int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(posX, 0);
        cmbOrden.setModel(gRegistro.rellenaComboOrdenServicio());
        
        cmbOrden.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
            txtFechaEmision.setText(gRegistro.rellenaTxtFecha(cmbOrden.getSelectedItem().toString()));
        }
        }
        );
        txtFechaEmision.setText(gRegistro.rellenaTxtFecha(cmbOrden.getSelectedItem().toString()));
        
        cmbOrden.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
            txtTaller.setText(gRegistro.rellenaTxtTaller((OrdenServicio)cmbOrden.getSelectedItem()));
        }
        }
        );
        txtTaller.setText(gRegistro.rellenaTxtTaller((OrdenServicio)cmbOrden.getSelectedItem()));
        
        cmbOrden.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
            txtEspecialidad.setText(gRegistro.rellenaTxtEspecialidad((OrdenServicio)cmbOrden.getSelectedItem()));
        }
        }
        );
            txtEspecialidad.setText(gRegistro.rellenaTxtEspecialidad((OrdenServicio)cmbOrden.getSelectedItem()));
            
       DefaultTableModel modeloT = (DefaultTableModel) tblDetalleRep.getModel();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cmbOrden = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtFechaEmision = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        txtTaller = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        calendarioReparacion = new datechooser.beans.DateChooserCombo();
        jLabel10 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNumComprobante = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmbReparacion = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaObservacion = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        txtImporteTotal = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDetalleRep = new javax.swing.JTable();
        btnEliminarDetalle = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnDetalle = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Envio a Taller");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Fecha");

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Hora");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Carolina");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Orden", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Orden Nº");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 20, 60, 20);

        jPanel2.add(cmbOrden);
        cmbOrden.setBounds(130, 20, 120, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Fecha  Emision");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(430, 20, 100, 20);
        jPanel2.add(txtFechaEmision);
        txtFechaEmision.setBounds(520, 20, 80, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Taller de Reparacion");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 50, 130, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Especialidad");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(440, 50, 80, 20);
        jPanel2.add(txtEspecialidad);
        txtEspecialidad.setBounds(520, 50, 150, 20);
        jPanel2.add(txtTaller);
        txtTaller.setBounds(130, 50, 260, 20);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Reparacion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Fecha Reparacion");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(30, 30, 110, 20);
        jPanel3.add(calendarioReparacion);
        calendarioReparacion.setBounds(140, 30, 90, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Responsable de Reparacion");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(350, 30, 200, 20);
        jPanel3.add(txtResponsable);
        txtResponsable.setBounds(520, 30, 210, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Nº Comprobante");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(40, 60, 110, 20);

        txtNumComprobante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumComprobanteKeyTyped(evt);
            }
        });
        jPanel3.add(txtNumComprobante);
        txtNumComprobante.setBounds(140, 60, 90, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Reparacion Efectuada");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(390, 60, 140, 20);

        jPanel3.add(cmbReparacion);
        cmbReparacion.setBounds(520, 60, 230, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Observaciones");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(60, 170, 100, 15);

        areaObservacion.setColumns(20);
        areaObservacion.setRows(5);
        jScrollPane2.setViewportView(areaObservacion);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(150, 120, 550, 96);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Importe Total: $ ");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(250, 90, 100, 20);

        txtImporteTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImporteTotalActionPerformed(evt);
            }
        });
        txtImporteTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImporteTotalKeyTyped(evt);
            }
        });
        jPanel3.add(txtImporteTotal);
        txtImporteTotal.setBounds(340, 90, 90, 20);

        btnAgregar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregar);
        btnAgregar.setBounds(310, 230, 110, 30);

        tblDetalleRep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Orden Nº", "Comprobante Nº", "Reparacion Efectuada", "Importe Total"
            }
        ));
        jScrollPane3.setViewportView(tblDetalleRep);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(30, 280, 670, 100);

        btnEliminarDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        btnEliminarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDetalleActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarDetalle);
        btnEliminarDetalle.setBounds(710, 320, 49, 30);

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnDetalle.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IrDetalle.png"))); // NOI18N
        btnDetalle.setText("Detalle");

        btnNuevo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icononuevo.PNG"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtNumComprobanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumComprobanteKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*
                 * corresponde a BACK_SPACE
                 */)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_txtNumComprobanteKeyTyped

    private void txtImporteTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImporteTotalKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*
                 * corresponde a BACK_SPACE
                 */)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_txtImporteTotalKeyTyped

    private void txtImporteTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImporteTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImporteTotalActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    int respuesta = JOptionPane.showConfirmDialog(null, "¿Confirma que desea cancelar la operación?");
    if (respuesta==0){
    dispose();
    }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
      DefaultTableModel modeloT = (DefaultTableModel) tblDetalleRep.getModel();
      Object fila []= {calendarioReparacion.getText(),cmbOrden.getSelectedItem(),txtNumComprobante.getText(),cmbReparacion.getSelectedItem(),txtImporteTotal.getText()};
      modeloT.addRow(fila);
      tblDetalleRep.setModel(modeloT);
      for(int i=0; i<modeloT.getRowCount(); i++){
           total = total + (Double.parseDouble(modeloT.getValueAt(i,4).toString()));
           txtTotal.setText(total.toString());
       }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDetalleActionPerformed
       DefaultTableModel modeloT = (DefaultTableModel) tblDetalleRep.getModel();
       modeloT.removeRow(tblDetalleRep.getSelectedRow());
       for(int i=0; i<modeloT.getRowCount(); i++){
       total = total + (Double.parseDouble(modeloT.getValueAt(i,4).toString()));
       txtTotal.setText(total.toString());
       }
    }//GEN-LAST:event_btnEliminarDetalleActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblDetalleRep.getModel();
        cmbOrden.setSelectedItem("");
        txtEspecialidad.setText("");
        txtFechaEmision.setText("");
        txtImporteTotal.setText("");
        txtNumComprobante.setText("");
        txtResponsable.setText("");
        txtTaller.setText("");
        txtTotal.setText("");
        for(int i=0; i<modelo.getRowCount(); i++){
            modelo.removeRow(i);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      DefaultTableModel modelo = (DefaultTableModel) tblDetalleRep.getModel();
      EnvioTaller envio = new EnvioTaller();
      envio.setFecha(modelo.getValueAt(0,0).toString());
      envio.setResponsable(txtResponsable.getText());
      envio.setImporteTotal(Double.parseDouble(txtImporteTotal.getText()));
      envio.setNumeroComprobante(Integer.parseInt(txtNumComprobante.getText()));
      gestorH.guardarObjeto(envio);
      for(int i=0; i<modelo.getRowCount(); i++){
            DetalleEnvio detalle = new DetalleEnvio();
            detalle.setArregloEfectuado((ArregloEfectuado)modelo.getValueAt(i,3));
            detalle.setPrecio(Double.parseDouble(modelo.getValueAt(i,4).toString()));
            detalle.setEnvio(envio);
            gestorH.guardarObjeto(detalle);
      }
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaObservacion;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JButton btnEliminarDetalle;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private datechooser.beans.DateChooserCombo calendarioReparacion;
    private javax.swing.JComboBox cmbOrden;
    private javax.swing.JComboBox cmbReparacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblDetalleRep;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaEmision;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtImporteTotal;
    private javax.swing.JTextField txtNumComprobante;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextField txtTaller;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
