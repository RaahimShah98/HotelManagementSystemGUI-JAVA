/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hotelmanagementsystemproject;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author raahi
 */
public class roomBooking extends javax.swing.JFrame {
    MainPage mainPage = new MainPage();
    roomBooking roomBooking1 = new roomBooking();
     int Index = -1;
     DefaultListModel<String> listModel;
    /**
     * Creates new form roomBooking
     */
    public roomBooking() {
        initComponents();
        
        listModel = new DefaultListModel<>();
        
        for(int i =1 ; i<=100 ; i++){
            if(i<=10){
                listModel.addElement("Room " + i + (" VIP ROOM"));
                continue;
            }
            listModel.addElement("Room " + i);
            roomBookingInfo.setModel(listModel);
            
        }  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        emptyRoomBtn = new javax.swing.JButton();
        customerDetails = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        roomBookingInfo = new javax.swing.JList<>();
        bookRoomBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));

        emptyRoomBtn.setText("Room Empty");
        emptyRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyRoomBtnActionPerformed(evt);
            }
        });

        customerDetails.setText("Enter Customer Name");
        customerDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerDetailsMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                customerDetailsMouseReleased(evt);
            }
        });

        roomBookingInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomBookingInfoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(roomBookingInfo);

        bookRoomBtn1.setText("Book Room");
        bookRoomBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRoomBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emptyRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookRoomBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerDetails)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE))
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(customerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bookRoomBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(emptyRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
   
    private void emptyRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyRoomBtnActionPerformed
        // TODO add your handling code here:
       listModel.setElementAt("Room " + (Index + 1), Index);
       
        
    }//GEN-LAST:event_emptyRoomBtnActionPerformed

    private void bookRoomBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRoomBtn1ActionPerformed
        // TODO add your handling code here:
       
      String customerDetail = customerDetails.getText();
      
      if(customerDetail.equals("")){
          JOptionPane.showMessageDialog(null,"Enter Name of Customer");
          
      }
      else if(Index == -1){
          JOptionPane.showMessageDialog(null,"Select a Room Number");
          
      }
      else{
          if(Index<10){
                listModel.setElementAt("Room " + (Index + 1) + (" VIP ROOM")+" (" + customerDetail+ " ) (BOOKED) Time of Booking: " , Index);
                
            }
          else{
        listModel.setElementAt("Room " + (Index + 1) +" (" + customerDetail+ " ) (BOOKED) Time of Booking: " , Index);
          }
          }
       
    }//GEN-LAST:event_bookRoomBtn1ActionPerformed

    private void roomBookingInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomBookingInfoMouseClicked
        // TODO add your handling code here:
      
       Index = roomBookingInfo.getSelectedIndex();
    }//GEN-LAST:event_roomBookingInfoMouseClicked

    private void customerDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerDetailsMouseClicked
        customerDetails.setText("");
    }//GEN-LAST:event_customerDetailsMouseClicked

    private void customerDetailsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerDetailsMouseReleased
        // TODO add your handling code here:
        customerDetails.setText("Enter User Name");
    }//GEN-LAST:event_customerDetailsMouseReleased

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
            java.util.logging.Logger.getLogger(roomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new roomBooking().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookRoomBtn1;
    private javax.swing.JTextField customerDetails;
    private javax.swing.JButton emptyRoomBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> roomBookingInfo;
    // End of variables declaration//GEN-END:variables
}