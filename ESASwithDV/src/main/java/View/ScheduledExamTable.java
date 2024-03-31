/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import com.google.protobuf.TextFormat.ParseException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maras
 */
public class ScheduledExamTable extends javax.swing.JFrame {
    
    private static ScheduledExamTable instance;
     public ScheduledExamTable() {
        initComponents();
    }
     
     public Connection getConnection (){
         try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
        System.out.println("Error loading MySQL JDBC driver: " + ex.getMessage());
        return null; // Return null if driver loading fails
    }
    
    Connection con = null;
    try {
      
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam_seat_arrangement_db", "root", "");
    } catch (SQLException ex) {
        System.out.println("Error connecting to database: " + ex.getMessage());
        return null; // Return null if connection fails
    }
    
    return con;
     }
     
  // add row to jtable
    public void addRowToJTable(Object[] rowData) {
        DefaultTableModel model = (DefaultTableModel) examTable.getModel();
        model.insertRow(0, rowData); // insert row at the beginning of the table
    }
     
      public static ScheduledExamTable getInstance() {
        if (instance == null) {
            instance = new ScheduledExamTable();
        }
        return instance;
    }
      
     
      private String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        examTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        examTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Batch", "Year&Semester", "Subject", "Floor", "RoomNo", "SeatNo", "StudentID-from", "StudentID-to", "Date", "TimeSlot"
            }
        ));
        examTable.getTableHeader().setReorderingAllowed(false);
        examTable.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                examTableHierarchyChanged(evt);
            }
        });
        jScrollPane1.setViewportView(examTable);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Insert All ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton1)
                .addGap(307, 307, 307)
                .addComponent(jButton2)
                .addGap(137, 498, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(146, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrangeExamSeats arrangeExamSeats = new ArrangeExamSeats();
       arrangeExamSeats.setVisible(true);
       arrangeExamSeats.setDefaultCloseOperation(arrangeExamSeats.DISPOSE_ON_CLOSE);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try (Connection con = getConnection();
         Statement st = con.createStatement()) {

        DefaultTableModel model = (DefaultTableModel) examTable.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            String selectedBatch = model.getValueAt(i, 0) != null ? model.getValueAt(i, 0).toString() : "";
            String selectedYearSemester = model.getValueAt(i, 1) != null ? model.getValueAt(i, 1).toString() : "";
            String selectedSubject = model.getValueAt(i, 2) != null ? model.getValueAt(i, 2).toString() : "";
            String selectedFloor = model.getValueAt(i, 3) != null ? model.getValueAt(i, 3).toString() : "";
            String selectedRoom = model.getValueAt(i, 4) != null ? model.getValueAt(i, 4).toString() : "";
            String seatNoRange = model.getValueAt(i, 5) != null ? model.getValueAt(i, 5).toString() : "";
            String studentIDfrom = model.getValueAt(i, 6) != null ? model.getValueAt(i, 6).toString() : "";
            String studentIDto = model.getValueAt(i, 7) != null ? model.getValueAt(i, 7).toString() : "";
            String selectedDate = model.getValueAt(i, 8) != null ? model.getValueAt(i, 8).toString() : "";
            String selectedTimeSlot = model.getValueAt(i, 9) != null ? model.getValueAt(i, 9).toString() : "";

            // format the date before inserting into the database
            if (!selectedDate.isEmpty()) {
                try {
                    SimpleDateFormat inputDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
                    Date parsedDate = inputDateFormat.parse(selectedDate);
                    
                    SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String formattedDate = outputDateFormat.format(parsedDate);

                    String sqlQuery = "INSERT INTO scheduled_exam_table (Batch, `Year&Semester`, Subject, Floor, RoomNo, SeatNo, `StudentID-from`, `StudentID-to`, Date, TimeSlot) VALUES ('" + selectedBatch + "', '" + selectedYearSemester + "', '" + selectedSubject + "', '" + selectedFloor + "', '" + selectedRoom + "', '" + seatNoRange + "', '" + studentIDfrom + "', '" + studentIDto + "', '" + formattedDate + "', '" + selectedTimeSlot + "')";

                    st.addBatch(sqlQuery);
                } catch (java.text.ParseException ex) {
                    Logger.getLogger(ScheduledExamTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                
                System.err.println("Empty date string at row " + (i + 1));
            }
        }

        int[] rowInserted = st.executeBatch();
        System.out.println("Data Inserted");
        System.out.println("Number of rows inserted: " + rowInserted.length);

       // show message if data inserted successfully
        JOptionPane.showMessageDialog(this, "Exam Details Inserted Successfully");

    } catch (SQLException ex) {
        Logger.getLogger(ScheduledExamTable.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void examTableHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_examTableHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_examTableHierarchyChanged


    public static void main(String args[]) {
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScheduledExamTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable examTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
