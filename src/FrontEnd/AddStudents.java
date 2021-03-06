package FrontEnd;

import javax.swing.JOptionPane;
import Model.Student;
import Model.InvalidInputException;
import ServiceLayer.StudentService;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class AddStudents extends javax.swing.JFrame {

    /**
     * Creates new form form
     */
    public AddStudents() {
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

        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        txtstudentname = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPostalAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ComboALStream = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        ComboALStatus = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        ComboCSUStream = new javax.swing.JComboBox();
        ComboALType = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Student");
        setResizable(false);

        txtstudentname.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Student Name");
        txtstudentname.add(jLabel1);
        jLabel1.setBounds(57, 131, 100, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Select stream");
        txtstudentname.add(jLabel2);
        jLabel2.setBounds(57, 69, 130, 20);
        txtstudentname.add(txtStudentName);
        txtStudentName.setBounds(57, 157, 500, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Contact Number");
        txtstudentname.add(jLabel3);
        jLabel3.setBounds(57, 198, 110, 20);
        txtstudentname.add(txtContactNumber);
        txtContactNumber.setBounds(57, 226, 500, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Email Address");
        txtstudentname.add(jLabel4);
        jLabel4.setBounds(57, 267, 110, 20);
        txtstudentname.add(txtEmailAddress);
        txtEmailAddress.setBounds(57, 291, 500, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Postal Address");
        txtstudentname.add(jLabel5);
        jLabel5.setBounds(57, 332, 120, 20);
        txtstudentname.add(txtPostalAddress);
        txtPostalAddress.setBounds(57, 358, 500, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("National Identity Card Number / Passport");
        txtstudentname.add(jLabel6);
        jLabel6.setBounds(57, 429, 210, 20);
        txtstudentname.add(txtNIC);
        txtNIC.setBounds(57, 455, 500, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("A/L Stream");
        txtstudentname.add(jLabel10);
        jLabel10.setBounds(232, 496, 80, 20);

        ComboALStream.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Art", "Commerce", "Maths", "Bio" }));
        txtstudentname.add(ComboALStream);
        ComboALStream.setBounds(232, 527, 140, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("A/L Status");
        txtstudentname.add(jLabel11);
        jLabel11.setBounds(417, 496, 70, 20);

        ComboALStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 - Pass", "2 - Pass", "3 - Pass", "Pending" }));
        txtstudentname.add(ComboALStatus);
        ComboALStatus.setBounds(417, 527, 140, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("A/L Type");
        txtstudentname.add(jLabel12);
        jLabel12.setBounds(57, 496, 70, 20);

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        txtstudentname.add(jButton3);
        jButton3.setBounds(251, 590, 90, 35);

        ComboCSUStream.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Computing", "Business", "Engineering", "Architecher", "Quantity Surveying" }));
        txtstudentname.add(ComboCSUStream);
        ComboCSUStream.setBounds(57, 100, 220, 22);

        ComboALType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sri Lanka", "London", "Cambridge", "Other" }));
        txtstudentname.add(ComboALType);
        ComboALType.setBounds(57, 527, 140, 22);

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        txtstudentname.add(jButton4);
        jButton4.setBounds(440, 590, 70, 25);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel7.setText("Registration Form");
        txtstudentname.add(jLabel7);
        jLabel7.setBounds(247, 11, 160, 40);

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        txtstudentname.add(jButton1);
        jButton1.setBounds(90, 590, 70, 25);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/620 x 650.JPG"))); // NOI18N
        txtstudentname.add(jLabel8);
        jLabel8.setBounds(0, 0, 620, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtstudentname, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtstudentname, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if ((!txtStudentName.getText().isEmpty())
                    && (!txtContactNumber.getText().isEmpty())
                    && (!txtEmailAddress.getText().isEmpty())
                    && (!txtPostalAddress.getText().isEmpty())
                    && (!txtNIC.getText().isEmpty())) {
                
                String CSUStream = (String) ComboCSUStream.getSelectedItem();
                
                String StudentName = txtStudentName.getText();
                int ContactNo = Integer.parseInt(txtContactNumber.getText());
                String EmailAddress = txtEmailAddress.getText();
                String PostalAddress = txtPostalAddress.getText();
                String NIC = txtNIC.getText();
                String ALStream = (String) ComboALStream.getSelectedItem();
                String ALStatus = (String) ComboALStatus.getSelectedItem();
                String ALType = (String) ComboALType.getSelectedItem();
                
                Student student = new Student(CSUStream, StudentName, ContactNo, EmailAddress, PostalAddress, NIC, ALStream, ALStatus, ALType);
                StudentService service = new StudentService();
                
                service.AddStudent(student);
                
                JOptionPane.showMessageDialog(rootPane, "Submitted Successfully");
                
            } else {
                throw new InvalidInputException();
            }
            
        } catch (InvalidInputException ex) {
            
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
    }//GEN-LAST:event_jButton3ActionPerformed
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        StudentManagement sm;
        sm = new StudentManagement();
        sm.setVisible(true);
        close();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reset();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void close() {

        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

    }
    
    public void reset() {
        txtStudentName.setText(" ");
        txtContactNumber.setText(" ");
        txtEmailAddress.setText(" ");
        txtPostalAddress.setText(" ");
        txtNIC.setText(" ");
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
            java.util.logging.Logger.getLogger(AddStudents.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudents.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudents.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudents.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboALStatus;
    private javax.swing.JComboBox ComboALStream;
    private javax.swing.JComboBox ComboALType;
    private javax.swing.JComboBox ComboCSUStream;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtPostalAddress;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JPanel txtstudentname;
    // End of variables declaration//GEN-END:variables
}
