
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Course extends javax.swing.JFrame {

    
    static String id;
    
    public Course() {
        initComponents();
    }
    
    public void getId(String ID){
         
        id = ID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        theory = new javax.swing.JLabel();
        hum3115 = new javax.swing.JButton();
        cse3101 = new javax.swing.JButton();
        cse3103 = new javax.swing.JButton();
        cse3107 = new javax.swing.JButton();
        cse3109 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        cse3100 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cse3108 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cse3110 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        cse3104 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(153, 0, 102));
        title.setText("COURSES IN SEMESTER 3.1");

        theory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        theory.setForeground(new java.awt.Color(102, 0, 102));
        theory.setText("Theory");

        hum3115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hum3115.png"))); // NOI18N
        hum3115.setText("jButton1");
        hum3115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hum3115ActionPerformed(evt);
            }
        });

        cse3101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse3101.jpg"))); // NOI18N
        cse3101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3101ActionPerformed(evt);
            }
        });

        cse3103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse3103.jpg"))); // NOI18N
        cse3103.setText("jButton1");
        cse3103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3103ActionPerformed(evt);
            }
        });

        cse3107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse3107.jpg"))); // NOI18N
        cse3107.setText("jButton2");
        cse3107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3107ActionPerformed(evt);
            }
        });

        cse3109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse3109.png"))); // NOI18N
        cse3109.setText("jButton3");
        cse3109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3109ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("HUM 3115");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("CSE 3101");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("CSE 3103");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("CSE 3107");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 0));
        jLabel5.setText("CSE 3109");

        lab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lab.setForeground(new java.awt.Color(102, 0, 102));
        lab.setText("LAB");

        cse3100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse3100.jpg"))); // NOI18N
        cse3100.setText("jButton1");
        cse3100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3100ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 0));
        jLabel6.setText("CSE 3100");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 51, 0));
        jLabel7.setText("CSE 3104");

        cse3108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse3108.jpg"))); // NOI18N
        cse3108.setText("jButton1");
        cse3108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3108ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("CSE 3108");

        cse3110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse3110.jpg"))); // NOI18N
        cse3110.setText("jButton2");
        cse3110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3110ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 102));
        jLabel9.setText("CSE 3110");

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(153, 0, 153));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        cse3104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cse3104.jpg"))); // NOI18N
        cse3104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3104ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel2)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cse3108, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cse3103, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel5)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(cse3110, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel6)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(theory)
                                    .addComponent(lab))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hum3115, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cse3100, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(back)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cse3101, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cse3104, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel8)
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(218, 218, 218)
                                        .addComponent(cse3107, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(cse3109, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(back)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hum3115, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(theory))
                            .addComponent(cse3101, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cse3103, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cse3107, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cse3109, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cse3100, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cse3108, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cse3110, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lab))
                    .addComponent(cse3104, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(87, 87, 87))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cse3101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3101ActionPerformed
        // TODO add your handling code here:
        
        //id = JOptionPane.showInputDialog(" \"Enter Your Id\" ");
        System.out.println("id: "+id);
        
        if(!id.equals("")){
            
            MyDatabaseHandler db = new MyDatabaseHandler();
            db.connectDatabase();
            
            ResultSet rs = db.testQuerycse3101();
            
            int res = db.checkResultcse3101(rs,id);
        }
    }//GEN-LAST:event_cse3101ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        
        this.hide();
        sLogin f = new sLogin();
        f.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void cse3103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3103ActionPerformed
        // TODO add your handling code here:
        
        //String id = JOptionPane.showInputDialog(" \"Enter Your Id\" ");
        System.out.println("id: "+id);
        
        if(!id.equals("")){
            
            MyDatabaseHandler db = new MyDatabaseHandler();
            db.connectDatabase();
            
            ResultSet rs = db.testQuerycse3103();
            
            int res = db.checkResultcse3103(rs,id);
        }
    }//GEN-LAST:event_cse3103ActionPerformed

    private void cse3107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3107ActionPerformed
        // TODO add your handling code here:
        
        System.out.println("id: "+id);
        
        if(!id.equals("")){
            
            MyDatabaseHandler db = new MyDatabaseHandler();
            db.connectDatabase();
            
            ResultSet rs = db.testQuerycse3107();
            
            int res = db.checkResultcse3107(rs,id);
        }
    }//GEN-LAST:event_cse3107ActionPerformed

    private void hum3115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hum3115ActionPerformed
        // TODO add your handling code here:
        
        System.out.println("id: "+id);
        
        if(!id.equals("")){
            
            MyDatabaseHandler db = new MyDatabaseHandler();
            db.connectDatabase();
            
            ResultSet rs = db.testQueryhum3115();
            
            int res = db.checkResulthum3115(rs,id);
        }
    }//GEN-LAST:event_hum3115ActionPerformed

    private void cse3109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3109ActionPerformed
        // TODO add your handling code here:
        
        System.out.println("id: "+id);
        
        if(!id.equals("")){
            
            MyDatabaseHandler db = new MyDatabaseHandler();
            db.connectDatabase();
            
            ResultSet rs = db.testQuerycse3109();
            
            int res = db.checkResultcse3109(rs,id);
        }
    }//GEN-LAST:event_cse3109ActionPerformed

    private void cse3100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3100ActionPerformed
        // TODO add your handling code here:
        
        System.out.println("id: "+id);
        
        if(!id.equals("")){
            
            MyDatabaseHandler db = new MyDatabaseHandler();
            db.connectDatabase();
            
            ResultSet rs = db.testQuerycse3100();
            
            int res = db.checkResultcse3100(rs,id);
        }
    }//GEN-LAST:event_cse3100ActionPerformed

    private void cse3108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3108ActionPerformed
        // TODO add your handling code here:
        
        System.out.println("id: "+id);
        
        if(!id.equals("")){
            
            MyDatabaseHandler db = new MyDatabaseHandler();
            db.connectDatabase();
            
            ResultSet rs = db.testQuerycse3108();
            
            int res = db.checkResultcse3108(rs,id);
        }
    }//GEN-LAST:event_cse3108ActionPerformed

    private void cse3110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3110ActionPerformed
        
        System.out.println("id: "+id);
        
        if(!id.equals("")){
            
            MyDatabaseHandler db = new MyDatabaseHandler();
            db.connectDatabase();
            
            ResultSet rs = db.testQuerycse3110();
            
            int res = db.checkResultcse3110(rs,id);
        }
    }//GEN-LAST:event_cse3110ActionPerformed

    private void cse3104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3104ActionPerformed
        
        System.out.println("id: "+id);
        
        if(!id.equals("")){
            
            MyDatabaseHandler db = new MyDatabaseHandler();
            db.connectDatabase();
            
            ResultSet rs = db.testQuerycse3104();
            
            int res = db.checkResultcse3104(rs,id);
        }
    }//GEN-LAST:event_cse3104ActionPerformed

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
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton cse3100;
    private javax.swing.JButton cse3101;
    private javax.swing.JButton cse3103;
    private javax.swing.JButton cse3104;
    private javax.swing.JButton cse3107;
    private javax.swing.JButton cse3108;
    private javax.swing.JButton cse3109;
    private javax.swing.JButton cse3110;
    private javax.swing.JButton hum3115;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel theory;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}