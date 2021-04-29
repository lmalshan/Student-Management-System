package FrontEnd;

import javax.swing.JOptionPane;

import Model.Subject;
import Model.InvalidInputException;
import ServiceLayer.UpdateSubjectService;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class UpdateSubject extends javax.swing.JFrame {

    /**
     * Creates new form SubjectManagement1
     */
    public UpdateSubject() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSubjectName = new javax.swing.JTextField();
        txtSubjectCode = new javax.swing.JTextField();
        ComboYear = new javax.swing.JComboBox();
        ComboSemester = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        homebutton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Subject");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Subject Name :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 80, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Subject Code");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 130, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Year :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 180, 50, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Semester :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 180, 70, 20);
        jPanel1.add(txtSubjectName);
        txtSubjectName.setBounds(170, 80, 288, 30);

        txtSubjectCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubjectCodeActionPerformed(evt);
            }
        });
        jPanel1.add(txtSubjectCode);
        txtSubjectCode.setBounds(170, 130, 288, 30);

        ComboYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st year", "2nd year", "3rd year" }));
        jPanel1.add(ComboYear);
        ComboYear.setBounds(100, 180, 120, 22);

        ComboSemester.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2" }));
        jPanel1.add(ComboSemester);
        ComboSemester.setBounds(330, 180, 120, 22);

        jButton1.setText("Update  Subject");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(110, 240, 289, 30);

        homebutton.setText("Back");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(homebutton);
        homebutton.setBounds(400, 300, 70, 25);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel5.setText("Update Subject");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(180, 10, 120, 30);

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 300, 75, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/500 x 350.JPG"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 500, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if ((!txtSubjectName.getText().isEmpty())
                    && (!txtSubjectCode.getText().isEmpty())) {

                String SubjectName = txtSubjectName.getText();
                int SubjectCode = Integer.parseInt(txtSubjectCode.getText());
             

                String Year = (String) ComboYear.getSelectedItem();
                String Semester = (String) ComboSemester.getSelectedItem();
                
                Subject subject = new Subject(SubjectName, SubjectCode, Year, Semester);

                UpdateSubjectService service1 = new UpdateSubjectService();

                service1.UpdateSubject(subject, SubjectCode);
                
                JOptionPane.showMessageDialog(rootPane, "Updated Successfully");

            } else {
                throw new InvalidInputException();
            }
        } catch (InvalidInputException ex) {

            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        SubjectManagment sm;
        sm = new SubjectManagment();
        sm.setVisible(true);
        close();
    }//GEN-LAST:event_homebuttonActionPerformed

    private void txtSubjectCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubjectCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubjectCodeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtSubjectName.setText(" ");
        txtSubjectCode.setText(" ");
    }//GEN-LAST:event_jButton2ActionPerformed

    public void close() {

        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

    }

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
            java.util.logging.Logger.getLogger(UpdateSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateSubject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboSemester;
    private javax.swing.JComboBox ComboYear;
    private javax.swing.JButton homebutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtSubjectCode;
    private javax.swing.JTextField txtSubjectName;
    // End of variables declaration//GEN-END:variables
}