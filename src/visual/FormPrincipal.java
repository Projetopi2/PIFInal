

package visual;

import javax.swing.JOptionPane;


public class FormPrincipal extends javax.swing.JFrame {


    
    public FormPrincipal() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoRankus = new javax.swing.JLabel();
        menuNavegRapida = new javax.swing.JPanel();
        menuNavegRapNCli = new javax.swing.JButton();
        menuNavegRapPCli = new javax.swing.JButton();
        menuNavegRapNAgend = new javax.swing.JButton();
        menuNavegRapPAgend = new javax.swing.JButton();
        menuBarra = new javax.swing.JMenuBar();
        menuBarCadastro = new javax.swing.JMenu();
        menuBarCadCli = new javax.swing.JMenuItem();
        menuBarAgendamento = new javax.swing.JMenu();
        menuBarAgenServ = new javax.swing.JMenuItem();
        menuBarPesquisa = new javax.swing.JMenu();
        menuBarPesqCli = new javax.swing.JMenuItem();
        menuBarPesqAgend = new javax.swing.JMenuItem();
        menuBarRelatorio = new javax.swing.JMenu();
        menuBarRelGeral = new javax.swing.JMenuItem();
        menuBarAjuda = new javax.swing.JMenu();
        menuBarAjudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agendamento Rankuspelus");
        setResizable(false);

        logoRankus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoRankuspelus.gif"))); // NOI18N

        menuNavegRapida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegação Rápida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 0, 18))); // NOI18N

        menuNavegRapNCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novCliente.gif"))); // NOI18N
        menuNavegRapNCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNavegRapNCliActionPerformed(evt);
            }
        });

        menuNavegRapPCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/locCliente.gif"))); // NOI18N
        menuNavegRapPCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNavegRapPCliActionPerformed(evt);
            }
        });

        menuNavegRapNAgend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novAgendamento.gif"))); // NOI18N
        menuNavegRapNAgend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNavegRapNAgendActionPerformed(evt);
            }
        });

        menuNavegRapPAgend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/locAgendamento.gif"))); // NOI18N
        menuNavegRapPAgend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNavegRapPAgendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuNavegRapidaLayout = new javax.swing.GroupLayout(menuNavegRapida);
        menuNavegRapida.setLayout(menuNavegRapidaLayout);
        menuNavegRapidaLayout.setHorizontalGroup(
            menuNavegRapidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuNavegRapidaLayout.createSequentialGroup()
                .addComponent(menuNavegRapNCli, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuNavegRapPCli, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuNavegRapNAgend, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuNavegRapPAgend, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuNavegRapidaLayout.setVerticalGroup(
            menuNavegRapidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuNavegRapNCli)
            .addComponent(menuNavegRapPCli)
            .addComponent(menuNavegRapNAgend)
            .addComponent(menuNavegRapPAgend)
        );

        menuBarCadastro.setText("Cadastro");
        menuBarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarCadastroActionPerformed(evt);
            }
        });

        menuBarCadCli.setText("Cliente");
        menuBarCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarCadCliActionPerformed(evt);
            }
        });
        menuBarCadastro.add(menuBarCadCli);

        menuBarra.add(menuBarCadastro);

        menuBarAgendamento.setText("Agendamento");

        menuBarAgenServ.setText("Novo Agendamento");
        menuBarAgenServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarAgenServActionPerformed(evt);
            }
        });
        menuBarAgendamento.add(menuBarAgenServ);

        menuBarra.add(menuBarAgendamento);

        menuBarPesquisa.setText("Pesquisa");

        menuBarPesqCli.setText("Cliente");
        menuBarPesqCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarPesqCliActionPerformed(evt);
            }
        });
        menuBarPesquisa.add(menuBarPesqCli);

        menuBarPesqAgend.setText("Agendamento");
        menuBarPesqAgend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarPesqAgendActionPerformed(evt);
            }
        });
        menuBarPesquisa.add(menuBarPesqAgend);

        menuBarra.add(menuBarPesquisa);

        menuBarRelatorio.setText("Relatório");

        menuBarRelGeral.setText("Gerar Relatório");
        menuBarRelGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarRelGeralActionPerformed(evt);
            }
        });
        menuBarRelatorio.add(menuBarRelGeral);

        menuBarra.add(menuBarRelatorio);

        menuBarAjuda.setText("Ajuda");

        menuBarAjudaSobre.setText("Sobre");
        menuBarAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarAjudaSobreActionPerformed(evt);
            }
        });
        menuBarAjuda.add(menuBarAjudaSobre);

        menuBarra.add(menuBarAjuda);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(logoRankus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuNavegRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuNavegRapida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoRankus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuNavegRapNCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNavegRapNCliActionPerformed
        FormNovoCliente form = new FormNovoCliente(this, false);
        form.setVisible(true);
    }//GEN-LAST:event_menuNavegRapNCliActionPerformed

    private void menuNavegRapNAgendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNavegRapNAgendActionPerformed
        FormNovoAgendamento form = new FormNovoAgendamento (this, false);
        form.setVisible(true);
    }//GEN-LAST:event_menuNavegRapNAgendActionPerformed

    private void menuNavegRapPCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNavegRapPCliActionPerformed
        FormPesquisaCliente form = new FormPesquisaCliente (this, false);
        form.setVisible(true);
    }//GEN-LAST:event_menuNavegRapPCliActionPerformed

    private void menuBarAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarAjudaSobreActionPerformed
        JOptionPane.showMessageDialog(null, "Agendamento Eletrônico Rankuspelus \nVersão 1.0");
    }//GEN-LAST:event_menuBarAjudaSobreActionPerformed

    private void menuBarCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarCadCliActionPerformed
        FormNovoCliente form = new FormNovoCliente(this, false);
        form.setVisible(true);
    }//GEN-LAST:event_menuBarCadCliActionPerformed

    private void menuBarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBarCadastroActionPerformed

    private void menuBarAgenServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarAgenServActionPerformed
        FormNovoAgendamento form = new FormNovoAgendamento (this, false);
        form.setVisible(true);
    }//GEN-LAST:event_menuBarAgenServActionPerformed

    private void menuNavegRapPAgendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNavegRapPAgendActionPerformed
        FormPesquisaAgendamento form = new FormPesquisaAgendamento (this, false);
        form.setVisible(true);
    }//GEN-LAST:event_menuNavegRapPAgendActionPerformed

    private void menuBarPesqAgendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarPesqAgendActionPerformed
        FormPesquisaAgendamento form = new FormPesquisaAgendamento (this, false);
        form.setVisible(true);
    }//GEN-LAST:event_menuBarPesqAgendActionPerformed

    private void menuBarPesqCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarPesqCliActionPerformed
        FormPesquisaCliente form = new FormPesquisaCliente (this, false);
        form.setVisible(true);
    }//GEN-LAST:event_menuBarPesqCliActionPerformed

    private void menuBarRelGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarRelGeralActionPerformed
        FormServicosEmExecucao form = new FormServicosEmExecucao (this, false);
        form.setVisible(true);
    }//GEN-LAST:event_menuBarRelGeralActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel logoRankus;
    private javax.swing.JMenuItem menuBarAgenServ;
    private javax.swing.JMenu menuBarAgendamento;
    private javax.swing.JMenu menuBarAjuda;
    private javax.swing.JMenuItem menuBarAjudaSobre;
    private javax.swing.JMenuItem menuBarCadCli;
    private javax.swing.JMenu menuBarCadastro;
    private javax.swing.JMenuItem menuBarPesqAgend;
    private javax.swing.JMenuItem menuBarPesqCli;
    private javax.swing.JMenu menuBarPesquisa;
    private javax.swing.JMenuItem menuBarRelGeral;
    private javax.swing.JMenu menuBarRelatorio;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JButton menuNavegRapNAgend;
    private javax.swing.JButton menuNavegRapNCli;
    private javax.swing.JButton menuNavegRapPAgend;
    private javax.swing.JButton menuNavegRapPCli;
    private javax.swing.JPanel menuNavegRapida;
    // End of variables declaration//GEN-END:variables
}
