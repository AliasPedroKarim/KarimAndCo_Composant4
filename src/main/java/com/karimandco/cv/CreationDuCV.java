/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.cv;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarah
 */
public class CreationDuCV extends javax.swing.JPanel {
    private ConnexionDB connexionDb = new ConnexionDB();
    private Connection connexion;
    
    public Integer idUtilisateur;

    /**
     * Creates new form CreationDuCV
     */
    public CreationDuCV() {
        initComponents();
        connexion = connexionDb.getConnnexion();
        idUtilisateur = 1;
        try {
            chargerCV();
        } catch (SQLException ex) {
            Logger.getLogger(CreationDuCV.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
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
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jProgressBar4 = new javax.swing.JProgressBar();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextFieldMaitrise1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jScrollPane2.setViewportView(jTextPane1);

        jScrollPane4.setViewportView(jTree1);

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

        jLabel2.setText("Maitrise 1  :");

        jLabel5.setText("Maitrise 2 :");

        jLabel6.setText("Maitrise 3 :");

        jLabel7.setText("Maitrise 4 :");

        jTextField1.setText("Titre de la maitrise");

        jTextField2.setText("Titre de la maitrise");

        jTextField3.setText("Titre de la maitrise");

        jTextField4.setText("Titre de la maitrise");

        jTextFieldMaitrise1.setText("Niveau de matrise");
        jTextFieldMaitrise1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMaitrise1KeyReleased(evt);
            }
        });

        jTextField6.setText("Niveau de maitrise");

        jTextField7.setText("Niveau de maitrise");

        jTextField8.setText("Niveau de maitrise");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7))
                            .addComponent(jProgressBar3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8))
                            .addComponent(jProgressBar4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMaitrise, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMaitrise1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(15, 15, 15)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(jLabelTitre)
                            .addComponent(jTextFieldTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jButtonValidationCV, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabelDescription))
                        .addGap(617, 617, 617))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelMaitrise)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMaitrise1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPaneExperiencePro, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTabbedPaneFormation, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jButtonValidationCV, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidationCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonValidationCVMouseClicked

        int reply = JOptionPane.showConfirmDialog(null, "Etes-vous sûr de vouloir enregistrer votre Curriculum Vitae.", "Comfimez l'engistrer", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            this.connexion = this.connexionDb.reconnect();
            createCV();
            
        } else {
            // Message si NON
        }

    }//GEN-LAST:event_jButtonValidationCVMouseClicked

    private void jTextFieldMaitrise1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMaitrise1KeyReleased
        String value = jTextFieldMaitrise1.getText();
        if(!value.equals("") && Integer.parseInt(value) >= 0 && Integer.parseInt(value) <= 100){
            jProgressBar1.setValue(Integer.parseInt(value));
        }
        System.out.println(jProgressBar1.getValue());
    }//GEN-LAST:event_jTextFieldMaitrise1KeyReleased

    public void createCV() {
        
        boolean update = false;
        
        List<Map<String, Object>> cv = null;
        try {
            cv = getCV(idUtilisateur);
            if (cv != null && cv.size() > 0) { update = true; }
        } catch (SQLException ex) { }
        
        Statement req;
        Integer idExperiencePro = null, idFormation = null, res = null;
        // Ici, on récupère les id des dernières occurences insérer dans les tables formation et experience pro
        idExperiencePro = experiencePro1.setEnvoieExperiencePro(update, (update ? (Integer) cv.get(0).get("id_experience_pro") : 0));
        idFormation = formation1.setEnvoieFormation(update, (update ? (Integer) cv.get(0).get("id_formation") : 0)); // Il manquant une methode ici
        
        try {
            // Ici mettre l'id de l'uilisateur
            List<Map<String, Object>> utilisateur = getUtilisateur(idUtilisateur);
            
            if (utilisateur != null && utilisateur.size() > 0) {
                if (idExperiencePro != null && idFormation != null) {

                    String titre = jTextFieldTitre.getText();
                    if (!titre.equals("")) {

                        String description = jTextAreaDescription.getText();

                        if (!description.equals("")) {

                            int maitrise = jProgressBar1.getValue();
                            
                            Integer idUtilisateur = (Integer)utilisateur.get(0).get("id");
                            String signature = utilisateur.get(0).get("nom").toString().toUpperCase() + " " + utilisateur.get(0).get("nom").toString();
                            
                            req = this.connexion.createStatement();
                            
                            if(update){
                                res = req.executeUpdate("UPDATE `cv` SET `titre` = '" + titre + "', `description` = '" + description + "', `maitrise` = '" + maitrise + "' WHERE id = " + cv.get(0).get("id"));
                            }else{
                                res = req.executeUpdate("INSERT INTO `cv` (`id`, `titre`, `description`, `signature`, `maitrise`, `id_utilisateur`, `id_formation`, `id_experience_pro`) "
                                    + "VALUES (NULL, '" + titre + "', '" + description + "', '" + signature + "', '" + maitrise + "', '" + idUtilisateur + "', '" + idFormation + "', '" + idExperiencePro + "');");
                            
                            }
                            if (res != null) { 
                                JOptionPane.showMessageDialog(this, "Curriculum Vitae a été créé avec succès.", "Curriculum Vitae Réussi", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(this, "Une erreur a été détecté lors de la création de votre CV veuillez réessayer.\n"
                                        + "Si le problème persistent veuillez réessayer ultérieurement", "Curriculum Vitae non créé", JOptionPane.WARNING_MESSAGE);
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "Veuillez saisir une description à votre Curriculum Vitae.");
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Il faut impérativement un titre à votre Curriculum Vitae.");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Atention ! Soit formation ou éxpérience professionnel est mal rempli ou incorrect.");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Veuillez saisir une description à votre Curriculum Vitae.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreationDuCV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void chargerCV() throws SQLException{
        List<Map<String, Object>> cv = getCV(idUtilisateur);
        if(cv != null){
            if (cv.size() > 0) {
                jTextFieldTitre.setText((String) cv.get(0).get("titre"));
                jTextAreaDescription.setText((String) cv.get(0).get("description"));
                jProgressBar1.setValue(Integer.parseInt((String) cv.get(0).get("maitrise")));

                List<Map<String, Object>> formation = getFormation(idUtilisateur);
                if (formation.size() > 0) {
                    Map<String, Object> formationData = formation.get(0);
                    formation1.getjTextFieldNomFormation().setText((String) formationData.get("nom"));
                    formation1.getjTextFieldAdresseFormation().setText((String) formationData.get("lieu"));
                    formation1.getjTextAreaDescriptionFormation().setText((String) formationData.get("description"));
                    formation1.getClassDate1().setText((String) formationData.get("annee_debut").toString());
                    formation1.getClassDate2().setText((String) formationData.get("annee_fin").toString());
                }

                List<Map<String, Object>> experiencePro = getExperiencePro(idUtilisateur);
                if (experiencePro.size() > 0) {
                    Map<String, Object> experienceProData = experiencePro.get(0);
                    experiencePro1.getjTextFieldNomEntpExpPro().setText((String) experienceProData.get("entreprise"));
                    experiencePro1.getjTextFieldAdresseExpPro().setText((String) experienceProData.get("adresse"));
                    experiencePro1.getjTextAreaDescriptionExpPro().setText((String) experienceProData.get("description"));
                    experiencePro1.getClassDate1().setText((String) experienceProData.get("annee_debut").toString());
                    experiencePro1.getClassDate2().setText((String) experienceProData.get("annee_fin").toString());
                }
            }
        }
        
    }
    
    // Accesseurs ou mutateurs pour la base de donnée
    
    public List<Map<String, Object>> getUtilisateur(Integer id) throws SQLException {
        if(this.connexion != null){
            Statement req = this.connexion.createStatement();
            ResultSet res = req.executeQuery("SELECT * FROM utilisateurs WHERE id = " + id);

            if (res.isBeforeFirst()) {
                return resultSetToList(res);
            }
        }
        return null;
    }
    
    public List<Map<String, Object>> getCV(Integer id) throws SQLException {
        if(this.connexion != null){
            Statement req = this.connexion.createStatement();
            ResultSet res = req.executeQuery("SELECT * FROM cv WHERE id_utilisateur = " + id);

            if (res.isBeforeFirst()) {
                return resultSetToList(res);
            }
            return null;
        }
        return null;
    }
    
    public List<Map<String, Object>> getFormation(Integer id) throws SQLException {
        List<Map<String, Object>> cv = getCV(id);
        if(cv != null){
            Statement req = this.connexion.createStatement();
            ResultSet res = req.executeQuery("SELECT * FROM formation WHERE id = " + cv.get(0).get("id_formation"));

            if (res.isBeforeFirst()) {
                return resultSetToList(res);
            }
        }
        return null;
    }
    
    public List<Map<String, Object>> getExperiencePro(Integer id) throws SQLException {
        List<Map<String, Object>> cv = getCV(id);
        if(cv != null){
            Statement req = this.connexion.createStatement();
            ResultSet res = req.executeQuery("SELECT * FROM experience_pro WHERE id = " + cv.get(0).get("id_experience_pro"));

            if (res.isBeforeFirst()) {
                return resultSetToList(res);
            }
        }
        return null;
    }
    
    /**
     * Convertir le ResultSet en une liste de cartes, où chaque carte représente 
     * une ligne avec columnNames et columValues
     *
     * @param res
     * @return
     * @throws SQLException
     */
    private List<Map<String, Object>> resultSetToList(ResultSet res) throws SQLException {
        ResultSetMetaData md = res.getMetaData();
        int columns = md.getColumnCount();
        List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
        while (res.next()) {
            Map<String, Object> row = new HashMap<String, Object>(columns);
            for (int i = 1; i <= columns; ++i) {
                row.put(md.getColumnName(i), res.getObject(i));
            }
            rows.add(row);
        }
        return rows;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.karimandco.cv.ExperiencePro experiencePro1;
    private com.karimandco.cv.Formation formation1;
    private javax.swing.JButton jButtonValidationCV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelMaitrise;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPaneExperiencePro;
    private javax.swing.JTabbedPane jTabbedPaneFormation;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextFieldMaitrise1;
    private javax.swing.JTextField jTextFieldTitre;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
