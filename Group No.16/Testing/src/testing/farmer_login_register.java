/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author sdewr
 */
public class farmer_login_register extends javax.swing.JFrame {

    /**
     * Creates new form farmer_login_register
     */
    public farmer_login_register() {
        initComponents();
        jScrollPane1.setOpaque(false);  //To remove border from jscrollpane
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new scrollbar.ScrollPaneWin11();
        jPanel6 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        city = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        mobileno = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        farmerid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        repassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        jScrollPane1 = new scrollbar.ScrollPaneWin11();
        address = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        farmeridlog = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        passwordlog = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkGradientFocus(1500);
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 204, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkGradientFocus(1500);
        kGradientPanel2.setkStartColor(new java.awt.Color(51, 204, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("CropBuddy");
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 220, 53));

        jLabel7.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("Farmer Register /Login");
        kGradientPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 300, 100));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-farmer-48.png"))); // NOI18N
        kGradientPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 50, 100));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-button-85.png"))); // NOI18N
        back.setText("jLabel4");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        kGradientPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 80));

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 100));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(565, 650));
        jPanel6.setMinimumSize(new java.awt.Dimension(413, 1260));
        jPanel6.setPreferredSize(new java.awt.Dimension(413, 1260));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 204, 255));
        jLabel35.setText("Full Name  :");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 110, 30));

        jLabel36.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 204, 255));
        jLabel36.setText("Email:");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 60, 30));

        jLabel37.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 204, 255));
        jLabel37.setText("Confirm Pasword  :");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 960, -1, 40));

        jLabel38.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 204, 255));
        jLabel38.setText("Password  :");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 860, -1, -1));

        jLabel39.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 204, 255));
        jLabel39.setText("Address:");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, -1, -1));

        jLabel40.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 204, 255));
        jLabel40.setText("City:");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 750, -1, -1));

        username.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel6.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 230, 40));

        email.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel6.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 230, 40));

        city.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "Pune", "Mumbai", "Nagpur", " " }));
        city.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel6.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 790, 110, 40));

        jLabel41.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 204, 255));
        jLabel41.setText("Contact Number :");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, 30));

        mobileno.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        mobileno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel6.add(mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 230, 40));

        jLabel43.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 204, 255));
        jLabel43.setText("Farmer Unique ID:");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 160, -1));

        farmerid.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        farmerid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel6.add(farmerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 160, 40));

        jButton1.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 255));
        jButton1.setText("Register");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1100, 170, 60));

        repassword.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        repassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel6.add(repassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1010, 170, 40));

        password.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel6.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 900, 170, 40));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        address.setColumns(20);
        address.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        address.setRows(5);
        address.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jScrollPane1.setViewportView(address);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 630, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-farmer-64.png"))); // NOI18N
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 70, 70));

        jScrollPane2.setViewportView(jPanel6);

        jTabbedPane2.addTab("tab1", jScrollPane2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 204, 255));
        jLabel45.setText("PASSWORD:");
        jPanel3.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, 40));

        farmeridlog.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        farmeridlog.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        farmeridlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmeridlogActionPerformed(evt);
            }
        });
        jPanel3.add(farmeridlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 200, 40));

        jButton2.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 204, 255));
        jButton2.setText("Login");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 90, 50));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setText(" farmer unnique id  :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, 40));

        passwordlog.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        passwordlog.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel3.add(passwordlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 200, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-farmer-64.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 70, 60));

        jTabbedPane2.addTab("tab2", jPanel3);

        kGradientPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 400, 560));

        jLabel5.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sell your  yeild ");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 320, 50));

        jLabel6.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("without any platform fee");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 340, 50));

        kGradientPanel3.setkGradientFocus(150);
        kGradientPanel3.setkStartColor(new java.awt.Color(51, 204, 255));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("login");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kGradientPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 200, 50));

        kGradientPanel4.setkGradientFocus(150);
        kGradientPanel4.setkStartColor(new java.awt.Color(51, 204, 255));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("register");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kGradientPanel1.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 200, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Username,Email,Password,mobile_no,FarmerUniqueId,Address,City,Repassword,query;
        String SUrl,SUser,SPass;
        SUrl = "jdbc:MySQL://localhost:3306/info";
        SUser = "root";
        SPass = "1234567890";
        
        try{
           Class.forName("com.mysql.jdbc.Driver"); 
           Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
           Statement st = con.createStatement();
           if("".equals(username.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Username is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
               
           }else  if("".equals(email.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Email is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("".equals(farmerid.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Farmer Id is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("".equals(mobileno.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Mobile no is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("".equals(address.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Address is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("".equals(city.getSelectedItem().toString())){
               JOptionPane.showMessageDialog(new JFrame(), "City is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           } else if("".equals(password.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else{
               Username = username.getText();
               mobile_no = mobileno.getText();
               Email = email.getText();
               Password = password.getText();
               Address = address.getText();
               City = city.getSelectedItem().toString();
               Repassword  = repassword.getText();
               FarmerUniqueId = farmerid.getText();
               query = "INSERT INTO farmer(username,mobileno,email,pass,city,address,re_pass,farmeruniqueid)"+
                       "VALUES('"+Username+"', '"+mobile_no+"' , '"+Email+"' , '"+Password+"','"+City+"','"+Address+"','"+Repassword+"','"+FarmerUniqueId+"')";
                st.execute(query);
                username.setText("");
                mobileno.setText("");
                email.setText("");
                password.setText("");
                address.setText("");
                city.setSelectedItem("--select city--");
                repassword.setText("");
                farmerid.setText("");
                showMessageDialog(null, "New account has been created successfully!");
                
           }
               
           }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void farmeridlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmeridlogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_farmeridlogActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String FarmerUniqueId, Password, query,Usernamedb,emaildb,mobiledb,addressdb,citydb, passDb = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/info";
        SUser = "root";
        SPass = "1234567890";
        Usernamedb = null;
        emaildb = null;
        mobiledb = null;
        addressdb = null;
        citydb = null;
        int notFound = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(farmeridlog.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Farmer ID is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(passwordlog.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else {
            FarmerUniqueId = farmeridlog.getText();
            Password = passwordlog.getText();
            
            query = "SELECT * FROM farmer WHERE farmeruniqueid= '"+FarmerUniqueId+"'";
       
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                passDb = rs.getString("pass");
                Usernamedb = rs.getString("username");
                emaildb = rs.getString("email");
                mobiledb = rs.getString("mobileno");
                addressdb = rs.getString("address");
                citydb = rs.getString("city");
                notFound = 1;
            }
            if(notFound == 1 && Password.equals(passDb)){
                successfullfarm sf = new successfullfarm();
                sf.show();
                dispose();
//                showMessageDialog(null, "Login Successfully!");
//                DashboardFarmer ds = new DashboardFarmer();
//                ds.show();
//                dispose();
                
            }else{
               JOptionPane.showMessageDialog(new JFrame(), "Incorrect username or password", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            
            }
        }catch(Exception e){
           System.out.println("Error!" + e.getMessage()); 
        }
        
        try {
            SUrl = "jdbc:MySQL://localhost:3306/info";
            SUser = "root";
            SPass = "1234567890";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            Statement st = con.createStatement();
            FarmerUniqueId = farmeridlog.getText();
            query = "INSERT INTO logfarmer (fid)" + "VALUES('"+FarmerUniqueId+"')";
            st.execute(query);
            passwordlog.setText("");
            farmeridlog.setText("");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User_Login_Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(User_Login_Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        home_page1 hp = new home_page1();
        hp.show();
        dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(farmer_login_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(farmer_login_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(farmer_login_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(farmer_login_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new farmer_login_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JLabel back;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JTextField email;
    private javax.swing.JTextField farmerid;
    private javax.swing.JTextField farmeridlog;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JTextField mobileno;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField passwordlog;
    private javax.swing.JPasswordField repassword;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
