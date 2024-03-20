/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import vistas.cls_agricultor;

public class frm_principal extends javax.swing.JFrame {
    
    public frm_principal() {
        initComponents();
        btn_actualizar_agricultor.setEnabled(false);
    }
    private LinkedList<cls_agricultor> agricultor = new LinkedList<>();
    private boolean sw;
    private int pos;
    
    private void fnt_guardar_agricultor(String id_str, String nombre_str, String contacto_str, String ubicacion_str){
        if (!id_str.equals("") && !nombre_str.equals("") 
                && !contacto_str.equals("") && !ubicacion_str.equals("")) {
            agricultor.add(new cls_agricultor(id_str, nombre_str, contacto_str, ubicacion_str));
            JOptionPane.showMessageDialog(null, "Agricultor registrado éxitosamente","AGRICULTOR",JOptionPane.INFORMATION_MESSAGE);
            fnt_nuevo_agricultor();
        }else{
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los datos solicitados","AGRICULTOR",JOptionPane.WARNING_MESSAGE);
        }
    }
    private void fnt_consultar_agricultor(String id_str){
        if (!id_str.equals("")) {
            for(int i = 0; i < agricultor.size(); i++){
                if (agricultor.get(i).getId_str().equals(id_str)) {
                    sw = true;
                    pos = i;
                }
            }
            if (sw) {
                txt_contacto.setText(agricultor.get(pos).getContacto_str());
                txt_nombre.setText(agricultor.get(pos).getNombre_str());
                txt_ubicacion.setText(agricultor.get(pos).getUbicacion_str());
                txt_id_agricultor.setEnabled(false);
                btn_actualizar_agricultor.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "No se encontraron registros","AGRICULTOR",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un ID válido","AGRICULTOR",JOptionPane.WARNING_MESSAGE);
        }
    }
    private void fnt_actualizar_agricultor(){
        if (!txt_nombre.getText().equals("") && !txt_contacto.getText().equals("") 
                && !txt_ubicacion.getText().equals("") && sw){
            agricultor.get(pos).setContacto_str(txt_contacto.getText());
            agricultor.get(pos).setNombre_str(txt_nombre.getText());
            agricultor.get(pos).setUbicacion_str(txt_ubicacion.getText());
            JOptionPane.showMessageDialog(null, "Agricultor actualizado éxitosamente","AGRICULTOR",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Debe rellenar toda la información solicitada","AGRICULTOR",JOptionPane.WARNING_MESSAGE);
        }
    }
    private void fnt_nuevo_agricultor(){
        txt_id_agricultor.setText("");
        txt_contacto.setText("");
        txt_nombre.setText("");
        txt_ubicacion.setText("");
        txt_id_agricultor.requestFocus();
        txt_id_agricultor.setEnabled(true);
        btn_actualizar_agricultor.setEnabled(false);
        sw = false;
        pos = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_cultivos = new javax.swing.JButton();
        btn_agricultor = new javax.swing.JButton();
        btn_labores = new javax.swing.JButton();
        btn_registro = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnl_agricultor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_id_agricultor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        Contacto = new javax.swing.JLabel();
        txt_contacto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_ubicacion = new javax.swing.JTextField();
        btn_nuevo_agricultor = new javax.swing.JButton();
        btn_consultar_agricultor = new javax.swing.JButton();
        btn_guardar_agricultor = new javax.swing.JButton();
        btn_actualizar_agricultor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 245, 247));

        jPanel2.setBackground(new java.awt.Color(85, 188, 218));

        btn_cultivos.setBackground(new java.awt.Color(5, 112, 147));
        btn_cultivos.setForeground(new java.awt.Color(255, 255, 255));
        btn_cultivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/sprout.png"))); // NOI18N
        btn_cultivos.setText("Cultivos");

        btn_agricultor.setBackground(new java.awt.Color(5, 112, 147));
        btn_agricultor.setForeground(new java.awt.Color(255, 255, 255));
        btn_agricultor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/farmer.png"))); // NOI18N
        btn_agricultor.setText("Agricultor");

        btn_labores.setBackground(new java.awt.Color(5, 112, 147));
        btn_labores.setForeground(new java.awt.Color(255, 255, 255));
        btn_labores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/farmer (1).png"))); // NOI18N
        btn_labores.setText("Labores");

        btn_registro.setBackground(new java.awt.Color(5, 112, 147));
        btn_registro.setForeground(new java.awt.Color(255, 255, 255));
        btn_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/farmer (1).png"))); // NOI18N
        btn_registro.setText("Registros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_labores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_registro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_agricultor)
                            .addComponent(btn_cultivos, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_agricultor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cultivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_labores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_registro)
                .addGap(124, 124, 124))
        );

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_agricultor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agricultor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("ID:");

        txt_id_agricultor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Nombre:");

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        Contacto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Contacto.setText("Contacto:");

        txt_contacto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Ubicación:");

        txt_ubicacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btn_nuevo_agricultor.setBackground(new java.awt.Color(5, 112, 147));
        btn_nuevo_agricultor.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevo_agricultor.setText("Nuvo");
        btn_nuevo_agricultor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_agricultorActionPerformed(evt);
            }
        });

        btn_consultar_agricultor.setBackground(new java.awt.Color(5, 112, 147));
        btn_consultar_agricultor.setForeground(new java.awt.Color(255, 255, 255));
        btn_consultar_agricultor.setText("Consultar");
        btn_consultar_agricultor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultar_agricultorActionPerformed(evt);
            }
        });

        btn_guardar_agricultor.setBackground(new java.awt.Color(5, 112, 147));
        btn_guardar_agricultor.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar_agricultor.setText("Guardar");
        btn_guardar_agricultor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_agricultorActionPerformed(evt);
            }
        });

        btn_actualizar_agricultor.setBackground(new java.awt.Color(5, 112, 147));
        btn_actualizar_agricultor.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar_agricultor.setText("Actualizar");
        btn_actualizar_agricultor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_agricultorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_agricultorLayout = new javax.swing.GroupLayout(pnl_agricultor);
        pnl_agricultor.setLayout(pnl_agricultorLayout);
        pnl_agricultorLayout.setHorizontalGroup(
            pnl_agricultorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_agricultorLayout.createSequentialGroup()
                .addGroup(pnl_agricultorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_agricultorLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(pnl_agricultorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_agricultorLayout.createSequentialGroup()
                                .addComponent(Contacto)
                                .addGap(18, 18, 18)
                                .addComponent(txt_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_agricultorLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_agricultorLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_id_agricultor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnl_agricultorLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_agricultorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_agricultorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_consultar_agricultor, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(btn_nuevo_agricultor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(pnl_agricultorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_guardar_agricultor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_actualizar_agricultor, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );
        pnl_agricultorLayout.setVerticalGroup(
            pnl_agricultorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_agricultorLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(pnl_agricultorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_id_agricultor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_agricultorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_agricultorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contacto)
                    .addComponent(txt_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_agricultorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(pnl_agricultorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_nuevo_agricultor, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btn_guardar_agricultor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_agricultorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizar_agricultor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar_agricultor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jLayeredPane1.add(pnl_agricultor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 440));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardar_agricultorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_agricultorActionPerformed
        fnt_guardar_agricultor(txt_id_agricultor.getText(), txt_nombre.getText(), txt_contacto.getText(), txt_ubicacion.getText());
    }//GEN-LAST:event_btn_guardar_agricultorActionPerformed

    private void btn_nuevo_agricultorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_agricultorActionPerformed
        fnt_nuevo_agricultor();
    }//GEN-LAST:event_btn_nuevo_agricultorActionPerformed

    private void btn_consultar_agricultorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultar_agricultorActionPerformed
        fnt_consultar_agricultor(txt_id_agricultor.getText());
    }//GEN-LAST:event_btn_consultar_agricultorActionPerformed

    private void btn_actualizar_agricultorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_agricultorActionPerformed
        fnt_actualizar_agricultor();
    }//GEN-LAST:event_btn_actualizar_agricultorActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contacto;
    private javax.swing.JButton btn_actualizar_agricultor;
    private javax.swing.JButton btn_agricultor;
    private javax.swing.JButton btn_consultar_agricultor;
    private javax.swing.JButton btn_cultivos;
    private javax.swing.JButton btn_guardar_agricultor;
    private javax.swing.JButton btn_labores;
    private javax.swing.JButton btn_nuevo_agricultor;
    private javax.swing.JButton btn_registro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnl_agricultor;
    private javax.swing.JTextField txt_contacto;
    private javax.swing.JTextField txt_id_agricultor;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_ubicacion;
    // End of variables declaration//GEN-END:variables
}
