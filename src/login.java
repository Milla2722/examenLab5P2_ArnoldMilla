
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class login extends javax.swing.JFrame {
    ////////////////f2 silla 3
    
    public login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_menu_Empleados = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        lbl_nombreU_Empleados = new javax.swing.JLabel();
        bt_cerrarS_Empleados = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_usuario_Civil = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_tramites_Civil = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tf_nt_Civiles = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txta_descT_Civiles = new javax.swing.JTextArea();
        bt_tramite_Civiles = new javax.swing.JButton();
        jd_menu_Civiles = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        lbl_nombreU_Civiles = new javax.swing.JLabel();
        bt_cerrarS_Civiles = new javax.swing.JButton();
        tab_modif_Civiles = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jcombo_Empleados = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_modifN_Empleados = new javax.swing.JTextField();
        tf_modifA_Empleados = new javax.swing.JTextField();
        tf_modifC_Empleados = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        tf_modifD_Empleados = new javax.swing.JTextField();
        dch_fechaN_Empleados = new com.toedter.calendar.JDateChooser();
        bt_modif_Empleados = new javax.swing.JButton();
        bt_gurpoS_Empleados = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombreapellido_login = new javax.swing.JTextField();
        bt_loginbutton_login = new javax.swing.JButton();
        pf_contrasena_login = new javax.swing.JPasswordField();

        jd_menu_Empleados.setMaximumSize(new java.awt.Dimension(786, 503));
        jd_menu_Empleados.setMinimumSize(new java.awt.Dimension(786, 503));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("Bienvenido:");

        lbl_nombreU_Empleados.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        bt_cerrarS_Empleados.setText("Cerrar Sesión");
        bt_cerrarS_Empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cerrarS_EmpleadosMouseClicked(evt);
            }
        });

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        tbl_usuario_Civil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Completo", "No. Identidad", "Fecha de Nacimiento"
            }
        ));
        jScrollPane3.setViewportView(tbl_usuario_Civil);

        tbl_tramites_Civil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Tramite", "Descripcion", "Fecha", "No. Identidad"
            }
        ));
        jScrollPane4.setViewportView(tbl_tramites_Civil);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("tab1", jPanel4);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel13.setText("Nombre");

        tf_nt_Civiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nt_CivilesActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel14.setText("Descripción");

        txta_descT_Civiles.setColumns(20);
        txta_descT_Civiles.setRows(5);
        jScrollPane5.setViewportView(txta_descT_Civiles);

        bt_tramite_Civiles.setText("Añadir");
        bt_tramite_Civiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_tramite_CivilesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(tf_nt_Civiles, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(bt_tramite_Civiles)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(tf_nt_Civiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(bt_tramite_Civiles)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", jPanel5);

        javax.swing.GroupLayout jd_menu_EmpleadosLayout = new javax.swing.GroupLayout(jd_menu_Empleados.getContentPane());
        jd_menu_Empleados.getContentPane().setLayout(jd_menu_EmpleadosLayout);
        jd_menu_EmpleadosLayout.setHorizontalGroup(
            jd_menu_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menu_EmpleadosLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jd_menu_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_menu_EmpleadosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_nombreU_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_menu_EmpleadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 405, Short.MAX_VALUE)
                        .addComponent(bt_cerrarS_Empleados)
                        .addGap(87, 87, 87))))
            .addGroup(jd_menu_EmpleadosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_menu_EmpleadosLayout.setVerticalGroup(
            jd_menu_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menu_EmpleadosLayout.createSequentialGroup()
                .addGroup(jd_menu_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_menu_EmpleadosLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jd_menu_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lbl_nombreU_Empleados)))
                    .addGroup(jd_menu_EmpleadosLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(bt_cerrarS_Empleados)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jd_menu_Civiles.setMaximumSize(new java.awt.Dimension(786, 503));
        jd_menu_Civiles.setMinimumSize(new java.awt.Dimension(786, 503));
        jd_menu_Civiles.setPreferredSize(new java.awt.Dimension(786, 503));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Bienvenido:");

        lbl_nombreU_Civiles.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        bt_cerrarS_Civiles.setText("Cerrar Sesión");
        bt_cerrarS_Civiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cerrarS_CivilesMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Completo", "No. Identidad", "Fecha de Nacimiento"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Tramite", "Descripcion", "Fecha", "No. Identidad"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        tab_modif_Civiles.addTab("Informacion Civiles", jPanel2);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel7.setText("Apellido");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel8.setText("Contrasenia");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel10.setText("Sexo");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel11.setText("Departamento");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel12.setText("Fecha de nacimiento");

        bt_gurpoS_Empleados.add(jRadioButton1);
        jRadioButton1.setText("Femenino");

        bt_gurpoS_Empleados.add(jRadioButton2);
        jRadioButton2.setText("Masculino");

        bt_modif_Empleados.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        bt_modif_Empleados.setText("Modifcar");
        bt_modif_Empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modif_EmpleadosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcombo_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(tf_modifD_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(tf_modifN_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(tf_modifA_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_modifC_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(bt_modif_Empleados)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(dch_fechaN_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcombo_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_modifN_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_modifA_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_modifC_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(dch_fechaN_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addGap(37, 37, 37)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_modifD_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_modif_Empleados))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tab_modif_Civiles.addTab("Modificacion Civiles", jPanel3);

        javax.swing.GroupLayout jd_menu_CivilesLayout = new javax.swing.GroupLayout(jd_menu_Civiles.getContentPane());
        jd_menu_Civiles.getContentPane().setLayout(jd_menu_CivilesLayout);
        jd_menu_CivilesLayout.setHorizontalGroup(
            jd_menu_CivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menu_CivilesLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_nombreU_Civiles, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_cerrarS_Civiles)
                .addGap(142, 142, 142))
            .addGroup(jd_menu_CivilesLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(tab_modif_Civiles, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jd_menu_CivilesLayout.setVerticalGroup(
            jd_menu_CivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menu_CivilesLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jd_menu_CivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_cerrarS_Civiles)
                    .addComponent(lbl_nombreU_Civiles, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(75, 75, 75)
                .addComponent(tab_modif_Civiles, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LogIn");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 202, 49));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Nombre y Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        tf_nombreapellido_login.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        tf_nombreapellido_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreapellido_loginActionPerformed(evt);
            }
        });
        jPanel1.add(tf_nombreapellido_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 270, 30));

        bt_loginbutton_login.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bt_loginbutton_login.setText("Ingresar");
        bt_loginbutton_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginbutton_loginMouseClicked(evt);
            }
        });
        jPanel1.add(bt_loginbutton_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 110, 40));
        jPanel1.add(pf_contrasena_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 270, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nombreapellido_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreapellido_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreapellido_loginActionPerformed

    private void bt_loginbutton_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginbutton_loginMouseClicked
        /////usuarios en bruto
        Usuarios u1 = new Empleados("Abogado" , "Jefe", 10, "Juan", "Oraculo", "1", "Cortes", 'm', new Date("15/10/2020"));
        Usuarios u2 = new Civiles ("Paco", "Lepos", "2", "Francisco Morazan", 'f', new Date("10/3/2021"));
        Usuarios u3 = new Civiles ("Irmao", "Fernandez", "5", "Comayagua", 'f', new Date("10/5/2019"));
        
        u1.id();
        u2.id();
        u3.id();
        
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        
        boolean valid = false;
        
        String [] name = tf_nombreapellido_login.getText().split(" ");
        
        for (int cont = 0; cont < usuarios.size(); cont++) {   
                //System.out.println(usuarios.get(cont).getNombre());
                //System.out.println(usuarios.get(cont).getApellido()); /////Estos quedan aca porque aveces no entra al if que viene a continuacion y no permite hacer el login
                //System.out.println(usuarios.get(cont).getContrasena());
            if(name[0].equalsIgnoreCase(usuarios.get(cont).getNombre()) && name[1].equalsIgnoreCase(usuarios.get(cont).getApellido()) && pf_contrasena_login.getText().equalsIgnoreCase(usuarios.get(cont).getContrasena())){
                valid = true;
                this.setVisible(false);
                tf_nombreapellido_login.setText("");
                pf_contrasena_login.setText("");
                if(usuarios.get(cont) instanceof Civiles){
                    lbl_nombreU_Empleados.setText(usuarios.get(cont).getNombre());
                    jd_menu_Empleados.setVisible(true);
                    jd_menu_Empleados.setResizable(true);
                } 
                else if (usuarios.get(cont) instanceof Empleados){
                    lbl_nombreU_Civiles.setText(usuarios.get(cont).getNombre());
                    jd_menu_Civiles.setVisible(true);
                    jd_menu_Civiles.setResizable(true);
                }
            }
        }
        
        ////Validacion para un nombre no valido o contraseña no valida
        if (valid != true){
            tf_nombreapellido_login.setText("");
            pf_contrasena_login.setText("");
            JOptionPane.showMessageDialog(this, "Nombre o contraseña equivocado");
        }
        
        ///Modelo para tabla de usuarios civiles
        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        
        for (int cont = 0; cont < usuarios.size(); cont++) {
            if (usuarios.get(cont) instanceof Civiles){
                String namae = usuarios.get(cont).getNombre();
                namae += " ";
                namae += usuarios.get(cont).getApellido();
                Object [] modelo = {namae,usuarios.get(cont).getNumeroID(),usuarios.get(cont).getFnacimiento()};
                model1.addRow(modelo);
            }
            
        }
        
        DefaultComboBoxModel modelCombo = (DefaultComboBoxModel) jcombo_Empleados.getModel();
        
        ////for para el combobox con numeros de identidad
        for (int cont = 0; cont < usuarios.size(); cont++) {
            if(usuarios.get(cont) instanceof Civiles){
                modelCombo.addElement(usuarios.get(cont));
            }        
        }
        
        ///modelo para table de solo un usuario
        DefaultTableModel model3 = (DefaultTableModel) tbl_usuario_Civil.getModel();
        
        for (int cont = 0; cont < usuarios.size(); cont++) {
            if(usuarios.get(cont) instanceof Civiles && usuarios.get(cont).getNombre().equalsIgnoreCase((lbl_nombreU_Empleados.getText()))){
                String namae = usuarios.get(cont).getNombre();
                namae += " ";
                namae += usuarios.get(cont).getApellido();
                Object [] modelo = {namae,usuarios.get(cont).getNumeroID(),usuarios.get(cont).getFnacimiento()};
                model1.addRow(modelo);
            }
        }
        
        ////////modelo para tabla de tramites de un solo usuario
        DefaultTableModel model4 = (DefaultTableModel) tbl_tramites_Civil.getModel();
        for (int cont = 0; cont < usuarios.size(); cont++) {
            if(usuarios.get(cont) instanceof Civiles && usuarios.get(cont).getNombre().equalsIgnoreCase((lbl_nombreU_Empleados.getText()))){
                Civiles verif = (Civiles) usuarios.get(cont);
                Object [] modelo = {verif.getTramites().get(cont).getNombre(),verif.getTramites().get(cont).getDescripcion(),verif.getTramites().get(cont).getFechaEnv(),verif.getTramites().get(cont).getNumeroID()};
                model1.addRow(modelo);
            }
        }
    }//GEN-LAST:event_bt_loginbutton_loginMouseClicked

    private void bt_cerrarS_EmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cerrarS_EmpleadosMouseClicked
        jd_menu_Empleados.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_bt_cerrarS_EmpleadosMouseClicked

    private void bt_cerrarS_CivilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cerrarS_CivilesMouseClicked
        jd_menu_Civiles.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_bt_cerrarS_CivilesMouseClicked

    private void bt_modif_EmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modif_EmpleadosMouseClicked
        ////metodo de modificar civiles dentro del tab de empleados
        char sexo = 'm';
        if(jRadioButton1.isEnabled()){
            sexo = 'f';
        }
        for (int cont = 0; cont < usuarios.size(); cont++) {
            if(usuarios.get(cont).getNumeroID().equalsIgnoreCase((String) jcombo_Empleados.getSelectedItem())){
                if(tf_modifN_Empleados.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Input invalido un campo esta vacio");
                    break;
                }
                Civiles usuario = new Civiles(tf_modifN_Empleados.getText(),tf_modifA_Empleados.getText(), tf_modifC_Empleados.getText(), tf_modifD_Empleados.getText(), sexo, dch_fechaN_Empleados.getDate());
                usuarios.set(cont, usuario);
            }
        }
        
        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        model1.setRowCount(0);
        
        for (int cont = 0; cont < usuarios.size(); cont++) {
            if (usuarios.get(cont) instanceof Civiles){
                String namae = usuarios.get(cont).getNombre();
                namae += " ";
                namae += usuarios.get(cont).getApellido();
                Object [] modelo = {namae,usuarios.get(cont).getNumeroID(),usuarios.get(cont).getFnacimiento()};
                model1.addRow(modelo);
            }
            
        }
    }//GEN-LAST:event_bt_modif_EmpleadosMouseClicked

    private void tf_nt_CivilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nt_CivilesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nt_CivilesActionPerformed

    private void bt_tramite_CivilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_tramite_CivilesMouseClicked
        ///////////si se pueden ver los tramites en general e igual los de uno solo pero, para guardar un nuevo tramite hay que darle dos veces al boton
        for (int cont = 0; cont < usuarios.size(); cont++) {
            if(usuarios.get(cont) instanceof Civiles && usuarios.get(cont).getNombre().equalsIgnoreCase(lbl_nombreU_Empleados.getText())){
                Civiles verif = (Civiles) usuarios.get(cont);
                verif.getTramites().add(new Tramites(tf_nt_Civiles.getText(), txta_descT_Civiles.getText(), usuarios.get(cont).getNumeroID(), new Date()));
            }
        } 
        
        ////////modelo para tabla de tramites en general
        DefaultTableModel model2 = (DefaultTableModel) tbl_tramites_Civil.getModel();
        for (int cont = 0; cont < usuarios.size(); cont++) {
            if(usuarios.get(cont) instanceof Civiles && usuarios.get(cont).getNombre().equalsIgnoreCase(lbl_nombreU_Empleados.getText())){
                Civiles verif = (Civiles) usuarios.get(cont);
                ////System.out.println(verif.getTramites()); /////probar a ver si guarda el tramite en consola
                if(verif.getTramites().size() >= 1){
                    Object [] modelo = {verif.getTramites().get(cont).getNombre(),verif.getTramites().get(cont).getDescripcion(),verif.getTramites().get(cont).getFechaEnv(),verif.getTramites().get(cont).getNumeroID()};
                    model2.addRow(modelo);
                }              
            }
        }
    }//GEN-LAST:event_bt_tramite_CivilesMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        //////cuando se cambia de tab se vacian los datos
        tf_nt_Civiles.setText("");
        lbl_nombreU_Empleados.setText("");
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    ArrayList <Usuarios> usuarios = new ArrayList();
               
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cerrarS_Civiles;
    private javax.swing.JButton bt_cerrarS_Empleados;
    private javax.swing.ButtonGroup bt_gurpoS_Empleados;
    private javax.swing.JButton bt_loginbutton_login;
    private javax.swing.JButton bt_modif_Empleados;
    private javax.swing.JButton bt_tramite_Civiles;
    private com.toedter.calendar.JDateChooser dch_fechaN_Empleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> jcombo_Empleados;
    private javax.swing.JDialog jd_menu_Civiles;
    private javax.swing.JDialog jd_menu_Empleados;
    private javax.swing.JLabel lbl_nombreU_Civiles;
    private javax.swing.JLabel lbl_nombreU_Empleados;
    private javax.swing.JPasswordField pf_contrasena_login;
    private javax.swing.JTabbedPane tab_modif_Civiles;
    private javax.swing.JTable tbl_tramites_Civil;
    private javax.swing.JTable tbl_usuario_Civil;
    private javax.swing.JTextField tf_modifA_Empleados;
    private javax.swing.JTextField tf_modifC_Empleados;
    private javax.swing.JTextField tf_modifD_Empleados;
    private javax.swing.JTextField tf_modifN_Empleados;
    private javax.swing.JTextField tf_nombreapellido_login;
    private javax.swing.JTextField tf_nt_Civiles;
    private javax.swing.JTextArea txta_descT_Civiles;
    // End of variables declaration//GEN-END:variables
}
