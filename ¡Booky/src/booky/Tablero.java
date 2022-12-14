/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package booky;

/**
 *
 * @author Jade González
 */
public class Tablero extends javax.swing.JFrame {

    /**
     * Creates new form Tablero
     */
    public Tablero() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        Principal = new javax.swing.JButton();
        NewAppot = new javax.swing.JButton();
        Agend = new javax.swing.JButton();
        appname = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Cabezal = new javax.swing.JPanel();
        cabez2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(153, 0, 0));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Principal.setBackground(new java.awt.Color(102, 102, 102));
        Principal.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        Principal.setText("Principal");
        Principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrincipalMouseClicked(evt);
            }
        });
        Principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrincipalActionPerformed(evt);
            }
        });
        Menu.add(Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 130, 40));

        NewAppot.setBackground(new java.awt.Color(102, 102, 102));
        NewAppot.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        NewAppot.setText("Nueva Cita");
        Menu.add(NewAppot, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 130, 40));

        Agend.setBackground(new java.awt.Color(102, 102, 102));
        Agend.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        Agend.setText("Agenda");
        Menu.add(Agend, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 130, 40));

        appname.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        appname.setText("¡Booksy");
        Menu.add(appname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 210, 60));

        Fondo.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 550));

        Cabezal.setBackground(new java.awt.Color(102, 102, 102));
        Cabezal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cabez2.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        cabez2.setForeground(new java.awt.Color(255, 255, 255));
        cabez2.setText("GESTIÓN DE CITAS");
        Cabezal.add(cabez2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 380, 40));

        Fondo.add(Cabezal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 620, 120));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 620, 440));

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrincipalActionPerformed
        
    }//GEN-LAST:event_PrincipalActionPerformed

    private void PrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrincipalMouseClicked
       Principal p1 = new Principal();
       p1.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_PrincipalMouseClicked

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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agend;
    private javax.swing.JPanel Cabezal;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton NewAppot;
    private javax.swing.JButton Principal;
    private javax.swing.JLabel appname;
    private javax.swing.JLabel cabez2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
