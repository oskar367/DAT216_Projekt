/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.text.DecimalFormat;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author win8
 */
public class CartItemPanel extends javax.swing.JPanel {

    /**
     * Creates new form cartItemPanel
     *
     * @param item
     */
    public CartItemPanel(ShoppingItem item) {

        initComponents();
        setShoppingItem(item);
        amountSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("here");
                if (listener != null) {
                    if (getAmount() != item.getAmount()) {
                        if(getAmount() > 0) {
                            System.out.println("notify change");
                            listener.amountChanged(item, getAmount());
                        }
                        else {
                            listener.itemRemoved(item);
                        }
                    }
                }
            }
        });

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
        jButton1 = new javax.swing.JButton();
        productNameLabel = new javax.swing.JLabel();
        amountSpinner = new javax.swing.JSpinner();
        productUnitLabel = new javax.swing.JLabel();
        productPriceLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\win8\\Documents\\dat216\\delete.png")); // NOI18N
        jButton1.setText("jButton1");

        productNameLabel.setText("Mjölk");

        productUnitLabel.setText("st");

        productPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        productPriceLabel.setText("10 :-");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\win8\\Documents\\dat216\\delete.png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(productNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productUnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameLabel)
                    .addComponent(amountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productUnitLabel)
                    .addComponent(productPriceLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        listener.itemRemoved(item);
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner amountSpinner;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JLabel productPriceLabel;
    private javax.swing.JLabel productUnitLabel;
    // End of variables declaration//GEN-END:variables
    private ShoppingItem item;
    private ShoppingItemPanelListener listener;

    public void setPanelListener(ShoppingItemPanelListener listener) {
        this.listener = listener;
    }

    public double getAmount() {
        return (Integer) amountSpinner.getValue();
    }

    public void setShoppingItem(ShoppingItem item) {
        this.item = item;
        Product product = item.getProduct();
        productNameLabel.setText(product.getName());
        DecimalFormat df = new DecimalFormat("0.00##");
        productPriceLabel.setText(df.format(item.getTotal()) + " :-");
        productUnitLabel.setText(product.getUnitSuffix());
        amountSpinner.setValue(item.getAmount());
    }

}
