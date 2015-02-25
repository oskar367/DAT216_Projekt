/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author mats
 */
public class ProductListPanel extends javax.swing.JPanel {
    /**
     * Creates new form MainContentPanel
     */
    public ProductListPanel() {
        initComponents();
    }
    
    public void reset() {
        this.removeAll();
    }
    
    public void updateProducts(List<Product> products) {
        this.removeAll();
        
        for (Product product : products) {
            ProductPanel panel = new ProductPanel(product);
            this.add(panel);
        }
        
        this.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.GridLayout(0, 4));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
