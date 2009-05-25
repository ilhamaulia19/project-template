/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuPanel.java
 *
 * Created on May 24, 2009, 6:34:13 PM
 */

package com.artivisi.pos.ui.sekuriti;

import com.artivisi.pos.model.sekuriti.Menu;
import com.artivisi.pos.ui.frame.FrameUtama;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import javax.swing.AbstractListModel;

/**
 *
 * @author ifnu
 */
public class MenuPanel extends javax.swing.JInternalFrame {

    private Integer selectedIndex;
    /** Creates new form MenuPanel */
    public MenuPanel() {
        initComponents();
        constructMenu();
        buttonPanelMaster1.getBtnTambah().setEnabled(false);
        initalizeListener();
    }

    private void initalizeListener(){
        buttonPanelMaster1.getBtnSimpan().addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //simpan
                buttonPanelMaster1.getBtnSimpan().setEnabled(false);
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstMenu = new javax.swing.JList();
        btnNaik = new javax.swing.JButton();
        btnKiri = new javax.swing.JButton();
        btnKanan = new javax.swing.JButton();
        btnTurun = new javax.swing.JButton();
        buttonPanelMaster1 = new com.artivisi.pos.ui.toolbar.ButtonPanelMaster();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Menu");

        lstMenu.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstMenu);

        btnNaik.setText("Naik");
        btnNaik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaikActionPerformed(evt);
            }
        });

        btnKiri.setText("<");
        btnKiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiriActionPerformed(evt);
            }
        });

        btnKanan.setText(">");
        btnKanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKananActionPerformed(evt);
            }
        });

        btnTurun.setText("Down");
        btnTurun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnKiri)
                                .addGap(31, 31, 31)
                                .addComponent(btnKanan))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(btnNaik))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnTurun)))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonPanelMaster1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(buttonPanelMaster1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNaik)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKiri)
                            .addComponent(btnKanan))
                        .addGap(18, 18, 18)
                        .addComponent(btnTurun)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKananActionPerformed
        // TODO add your handling code here:
        buttonPanelMaster1.getBtnSimpan().setEnabled(true);
}//GEN-LAST:event_btnKananActionPerformed

    private void btnNaikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaikActionPerformed
        buttonPanelMaster1.getBtnSimpan().setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNaikActionPerformed

    private void btnKiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiriActionPerformed
        buttonPanelMaster1.getBtnSimpan().setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKiriActionPerformed

    private void btnTurunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurunActionPerformed
        buttonPanelMaster1.getBtnSimpan().setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTurunActionPerformed

    private void constructMenu(){
        List<Menu> menus = FrameUtama.getSekuritiService().semuaMenu();
        Map<Integer,List<Menu>> menuMap = new HashMap<Integer, List<Menu>>();
        for(Menu m:menus){
            List<Menu> menuList = null;
            if(menuMap.get(m.getMenuLevel()) == null){
                menuList = new ArrayList<Menu>();
                menuMap.put(m.getMenuLevel(),menuList);
            } else {
                menuList = menuMap.get(m.getMenuLevel());
            }
            menuList.add(m);
        }
        //construct child and parent
        Integer maximumLevel = FrameUtama.getSekuritiService().maximumMenuLevel();
        List<Menu> parents = menuMap.get(0);
        if(parents==null){
            throw new IllegalStateException("Menu level 0 tidak ada!");
        }
        //
        List<Menu> childs = null;
        for(int i=1;i<=maximumLevel;i++){
            childs = menuMap.get(i);
            if(childs!=null){
                for(Menu m : childs){
                    if(parents.indexOf(m.getParent())>=0){
                        Menu parent = parents.get(parents.indexOf(m.getParent()));
                        parent.addChild(m);
                    }
                }
            }
            parents = childs;
        }
        Stack<Set<Menu>> stack = new Stack<Set<Menu>>();
        Set<Menu> parentsOrdered = new TreeSet<Menu>(new UrutanComparator());
        parentsOrdered.addAll(menuMap.get(0));
        stack.push(parentsOrdered);

        List<String> orderedMenu = new ArrayList<String>();
        while(true){
            if(stack.isEmpty()) break;
            Set<Menu> current = stack.pop();
            if(current!=null && !current.isEmpty()){
                Menu menu = current.iterator().next();
                current.remove(menu);
                orderedMenu.add(padTabs(menu.getId(), menu.getMenuLevel()));
                if(!current.isEmpty()) stack.push(current);
                if(menu.getChilds()!=null && !menu.getChilds().isEmpty()) stack.push(menu.getChilds());
            } else if(stack.isEmpty()){
                break;
            }
        }
        lstMenu.setModel(new MenuListModel(orderedMenu));
    }

    private static class MenuListModel extends AbstractListModel{
        private List<String> orderedMenu;

        public MenuListModel(List<String> orderedMenu) {
            this.orderedMenu=orderedMenu;
        }

        public int getSize() {
            return orderedMenu.size();
        }

        public Object getElementAt(int index) {
            return orderedMenu.get(index);
        }
        
    }

    private String padTabs(String data,int num){
        if(num<=0) return data;
        else {
            StringBuilder builder = new StringBuilder();
            for(int i=0;i<num;i++){
                builder.append("\t");
            }
            builder.append(data);
            return builder.toString();
        }
    }

    private static class UrutanComparator implements Comparator<Menu>{

        public int compare(Menu o1, Menu o2) {
            return o1.getUrutan().compareTo(o2.getUrutan());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKanan;
    private javax.swing.JButton btnKiri;
    private javax.swing.JButton btnNaik;
    private javax.swing.JButton btnTurun;
    private com.artivisi.pos.ui.toolbar.ButtonPanelMaster buttonPanelMaster1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstMenu;
    // End of variables declaration//GEN-END:variables

}
