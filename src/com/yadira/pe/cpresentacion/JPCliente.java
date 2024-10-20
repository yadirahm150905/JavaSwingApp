
package com.yadira.pe.cpresentacion;

import com.yadira.pe.cmodelo.Cliente;
import com.yadira.pe.cnegocio.ClienteBO;
import javax.swing.JOptionPane;


public class JPCliente extends javax.swing.JPanel {
    private ClienteBO tdbo = new ClienteBO();
    private Cliente td = new Cliente();
    String idCliente;
    
    
    public JPCliente() {
        initComponents();
        tdbo = new ClienteBO(); // Inicializa la instancia de TipoDocumentoBO
        listarCliente(); // Cargar los tipos de documentos al inicializar
    }

    // Resto del código...

    private void listarCliente() {
        tdbo.listarCliente(TablaClienteRegistro); // Asegúrate de que jTable1 esté definido
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textDNI = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        textApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textEMAIL = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClienteRegistro = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel1.setText("Registro  De Clientes  -  Compañia Nuevo Peru Bank");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 716, 65));

        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        textNombre.setBackground(new java.awt.Color(255, 255, 242));
        textNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombre.setBorder(null);
        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });
        jPanel1.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 340, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setText("Telefono:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jLabel5.setText("Nombre:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        textDNI.setBackground(new java.awt.Color(255, 255, 242));
        textDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textDNI.setBorder(null);
        textDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDNIActionPerformed(evt);
            }
        });
        jPanel1.add(textDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 340, 20));

        textTelefono.setBackground(new java.awt.Color(255, 255, 242));
        textTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textTelefono.setBorder(null);
        textTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(textTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 340, 20));

        textApellidos.setBackground(new java.awt.Color(255, 255, 242));
        textApellidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textApellidos.setBorder(null);
        textApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textApellidosActionPerformed(evt);
            }
        });
        jPanel1.add(textApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 340, 20));

        jLabel6.setText("DNI:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel7.setText("Dirección:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        textDireccion.setBackground(new java.awt.Color(255, 255, 242));
        textDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textDireccion.setBorder(null);
        textDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(textDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 340, 20));

        jLabel8.setText("EMAIL:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        textEMAIL.setBackground(new java.awt.Color(255, 255, 242));
        textEMAIL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textEMAIL.setBorder(null);
        textEMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEMAILActionPerformed(evt);
            }
        });
        jPanel1.add(textEMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 340, -1));

        btnLimpiar.setBackground(new java.awt.Color(204, 238, 206));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        btnModificar.setBackground(new java.awt.Color(204, 238, 206));
        btnModificar.setText("modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 207, 118));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 207, 118));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        TablaClienteRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaClienteRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaClienteRegistroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaClienteRegistro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 430, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDNIActionPerformed

    private void textTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefonoActionPerformed

    private void textApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellidosActionPerformed

    private void textDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDireccionActionPerformed

    private void textEMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEMAILActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    textNombre.setText("");
    textApellidos.setText("");
    textDNI.setText("");
    textDireccion.setText("");
    textEMAIL.setText("");
    textTelefono.setText("");
    
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       try {
           String id_cliente = null;

            td.setId_cliente(Integer.parseInt(id_cliente));
            td.setNombre(textNombre.getText());
            td.setApellido(textApellidos.getText());
            td.setDni(textDNI.getText());
            td.setDireccion(textDireccion.getText());
            td.setEmail(textEMAIL.getText());
            td.setTelefono(textTelefono.getText());

            tdbo.modificarCliente(td);
            listarCliente();
            JOptionPane.showMessageDialog(null, ":) se altualizo corectamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: al altualizar Tipo documento ");

}

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            String id_cliente = null;
            //            TipoDocumento tdf = new TipoDocumento();
            td.setId_cliente(Integer.parseInt(id_cliente));
            tdbo.eliminarCliente(td);
            listarCliente();
        } catch (Exception diego) {
            JOptionPane.showMessageDialog(null, "Error" + diego.getMessage());

}

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     try {
            td.setNombre(textNombre.getText());
            td.setApellido(textApellidos.getText());
            td.setDni(textDNI.getText());
            td.setDireccion(textDireccion.getText());
            td.setEmail(textEMAIL.getText());
            td.setTelefono(textTelefono.getText());

            String smg = tdbo.agregarCliente(td);
            JOptionPane.showMessageDialog(null, ":) se guardo corectamente" + smg);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: al guardar Tipo documento ");
}       
}    
    public boolean valida(){
    if (textNombre.getText().equals("")) {
        JOptionPane.showMessageDialog(null, ":) NOMBRE ES REQUERIDO");
        return false;
    } else if (textApellidos.getText().equals("")) {
        JOptionPane.showMessageDialog(null, ":) APELLIDOS ES REQUERIDO");
        return false;
    } else if (textDNI.getText().equals("")) {
        JOptionPane.showMessageDialog(null, ":) DNI ES REQUERIDO");
        return false;
    } else if (textDireccion.getText().equals("")) {
        JOptionPane.showMessageDialog(null, ":) DIRECCION ES REQUERIDO");
        return false;
    } else if (textEMAIL.getText().equals("")) {
        JOptionPane.showMessageDialog(null, ":) EMAIL ES REQUERIDO");
        return false;
        } else if (textTelefono.getText().equals("")) {
        JOptionPane.showMessageDialog(null, ":) TELEFONO ES REQUERIDO");
        return false;
    }

    // If all validations pass
    return true;    

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void TablaClienteRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaClienteRegistroMouseClicked
    int  seleccion  = TablaClienteRegistro.rowAtPoint(evt.getPoint());
        
        idCliente = TablaClienteRegistro.getValueAt(seleccion, 0)+ "" ;
        textNombre.setText(TablaClienteRegistro.getValueAt(seleccion, 1)+ "");
        textApellidos.setText(TablaClienteRegistro.getValueAt(seleccion, 2)+ "");
        textDNI.setText(TablaClienteRegistro.getValueAt(seleccion, 3)+ "");
        textDireccion.setText(TablaClienteRegistro.getValueAt(seleccion, 4)+ "");
        textEMAIL.setText(TablaClienteRegistro.getValueAt(seleccion, 5)+ "");
        textTelefono.setText(TablaClienteRegistro.getValueAt(seleccion, 6)+ "");
        
        System.out.println(idCliente);
    }  
/*
          }      }//GEN-LAST:event_TablaClienteRegistroMouseClicked

*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaClienteRegistro;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField textApellidos;
    private javax.swing.JTextField textDNI;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textEMAIL;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables


}