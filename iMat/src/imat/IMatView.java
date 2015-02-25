/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Oskar
 */
public class IMatView extends javax.swing.JFrame {
    private final ListHandler lh = new ListHandler();
    
    private final IMatDataHandler imat = IMatDataHandler.getInstance();
    
    private DefaultListModel listModel;
    
    private class ConcreteSearchListener implements SearchListener {
        @Override
        public void search(String str) {
            List<Product> results = imat.findProducts(str);
            // TODO: do stuff with the result
        }
    }
    
    /**
     * Creates new form IMatView
     */
    public IMatView(){
        initComponents();
        
        //topPanel
        searchPanel.addSearchButtonListener(new ConcreteSearchListener());
        
        //sidePanel
        categoryList.setCellRenderer(new CellRenderer());
        listModel = new DefaultListModel();
        categoryList.setModel(listModel);
        
        //contentPanel
        contentPanel.setLayout(new GridLayout(0,4));
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        topTabsPanel = new javax.swing.JPanel();
        topHeadPanel = new javax.swing.JPanel();
        fruitButton = new imat.MainCategoryItem();
        fruitButton.setText("Frukt & grönt");
        charkButton = new imat.MainCategoryItem();
        charkButton.setText("Chark");
        diaryButton = new imat.MainCategoryItem();
        diaryButton.setText("Mejeri");
        breadButton = new imat.MainCategoryItem();
        breadButton.setText("Bröd");
        snacksButton = new imat.MainCategoryItem();
        snacksButton.setText("Dryck & snacks");
        recipeButton = new imat.MainCategoryItem();
        recipeButton.setText("Recept");
        dryButton = new imat.MainCategoryItem();
        dryButton.setText("Torrvaror");
        searchPanel = new imat.SearchPanel();
        subHeadPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        categoryScrollPane = new javax.swing.JScrollPane();
        categoryList = new javax.swing.JList();
        contentScrollPane = new javax.swing.JScrollPane();
        contentPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iMat - Mat..Mat!");

        fruitButton.setMinimumSize(new java.awt.Dimension(100, 60));
        fruitButton.setName(""); // NOI18N
        fruitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fruitButtonMouseClicked(evt);
            }
        });

        charkButton.setMinimumSize(new java.awt.Dimension(100, 60));
        charkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                charkButtonMouseClicked(evt);
            }
        });

        diaryButton.setMinimumSize(new java.awt.Dimension(100, 60));
        diaryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diaryButtonMouseClicked(evt);
            }
        });

        breadButton.setMinimumSize(new java.awt.Dimension(100, 60));
        breadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                breadButtonMouseClicked(evt);
            }
        });

        snacksButton.setMinimumSize(new java.awt.Dimension(100, 60));
        snacksButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                snacksButtonMouseClicked(evt);
            }
        });

        recipeButton.setMinimumSize(new java.awt.Dimension(100, 60));
        recipeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recipeButtonMouseClicked(evt);
            }
        });

        dryButton.setMinimumSize(new java.awt.Dimension(100, 60));
        dryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dryButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topHeadPanelLayout = new javax.swing.GroupLayout(topHeadPanel);
        topHeadPanel.setLayout(topHeadPanelLayout);
        topHeadPanelLayout.setHorizontalGroup(
            topHeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topHeadPanelLayout.createSequentialGroup()
                .addComponent(fruitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(breadButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(charkButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(diaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dryButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(snacksButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(recipeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        topHeadPanelLayout.setVerticalGroup(
            topHeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topHeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(fruitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(charkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(diaryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(breadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(snacksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recipeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        subHeadPanel.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout subHeadPanelLayout = new javax.swing.GroupLayout(subHeadPanel);
        subHeadPanel.setLayout(subHeadPanelLayout);
        subHeadPanelLayout.setHorizontalGroup(
            subHeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        subHeadPanelLayout.setVerticalGroup(
            subHeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout topTabsPanelLayout = new javax.swing.GroupLayout(topTabsPanel);
        topTabsPanel.setLayout(topTabsPanelLayout);
        topTabsPanelLayout.setHorizontalGroup(
            topTabsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topHeadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subHeadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        topTabsPanelLayout.setVerticalGroup(
            topTabsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topTabsPanelLayout.createSequentialGroup()
                .addComponent(topHeadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(subHeadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/img/logo.jpg"))); // NOI18N
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(homeButton)
                .addGap(0, 0, 0)
                .addComponent(topTabsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topTabsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homeButton)
        );

        bodyPanel.setBackground(new java.awt.Color(102, 255, 102));

        sidePanel.setBackground(new java.awt.Color(0, 204, 204));

        categoryScrollPane.setBorder(null);

        categoryList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        categoryList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        categoryList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                categoryListValueChanged(evt);
            }
        });
        categoryScrollPane.setViewportView(categoryList);

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addComponent(categoryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoryScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1052, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        contentScrollPane.setViewportView(contentPanel);

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentScrollPane))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fruitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fruitButtonMouseClicked
        handleClick(evt);
    }//GEN-LAST:event_fruitButtonMouseClicked

    private void breadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breadButtonMouseClicked
        handleClick(evt);
    }//GEN-LAST:event_breadButtonMouseClicked

    private void charkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_charkButtonMouseClicked
        handleClick(evt);
    }//GEN-LAST:event_charkButtonMouseClicked

    private void diaryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diaryButtonMouseClicked
        handleClick(evt);
    }//GEN-LAST:event_diaryButtonMouseClicked

    private void dryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dryButtonMouseClicked
        handleClick(evt);
    }//GEN-LAST:event_dryButtonMouseClicked

    private void snacksButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snacksButtonMouseClicked
        handleClick(evt);
    }//GEN-LAST:event_snacksButtonMouseClicked

    private void recipeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recipeButtonMouseClicked
        handleClick(evt);
    }//GEN-LAST:event_recipeButtonMouseClicked

    private void handleClick(java.awt.event.MouseEvent evt) {
        MainCategoryItem source = (MainCategoryItem)evt.getSource();
        
        if (source == fruitButton) {
            setList("FoG");
        } else if (source == charkButton) {
            setList("Chark");
        } else if (source == breadButton) {
            setList("Bröd");
        } else if (source == diaryButton) {
            setList("Mejeri");
        } else if (source == dryButton) {
            setList("Torr");
        } else if (source == snacksButton) {
            setList("DS");
        }
        
        resetButtons();
        highlightButton(source);
    }
    
    private void categoryListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_categoryListValueChanged
        resetProductList();
        listProducts((String)categoryList.getSelectedValue());
    }//GEN-LAST:event_categoryListValueChanged

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        resetButtons();
        resetProductList();
        if (categoryList.getModel().getSize() != 0){
            listModel.removeAllElements();
            categoryList.setModel(listModel);
        }
    }//GEN-LAST:event_homeButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IMatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMatView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private imat.MainCategoryItem breadButton;
    private javax.swing.JList categoryList;
    private javax.swing.JScrollPane categoryScrollPane;
    private imat.MainCategoryItem charkButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JScrollPane contentScrollPane;
    private imat.MainCategoryItem diaryButton;
    private imat.MainCategoryItem dryButton;
    private imat.MainCategoryItem fruitButton;
    private javax.swing.JLabel homeButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel mainPanel;
    private imat.MainCategoryItem recipeButton;
    private imat.SearchPanel searchPanel;
    private javax.swing.JPanel sidePanel;
    private imat.MainCategoryItem snacksButton;
    private javax.swing.JPanel subHeadPanel;
    private javax.swing.JPanel topHeadPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel topTabsPanel;
    // End of variables declaration//GEN-END:variables

    private void setList(String s) {
        if(!categoryScrollPane.isVisible()){
            categoryScrollPane.setVisible(true);
        }
        Object[] listData = lh.getLists(s).toArray();
        categoryList.setListData(listData);
        categoryList.setSelectedIndex(0);
    }

    private void resetButtons() {
        fruitButton.reset();
        breadButton.reset();
        charkButton.reset();
        dryButton.reset();
        snacksButton.reset();
        diaryButton.reset();
        recipeButton.reset();
    }

    private void highlightButton(MainCategoryItem button) {
        button.highlight();
    }

    private void resetProductList() {
        contentPanel.removeAll();
    }

    private void listProducts(String p) {
        ArrayList<Product> list = new ArrayList<>();
        if(p == "ALLA"){
            list.addAll(lh.getProducts(getMainCategory()));
        }else{
            list.addAll(lh.getProducts(lh.parseString(p)));
        }
        for(Product temp : list){
            ProductPanel panel = new ProductPanel();
            panel.setName(temp.getName());
            panel.setPrice(temp.getPrice(), temp.getUnit() + "" + temp.getUnitSuffix());
            panel.setImage(temp.getImageName());
            panel.setVisible(true);
            contentPanel.add(panel);
            panel.revalidate();
        }
    }

    private String getMainCategory() {
        return "FoG";
    }
}
