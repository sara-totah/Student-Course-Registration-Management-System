/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.studentenrollmentmanager;

import static com.mycompany.studentenrollmentmanager.ReadPropertiesFile.Read;
import static com.mycompany.studentenrollmentmanager.ReadPropertiesFile.getPassword;
import static com.mycompany.studentenrollmentmanager.ReadPropertiesFile.getUrl;
import static com.mycompany.studentenrollmentmanager.ReadPropertiesFile.getUsername;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saratotah
 */
public class course_enrollment extends javax.swing.JFrame {
    private Connection con1;
    private PreparedStatement insert;
    private String url;
    private String username;
    private String password;

    /**
     * Creates new form student_reg
     */
    public course_enrollment() throws Exception {
        initComponents();
        Read();
        
        url = getUrl();
        username = getUsername();
        password = getPassword();
         
        table_update();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        course_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        student_id = new javax.swing.JTextField();
        add_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        course_enrollment_table = new javax.swing.JTable();
        back_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 36)); // NOI18N
        jLabel1.setText("Student Regestration Into Courses");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Register Student Into a Course");

        course_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_idActionPerformed(evt);
            }
        });

        jLabel3.setText("Student Id");

        jLabel4.setText("Course Id");

        student_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_idActionPerformed(evt);
            }
        });

        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        course_enrollment_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enrollment Id", "Student Id", "Couse Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        course_enrollment_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                course_enrollment_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(course_enrollment_table);

        back_btn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_btn)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(58, 58, 58)
                                        .addComponent(student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(58, 58, 58)
                                        .addComponent(course_id, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(add_btn)
                                .addGap(29, 29, 29)
                                .addComponent(delete_btn)))
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_btn)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(student_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(course_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_btn)
                            .addComponent(delete_btn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void table_update(){
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
             con1 = DriverManager.getConnection(url,username,password);
            insert = con1.prepareStatement("SELECT * FROM student_enrollment"); 
            ResultSet rs = insert.executeQuery();
            
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            
            DefaultTableModel Df = (DefaultTableModel)course_enrollment_table.getModel();
            Df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                
                for (int i=1; i<=c; i++){
                   v2.add(rs.getString("enrollment_id"));
                   v2.add(rs.getString("student_id"));
                   v2.add(rs.getString("course_id"));
                }
                
                Df.addRow(v2);
            }
        }
        
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(course_enrollment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        String student_id_txt = student_id.getText();
        String course_id_txt = course_id.getText();
        double fees;
        double balance;

    try {
        Class.forName("com.mysql.jdbc.Driver");

         con1 = DriverManager.getConnection(url,username,password);
        
        // Retrieve course fee
        insert = con1.prepareStatement("SELECT course_fee FROM courses WHERE course_id =?");
        insert.setString(1, course_id_txt);
        ResultSet resultFees = insert.executeQuery();
        if (resultFees.next()) {
            fees = Double.parseDouble(resultFees.getString("course_fee"));
        } else {
            // Handle the case when the course_id is not found
            JOptionPane.showMessageDialog(this, "Course ID not found");
            return;
        }

        // Retrieve student balance
        insert = con1.prepareStatement("SELECT balance FROM students WHERE student_id =?");
        insert.setString(1, student_id_txt);
        ResultSet resultBalance = insert.executeQuery();
        if (resultBalance.next()) {
            balance = Double.parseDouble(resultBalance.getString("balance"));
        } else {
            // Handle the case when the student_id is not found
            JOptionPane.showMessageDialog(this, "Student ID not found");
            return;
        }

        if (balance >= fees) {
            // Continue with enrollment process
            insert = con1.prepareStatement("INSERT INTO student_enrollment(student_id,course_id) VALUES (?,?)");

            insert.setString(1, student_id_txt);
            insert.setString(2, course_id_txt);

            insert.executeUpdate();

            JOptionPane.showMessageDialog(this, "Student Enrolled");
            balance = balance - fees;
            insert = con1.prepareStatement("UPDATE students SET balance=? WHERE student_id=?"); 
            insert.setDouble(1, balance);
            insert.setString(2, student_id_txt);
            insert.executeUpdate();

            table_update();
        } else {
            JOptionPane.showMessageDialog(this, "Student Balance is not enough to register into this course");
        }

        // Empty text fields after enrolling the student
        student_id.setText("");
        course_id.setText("");
        student_id.requestFocus();
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(course_enrollment.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_add_btnActionPerformed

    private void student_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_idActionPerformed

    private void course_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_idActionPerformed

    private void course_enrollment_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_course_enrollment_tableMouseClicked
        DefaultTableModel Df = (DefaultTableModel)course_enrollment_table.getModel();
        int selectedIndex = course_enrollment_table.getSelectedRow();
        
        student_id.setText(Df.getValueAt(selectedIndex, 1).toString());
        course_id.setText(Df.getValueAt(selectedIndex, 2).toString());        
    }//GEN-LAST:event_course_enrollment_tableMouseClicked

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        DefaultTableModel Df = (DefaultTableModel)course_enrollment_table.getModel();
        int selectedIndex = course_enrollment_table.getSelectedRow();

        try {
            int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete this student enrollment","Warning",JOptionPane.YES_NO_OPTION);
            
            if(dialogResult == JOptionPane.YES_OPTION){
                Class.forName("com.mysql.jdbc.Driver");
            
                 con1 = DriverManager.getConnection(url,username,password);
                insert = con1.prepareStatement("DELETE FROM student_enrollment WHERE enrollment_id=?"); 
                
                insert.setInt(1, id);
                
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this,"Enrollment Process Deleted");
            table_update();
            //empty text fields after enrolling the student
            
            student_id.setText("");
            course_id.setText("");
            student_id.requestFocus();
            
            } 
           
        }
        
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(course_enrollment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        new Main().setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

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
            java.util.logging.Logger.getLogger(course_enrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(course_enrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(course_enrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(course_enrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new course_enrollment().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(course_enrollment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JTable course_enrollment_table;
    private javax.swing.JTextField course_id;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField student_id;
    // End of variables declaration//GEN-END:variables
}
