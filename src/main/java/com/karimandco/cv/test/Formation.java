/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.cv.test;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Sarah
 */
public class Formation extends javax.swing.JPanel {

    private ConnexionDB connexionDb = new ConnexionDB();
    private Connection connexion;
    
    private Integer idFormation = null;
    private Integer idCV = null;

    /**
     * Creates new form formation
     */
    public Formation() {
        initComponents();
        connexion = connexionDb.getConnnexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldAdresseFormation = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelTitre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescriptionFormation = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNomFormation = new javax.swing.JTextField();
        classDate1 = new com.karimandco.cv.test.ClassDate();
        classDate2 = new com.karimandco.cv.test.ClassDate();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lieu de formation");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Date");

        jLabelTitre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitre.setText("Formation");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Description de la formation ");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("à");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Début");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fin");

        jTextAreaDescriptionFormation.setColumns(20);
        jTextAreaDescriptionFormation.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDescriptionFormation);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nom de la formation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldAdresseFormation)
                    .addComponent(jTextFieldNomFormation)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(5, 5, 5))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitre)
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNomFormation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldAdresseFormation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Permet d'envoyé toute les informations d'une formation directement dans la base donnée, 
     * et ensuite la méthode peut soit envoyé null soit le dernier clé id créer
     * 
     * @param args
     * @return Integer | null
     */
    public Integer setEnvoieFormation(Object...args) {
        this.connexion = this.connexionDb.reconnect();
        Statement req;
        Integer res, lastKey = null;
        
        Integer idCV = (Integer) args[0];
        System.out.println("Id CV ici -> " + idCV);

        String formation = jTextFieldNomFormation.getText();

        if (!formation.equals("")) {
            String lieu = jTextFieldAdresseFormation.getText();

            if (!lieu.equals("")) {

                String date_debut = classDate1.getText();
                String date_fin = classDate2.getText();
                if (classDate1.verifDate() && classDate2.verifDate()) {

                    date_debut = date_debut.replaceAll("/", "-");
                    date_fin = date_fin.replaceAll("/", "-");

                    String description = jTextAreaDescriptionFormation.getText();

                    if (this.connexion != null) {
                        try {
                            req = this.connexion.createStatement();
                            
                            if(this.idFormation != null){
                                res = req.executeUpdate("UPDATE `formation` "
                                        + "SET `nom` = '" + formation + "', `lieu` = '" + lieu + "', `description` = '" + description + "', `annee_debut` = '" + date_debut + "', `annee_fin` = '" + date_fin + "' "
                                        + "WHERE id = " + this.idFormation);
                                lastKey = this.idFormation;
                            }else{
                                res = req.executeUpdate("INSERT INTO `formation` (`id`, `nom`, `lieu`, `description`, `annee_debut`, `annee_fin`, `id_cv`) "
                                        + "VALUES (NULL, '" + formation + "', '" + lieu + "', '" + description + "', '" + date_debut + "', '" + date_fin + "', '" + idCV + "');", Statement.RETURN_GENERATED_KEYS);

                                ResultSet rs = req.getGeneratedKeys();
                                if (rs.next()) {
                                    lastKey = rs.getInt(1);
                                    this.idFormation = lastKey;
                                }
                            }

                            System.out.println("Dernière id pour Formation : " + lastKey);
                        } catch (SQLException ex) {
                            Logger.getLogger(ExperiencePro.class.getName()).log(Level.SEVERE, null, ex);
                            this.connexion = null;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "L'un de vos dates de période de formation n'est pas valide.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Veuillez saisir un lieu valide.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez saisir un nom de formation.");
        }
        return lastKey;
    }

    public ClassDate getClassDate1() {
        return classDate1;
    }

    public ClassDate getClassDate2() {
        return classDate2;
    }

    public JTextArea getjTextAreaDescriptionFormation() {
        return jTextAreaDescriptionFormation;
    }

    public JTextField getjTextFieldAdresseFormation() {
        return jTextFieldAdresseFormation;
    }

    public JTextField getjTextFieldNomFormation() {
        return jTextFieldNomFormation;
    }

    public Integer getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(Integer idFormation) {
        this.idFormation = idFormation;
    }

    public Integer getIdCV() {
        return idCV;
    }

    public void setIdCV(Integer idCV) {
        this.idCV = idCV;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.karimandco.cv.test.ClassDate classDate1;
    private com.karimandco.cv.test.ClassDate classDate2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescriptionFormation;
    private javax.swing.JTextField jTextFieldAdresseFormation;
    private javax.swing.JTextField jTextFieldNomFormation;
    // End of variables declaration//GEN-END:variables
}
