/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e_canteen;

/**
 *
 * @author Avadhoot
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    /**
     *
     * @param username
     */
    public Dashboard(String username) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1070, 600));
        setMinimumSize(new java.awt.Dimension(1070, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1070, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/u3ze4203 (1).png"))); // NOI18N
        jButton2.setText("Canteen 1");
        jButton2.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 180, 230, 260);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/u3ze4203 (1).png"))); // NOI18N
        jButton1.setText("Canteen 2");
        getContentPane().add(jButton1);
        jButton1.setBounds(700, 180, 230, 260);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("HOME");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 10));

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("PROFILE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, 30));

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 0));
        jButton4.setText("MY ORDERS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 120, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        jButton5.setText("LOGOUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 130, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user (1).png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 30, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add to cart.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 30, 40));

        jToggleButton3.setText("=");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 30, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 230, 600);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Where will you be eating today ?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 60, 340, 100);

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jToggleButton1.setText("CANTEEN 1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(390, 470, 140, 50);

        jToggleButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jToggleButton2.setText("CANTEEN 2");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(750, 470, 140, 50);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("E-Canteen");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel6.setText("jLabel6");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 110, -1));

        getContentPane().add(jPanel4);
        jPanel4.setBounds(230, 0, 840, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new Homepage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Profile ProfileFrame = new Profile();
        String txtUsername = jLabel6.getText();
        ProfileFrame.setVisible(true);
        ProfileFrame.pack();
        ProfileFrame.jLabel2.setText(txtUsername);
        ProfileFrame.setLocationRelativeTo(ProfileFrame);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        Canteen1 Canteen1Frame = new Canteen1();
        String txtUsername = jLabel6.getText();
        Canteen1Frame.setVisible(true);
        Canteen1Frame.pack();
        Canteen1Frame.jLabel7.setText(txtUsername);
        Canteen1Frame.setLocationRelativeTo(Canteen1Frame);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        Canteen2 Canteen2Frame = new Canteen2();
        String txtUsername = jLabel6.getText();
        Canteen2Frame.setVisible(true);
        Canteen2Frame.pack();
        Canteen2Frame.jLabel19.setText(txtUsername);
        Canteen2Frame.setLocationRelativeTo(Canteen2Frame);
        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MyOrders1 MyOrders1Frame = new MyOrders1();
        String txtUsername = jLabel6.getText();
        MyOrders1Frame.setVisible(true);
        MyOrders1Frame.pack();
        MyOrders1Frame.jLabel6.setText(txtUsername);
        MyOrders1Frame.setLocationRelativeTo(MyOrders1Frame);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}
