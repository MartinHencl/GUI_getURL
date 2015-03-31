/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_geturl_2;

import java.awt.Dialog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI_getURL_2 extends javax.swing.JFrame {

    
    public GUI_getURL_2() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_URL = new javax.swing.JLabel();
        jTextField_URL = new javax.swing.JTextField();
        jButton_go = new javax.swing.JButton();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel_WebPage = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane_WebPage = new javax.swing.JEditorPane();
        jPanel_CodePage = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_CodePage = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_file = new javax.swing.JMenu();
        jMenuItem_new = new javax.swing.JMenuItem();
        jMenuItem_newPage = new javax.swing.JMenuItem();
        jMenu_edit = new javax.swing.JMenu();
        jMenuItem_copy = new javax.swing.JMenuItem();
        jMenu_help = new javax.swing.JMenu();
        jMenuItem_about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_URL.setText("URL: ");

        jTextField_URL.setText("http://pluto.pslib.cz");

        jButton_go.setText("GO!");
        jButton_go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_goActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jEditorPane_WebPage);

        javax.swing.GroupLayout jPanel_WebPageLayout = new javax.swing.GroupLayout(jPanel_WebPage);
        jPanel_WebPage.setLayout(jPanel_WebPageLayout);
        jPanel_WebPageLayout.setHorizontalGroup(
            jPanel_WebPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        jPanel_WebPageLayout.setVerticalGroup(
            jPanel_WebPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Webová stránka", jPanel_WebPage);

        jTextArea_CodePage.setColumns(20);
        jTextArea_CodePage.setRows(5);
        jScrollPane2.setViewportView(jTextArea_CodePage);

        javax.swing.GroupLayout jPanel_CodePageLayout = new javax.swing.GroupLayout(jPanel_CodePage);
        jPanel_CodePage.setLayout(jPanel_CodePageLayout);
        jPanel_CodePageLayout.setHorizontalGroup(
            jPanel_CodePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        jPanel_CodePageLayout.setVerticalGroup(
            jPanel_CodePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Zdrojový kód", jPanel_CodePage);

        jMenu_file.setText("Soubor");

        jMenuItem_new.setText("Nový");
        jMenuItem_new.setEnabled(false);
        jMenu_file.add(jMenuItem_new);

        jMenuItem_newPage.setText("Nový web");
        jMenuItem_newPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_newPageActionPerformed(evt);
            }
        });
        jMenu_file.add(jMenuItem_newPage);

        jMenuBar1.add(jMenu_file);

        jMenu_edit.setText("Upravit");

        jMenuItem_copy.setText("Kopírovat");
        jMenu_edit.add(jMenuItem_copy);

        jMenuBar1.add(jMenu_edit);

        jMenu_help.setText("Help");

        jMenuItem_about.setText("O programu");
        jMenuItem_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_aboutActionPerformed(evt);
            }
        });
        jMenu_help.add(jMenuItem_about);

        jMenuBar1.add(jMenu_help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_URL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_URL, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_go)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_URL)
                    .addComponent(jTextField_URL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_go))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_goActionPerformed
     
        String InputURL = jTextField_URL.getText();
        try {
            //zobrazení stránky webu
            jEditorPane_WebPage.setPage(InputURL);
            
            //načtení HTML stránky
            URL url = new URL(InputURL);
            URLConnection spojeni = url.openConnection();
            
            //provázání síťového socketu s bufferem
            BufferedReader in = new BufferedReader(new InputStreamReader(spojeni.getInputStream()));
            
            //pro zrychlení vytvoříme objekt bufferu
            StringBuilder inputLines = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null)
            {
                inputLines.append(line).append("\n");
            }
            
            //celý buffer textu vyplivneme na stránku kódu
            jTextArea_CodePage.setText(inputLines.toString());
        } catch (IOException ex) {
            Logger.getLogger(GUI_getURL_2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_goActionPerformed

    private void jMenuItem_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_aboutActionPerformed
        String zprava = "Tohle by se nemělo dít.";
        JOptionPane.showMessageDialog(new JFrame(), zprava, "Dialog", JOptionPane.ERROR_MESSAGE);        
    }//GEN-LAST:event_jMenuItem_aboutActionPerformed

    private void jMenuItem_newPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_newPageActionPerformed
        try {
            jEditorPane_WebPage.setPage(getClass().getResource("/soubory/webpage.html"));
        } catch (IOException ex) {
            Logger.getLogger(GUI_getURL_2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_newPageActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_getURL_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_getURL_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_getURL_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_getURL_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_getURL_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_go;
    private javax.swing.JEditorPane jEditorPane_WebPage;
    private javax.swing.JLabel jLabel_URL;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_about;
    private javax.swing.JMenuItem jMenuItem_copy;
    private javax.swing.JMenuItem jMenuItem_new;
    private javax.swing.JMenuItem jMenuItem_newPage;
    private javax.swing.JMenu jMenu_edit;
    private javax.swing.JMenu jMenu_file;
    private javax.swing.JMenu jMenu_help;
    private javax.swing.JPanel jPanel_CodePage;
    private javax.swing.JPanel jPanel_WebPage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextArea jTextArea_CodePage;
    private javax.swing.JTextField jTextField_URL;
    // End of variables declaration//GEN-END:variables
}
