/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import se.chalmers.ait.dat215.project.Order;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author mats
 */
public class OrderHistoryItem extends javax.swing.JPanel {
    
    private Dimension maximumSize;
    private boolean isToggled = false;
    
    /**
     * Creates new form OrderHistoryItem
     */
    public OrderHistoryItem(Order order) {
        initComponents();
        updateFields(order);
        
//        products.setVisible(false);
    }
    
    public void updateFields(Order order) {
        dateLabel.setText(new SimpleDateFormat("yyyy-MM-dd").format(order.getDate()));
        orderNumberLabel.setText(order.getOrderNumber() + "");
        
        List<ShoppingItem> items = order.getItems();
        itemCountLabel.setText(items.size() + " st");
        
        int price = 0;
        for (ShoppingItem item : items) {
            productList.add(new InlineProductItem(item));
            price += item.getTotal();
        }
        priceLabel.setText(price + " kr");
    }
    
    public void highlight() {
        labels.setBackground(Constants.SOFT_HIGHLIGHT_COLOR);
    }
    
    public void reset() {
        labels.setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wrapper = new javax.swing.JPanel();
        labels = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        orderNumberLabel = new javax.swing.JLabel();
        itemCountLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        infoButton = new javax.swing.JButton();
        products = new javax.swing.JPanel();
        productLabels = new javax.swing.JPanel();
        dateLabel1 = new javax.swing.JLabel();
        orderNumberLabel1 = new javax.swing.JLabel();
        itemCountLabel1 = new javax.swing.JLabel();
        priceLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        productList = new javax.swing.JPanel();

        wrapper.setBackground(Constants.MAIN_BACKGROUND);
        wrapper.setPreferredSize(new java.awt.Dimension(0, 0));

        labels.setBackground(new java.awt.Color(255, 255, 255));
        labels.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        labels.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labels.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelsMouseEntered(evt);
            }
        });

        dateLabel.setText("Datum");
        dateLabel.setMaximumSize(new java.awt.Dimension(100, 16));
        dateLabel.setMinimumSize(new java.awt.Dimension(100, 16));
        dateLabel.setPreferredSize(new java.awt.Dimension(100, 16));
        dateLabel.setSize(new java.awt.Dimension(100, 16));

        orderNumberLabel.setText("Ordernummer");

        itemCountLabel.setText("Antal produkter");

        priceLabel.setText("Pris");

        infoButton.setText("Visa info");

        javax.swing.GroupLayout labelsLayout = new javax.swing.GroupLayout(labels);
        labels.setLayout(labelsLayout);
        labelsLayout.setHorizontalGroup(
            labelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orderNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoButton)
                .addGap(0, 0, 0))
        );
        labelsLayout.setVerticalGroup(
            labelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(orderNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(itemCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(labelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(infoButton))
        );

        products.setBackground(new java.awt.Color(246, 246, 246));
        products.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        productLabels.setBackground(new java.awt.Color(246, 246, 246));

        dateLabel1.setText("Bild");
        dateLabel1.setMaximumSize(new java.awt.Dimension(100, 16));
        dateLabel1.setMinimumSize(new java.awt.Dimension(100, 16));
        dateLabel1.setPreferredSize(new java.awt.Dimension(100, 16));
        dateLabel1.setSize(new java.awt.Dimension(100, 16));

        orderNumberLabel1.setText("Namn");

        itemCountLabel1.setText("Antal");

        priceLabel1.setText("Enhetspris");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Totalt pris");

        javax.swing.GroupLayout productLabelsLayout = new javax.swing.GroupLayout(productLabels);
        productLabels.setLayout(productLabelsLayout);
        productLabelsLayout.setHorizontalGroup(
            productLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productLabelsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orderNumberLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemCountLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priceLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        productLabelsLayout.setVerticalGroup(
            productLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dateLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(orderNumberLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(itemCountLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(priceLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        productList.setBackground(new java.awt.Color(246, 246, 246));
        productList.setLayout(new javax.swing.BoxLayout(productList, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout productsLayout = new javax.swing.GroupLayout(products);
        products.setLayout(productsLayout);
        productsLayout.setHorizontalGroup(
            productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productLabels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(productList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        productsLayout.setVerticalGroup(
            productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productsLayout.createSequentialGroup()
                .addComponent(productLabels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(productList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout wrapperLayout = new javax.swing.GroupLayout(wrapper);
        wrapper.setLayout(wrapperLayout);
        wrapperLayout.setHorizontalGroup(
            wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrapperLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(products, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        wrapperLayout.setVerticalGroup(
            wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrapperLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(labels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(products, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wrapper, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wrapper, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labelsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelsMouseEntered
        highlight();
    }//GEN-LAST:event_labelsMouseEntered

    private void labelsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelsMouseExited
        reset();
    }//GEN-LAST:event_labelsMouseExited

    private void labelsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelsMouseClicked
        products.setVisible(!products.isVisible());
        firePropertyChange("click", null, null);
    }//GEN-LAST:event_labelsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JButton infoButton;
    private javax.swing.JLabel itemCountLabel;
    private javax.swing.JLabel itemCountLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel labels;
    private javax.swing.JLabel orderNumberLabel;
    private javax.swing.JLabel orderNumberLabel1;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel priceLabel1;
    private javax.swing.JPanel productLabels;
    private javax.swing.JPanel productList;
    private javax.swing.JPanel products;
    private javax.swing.JPanel wrapper;
    // End of variables declaration//GEN-END:variables
}
