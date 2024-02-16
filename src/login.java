
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


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
        jd_menu_Civiles = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        lbl_nombreU_Civiles = new javax.swing.JLabel();
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

        javax.swing.GroupLayout jd_menu_EmpleadosLayout = new javax.swing.GroupLayout(jd_menu_Empleados.getContentPane());
        jd_menu_Empleados.getContentPane().setLayout(jd_menu_EmpleadosLayout);
        jd_menu_EmpleadosLayout.setHorizontalGroup(
            jd_menu_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menu_EmpleadosLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_nombreU_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(457, Short.MAX_VALUE))
        );
        jd_menu_EmpleadosLayout.setVerticalGroup(
            jd_menu_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menu_EmpleadosLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jd_menu_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_nombreU_Empleados))
                .addContainerGap(425, Short.MAX_VALUE))
        );

        jd_menu_Civiles.setMaximumSize(new java.awt.Dimension(786, 503));
        jd_menu_Civiles.setMinimumSize(new java.awt.Dimension(786, 503));
        jd_menu_Civiles.setPreferredSize(new java.awt.Dimension(786, 503));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Bienvenido:");

        lbl_nombreU_Civiles.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        javax.swing.GroupLayout jd_menu_CivilesLayout = new javax.swing.GroupLayout(jd_menu_Civiles.getContentPane());
        jd_menu_Civiles.getContentPane().setLayout(jd_menu_CivilesLayout);
        jd_menu_CivilesLayout.setHorizontalGroup(
            jd_menu_CivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menu_CivilesLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_nombreU_Civiles, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(484, Short.MAX_VALUE))
        );
        jd_menu_CivilesLayout.setVerticalGroup(
            jd_menu_CivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menu_CivilesLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jd_menu_CivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nombreU_Civiles, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(418, Short.MAX_VALUE))
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
        Usuarios u1 = new Empleados("Abogado" , "Jefe", 10, "Juan", "Oraculo", "12524", "Cortes", 'm', new Date(15/10/2020));
        Usuarios u2 = new Civiles ("Paco", "Lepos", "+++", "Francisco Morazan", 'f', new Date(10/3/2021));
        Usuarios u3 = new Civiles ("Irmao", "Fernandez", "51264", "Comayagua", 'f', new Date(10/5/2019));
        
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        boolean valid = false;
        
        String [] name = tf_nombreapellido_login.getText().split(" ");
        
        for (int cont = 0; cont < usuarios.size(); cont++) {        
            if(name[0].equalsIgnoreCase(usuarios.get(cont).getNombre()) && name[1].equalsIgnoreCase(usuarios.get(cont).getApellido()) && pf_contrasena_login.getText().equalsIgnoreCase(usuarios.get(cont).getContrasena())){
                valid = true;
                this.setVisible(false);
                if(usuarios.get(cont) instanceof Empleados){
                    lbl_nombreU_Empleados.setText(usuarios.get(cont).getNombre());
                    jd_menu_Empleados.setVisible(true);
                    jd_menu_Empleados.setResizable(true);
                } 
                else if (usuarios.get(cont) instanceof Civiles){
                    lbl_nombreU_Civiles.setText(usuarios.get(cont).getNombre());
                    jd_menu_Civiles.setVisible(true);
                    jd_menu_Civiles.setResizable(true);
                }
            }
        }
        
        System.out.println(valid);
        
        if (valid != true){
            tf_nombreapellido_login.setText(" ");
            pf_contrasena_login.setText(" ");
            JOptionPane.showMessageDialog(this, "Nombre o contraseña equivocado");
        }
         
    }//GEN-LAST:event_bt_loginbutton_loginMouseClicked

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
    private javax.swing.JButton bt_loginbutton_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDialog jd_menu_Civiles;
    private javax.swing.JDialog jd_menu_Empleados;
    private javax.swing.JLabel lbl_nombreU_Civiles;
    private javax.swing.JLabel lbl_nombreU_Empleados;
    private javax.swing.JPasswordField pf_contrasena_login;
    private javax.swing.JTextField tf_nombreapellido_login;
    // End of variables declaration//GEN-END:variables
}
