//nombre : Yadira Yahaira Huaman Meza
package com.yadira.pe.cpresentacion;

import com.yadira.pe.cmodelo.Compania;
import com.yadira.pe.cnegocio.CompaniaBO;

public class JPBillete extends javax.swing.JPanel {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        popupMenu1 = new java.awt.PopupMenu();
        JPBillete = new javax.swing.JPanel();
        txtNBillete = new javax.swing.JTextField();
        textNombre1 = new javax.swing.JTextField();
        textNombre2 = new javax.swing.JTextField();
        textNombre3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textNombre4 = new javax.swing.JTextField();
        textNombre5 = new javax.swing.JTextField();
        textNombre6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RegistroBilletes = new javax.swing.JTable();

        jButton1.setText("jButton1");

        popupMenu1.setLabel("popupMenu1");

        JPBillete.setBackground(new java.awt.Color(204, 234, 175));

        txtNBillete.setBackground(new java.awt.Color(255, 255, 242));
        txtNBillete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNBillete.setBorder(null);
        txtNBillete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNBilleteActionPerformed(evt);
            }
        });

        textNombre1.setBackground(new java.awt.Color(255, 255, 242));
        textNombre1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombre1.setBorder(null);
        textNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombre1ActionPerformed(evt);
            }
        });

        textNombre2.setBackground(new java.awt.Color(255, 255, 242));
        textNombre2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombre2.setBorder(null);
        textNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombre2ActionPerformed(evt);
            }
        });

        textNombre3.setBackground(new java.awt.Color(255, 255, 242));
        textNombre3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombre3.setBorder(null);
        textNombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombre3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel1.setText("Registro  De  Billetes -  Compañia Nuevo Peru Bank");

        jLabel5.setText("Origen:");

        jLabel6.setText("Destino:");

        jLabel7.setText("Fecha Viaje:");

        jLabel8.setText("Numero de Billete:");

        textNombre4.setBackground(new java.awt.Color(255, 255, 242));
        textNombre4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombre4.setBorder(null);
        textNombre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombre4ActionPerformed(evt);
            }
        });

        textNombre5.setBackground(new java.awt.Color(255, 255, 242));
        textNombre5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombre5.setBorder(null);
        textNombre5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombre5ActionPerformed(evt);
            }
        });

        textNombre6.setBackground(new java.awt.Color(255, 255, 242));
        textNombre6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombre6.setBorder(null);
        textNombre6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombre6ActionPerformed(evt);
            }
        });

        jLabel9.setText("Precio:");

        jLabel10.setText("ID COMPAÑIA:");

        jLabel11.setText("Hora:");

        btnLimpiar.setBackground(new java.awt.Color(204, 238, 206));
        btnLimpiar.setText("Eliminar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 207, 118));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        RegistroBilletes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(RegistroBilletes);

        javax.swing.GroupLayout JPBilleteLayout = new javax.swing.GroupLayout(JPBillete);
        JPBillete.setLayout(JPBilleteLayout);
        JPBilleteLayout.setHorizontalGroup(
            JPBilleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBilleteLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPBilleteLayout.createSequentialGroup()
                .addGap(0, 213, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(JPBilleteLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(JPBilleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNBillete, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addComponent(textNombre1)
                    .addComponent(textNombre3)
                    .addComponent(textNombre4)
                    .addComponent(textNombre2)
                    .addComponent(textNombre6)
                    .addComponent(textNombre5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        JPBilleteLayout.setVerticalGroup(
            JPBilleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBilleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPBilleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPBilleteLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNBillete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textNombre6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(JPBilleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPBillete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPBillete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNBilleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNBilleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNBilleteActionPerformed

    private void textNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombre1ActionPerformed

    private void textNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombre2ActionPerformed

    private void textNombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombre3ActionPerformed

    private void textNombre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombre4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombre4ActionPerformed

    private void textNombre5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombre5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombre5ActionPerformed

    private void textNombre6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombre6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombre6ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
     /*   txtNBillete.setText("");
        textApellidos.setText("");
        textDNI.setText("");
        textDireccion.setText("");
        textEMAIL.setText("");
        textTelefono.setText("");
*/
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPBillete;
    private javax.swing.JTable RegistroBilletes;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField textNombre1;
    private javax.swing.JTextField textNombre2;
    private javax.swing.JTextField textNombre3;
    private javax.swing.JTextField textNombre4;
    private javax.swing.JTextField textNombre5;
    private javax.swing.JTextField textNombre6;
    private javax.swing.JTextField txtNBillete;
    // End of variables declaration//GEN-END:variables

}
