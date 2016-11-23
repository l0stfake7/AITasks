/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aitask1.Forms;

import aitask1.Classes.AITask1;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Bartek
 */
public class JPanelMain extends javax.swing.JPanel {

    
    private final DefaultListModel<String> listModel;
    
    /**
     * Creates new form JPanelMain
     */
    public JPanelMain() {
        listModel = new DefaultListModel<>();
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

        buttonGroupGenerateMethod = new javax.swing.ButtonGroup();
        jButtonGenerate = new javax.swing.JButton();
        jLabelNumbers = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListGenerate = new javax.swing.JList<>();
        jComboBoxNumbers = new javax.swing.JComboBox<>();
        jRadioButtonMethodRecursion = new javax.swing.JRadioButton();
        jRadioButtonMethodLexicographically = new javax.swing.JRadioButton();
        jLabelGenerateMethod = new javax.swing.JLabel();

        jButtonGenerate.setText("Generate!");
        jButtonGenerate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGenerateMouseClicked(evt);
            }
        });

        jLabelNumbers.setText("Type n:");

        jListGenerate.setModel(listModel);
        jScrollPane1.setViewportView(jListGenerate);

        jComboBoxNumbers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        buttonGroupGenerateMethod.add(jRadioButtonMethodRecursion);
        jRadioButtonMethodRecursion.setSelected(true);
        jRadioButtonMethodRecursion.setText("recursion");

        buttonGroupGenerateMethod.add(jRadioButtonMethodLexicographically);
        jRadioButtonMethodLexicographically.setText("lexicographically");

        jLabelGenerateMethod.setText("Generate method:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGenerateMethod)
                            .addComponent(jLabelNumbers))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonMethodRecursion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonMethodLexicographically)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonGenerate))
                            .addComponent(jComboBoxNumbers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumbers)
                    .addComponent(jComboBoxNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelGenerateMethod)
                            .addComponent(jRadioButtonMethodRecursion))
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonMethodLexicographically)
                            .addComponent(jButtonGenerate))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerateMouseClicked
        
        ArrayList<String> result;
        
        //clear listBox
        listModel.removeAllElements();
        
        try {            
            if(jRadioButtonMethodRecursion.isSelected()) {//recursive
               //build n size string from 0 to n
                String source = "";
                int i = 0;
                while(i <= Integer.parseInt(jComboBoxNumbers.getSelectedItem().toString())) {
                    source += i;
                    i++;
                }      
                //calculate
                result = AITask1.GeneratePermutationRecursive(source);
                //show results
                for(String permutation: result) {
                    listModel.addElement(permutation);
                } 
            }
            else {//lexicographically
                //calculate
                //result = AITask1.GeneratePermutationLexicographically(Integer.parseInt(jComboBoxNumbers.getSelectedItem().toString()));
                //show results
                //for(String permutation: result) {
                //    listModel.addElement(permutation);
                //} 
            }            
        }
        catch(NumberFormatException exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage());
        }
        catch(Exception exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage());
        } 
    }//GEN-LAST:event_jButtonGenerateMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGenerateMethod;
    private javax.swing.JButton jButtonGenerate;
    private javax.swing.JComboBox<String> jComboBoxNumbers;
    private javax.swing.JLabel jLabelGenerateMethod;
    private javax.swing.JLabel jLabelNumbers;
    private javax.swing.JList<String> jListGenerate;
    private javax.swing.JRadioButton jRadioButtonMethodLexicographically;
    private javax.swing.JRadioButton jRadioButtonMethodRecursion;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}