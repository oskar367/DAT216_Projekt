/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import javax.swing.border.MatteBorder;

/**
 *
 * @author mats
 */
public class MainCategoryItem extends javax.swing.JPanel {
    private MainProductCategory category;
    
    private Color currentColor = Constants.DEFAULT_COLOR;
    private Color currentHoverColor = Constants.HOVER_COLOR;
    private Color currentPressedColor = Constants.PRESSED_COLOR;
    
    private boolean mouseOver = false;
    private boolean mousePressed = false;
    private boolean highlighted = false;

    /**
     * Creates new form MainCategoryItem
     */
    public MainCategoryItem() {
        initComponents();
        
        updateBackgroundColor();
    }
    
    public void setCategory(MainProductCategory category) {
        this.category = category;
        this.categoryName.setText(category.getName());
    }
    
    public MainProductCategory getCategory() {
        return this.category;
    }
    
    public void highlight() {
        highlighted = true;
        
        currentColor = Constants.HIGHLIGHT_COLOR;
        currentHoverColor = Constants.HIGHLIGHT_COLOR;
        currentPressedColor = Constants.HIGHLIGHT_COLOR;
        
        updateBackgroundColor();
    }
    
    public boolean isHighlighted(){
        return highlighted;
    }
    
    private void updateBackgroundColor() {
        if (mousePressed) {
            this.setBackground(currentPressedColor);
        } else if (mouseOver) {
            this.setBackground(currentHoverColor);
        } else {
            this.setBackground(currentColor);
        }
    }
    
    public void reset() {
        currentColor = Constants.DEFAULT_COLOR;
        currentHoverColor = Constants.HOVER_COLOR;
        currentPressedColor = Constants.PRESSED_COLOR;
        
        updateBackgroundColor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categoryName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(120, 60));
        setMinimumSize(new java.awt.Dimension(120, 60));
        setPreferredSize(new java.awt.Dimension(120, 60));
        setSize(new java.awt.Dimension(100, 60));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        categoryName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryName.setText("Recept");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(categoryName, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(categoryName, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        mouseOver = true;
        updateBackgroundColor();
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        mouseOver = false;
        updateBackgroundColor();
    }//GEN-LAST:event_formMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        mousePressed = true;
        updateBackgroundColor();
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        mousePressed = false;
        updateBackgroundColor();
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryName;
    // End of variables declaration//GEN-END:variables
}
