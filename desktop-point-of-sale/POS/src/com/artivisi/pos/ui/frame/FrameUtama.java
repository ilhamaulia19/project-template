/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrameUtama.java
 *
 * Created on Apr 29, 2009, 10:16:09 AM
 */
package com.artivisi.pos.ui.frame;

import com.artivisi.pos.service.MasterService;
import com.artivisi.pos.service.ReportService;
import com.artivisi.pos.service.SekuritiService;
import com.artivisi.pos.service.TransaksiService;
import com.artivisi.pos.ui.master.MasterProdukPanel;
import javax.swing.JFrame;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author kurusgw
 */
public class FrameUtama extends javax.swing.JFrame {

    private static FrameUtama instance;

    public static FrameUtama getInstance() {
        return instance;
    }

    /** Creates new form FrameUtama */
    public FrameUtama() {
        initComponents();
        instance = this;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        destktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(destktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(destktopPane, javax.swing.GroupLayout.Alignment.TRAILING))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private MasterProdukPanel masterProduk;

    //menginstantkan ke Toko Service
    private static TransaksiService transaksiService;
    private static MasterService masterService;
    private static ReportService reportService;
    private static SekuritiService sekuritiService;

    public static TransaksiService getTransaksiService(){
        return transaksiService;
    }

    public MasterProdukPanel getMasterProduk() {
        return masterProduk;
    }

    public static MasterService getMasterService() {
        return masterService;
    }

    public static ReportService getReportService() {
        return reportService;
    }

    public static SekuritiService getSekuritiService() {
        return sekuritiService;
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        AbstractApplicationContext ctx =
            new ClassPathXmlApplicationContext
            ("classpath:applicationContext.xml");
          ctx.registerShutdownHook();

        transaksiService = (TransaksiService) ctx.getBean("tokoService");
        masterService = (MasterService) ctx.getBean("masterService");
        //aku remark dulu (aldi)
        //sekuritiService = (SekuritiService) ctx.getBean("sekuritiService");
        //reportService = (ReportService) ctx.getBean("reportService");

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameUtama fu = new FrameUtama();
                fu.setVisible(true);
                fu.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane destktopPane;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}