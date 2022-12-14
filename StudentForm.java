
import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Preparedc3ment;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;



/**
 *
 * @author Joshua
 */
public class StudentForm extends javax.swing.JFrame {

    /**
     * Creates new form StudentForm
     */
    public StudentForm() {
        initComponents();
          setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultc3="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        sid = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        smobno = new javax.swing.JTextField();
        sgender = new javax.swing.JTextField();
        sfname = new javax.swing.JTextField();
        smname = new javax.swing.JTextField();
        sage = new javax.swing.JTextField();
        sc1 = new javax.swing.JTextField();
        sc2 = new javax.swing.JTextField();
        sc3 = new javax.swing.JTextField();
        sc4 = new javax.swing.JTextField();
        sdob = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student registration");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 20, 350, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 80, 160, 28);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 120, 160, 28);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Mobile No.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 160, 160, 28);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 200, 160, 28);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("Father's Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 240, 160, 28);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("Mother's Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 280, 160, 28);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setText("DOB");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 320, 160, 28);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setText("Age");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 360, 160, 28);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setText("Course 1");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 400, 160, 28);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 255));
        jLabel12.setText("Course 2");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 440, 160, 28);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 255));
        jLabel13.setText("Course 3");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(50, 480, 160, 28);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 255, 255));
        jLabel14.setText("Course 4");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(50, 520, 160, 28);

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(90, 600, 120, 40);

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Exit");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 600, 120, 40);

        sid.setBackground(new java.awt.Color(153, 153, 255));
        sid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sid.setForeground(new java.awt.Color(255, 255, 255));
        sid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(sid);
        sid.setBounds(280, 80, 280, 30);

        sname.setBackground(new java.awt.Color(153, 153, 255));
        sname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sname.setForeground(new java.awt.Color(255, 255, 255));
        sname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(sname);
        sname.setBounds(280, 120, 280, 30);

        smobno.setBackground(new java.awt.Color(153, 153, 255));
        smobno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        smobno.setForeground(new java.awt.Color(255, 255, 255));
        smobno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(smobno);
        smobno.setBounds(280, 160, 280, 30);

        sgender.setBackground(new java.awt.Color(153, 153, 255));
        sgender.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sgender.setForeground(new java.awt.Color(255, 255, 255));
        sgender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(sgender);
        sgender.setBounds(280, 200, 280, 30);

        sfname.setBackground(new java.awt.Color(153, 153, 255));
        sfname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sfname.setForeground(new java.awt.Color(255, 255, 255));
        sfname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(sfname);
        sfname.setBounds(280, 240, 280, 30);

        smname.setBackground(new java.awt.Color(153, 153, 255));
        smname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        smname.setForeground(new java.awt.Color(255, 255, 255));
        smname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(smname);
        smname.setBounds(280, 280, 280, 30);

        sage.setBackground(new java.awt.Color(153, 153, 255));
        sage.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sage.setForeground(new java.awt.Color(255, 255, 255));
        sage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(sage);
        sage.setBounds(280, 360, 280, 30);

        sc1.setBackground(new java.awt.Color(153, 153, 255));
        sc1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sc1.setForeground(new java.awt.Color(255, 255, 255));
        sc1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(sc1);
        sc1.setBounds(280, 400, 280, 30);

        sc2.setBackground(new java.awt.Color(153, 153, 255));
        sc2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sc2.setForeground(new java.awt.Color(255, 255, 255));
        sc2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(sc2);
        sc2.setBounds(280, 440, 280, 30);

        sc3.setBackground(new java.awt.Color(153, 153, 255));
        sc3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sc3.setForeground(new java.awt.Color(255, 255, 255));
        sc3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(sc3);
        sc3.setBounds(280, 480, 280, 30);

        sc4.setBackground(new java.awt.Color(153, 153, 255));
        sc4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sc4.setForeground(new java.awt.Color(255, 255, 255));
        sc4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(sc4);
        sc4.setBounds(280, 520, 280, 30);

        sdob.setBackground(new java.awt.Color(153, 153, 255));
        sdob.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sdob.setForeground(new java.awt.Color(255, 255, 255));
        sdob.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(sdob);
        sdob.setBounds(280, 320, 280, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Student Info");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(830, 20, 220, 40);

        area.setBackground(new java.awt.Color(204, 255, 255));
        area.setColumns(20);
        area.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(670, 80, 0, 0);

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("View");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(740, 600, 120, 40);

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Print");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(990, 600, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/darkblurbg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1250, 830);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1252, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
Class.forName("com.mysql.jdbc.Driver");
                  try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","")) {
                      String sql = "INSERT into studentinfo ( ID	, Name, MobileNo, Gender, FatherName, MotherName, DOB, Age, Course1, Course2, Course3, Course4) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                      Preparedc3ment pst = con.preparec3ment(sql);
                      pst.setString(1, sid.getText());
                      pst.setString(2, sname.getText());
                      pst.setString(3, smobno.getText());
                      pst.setString(4, sgender.getText());
                      pst.setString(5, sfname.getText());
                      pst.setString(6, smname.getText());
                      pst.setString(7, sdob.getText());
                      pst.setString(8, sage.getText());
                      pst.setString(9, sc1.getText());
                      pst.setString(10, sc2.getText());
                      pst.setString(11, sc3.getText());
                      pst.setString(12, sc4.getText());
                      pst.executeUpdate();
                      JOptionPane.showMessageDialog(null,"Data Submitted Sucessfully.....");   
                      
                  }
}   
catch(        HeadlessException | ClassNotFoundException | SQLException e){
    JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try{
             area.setText("******************************************\n");
   area.setText(area.getText()+"                          STUDENT DATA                    \n");
   area.setText(area.getText()+"******************************************\n");
   
   area.setText(area.getText()+"\n");
   
   area.setText(area.getText()+"ID      :  "+sid.getText()+"\n");
   area.setText(area.getText()+"Name        :  "+sname.getText()+"\n");
   area.setText(area.getText()+"Mobile No.      :  "+smobno.getText()+"\n");
   area.setText(area.getText()+"Gender      :  "+sgender.getText()+"\n");
   area.setText(area.getText()+"Father Name     :  "+sfname.getText()+"\n");
   area.setText(area.getText()+"Mother Name      :  "+smname.getText()+"\n");
   area.setText(area.getText()+"DOB     :  "+sdob.getText()+"\n");
   area.setText(area.getText()+"Age     :  "+sage.getText()+"\n");
   area.setText(area.getText()+"Course1       :  "+sc1.getText()+"\n");
   area.setText(area.getText()+"Course2        :  "+sc2.getText()+"\n");
   area.setText(area.getText()+"Course3       :  "+sc3.getText()+"\n");
   area.setText(area.getText()+"Course4        :  "+sc4.getText()+"\n");
       }catch(Exception e){
           System.out.println(e);
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try{
           area.print();
       }catch(PrinterException e){
           System.out.println(e);
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         JDialog.setDefaultLookAndFeelDecorated(true);
       int response = JOptionPane.showConfirmDialog(null,"Do you want to EXIT?",   "Confirm" ,
               JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       if(response == JOptionPane.YES_NO_OPTION){
         setVisible(false);
         Admin a = new Admin();
         a.setVisible(true);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration //GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField sage;
    private javax.swing.JTextField sc1;
    private javax.swing.JTextField sc2;
    private javax.swing.JTextField sdob;
    private javax.swing.JTextField sfname;
    private javax.swing.JTextField smname;
    private javax.swing.JTextField sgender;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField smobno;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField sc4;
    private javax.swing.JTextField sc3;
    // End of variables declaration//GEN-END:variables
}
