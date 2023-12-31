
import com.mysql.cj.jdbc.Blob;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Creationanevent extends javax.swing.JFrame {

    /**
     * Creates new form Creatuionanevent
     */
    public Creationanevent() {
        initComponents();
    }
     Connection con;
    PreparedStatement pst;
    ResultSet rs;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TitleTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        SummaryTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dateTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        StatusTextField4 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Creating An Event");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel2.setText("Text of the events");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 124, 104, -1));

        jLabel4.setText("Add Images Here");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 87, 127, -1));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 104, 97, 96));

        jLabel6.setText("Titel for event");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 59, 121, -1));
        jPanel2.add(TitleTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 81, 225, -1));

        SummaryTextArea1.setColumns(20);
        SummaryTextArea1.setRows(5);
        jScrollPane2.setViewportView(SummaryTextArea1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 152, 270, 100));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 479, 137, 45));

        jLabel3.setText("Date");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 43, -1));

        dateTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(dateTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 225, -1));

        jLabel9.setText("Details");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 37, -1));

        jButton3.setText("Choose Image");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 330, -1, -1));

        img.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(3, 3, 3), 1, true));
        jPanel2.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 109, 371, 171));

        jButton6.setText("Clear");
        jButton6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 475, 123, 53));

        StatusTextField4.setColumns(20);
        StatusTextField4.setRows(5);
        jScrollPane1.setViewportView(StatusTextField4);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 290, -1));

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 120, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           try {                                         
            // TODO add your handling code here:
            //getting user input
            String Title = TitleTextField1.getText();
            String Summary = SummaryTextArea1.getText();
            
            String userInputDate = dateTextField2.getText();
            
// Validate the date format (dd/mm/yyyy) and parse it
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

Date parsedDate = dateFormat.parse(userInputDate);
SimpleDateFormat dbDateFormat = new SimpleDateFormat("yyyy-MM-dd");
String dbDate = dbDateFormat.format(parsedDate);



String Status = StatusTextField4.getText();
//for the code
try {
    //storing database detais in SUrl,Spass,SUser
    String SUrl,SUser,SPass;
    SUrl = "jdbc:MySQL://localhost:3306/connector";
    SUser = "root";
    SPass = "Parthavi@1204";
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    //connection to database
    con = DriverManager.getConnection(SUrl,SUser,SPass);
    pst = con.prepareStatement("INSERT INTO connector(Title,Summary,date,Details,Image)values(?,?,?,?,?)");
    //storing data of user input in database
    InputStream is = new FileInputStream(new File(s));
    pst.setString(1, Title);
    pst.setString(2, Summary);
    pst.setString(3, dbDate);
    
    pst.setString(4, Status);
    pst.setBlob(5, is);
    pst.executeUpdate();
    
    JOptionPane.showMessageDialog(null, "Saved successfully");
    
    
    
} catch (ClassNotFoundException ex) {
    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
} catch (SQLException ex) {
    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
} catch (FileNotFoundException ex) {
    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
}


        } catch (ParseException ex) {
            Logger.getLogger(Creationanevent.class.getName()).log(Level.SEVERE, null, ex);
        }
         
                
    }                                        
//resizing imagep from image path
    public ImageIcon ResizeImage(String imgpath){
            ImageIcon MyImage = new ImageIcon(imgpath);
            Image imge = MyImage.getImage();
            Image newImage = imge.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image =new ImageIcon(newImage);
            return image;
        
    }//GEN-LAST:event_jButton1ActionPerformed
String s;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       JFileChooser filechooser = new JFileChooser(); // Create a file chooser dialog

    // Set the default directory to the user's home directory
    filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));

    // Create a filter to allow specific image file extensions
    FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "png", "gif", "jpeg");
    filechooser.addChoosableFileFilter(filter); // Add the filter to the file chooser

    // Show the file chooser dialog and capture the user's choice (approve or cancel)
    int result = filechooser.showSaveDialog(null);

    if (result == JFileChooser.APPROVE_OPTION) {
        // If the user selects a file and clicks "Open" in the file chooser
        File selectedFile = filechooser.getSelectedFile(); // Get the selected file
        String path = selectedFile.getAbsolutePath(); // Get the absolute path of the selected file
        img.setIcon(ResizeImage(path)); // Set the icon of the 'img' component by calling the 'ResizeImage' method with the selected file's path
        s = path; // Store the selected file's path in the 's' variable
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dateTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextField2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //reseting the textfield
        TitleTextField1.setText("");
        SummaryTextArea1.setText("");
        dateTextField2.setText("");
        StatusTextField4.setText("");
        
        img.setIcon(null);
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
    // Storing database details in SUrl, SUser, SPass
    String SUrl, SUser, SPass;
    SUrl = "jdbc:MySQL://localhost:3306/connector";
    SUser = "root";
    SPass = "Parthavi@1204";

    Class.forName("com.mysql.cj.jdbc.Driver");
    // Connection to the database
    con = DriverManager.getConnection(SUrl, SUser, SPass);

    // Assuming you have a unique identifier for the row you want to delete, such as an ID
    String Title = TitleTextField1.getText(); 
    // Prepare and execute the SQL DELETE statement
    String deleteQuery = "DELETE FROM connector WHERE Title = ?";
    pst = con.prepareStatement(deleteQuery);
    pst.setString(1, Title);

    int rowsDeleted = pst.executeUpdate();

    if (rowsDeleted > 0) {
        JOptionPane.showMessageDialog(null, " deleted successfully");
    } else {
        JOptionPane.showMessageDialog(null, "Title not found or couldn't be deleted");
    }
} catch (ClassNotFoundException | SQLException ex) {
    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Creationanevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Creationanevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Creationanevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Creationanevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creationanevent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea StatusTextField4;
    private javax.swing.JTextArea SummaryTextArea1;
    private javax.swing.JTextField TitleTextField1;
    private javax.swing.JTextField dateTextField2;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
