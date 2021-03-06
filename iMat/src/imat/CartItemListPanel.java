/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author win8
 */
public class CartItemListPanel extends javax.swing.JPanel  {

    /**
     * Creates new form CartListPanel
     */
    public CartItemListPanel() {
        initComponents();

        //addShoppingItem(new ShoppingItem(p2, 4));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMinimumSize(new java.awt.Dimension(359, 0));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));
    }// </editor-fold>//GEN-END:initComponents

    public void insertShoppingItem(ShoppingItem item) {

        itemList.add(item);

        Collections.sort(itemList, new Comparator<ShoppingItem>() {

            @Override
            public int compare(ShoppingItem o1, ShoppingItem o2) {
                return o1.getProduct().getName().compareTo(o2.getProduct().getName());
            }
        });
        updateList();
    }

    public void removeItem(ShoppingItem item) {
        itemList.remove(item);
        updateList();
    }

    public void clearList() {
        itemList.clear();
        updateList();
    }

    public void updateList() {
        this.removeAll();

        for (ShoppingItem item : itemList) {
            CartItemPanel cartItemPanel = new CartItemPanel(item);
            cartItemPanel.setPanelListener(listener);
          
            add(cartItemPanel);
        }
        updateSize();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
   
    ShoppingItemPanelListener listener;
    
    public void setItemPanelListener(ShoppingItemPanelListener listener) {
        this.listener = listener;
    }


    public void updateSize() {
        setSize(getPreferredSize());
        setMaximumSize(getPreferredSize());
        revalidate();
    }
    ArrayList<ShoppingItem> itemList = new ArrayList<>();

}
