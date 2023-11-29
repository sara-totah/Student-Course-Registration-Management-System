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
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saratotah
 */
public class Student_registration extends javax.swing.JFrame {
    private Connection con1;
    private PreparedStatement insert;
    private String url;
    private String username;
    private String password;

    /**
     * Creates new form Student_registration
     */
    public Student_registration() throws Exception {
        initComponents();
        Read();
        
        url = getUrl();
        username = getUsername();
        password = getPassword();
         
        table_update();
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
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        student_id_txt = new javax.swing.JTextField();
        student_major_txt = new javax.swing.JTextField();
        student_name_txt = new javax.swing.JTextField();
        student_mobile_txt = new javax.swing.JTextField();
        student_email_txt = new javax.swing.JTextField();
        student_city_txt = new javax.swing.JTextField();
        student_age_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        student_balance_txt = new javax.swing.JTextField();
        delete_btn = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        students_table = new javax.swing.JTable();
        back_btn = new javax.swing.JButton();

        jButton2.setText("Delete");

        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 36)); // NOI18N
        jLabel1.setText("Student Regestration");

        student_id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_id_txtActionPerformed(evt);
            }
        });

        student_name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_name_txtActionPerformed(evt);
            }
        });

        student_mobile_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_mobile_txtActionPerformed(evt);
            }
        });

        student_city_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_city_txtActionPerformed(evt);
            }
        });

        jLabel2.setText("Student Id");

        jLabel3.setText("Major");

        jLabel4.setText("Student Name");

        jLabel5.setText("Email");

        jLabel6.setText("Mobile");

        jLabel7.setText("Age");

        jLabel8.setText("City");

        jLabel9.setText("Balance");

        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        edit_btn.setText("Edit");
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        students_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student Id", "Name", "Major", "Age", "Email", "Mobile", "City", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        students_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                students_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(students_table);

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
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_btn)
                                .addGap(29, 29, 29)
                                .addComponent(delete_btn)
                                .addGap(30, 30, 30)
                                .addComponent(edit_btn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(student_city_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(student_age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(student_mobile_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(student_email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(student_major_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(student_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(77, 77, 77)
                                    .addComponent(student_id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(student_balance_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_btn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(student_id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(student_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(student_major_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(student_email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(student_mobile_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(student_age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(student_city_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(student_balance_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_btn)
                            .addComponent(delete_btn)
                            .addComponent(edit_btn)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void table_update(){
        int column_num;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
             con1 = DriverManager.getConnection(url,username,password);
            insert = con1.prepareStatement("SELECT * FROM students"); 
            ResultSet rs = insert.executeQuery();
            
            ResultSetMetaData Rss = rs.getMetaData();
            column_num = Rss.getColumnCount();
            
            DefaultTableModel Df = (DefaultTableModel)students_table.getModel();
            Df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                
                for (int i=1; i <= column_num; i++){
                   v2.add(rs.getString("student_id"));
                   v2.add(rs.getString("name"));
                   v2.add(rs.getString("major"));
                   v2.add(rs.getString("age"));
                   v2.add(rs.getString("email"));
                   v2.add(rs.getString("mobile"));
                   v2.add(rs.getString("city"));
                   v2.add(rs.getString("balance"));
                }
                
                Df.addRow(v2);
            }
        }
        
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(course_enrollment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        DefaultTableModel Df = (DefaultTableModel)students_table.getModel();
        int selectedIndex = students_table.getSelectedRow();
        
        try {
            int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            
            String id_txt = student_id_txt.getText();
            String name_txt = student_name_txt.getText();
            String major_txt = student_major_txt.getText();
            String age_txt = student_age_txt.getText();
            String email_txt = student_email_txt.getText();
            String mobile_txt = student_mobile_txt.getText();
            String city_txt = student_city_txt.getText(); 
            String balance_txt = student_balance_txt.getText(); 
            
            Class.forName("com.mysql.jdbc.Driver");
            
             con1 = DriverManager.getConnection(url,username,password);
            insert = con1.prepareStatement("UPDATE students SET name=?, major=?, age=?, email=?, mobile=?, city=?, balance=? WHERE student_id=?"); 
            
            insert.setInt(8, id);
            insert.setString(1, name_txt);
            insert.setString(2, major_txt);
            insert.setString(3, age_txt);
            insert.setString(4, email_txt);
            insert.setString(5,mobile_txt);
            insert.setString(6, city_txt);
            insert.setString(7, balance_txt);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Student Details Updated");
            table_update();
            
            //empty text fields after registering the student
            
            student_id_txt.setText("");
            student_name_txt.setText("");
            student_major_txt.setText("");
            student_age_txt.setText("");
            student_email_txt.setText("");
            student_mobile_txt.setText("");
            student_city_txt.setText("");
            student_balance_txt.setText("");
            
            student_id_txt.requestFocus();
        }
        
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(course_enrollment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_edit_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        String id_txt = student_id_txt.getText();
        String name_txt = student_name_txt.getText();
        String major_txt = student_major_txt.getText();
        String age_txt = student_age_txt.getText();
        String email_txt = student_email_txt.getText();
        String mobile_txt = student_mobile_txt.getText();
        String city_txt = student_city_txt.getText(); 
        String balance_txt = student_balance_txt.getText();  
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
             con1 = DriverManager.getConnection(url,username,password);
            insert = con1.prepareStatement("INSERT INTO students(student_id,name,major,age,email,mobile,city,balance) VALUES (?,?,?,?,?,?,?,?)"); 
            
            insert.setString(1, id_txt);
            insert.setString(2, name_txt);
            insert.setString(3, major_txt);
            insert.setString(4, age_txt);
            insert.setString(5, email_txt);
            insert.setString(6,mobile_txt);
            insert.setString(7, city_txt);
            insert.setString(8, balance_txt);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Student Registered");
            table_update();
            
            //empty text fields after registering the student
            
            student_id_txt.setText("");
            student_name_txt.setText("");
            student_major_txt.setText("");
            student_age_txt.setText("");
            student_email_txt.setText("");
            student_mobile_txt.setText("");
            student_city_txt.setText("");
            student_balance_txt.setText("");
            
            student_id_txt.requestFocus();
        }
        
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(course_enrollment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void student_id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_id_txtActionPerformed

    private void student_name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_name_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_name_txtActionPerformed

    private void student_mobile_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_mobile_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_mobile_txtActionPerformed

    private void student_city_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_city_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_city_txtActionPerformed

    private void students_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_students_tableMouseClicked
        DefaultTableModel Df = (DefaultTableModel)students_table.getModel();
        int selectedIndex = students_table.getSelectedRow();
        
        student_id_txt.setText(Df.getValueAt(selectedIndex, 0).toString());
        student_name_txt.setText(Df.getValueAt(selectedIndex, 1).toString());    
        student_major_txt.setText(Df.getValueAt(selectedIndex, 2).toString());
        student_age_txt.setText(Df.getValueAt(selectedIndex, 3).toString());  
        student_email_txt.setText(Df.getValueAt(selectedIndex, 4).toString());
        student_mobile_txt.setText(Df.getValueAt(selectedIndex, 5).toString());  
        student_city_txt.setText(Df.getValueAt(selectedIndex, 6).toString());
        student_balance_txt.setText(Df.getValueAt(selectedIndex, 7).toString());
    }//GEN-LAST:event_students_tableMouseClicked

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
       DefaultTableModel Df = (DefaultTableModel)students_table.getModel();
        int selectedIndex = students_table.getSelectedRow();

        try {
            int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete this student registration","Warning",JOptionPane.YES_NO_OPTION);
            
            if(dialogResult == JOptionPane.YES_OPTION){
                Class.forName("com.mysql.jdbc.Driver");
            
                con1 = DriverManager.getConnection(url,username,password);
                insert = con1.prepareStatement("DELETE FROM students_enrollment WHERE student_id=?");
                insert = con1.prepareStatement("DELETE FROM students WHERE student_id=?"); 
                
                insert.setInt(1, id);
                
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this,"Student Registartion Process Deleted");
            table_update();
            //empty text fields after enrolling the student
            
            student_id_txt.setText("");
            student_name_txt.setText("");
            student_major_txt.setText("");
            student_age_txt.setText("");
            student_email_txt.setText("");
            student_mobile_txt.setText("");
            student_city_txt.setText("");
            student_balance_txt.setText("");
            
            student_id_txt.requestFocus();
            
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
            java.util.logging.Logger.getLogger(Student_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Student_registration().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Student_registration.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton edit_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField student_age_txt;
    private javax.swing.JTextField student_balance_txt;
    private javax.swing.JTextField student_city_txt;
    private javax.swing.JTextField student_email_txt;
    private javax.swing.JTextField student_id_txt;
    private javax.swing.JTextField student_major_txt;
    private javax.swing.JTextField student_mobile_txt;
    private javax.swing.JTextField student_name_txt;
    private javax.swing.JTable students_table;
    // End of variables declaration//GEN-END:variables
}
