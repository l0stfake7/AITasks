/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aitask1.Forms;

import aitask1.Classes.HetmansProblemSolver;
import aitask1.Classes.PermutationGenerator;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Bartek
 */
public class JPanelMain extends javax.swing.JPanel {

    
    private final DefaultListModel<String> listModeljListGeneratePermutations;
    private final DefaultListModel<String> listModeljListGeneratePermutationsHetman;    
    private final ListSelectionListener listSelectionListener;
    private ArrayList<String> firstResult;
    private ArrayList<String> secondResult;
    
    /**
     * Creates new form JPanelMain
     */
    public JPanelMain() {
        
        listModeljListGeneratePermutations = new DefaultListModel<>();
        listModeljListGeneratePermutationsHetman = new DefaultListModel<>();
        
        initComponents(); 
        
        this.listSelectionListener = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                
                boolean adjust = listSelectionEvent.getValueIsAdjusting();
                
                if (!adjust) {
                    JList list = (JList) listSelectionEvent.getSource();
                    int selection = list.getSelectedIndex();
                    JOptionPane.showMessageDialog(null, secondResult.get(selection));
                }
            }
        };
        jListGeneratePermutationsHetman.addListSelectionListener(listSelectionListener);
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
        jListGeneratePermutations = new javax.swing.JList<>();
        jComboBoxNumbers = new javax.swing.JComboBox<>();
        jRadioButtonMethodRecursion = new javax.swing.JRadioButton();
        jRadioButtonMethodLexicographically = new javax.swing.JRadioButton();
        jLabelGenerateMethod = new javax.swing.JLabel();
        jCheckBoxValidResults = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListGeneratePermutationsHetman = new javax.swing.JList<>();

        jButtonGenerate.setText("Generate!");
        jButtonGenerate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGenerateMouseClicked(evt);
            }
        });

        jLabelNumbers.setText("Type n:");

        jListGeneratePermutations.setModel(listModeljListGeneratePermutations);
        jScrollPane1.setViewportView(jListGeneratePermutations);

        jComboBoxNumbers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        buttonGroupGenerateMethod.add(jRadioButtonMethodRecursion);
        jRadioButtonMethodRecursion.setSelected(true);
        jRadioButtonMethodRecursion.setText("recursion");

        buttonGroupGenerateMethod.add(jRadioButtonMethodLexicographically);
        jRadioButtonMethodLexicographically.setText("lexicographically");

        jLabelGenerateMethod.setText("Generate method:");

        jCheckBoxValidResults.setText("8 hetmans problem solve");

        jListGeneratePermutationsHetman.setModel(listModeljListGeneratePermutationsHetman);
        jListGeneratePermutationsHetman.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(jListGeneratePermutationsHetman);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGenerateMethod)
                            .addComponent(jLabelNumbers))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonMethodRecursion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonMethodLexicographically))
                            .addComponent(jComboBoxNumbers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBoxValidResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumbers)
                    .addComponent(jComboBoxNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxValidResults))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelGenerateMethod)
                        .addComponent(jRadioButtonMethodRecursion))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonMethodLexicographically)
                        .addComponent(jButtonGenerate)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerateMouseClicked
        
        try {  
            firstResult = new ArrayList<>();
            secondResult = new ArrayList<>();
            StringBuilder stringBuilder;
            long counter = 0;
            //clear listBox
            listModeljListGeneratePermutations.removeAllElements();
            listModeljListGeneratePermutationsHetman.removeAllElements();
            
            
            if(jRadioButtonMethodRecursion.isSelected()) {//recursive
               //build n size string from 0 to n
                String source = "";
                int i = 1;
                while(i <= Integer.parseInt(jComboBoxNumbers.getSelectedItem().toString())) {
                    source += i;
                    i++;
                }      
                //calculate
                firstResult = PermutationGenerator.GeneratePermutationRecursive(source);     
            }
            else {//lexicographically
                //calculate
                firstResult = PermutationGenerator.GeneratePermutationLexicographically(Integer.parseInt(jComboBoxNumbers.getSelectedItem().toString()));              
            } 
            
            //show results
            
            for(String permutation: firstResult) {
                counter++;
                stringBuilder = new StringBuilder("");
                stringBuilder.append(counter);
                stringBuilder.append(" = {");
                for (int i = 0; i < permutation.length(); i++){
                    stringBuilder.append(permutation.charAt(i));
                    if(i < permutation.length() -1)
                        stringBuilder.append(",");
                }
                stringBuilder.append("}");
                listModeljListGeneratePermutations.addElement(stringBuilder.toString());
                
            }    
            counter = 0;
            
            if(jCheckBoxValidResults.isSelected()) {//8 hetmans problem solve
                
                secondResult = HetmansProblemSolver.validPermutations(firstResult);
                //show results
                for(String permutation: secondResult) {
                    counter++;
                    stringBuilder = new StringBuilder("");
                    stringBuilder.append(counter);
                    stringBuilder.append(" = {");
                    for (int i = 0; i < permutation.length(); i++){
                        stringBuilder.append(permutation.charAt(i));
                        if(i < permutation.length() -1)
                            stringBuilder.append(",");
                    }
                    stringBuilder.append("}");
                    listModeljListGeneratePermutationsHetman.addElement(stringBuilder.toString());
                
                }   
            }
        }
        catch(NumberFormatException exc) {
            JOptionPane.showMessageDialog(null, "whaaaat?" + exc.toString());
        }
        catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "whaaaaaaaat?" + exc.toString());
        } 
    }//GEN-LAST:event_jButtonGenerateMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGenerateMethod;
    private javax.swing.JButton jButtonGenerate;
    private javax.swing.JCheckBox jCheckBoxValidResults;
    private javax.swing.JComboBox<String> jComboBoxNumbers;
    private javax.swing.JLabel jLabelGenerateMethod;
    private javax.swing.JLabel jLabelNumbers;
    private javax.swing.JList<String> jListGeneratePermutations;
    private javax.swing.JList<String> jListGeneratePermutationsHetman;
    private javax.swing.JRadioButton jRadioButtonMethodLexicographically;
    private javax.swing.JRadioButton jRadioButtonMethodRecursion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
