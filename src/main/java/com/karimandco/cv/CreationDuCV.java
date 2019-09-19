/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.cv;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarah
 */
public class CreationDuCV extends javax.swing.JPanel {

    private Connection connexion;
    
    /**
     * Creates new form CreationDuCV
     */
    public CreationDuCV() {
        initComponents();
        connexion = new ConnexionDB().getConnnexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelTitre = new javax.swing.JLabel();
        jTextFieldTitre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPaneFormation = new javax.swing.JTabbedPane();
        formation1 = new com.karimandco.cv.Formation();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPaneExperiencePro = new javax.swing.JTabbedPane();
        experiencePro1 = new com.karimandco.cv.ExperiencePro();
        jLabelDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jButtonValidationCV = new javax.swing.JButton();
        jLabelMaitrise = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMatrise = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Création de votre CV");

        jLabelTitre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitre.setText("Titre du CV");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Vos formations");

        jTabbedPaneFormation.addTab("Formation 1", formation1);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Vos exprérience professionnel");

        jTabbedPaneExperiencePro.addTab("Experience 1", experiencePro1);

        jLabelDescription.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDescription.setText("Description CV");

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescription);

        jButtonValidationCV.setText("Validation création du CV");
        jButtonValidationCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonValidationCVMouseClicked(evt);
            }
        });

        jLabelMaitrise.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelMaitrise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMaitrise.setText("Maitrise");

        jTextAreaMatrise.setColumns(20);
        jTextAreaMatrise.setRows(5);
        jScrollPane2.setViewportView(jTextAreaMatrise);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTabbedPaneFormation, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTabbedPaneExperiencePro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabelDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMaitrise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(jLabelTitre)
                            .addComponent(jTextFieldTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonValidationCV, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabelTitre)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(617, 617, 617))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelDescription)
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMaitrise)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPaneExperiencePro, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTabbedPaneFormation, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonValidationCV, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidationCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonValidationCVMouseClicked
        
        int reply = JOptionPane.showConfirmDialog(null, "Etes-vous sûr de vouloir enregistrer votre Curriculum Vitae.", "Comfimez l'engistrer", JOptionPane.YES_NO_OPTION);
            createCV();
        if (reply == JOptionPane.YES_OPTION) {
          JOptionPane.showMessageDialog(null, "Bravo");
        }
        else {
           // Message si NON
        }
        
    }//GEN-LAST:event_jButtonValidationCVMouseClicked

    public void createCV(){
        Integer idExperiencePro = null, idFormation = null;
        // Ici, on récupère les id des dernières occurences insérer dans les tables formation et experience pro
        idExperiencePro = experiencePro1.setEnvoieExperiencePro();
        // idFormation = formation1.methode(); // Il manquant une methode ici
        
        if(idExperiencePro != null && idFormation != null){
            
            String titre = jTextFieldTitre.getText();
            if(titre.equals("")){
                
                String description = jTextAreaDescription.getText();
                
                if(description.equals("")){
                
                    String maitrise = jTextAreaMatrise.getText();
                    
                    if(maitrise.equals("")){
                
                        

                    }else{
                        JOptionPane.showMessageDialog(this, "Veuillez saisir une metrise à votre Curriculum Vitae.");
                    }

                }else{
                    JOptionPane.showMessageDialog(this, "Veuillez saisir une description à votre Curriculum Vitae.");
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "Il faut impérativement un titre à votre Curriculum Vitae.");
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Atention ! Soit formation ou éxpérience professionnel est mal rempli ou incorrect.");
        }
    }
    
    public boolean verifUtilisateur(Integer id) throws SQLException{
        Statement req = this.connexion.createStatement();
        ResultSet res = req.executeQuery("SELECT * FROM utilisateur WHRERE id = " + id);
        
        if(res.isBeforeFirst()){
            
        }
        return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.karimandco.cv.ExperiencePro experiencePro1;
    private com.karimandco.cv.Formation formation1;
    private javax.swing.JButton jButtonValidationCV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelMaitrise;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneExperiencePro;
    private javax.swing.JTabbedPane jTabbedPaneFormation;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextArea jTextAreaMatrise;
    private javax.swing.JTextField jTextFieldTitre;
    // End of variables declaration//GEN-END:variables
}
