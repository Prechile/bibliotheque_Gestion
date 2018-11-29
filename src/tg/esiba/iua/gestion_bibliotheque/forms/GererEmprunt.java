/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.esiba.iua.gestion_bibliotheque.forms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tg.esiba.iua.bibliotheque.dao.impl.EmpruntDao;
import tg.esiba.iua.bibliotheque.entites.Emprunt;
import util.Connexion;

/**
 *
 * @author BILALI FOFANA
 */
public class GererEmprunt extends javax.swing.JFrame {

    Statement state;
   DefaultTableModel model = new DefaultTableModel();
    
    EmpruntDao emprunt = new EmpruntDao() {
        @Override
        public Emprunt insertLivre(Emprunt emp) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Emprunt UpdateLivre(Emprunt emp) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Emprunt getAll(Emprunt emp) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    
    /**
     * Creates new form gererEmprunt
     */
    public GererEmprunt() throws SQLException {
        initComponents();
        
        
        model.addColumn("Identifiant");
        model.addColumn("Code livre");
        model.addColumn("Nom");
        model.addColumn("Date emprunt");
        model.addColumn("Delais emprunt");
        
        
        
        
        
        Connexion con = new Connexion();
    
    try{
        this.state = con.getStatement();
    }catch(SQLException ex){
    Logger.getLogger(GererAdherent.class.getName()).log(Level.SEVERE, null, ex);
    }
        
            ResultSet Rs = state.executeQuery("Select * from emprunt");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("id_emp"),Rs.getString("code_liv"),Rs.getString("nom"), Rs.getString("date_emp"), Rs.getString("delais_emp")});
            }
            
            table_emp.setModel(model);
        
    } 
        
        
    
private void deplace(int i) {
         
         txtid.setText(model.getValueAt(i, 0).toString());
         
       try {

        } catch (Exception e) {
           
            JOptionPane.showMessageDialog(null, "erreur de deplacement" + e.getLocalizedMessage());
        }
    }    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_emp = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerer Adherent");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Recherche");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Recherche");

        table_emp.setBackground(new java.awt.Color(204, 204, 204));
        table_emp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table_emp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Code du livre", "Code d'adherent", "Date emprunt", "Date retour"
            }
        ));
        table_emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_empMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_emp);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tg/esiba/iua/gestion_bibliotheque/images/refresh-icon.png"))); // NOI18N
        jButton2.setText("Actualiser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualiser(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tg/esiba/iua/gestion_bibliotheque/images/add-1-icon.png"))); // NOI18N
        jButton3.setText("Ajouter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ajouter(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tg/esiba/iua/gestion_bibliotheque/images/Close-icon.png"))); // NOI18N
        jButton4.setText("Supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Supprimer(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tg/esiba/iua/gestion_bibliotheque/images/close-2-icon.png"))); // NOI18N
        jButton5.setText("Annuler");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Annuler(evt);
            }
        });

        txtid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(231, 231, 231)
                                .addComponent(txtid))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jButton2)
                        .addGap(34, 34, 34)
                        .addComponent(jButton3)
                        .addGap(42, 42, 42)
                        .addComponent(jButton4)
                        .addGap(38, 38, 38)
                        .addComponent(jButton5)))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Annuler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Annuler
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Annuler

    private void Actualiser(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualiser
        // TODO add your handling code here:
         model.setRowCount(0);
        try {
            
ResultSet Rs = state.executeQuery("Select * from emprunt");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("id_emp"),Rs.getString("code_liv"),Rs.getString("nom"), Rs.getString("date_emp"), Rs.getString("delais_emp")});
            }
            
            table_emp.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(GererAdherent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Actualiser

    private void Supprimer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Supprimer
        // TODO add your handling code here:
        int id=Integer.parseInt(txtid.getText());
        emprunt.RemoveId(id);
        
         model.setRowCount(0);
        try {
            
ResultSet Rs = state.executeQuery("Select * from emprunt");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("id_emp"),Rs.getString("code_liv"),Rs.getString("nom"), Rs.getString("date_emp"), Rs.getString("delais_emp")});
            }
            
            table_emp.setModel(model);
        if(JOptionPane.showConfirmDialog (null,"Etes vous  sure de le supprimer ?"
                     ,"Supprimer un etudient",
                  JOptionPane.YES_NO_OPTION ) ==0);
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erreur de deplacement" + ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_Supprimer

    private void table_empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_empMouseClicked
        // TODO add your handling code here:
        try {

            int j = table_emp.getSelectedRow();
            deplace(j);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur de deplacement" + e.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_table_empMouseClicked

    private void Ajouter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ajouter
        Emprunts e=new Emprunts();
        e.setVisible(true);
    }//GEN-LAST:event_Ajouter

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GererEmprunt().setVisible(true);
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(GererEmprunt.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable table_emp;
    private javax.swing.JLabel txtid;
    // End of variables declaration//GEN-END:variables
}
