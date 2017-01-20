/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aitask1.Forms;

import aitask1.Classes.*;
import java.awt.Dialog;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Bartek
 */
public class JPanelMain extends javax.swing.JPanel {

    
    private final DefaultListModel<String> listModeljListGeneratePermutations;
    private final DefaultListModel<String> listModeljListGeneratePermutationsHetman;    
    private ArrayList<String> firstResult;
    private ArrayList<String> secondResult; 
    private JPanelDrawChessboard jPanelDrawChessboard;
    private boolean refreshFlag;
    
    /**
     * Creates new form JPanelMain
     */
    public JPanelMain() {
        
        listModeljListGeneratePermutations = new DefaultListModel<>();
        listModeljListGeneratePermutationsHetman = new DefaultListModel<>();
        firstResult = new ArrayList<>();
        secondResult = new ArrayList<>();
        refreshFlag = false;
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
        buttonGroupHetmansProbleSolveType = new javax.swing.ButtonGroup();
        jButtonClear = new javax.swing.JButton();
        jLabelNumbers = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListGeneratePermutations = new javax.swing.JList<>();
        jComboBoxNumbers = new javax.swing.JComboBox<>();
        jRadioButtonMethodRecursion = new javax.swing.JRadioButton();
        jRadioButtonMethodLexicographically = new javax.swing.JRadioButton();
        jLabelGenerateMethod = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListGeneratePermutationsHetman = new javax.swing.JList<>();
        jRadioButtonStandardSolve = new javax.swing.JRadioButton();
        jRadioButtonBacktracingSolve = new javax.swing.JRadioButton();
        jRadioButtonStepestAscentSolve = new javax.swing.JRadioButton();
        jButtonGenerate = new javax.swing.JButton();
        jButtonShow = new javax.swing.JButton();

        jButtonClear.setText("Clear");
        jButtonClear.setMaximumSize(new java.awt.Dimension(59, 23));
        jButtonClear.setMinimumSize(new java.awt.Dimension(59, 23));
        jButtonClear.setPreferredSize(new java.awt.Dimension(59, 23));
        jButtonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClearMouseClicked(evt);
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

        jListGeneratePermutationsHetman.setModel(listModeljListGeneratePermutationsHetman);
        jListGeneratePermutationsHetman.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jListGeneratePermutationsHetman.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListGeneratePermutationsHetmanValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListGeneratePermutationsHetman);

        buttonGroupHetmansProbleSolveType.add(jRadioButtonStandardSolve);
        jRadioButtonStandardSolve.setSelected(true);
        jRadioButtonStandardSolve.setText("8 hetmans problem all solves");
        jRadioButtonStandardSolve.setToolTipText("");
        jRadioButtonStandardSolve.setMargin(new java.awt.Insets(1, 1, 1, 1));

        buttonGroupHetmansProbleSolveType.add(jRadioButtonBacktracingSolve);
        jRadioButtonBacktracingSolve.setText("8 hetmans problem recurrence solve");
        jRadioButtonBacktracingSolve.setMargin(new java.awt.Insets(1, 1, 1, 1));

        buttonGroupHetmansProbleSolveType.add(jRadioButtonStepestAscentSolve);
        jRadioButtonStepestAscentSolve.setText("8 hetmans problem steepest-ascent solve");

        jButtonGenerate.setText("Generate");
        jButtonGenerate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGenerateMouseClicked(evt);
            }
        });

        jButtonShow.setText("Show");
        jButtonShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonShowMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButtonShow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonStepestAscentSolve)
                            .addComponent(jRadioButtonStandardSolve)
                            .addComponent(jRadioButtonBacktracingSolve))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNumbers)
                            .addComponent(jComboBoxNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelGenerateMethod)
                                .addComponent(jRadioButtonMethodRecursion))
                            .addComponent(jRadioButtonMethodLexicographically)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonStandardSolve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonBacktracingSolve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonStepestAscentSolve)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonShow, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearMouseClicked
        
        try {  
            refreshFlag = true;
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
            
            if(jRadioButtonStandardSolve.isSelected()) {//8 hetmans problem solve(all)
                
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
            
            if(jRadioButtonBacktracingSolve.isSelected()) {//8 hetmans problem solve(backtracking)
                
                
            }
            if(jRadioButtonStepestAscentSolve.isSelected()) {//8 hetmans problem solve(steepest-ascent)
                
            }
            
            refreshFlag = false;
        }
        catch(NumberFormatException exc) {
            JOptionPane.showMessageDialog(null, "whaaaat?" + exc.toString());
        }
        catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "whaaaaaaaat?" + exc.toString());
        } 
    }//GEN-LAST:event_jButtonClearMouseClicked

    private void jListGeneratePermutationsHetmanValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListGeneratePermutationsHetmanValueChanged
        
        if(!refreshFlag) {
            jPanelDrawChessboard = new JPanelDrawChessboard(secondResult.get(jListGeneratePermutationsHetman.getSelectedIndex()), Byte.parseByte(jComboBoxNumbers.getSelectedItem().toString()));
            JDialog dialog = null;
            //show 
            if (dialog == null) {
                Window win = SwingUtilities.getWindowAncestor(this);
                if (win != null) {
                    dialog = new JDialog(win, secondResult.get(jListGeneratePermutationsHetman.getSelectedIndex()), Dialog.ModalityType.APPLICATION_MODAL);
                    dialog.getContentPane().add(jPanelDrawChessboard);
                    dialog.setResizable(false);
                    dialog.setSize(Integer.parseInt(jComboBoxNumbers.getSelectedItem().toString()) * 55, Integer.parseInt(jComboBoxNumbers.getSelectedItem().toString()) * 55);                
                    dialog.setLocationRelativeTo(null);
                }
            }

            dialog.setVisible(true); // here the modal dialog takes over
            dialog.pack();
            dialog = null;
        }
    }//GEN-LAST:event_jListGeneratePermutationsHetmanValueChanged

    private void jButtonGenerateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGenerateMouseClicked

    private void jButtonShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonShowMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonShowMouseClicked
/*
            drawPanel = new DrawPanel();
        drawPanel.setSize(600, 600);
        drawPanel.setVisible(true);
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGenerateMethod;
    private javax.swing.ButtonGroup buttonGroupHetmansProbleSolveType;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonGenerate;
    private javax.swing.JButton jButtonShow;
    private javax.swing.JComboBox<String> jComboBoxNumbers;
    private javax.swing.JLabel jLabelGenerateMethod;
    private javax.swing.JLabel jLabelNumbers;
    private javax.swing.JList<String> jListGeneratePermutations;
    private javax.swing.JList<String> jListGeneratePermutationsHetman;
    private javax.swing.JRadioButton jRadioButtonBacktracingSolve;
    private javax.swing.JRadioButton jRadioButtonMethodLexicographically;
    private javax.swing.JRadioButton jRadioButtonMethodRecursion;
    private javax.swing.JRadioButton jRadioButtonStandardSolve;
    private javax.swing.JRadioButton jRadioButtonStepestAscentSolve;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
