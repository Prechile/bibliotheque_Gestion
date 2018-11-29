/*
 *Gestion des livres.
 */

package tg.esiba.iua.gestion_bibliotheque.forms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tg.esiba.gestion_bibliotheque.reports.LivresReport;
import tg.esiba.iua.bibliotheque.dao.impl.InscritDao;
import tg.esiba.iua.bibliotheque.dao.impl.LivreDao;
import tg.esiba.iua.bibliotheque.entites.Inscrit;
import tg.esiba.iua.bibliotheque.entites.Livre;
import util.Connexion;

/**
 *
 * @author BILALI FOFANA
 */
public class GererLivre extends javax.swing.JFrame { 

   Statement state;
    DefaultTableModel model = new DefaultTableModel();
    
    LivreDao liv = new LivreDao() {
       @Override
       public Livre getAll(Livre livre) {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }

       @Override
       public List<Livre> getAll() {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }
   };
    
    
    public GererLivre() throws SQLException {
        initComponents();
       // addrowtable();
        
        model.addColumn("id_livre");
        model.addColumn("Titre_livre");
        model.addColumn("Code du livre");
        model.addColumn("Nombre de page");
        model.addColumn("Annee");
        model.addColumn("Categorie");
        model.addColumn("Resume");
       
        
        
        Connexion con = new Connexion();
    
    try{
        this.state = con.getStatement();
    }catch(SQLException ex){
    Logger.getLogger(GererAdherent.class.getName()).log(Level.SEVERE, null, ex);
    }
        
            ResultSet Rs = state.executeQuery("Select * from livre");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("id_livre"),Rs.getString("titre"),Rs.getString("code"), Rs.getString("page"), Rs.getString("annee"), Rs.getString("categorie"), Rs.getString("resume")});
            }
            
            table_livre.setModel(model);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txttitre = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_livre = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        txtid = new javax.swing.JLabel();
        txtt = new javax.swing.JTextField();
        txtc = new javax.swing.JTextField();
        txtn = new javax.swing.JTextField();
        txta = new javax.swing.JTextField();
        txtca = new javax.swing.JTextField();
        txtr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Categorie");

        txtcat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton1.setText("Categorie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Recherche par titre");

        txttitre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton2.setText("Recherche");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        table_livre.setBackground(new java.awt.Color(204, 204, 204));
        table_livre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Identifiant", "Titre du livre", "Code du livre", "Nombre de page", "Annee", "Categorie", "Resume"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_livre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_livreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_livre);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tg/esiba/iua/gestion_bibliotheque/images/refresh-icon.png"))); // NOI18N
        jButton3.setText("Actualiser");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tg/esiba/iua/gestion_bibliotheque/images/add-1-icon.png"))); // NOI18N
        jButton4.setText("Ajouter livre");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Modifier livre");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tg/esiba/iua/gestion_bibliotheque/images/Close-icon.png"))); // NOI18N
        jButton6.setText("Supprimer livre");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tg/esiba/iua/gestion_bibliotheque/images/print-icon.png"))); // NOI18N
        jButton7.setText("Imprimer livre");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tg/esiba/iua/gestion_bibliotheque/images/close-2-icon.png"))); // NOI18N
        jButton8.setText("Annuler");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        txtid.setText("Id");

        txtt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttActionPerformed(evt);
            }
        });

        txtc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcActionPerformed(evt);
            }
        });

        txtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Titre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Code");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Annee");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Categorie");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Resume");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtt)
                                    .addComponent(jButton3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4)
                                        .addGap(56, 56, 56)
                                        .addComponent(jButton5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtca, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3)
                                .addGap(137, 137, 137)
                                .addComponent(jLabel4)
                                .addGap(119, 119, 119)
                                .addComponent(jLabel5)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel6)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel7)
                                .addGap(110, 110, 110)
                                .addComponent(jLabel8)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtcat, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton1)
                                        .addGap(48, 48, 48)
                                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(txttitre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addGap(216, 216, 216)))))
                        .addGap(75, 75, 75))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(txtid)
                    .addComponent(txttitre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
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

    
//    public void addrowtable(){
//        
//         //DefaultTableModel model = new DefaultTableModel();
//         ArrayList<Livre> liste= liv.list_Livre();
//         Object rowData[]= new Object[7];
//         for(int i=0;i< liste.size();i++){
//             rowData[0]=liste.get(i).getIdLivre();
//             rowData[1]=liste.get(i).getTitre();
//             rowData[2]=liste.get(i).getCode_livre();
//             rowData[3]=liste.get(i).getNombre_page();
//             rowData[4]=liste.get(i).getAnnee();
//             rowData[5]=liste.get(i).getCategorie();
//             rowData[6]=liste.get(i).getResume();
//             model.addRow(rowData);
//             
//             table_livre.setModel(model);
//             
//         }
//    }
//    
    
    
    /**
     * La methode deplacer affiche les donnees  d'une ligne selectionnee dans le tableau.
     */
     private void deplace(int i) {
      txtid.setText(model.getValueAt(i, 0).toString());
       txtt.setText(model.getValueAt(i, 1).toString());
         txtc.setText(model.getValueAt(i,2).toString());
         txtn.setText(model.getValueAt(i, 3).toString());
         txta.setText(model.getValueAt(i, 4).toString());
        txtca.setText(model.getValueAt(i, 5).toString());
        txtr.setText(model.getValueAt(i, 6).toString());
//         txte.setText(model.getValueAt(i, 7).toString());
//         txtt.setText(model.getValueAt(i, 8).toString());
        
        try {

        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "erreur de deplacement" + e.getLocalizedMessage());
        }
    }
    
    
    
    
    
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    
    /**
     * Actualiser les donnees dans le tabeau.
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        model.setRowCount(0);
        try {
            

            ResultSet Rs = state.executeQuery("Select * from livre");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("id_livre"),Rs.getString("titre"),Rs.getString("code"), Rs.getString("page"), Rs.getString("annee"), Rs.getString("categorie"), Rs.getString("resume")});
            }
            
            table_livre.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(GererLivre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
         
    }//GEN-LAST:event_jButton5ActionPerformed

    
    /**
     * selectionner une ligne du tableau.
     */
    private void table_livreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_livreMouseClicked
        
        
        try {

            int j = table_livre.getSelectedRow();
            deplace(j);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur de deplacement" + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_table_livreMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        Livres livr = new Livres();
        livr.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    
    /**
     * Supprimer un livre par son identifiant.
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
         int a=Integer.parseInt(txtid.getText());
        liv.RemoveId(a);
        
         model.setRowCount(0);
        try {
            

            ResultSet Rs = state.executeQuery("Select * from livre");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("id_livre"),Rs.getString("titre"),Rs.getString("code"), Rs.getString("page"), Rs.getString("annee"), Rs.getString("categorie"), Rs.getString("resume")});
            }
            
            table_livre.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(GererLivre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * Recherche des livres par categorie.
     */
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
         model.setRowCount(0);
       String c=txtcat.getText();
        try {
            ResultSet Rs=state.executeQuery("Select* from livre where categorie LIKE '"+c+"%' ");
            while(Rs.next()){
                model.addRow(new Object[]{Rs.getString("id_livre"),Rs.getString("titre"),Rs.getString("code"), Rs.getString("page"), Rs.getString("annee"), Rs.getString("categorie"), Rs.getString("resume")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(GererAdherent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    /**
     *  recherche des livres par leur nom.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         model.setRowCount(0);
       String t=txttitre.getText();
        try {
            ResultSet Rs=state.executeQuery("Select* from livre where titre LIKE '"+t+"%' ");
            while(Rs.next()){
                model.addRow(new Object[]{Rs.getString("id_livre"),Rs.getString("titre"),Rs.getString("code"), Rs.getString("page"), Rs.getString("annee"), Rs.getString("categorie"), Rs.getString("resume")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(GererAdherent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        LivresReport imp = new LivresReport(); 
        imp.displayReportListLivre();
    }//GEN-LAST:event_jButton7MouseClicked

    private void txttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttActionPerformed

    private void txtcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcActionPerformed

    
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
            java.util.logging.Logger.getLogger(GererLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GererLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GererLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GererLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GererLivre().setVisible(true);
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(GererLivre.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_livre;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtc;
    private javax.swing.JTextField txtca;
    private javax.swing.JTextField txtcat;
    private javax.swing.JLabel txtid;
    private javax.swing.JTextField txtn;
    private javax.swing.JTextField txtr;
    private javax.swing.JTextField txtt;
    private javax.swing.JTextField txttitre;
    // End of variables declaration//GEN-END:variables
}
