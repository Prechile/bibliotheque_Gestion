/*
 *Gestion des inscrit.
 */

package tg.esiba.iua.gestion_bibliotheque.forms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.util.calendar.BaseCalendar.Date;
import tg.esiba.iua.bibliotheque.dao.impl.InscritDao;
import tg.esiba.iua.bibliotheque.entites.Inscrit;
import util.Connexion;


public class GererAdherent extends javax.swing.JFrame {
    
    Statement state;
   DefaultTableModel model = new DefaultTableModel();
    
    InscritDao ins = new InscritDao() {
        @Override
        public Inscrit getAll(Inscrit ins) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Inscrit UpdateInscrit(Inscrit ins) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
   
    /**
     * Creates new form gererAdherent
     * @throws java.sql.SQLException
     */
    public GererAdherent() throws SQLException  {
        initComponents();
         
         
        model.addColumn("id_inscrit");
        model.addColumn("Nom");
        model.addColumn("Prenom");
        model.addColumn("Date_naissance");
        model.addColumn("Rue");
        model.addColumn("Ville");
        model.addColumn("Cp");
        model.addColumn("Email");
        model.addColumn("Telephone");
        
        
        
        
        Connexion con = new Connexion();
    
    try{
        this.state = con.getStatement();
    }catch(SQLException ex){
    Logger.getLogger(GererAdherent.class.getName()).log(Level.SEVERE, null, ex);
    }
        
            ResultSet Rs = state.executeQuery("Select * from inscrit");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("id_inscrit"),Rs.getString("nom"),Rs.getString("prenom"), Rs.getString("date_naissance"), Rs.getString("rue"), Rs.getString("ville"), Rs.getString("cp"), Rs.getString("email"), Rs.getString("tel")});
            }
            
            table.setModel(model);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtrech = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtcontent = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        txtn = new javax.swing.JTextField();
        txtp = new javax.swing.JTextField();
        txtd = new javax.swing.JTextField();
        txtr = new javax.swing.JTextField();
        txtv = new javax.swing.JTextField();
        txtc = new javax.swing.JTextField();
        txte = new javax.swing.JTextField();
        txtt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Recherche par  Nom:");

        txtrech.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tg/esiba/iua/gestion_bibliotheque/images/Seach-icon.png"))); // NOI18N
        jButton1.setText("Recherche");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(204, 204, 204));
        table.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nom", "Prenom", "Date_naissance", "Rue", "Ville", "Cp", "Email", "Telephone"
            }
        ));
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setSelectionBackground(new java.awt.Color(204, 204, 255));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tg/esiba/iua/gestion_bibliotheque/images/refresh-icon.png"))); // NOI18N
        jButton2.setText("Actualiser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tg/esiba/iua/gestion_bibliotheque/images/add-1-icon.png"))); // NOI18N
        jButton3.setText("Ajouter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tg/esiba/iua/gestion_bibliotheque/images/Close-icon.png"))); // NOI18N
        jButton4.setText("Supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tg/esiba/iua/gestion_bibliotheque/images/close-2-icon.png"))); // NOI18N
        jButton5.setText("Annuler");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Identifiant :");

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Modifier");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdActionPerformed(evt);
            }
        });

        txtr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nom");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Prenom");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Date naissance");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Rue");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ville");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Cp");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Email");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Telephone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcontent, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtrech, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton1)))
                .addGap(304, 304, 304))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(52, 52, 52)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel5)
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel6)
                                        .addGap(94, 94, 94)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(110, 110, 110)
                                        .addComponent(jLabel9)
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel10)
                                        .addGap(16, 16, 16))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtr, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtv, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(txte, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jButton2)
                        .addGap(32, 32, 32)
                        .addComponent(jButton3)
                        .addGap(31, 31, 31)
                        .addComponent(jButton4)
                        .addGap(41, 41, 41)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton5)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtcontent, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtrech, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtv, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
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

    
    /**
     * deplace(): selectionne la ligne d'une tableau
     */
     private void deplace(int i) {
         
         txtcontent.setText(model.getValueAt(i, 0).toString());
         txtn.setText(model.getValueAt(i, 1).toString());
         txtp.setText(model.getValueAt(i,2).toString());
         txtd.setText(model.getValueAt(i, 3).toString());
         txtr.setText(model.getValueAt(i, 4).toString());
         txtv.setText(model.getValueAt(i, 5).toString());
         txtc.setText(model.getValueAt(i, 6).toString());
         txte.setText(model.getValueAt(i, 7).toString());
         txtt.setText(model.getValueAt(i, 8).toString());
        
        try {

        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "erreur de deplacement" + e.getLocalizedMessage());
        }
    }
    
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Adherent ad=new Adherent();
        ad.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    
    /**
     * appelle de la methode Remove pour supprimer une personne a partir de son identifiant.
     * @param a :convertie en entier la valeur recuperer de id.
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        int a=Integer.parseInt(txtcontent.getText());
        ins.RemoveId(a);
     
        model.setRowCount(0);
        try {
            

            ResultSet Rs = state.executeQuery("Select * from inscrit");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("id_inscrit"),Rs.getString("nom"),Rs.getString("prenom"), Rs.getString("date_naissance"), Rs.getString("rue"), Rs.getString("ville"), Rs.getString("cp"), Rs.getString("email"), Rs.getString("tel")});
            }
            
            table.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(GererAdherent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    
    /**
     * @param j:permet de parcourir la ligne selectionner.
    */
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        
         try {

            int j = table.getSelectedRow();
            deplace(j);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur de deplacement" + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_tableMouseClicked

    /**
     * Actualise le tableau contenant les membres.
     */
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        model.setRowCount(0);
        try {
            

            ResultSet Rs = state.executeQuery("Select * from inscrit");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("id_inscrit"),Rs.getString("nom"),Rs.getString("prenom"), Rs.getString("date_naissance"), Rs.getString("rue"), Rs.getString("ville"), Rs.getString("cp"), Rs.getString("email"), Rs.getString("tel")});
            }
            
            table.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(GererAdherent.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     *Rechercher par Nom
     */
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//String n=txtrech.getText();
//         ins.recherche(n);
         //table.setModel(ins.recherche(n));
       model.setRowCount(0);
       String n=txtrech.getText();
        try {
            ResultSet Rs=state.executeQuery("Select* from inscrit where nom LIKE '"+n+"%' ");
            while(Rs.next()){
                model.addRow(new Object[]{Rs.getString("id_inscrit"),Rs.getString("nom"),Rs.getString("prenom"), Rs.getString("date_naissance"), Rs.getString("rue"), Rs.getString("ville"), Rs.getString("cp"), Rs.getString("email"), Rs.getString("tel")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(GererAdherent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Modification des informations sur un adherent.
     */
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
 // SimpleDateFormat forma = new SimpleDateFormat("dd/MM/yy");
            
            Inscrit inscri= new Inscrit();
            
            String md= txtd.getText();
//  java.util.Date d = forma.parse(md);
            
            String mn= txtn.getText();
            String mp= txtp.getText();
            int i= Integer.parseInt(txtcontent.getText());
            String mr= txtr.getText();
            String mv= txtv.getText();
            String mc= txtc.getText();
            String me= txte.getText();
            int mt=Integer.parseInt(txtt.getText());
            
            
            
            ins.UpdateInscrits(i,mn,mp,me,mt);
            
            
            model.setRowCount(0);
        try {
            

            ResultSet Rs = state.executeQuery("Select * from inscrit");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("id_inscrit"),Rs.getString("nom"),Rs.getString("prenom"), Rs.getString("date_naissance"), Rs.getString("rue"), Rs.getString("ville"), Rs.getString("cp"), Rs.getString("email"), Rs.getString("tel")});
            }
            
            table.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(GererAdherent.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttActionPerformed

    private void txtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GererAdherent().setVisible(true);
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(GererAdherent.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTable table;
    private javax.swing.JTextField txtc;
    private javax.swing.JLabel txtcontent;
    private javax.swing.JTextField txtd;
    private javax.swing.JTextField txte;
    private javax.swing.JTextField txtn;
    private javax.swing.JTextField txtp;
    private javax.swing.JTextField txtr;
    private javax.swing.JTextField txtrech;
    private javax.swing.JTextField txtt;
    private javax.swing.JTextField txtv;
    // End of variables declaration//GEN-END:variables
}
