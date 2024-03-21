/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import vistas.*;


public class frm_principal extends javax.swing.JFrame {
    
    private cls_agricultor_manager agricultor_manager = new cls_agricultor_manager();
    private cls_cultivos_manager cultivo_manager = new cls_cultivos_manager();
    
    public frm_principal() {
        initComponents();
        btn_actualizar_agricultor.setEnabled(false);
        btn_actualizar_cultivo.setEnabled(false);
        pnl_agricultor.setVisible(false);
        pnl_cultivos.setVisible(false);
    }
    
    private void fnt_mostrar_panel_agricultor(){
        if (pnl_agricultor.isVisible() == false) {
            pnl_agricultor.setVisible(true);
            pnl_cultivos.setVisible(false);
        }else{
             pnl_agricultor.setVisible(false);
             pnl_cultivos.setVisible(false);
        }
    } 
    private void fnt_mostrar_panel_cultivo(){
        if (pnl_cultivos.isVisible() == false) {
            pnl_agricultor.setVisible(false);
            pnl_cultivos.setVisible(true);
        }else{
             pnl_agricultor.setVisible(false);
             pnl_cultivos.setVisible(false);
        }
    } 
    
    ///Agricultor
    private void fnt_guardar_agricultor(String id_str, String nombre_str, String contacto_str, String ubicacion_str){
       agricultor_manager.fnt_guardar_agricultor(id_str, nombre_str, contacto_str, ubicacion_str);
       fnt_nuevo_agricultor();
    }
    private void fnt_nuevo_agricultor(){
        agricultor_manager.setSw(false);
        agricultor_manager.setPos(0);
        agricultor_manager.setBoton_actualizar(false);
        agricultor_manager.setId_actualizar(true);
        
        txt_contacto.setText("");
        txt_id_agricultor.setText("");
        txt_nombre.setText("");
        txt_ubicacion.setText("");
        txt_id_agricultor.requestFocus();
        btn_actualizar_agricultor.setEnabled(false);
        txt_id_agricultor.setEnabled(true);
    }

    private void fnt_consultar_agricultor(String id_str){
        agricultor_manager.fnt_consultar_agricultor(id_str);
        txt_contacto.setText(agricultor_manager.getContacto());
        txt_nombre.setText(agricultor_manager.getNombre());
        txt_ubicacion.setText(agricultor_manager.getUbicacion());
        txt_id_agricultor.setEnabled(agricultor_manager.isId_actualizar());
        btn_actualizar_agricultor.setEnabled(agricultor_manager.isBoton_actualizar());
    }
    private void fnt_actualizar_agricultor(){
        agricultor_manager.fnt_actualizar_agricultor(txt_nombre.getText(), txt_contacto.getText(), txt_ubicacion.getText());
    }
    
    ///Cultivo
    private void fnt_guardar_cultivo(String codigo_str, String nombre_str, String area_str){
       cultivo_manager.fnt_guardar_cultivo(codigo_str, nombre_str, area_str);
       fnt_nuevo_cultivo();
    }
    private void fnt_nuevo_cultivo(){
        cultivo_manager.setSw(false);
        cultivo_manager.setPos(0);
        cultivo_manager.setBoton_actualizar(false);
        cultivo_manager.setId_actualizar(true);
        
        txt_area_cultivo.setText("");
        txt_cod_cultivo.setText("");
        txt_nombre_cultivo.setText("");
        txt_cod_cultivo.requestFocus();
        btn_actualizar_cultivo.setEnabled(false);
        txt_cod_cultivo.setEnabled(true);
    }
    private void fnt_consultar_cultivo(String codigo_str){
        cultivo_manager.fnt_consultar_cultivo(codigo_str);
        txt_nombre_cultivo.setText(cultivo_manager.getNombre());
        txt_area_cultivo.setText(cultivo_manager.getArea());
        txt_cod_cultivo.setEnabled(cultivo_manager.isId_actualizar());
        btn_actualizar_cultivo.setEnabled(cultivo_manager.isBoton_actualizar());
    }
    
    private void fnt_actualizar_cultivo(){
        cultivo_manager.fnt_actualizar_cultivos(txt_nombre_cultivo.getText(), txt_area_cultivo.getText());
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
        pnl_labores = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_cod_labor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre_labor = new javax.swing.JTextField();
        Contacto2 = new javax.swing.JLabel();
        txt_tiempo_labor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_labores = new javax.swing.JTable();
        btn_actualizar_labor = new javax.swing.JButton();
        btn_guardar_labor = new javax.swing.JButton();
        btn_consultar_labor = new javax.swing.JButton();
        btn_nueva_labor = new javax.swing.JButton();
        pnl_cultivos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_cod_cultivo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre_cultivo = new javax.swing.JTextField();
        Contacto1 = new javax.swing.JLabel();
        txt_area_cultivo = new javax.swing.JTextField();
        btn_nuevo_cultivo = new javax.swing.JButton();
        btn_consultar_cultivo = new javax.swing.JButton();
        btn_guardar_cultivo = new javax.swing.JButton();
        btn_actualizar_cultivo = new javax.swing.JButton();
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
        btn_cultivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cultivosActionPerformed(evt);
            }
        });

        btn_agricultor.setBackground(new java.awt.Color(5, 112, 147));
        btn_agricultor.setForeground(new java.awt.Color(255, 255, 255));
        btn_agricultor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/farmer.png"))); // NOI18N
        btn_agricultor.setText("Agricultor");
        btn_agricultor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agricultorActionPerformed(evt);
            }
        });

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

        pnl_labores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Labores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Código:");

        txt_cod_labor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Nombre:");

        txt_nombre_labor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        Contacto2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Contacto2.setText("Tiempo:");

        txt_tiempo_labor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Labores existentes"));

        tbl_labores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOMBRE", "TIEMPO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_labores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btn_actualizar_labor.setBackground(new java.awt.Color(5, 112, 147));
        btn_actualizar_labor.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar_labor.setText("Actualizar");
        btn_actualizar_labor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_laborActionPerformed(evt);
            }
        });

        btn_guardar_labor.setBackground(new java.awt.Color(5, 112, 147));
        btn_guardar_labor.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar_labor.setText("Guardar");
        btn_guardar_labor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_laborActionPerformed(evt);
            }
        });

        btn_consultar_labor.setBackground(new java.awt.Color(5, 112, 147));
        btn_consultar_labor.setForeground(new java.awt.Color(255, 255, 255));
        btn_consultar_labor.setText("Consultar");
        btn_consultar_labor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultar_laborActionPerformed(evt);
            }
        });

        btn_nueva_labor.setBackground(new java.awt.Color(5, 112, 147));
        btn_nueva_labor.setForeground(new java.awt.Color(255, 255, 255));
        btn_nueva_labor.setText("Nuevo");
        btn_nueva_labor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueva_laborActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_laboresLayout = new javax.swing.GroupLayout(pnl_labores);
        pnl_labores.setLayout(pnl_laboresLayout);
        pnl_laboresLayout.setHorizontalGroup(
            pnl_laboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_laboresLayout.createSequentialGroup()
                .addGroup(pnl_laboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_laboresLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(pnl_laboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_laboresLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nombre_labor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_laboresLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txt_cod_labor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_laboresLayout.createSequentialGroup()
                                .addComponent(Contacto2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_tiempo_labor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnl_laboresLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(pnl_laboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_consultar_labor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_nueva_labor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(pnl_laboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_guardar_labor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_actualizar_labor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_laboresLayout.setVerticalGroup(
            pnl_laboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_laboresLayout.createSequentialGroup()
                .addGroup(pnl_laboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_cod_labor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_laboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_nombre_labor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_laboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contacto2)
                    .addComponent(txt_tiempo_labor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_laboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_nueva_labor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_guardar_labor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_laboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizar_labor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar_labor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLayeredPane1.add(pnl_labores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 440));

        pnl_cultivos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cultivos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Codigo:");

        txt_cod_cultivo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Nombre:");

        txt_nombre_cultivo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        Contacto1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Contacto1.setText("Area(m^2:)");

        txt_area_cultivo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btn_nuevo_cultivo.setBackground(new java.awt.Color(5, 112, 147));
        btn_nuevo_cultivo.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevo_cultivo.setText("Nuevo");
        btn_nuevo_cultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_cultivoActionPerformed(evt);
            }
        });

        btn_consultar_cultivo.setBackground(new java.awt.Color(5, 112, 147));
        btn_consultar_cultivo.setForeground(new java.awt.Color(255, 255, 255));
        btn_consultar_cultivo.setText("Consultar");
        btn_consultar_cultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultar_cultivoActionPerformed(evt);
            }
        });

        btn_guardar_cultivo.setBackground(new java.awt.Color(5, 112, 147));
        btn_guardar_cultivo.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar_cultivo.setText("Guardar");
        btn_guardar_cultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_cultivoActionPerformed(evt);
            }
        });

        btn_actualizar_cultivo.setBackground(new java.awt.Color(5, 112, 147));
        btn_actualizar_cultivo.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar_cultivo.setText("Actualizar");
        btn_actualizar_cultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_cultivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_cultivosLayout = new javax.swing.GroupLayout(pnl_cultivos);
        pnl_cultivos.setLayout(pnl_cultivosLayout);
        pnl_cultivosLayout.setHorizontalGroup(
            pnl_cultivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_cultivosLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(pnl_cultivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_consultar_cultivo, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(btn_nuevo_cultivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(pnl_cultivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_guardar_cultivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_actualizar_cultivo, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addGap(59, 59, 59))
            .addGroup(pnl_cultivosLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(pnl_cultivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_cultivosLayout.createSequentialGroup()
                        .addComponent(Contacto1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_area_cultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_cultivosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombre_cultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_cultivosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_cod_cultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_cultivosLayout.setVerticalGroup(
            pnl_cultivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cultivosLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(pnl_cultivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_cod_cultivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_cultivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_nombre_cultivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_cultivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contacto1)
                    .addComponent(txt_area_cultivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(pnl_cultivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_nuevo_cultivo, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btn_guardar_cultivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_cultivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizar_cultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar_cultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jLayeredPane1.add(pnl_cultivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 440));

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
        btn_nuevo_agricultor.setText("Nuevo");
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

    private void btn_agricultorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agricultorActionPerformed
        fnt_mostrar_panel_agricultor();
    }//GEN-LAST:event_btn_agricultorActionPerformed

    private void btn_nuevo_cultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_cultivoActionPerformed
        fnt_nuevo_cultivo();
    }//GEN-LAST:event_btn_nuevo_cultivoActionPerformed

    private void btn_consultar_cultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultar_cultivoActionPerformed
        fnt_consultar_cultivo(txt_cod_cultivo.getText());
    }//GEN-LAST:event_btn_consultar_cultivoActionPerformed

    private void btn_guardar_cultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_cultivoActionPerformed
        fnt_guardar_cultivo(txt_cod_cultivo.getText() ,txt_nombre_cultivo.getText(), txt_area_cultivo.getText());
    }//GEN-LAST:event_btn_guardar_cultivoActionPerformed

    private void btn_actualizar_cultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_cultivoActionPerformed
        fnt_actualizar_cultivo();
    }//GEN-LAST:event_btn_actualizar_cultivoActionPerformed

    private void btn_cultivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cultivosActionPerformed
        fnt_mostrar_panel_cultivo();
    }//GEN-LAST:event_btn_cultivosActionPerformed

    private void btn_actualizar_laborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_laborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizar_laborActionPerformed

    private void btn_guardar_laborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_laborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar_laborActionPerformed

    private void btn_consultar_laborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultar_laborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_consultar_laborActionPerformed

    private void btn_nueva_laborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueva_laborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nueva_laborActionPerformed

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
    private javax.swing.JLabel Contacto1;
    private javax.swing.JLabel Contacto2;
    protected javax.swing.JButton btn_actualizar_agricultor;
    protected javax.swing.JButton btn_actualizar_cultivo;
    protected javax.swing.JButton btn_actualizar_labor;
    private javax.swing.JButton btn_agricultor;
    private javax.swing.JButton btn_consultar_agricultor;
    private javax.swing.JButton btn_consultar_cultivo;
    private javax.swing.JButton btn_consultar_labor;
    private javax.swing.JButton btn_cultivos;
    private javax.swing.JButton btn_guardar_agricultor;
    private javax.swing.JButton btn_guardar_cultivo;
    private javax.swing.JButton btn_guardar_labor;
    private javax.swing.JButton btn_labores;
    private javax.swing.JButton btn_nueva_labor;
    private javax.swing.JButton btn_nuevo_agricultor;
    private javax.swing.JButton btn_nuevo_cultivo;
    private javax.swing.JButton btn_registro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JPanel pnl_agricultor;
    protected javax.swing.JPanel pnl_cultivos;
    protected javax.swing.JPanel pnl_labores;
    private javax.swing.JTable tbl_labores;
    protected javax.swing.JTextField txt_area_cultivo;
    protected javax.swing.JTextField txt_cod_cultivo;
    protected javax.swing.JTextField txt_cod_labor;
    protected javax.swing.JTextField txt_contacto;
    protected javax.swing.JTextField txt_id_agricultor;
    protected javax.swing.JTextField txt_nombre;
    protected javax.swing.JTextField txt_nombre_cultivo;
    protected javax.swing.JTextField txt_nombre_labor;
    protected javax.swing.JTextField txt_tiempo_labor;
    protected javax.swing.JTextField txt_ubicacion;
    // End of variables declaration//GEN-END:variables
}
