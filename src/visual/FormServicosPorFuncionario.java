/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import piagendamentos.Agendamento;
import piagendamentos.Cliente;
import piagendamentos.DaoAgendamento;
import piagendamentos.DaoClientes;
import piagendamentos.DaoFuncionario;
import piagendamentos.Funcionario;
import piagendamentos.Relatorios;
import piagendamentos.util.FormatacaoData;

/**
 *
 * @author Elder
 */
public class FormServicosPorFuncionario extends javax.swing.JDialog {

    /**
     * Creates new form FormNovoCliente
     */
    public FormServicosPorFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoRakusPeqNCli = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbo_novoServicosPorFuncionarioFuncionarios = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        date_novoServicosPorFuncionarioDe = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        date_novoServicosPorFuncionarioAte = new com.toedter.calendar.JDateChooser();
        btn_novoServicosPorFuncionarioPesquisarAgendamentos = new javax.swing.JButton();
        btn_novoServicosPorFuncionarioGerarRelatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_novoServicosPorFuncionario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rankuspelus - Relatório por Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        logoRakusPeqNCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoRankupeluspequeno.gif"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serviços por Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 0, 18))); // NOI18N

        jLabel3.setText("Funcionário:");

        jLabel1.setText("Período de:");

        date_novoServicosPorFuncionarioDe.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_novoServicosPorFuncionarioDePropertyChange(evt);
            }
        });

        jLabel5.setText("até");

        date_novoServicosPorFuncionarioAte.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_novoServicosPorFuncionarioAtePropertyChange(evt);
            }
        });

        btn_novoServicosPorFuncionarioPesquisarAgendamentos.setText("Pesquisar Agendamentos");
        btn_novoServicosPorFuncionarioPesquisarAgendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoServicosPorFuncionarioPesquisarAgendamentosActionPerformed(evt);
            }
        });

        btn_novoServicosPorFuncionarioGerarRelatorio.setText("Gerar Relatório");
        btn_novoServicosPorFuncionarioGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoServicosPorFuncionarioGerarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbo_novoServicosPorFuncionarioFuncionarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date_novoServicosPorFuncionarioDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_novoServicosPorFuncionarioAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_novoServicosPorFuncionarioPesquisarAgendamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_novoServicosPorFuncionarioGerarRelatorio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbo_novoServicosPorFuncionarioFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(date_novoServicosPorFuncionarioAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(date_novoServicosPorFuncionarioDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_novoServicosPorFuncionarioPesquisarAgendamentos)
                        .addComponent(btn_novoServicosPorFuncionarioGerarRelatorio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_novoServicosPorFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código Agendamento", "Funcionário", "Serviço", "Data", "Horário Início", "Horário Fim", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_novoServicosPorFuncionario.setFillsViewportHeight(true);
        tbl_novoServicosPorFuncionario.setFocusable(false);
        tbl_novoServicosPorFuncionario.setInheritsPopupMenu(true);
        tbl_novoServicosPorFuncionario.setRequestFocusEnabled(false);
        tbl_novoServicosPorFuncionario.setRowSelectionAllowed(false);
        tbl_novoServicosPorFuncionario.setUpdateSelectionOnSort(false);
        tbl_novoServicosPorFuncionario.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(tbl_novoServicosPorFuncionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoRakusPeqNCli))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoRakusPeqNCli))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void date_novoServicosPorFuncionarioDePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_novoServicosPorFuncionarioDePropertyChange


    }//GEN-LAST:event_date_novoServicosPorFuncionarioDePropertyChange

    private void date_novoServicosPorFuncionarioAtePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_novoServicosPorFuncionarioAtePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_date_novoServicosPorFuncionarioAtePropertyChange

    private void btn_novoServicosPorFuncionarioPesquisarAgendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoServicosPorFuncionarioPesquisarAgendamentosActionPerformed
        
        String dataInicio = FormatacaoData.convertToString(date_novoServicosPorFuncionarioDe.getDate());
        
        String dataFim = FormatacaoData.convertToString(date_novoServicosPorFuncionarioAte.getDate());
        
        DaoFuncionario daoFunc = new DaoFuncionario();
        
        String nomeFuncionario = cbo_novoServicosPorFuncionarioFuncionarios.getSelectedItem().toString();
        
        Funcionario f = daoFunc.pesquisaFuncionario(nomeFuncionario);
        
        Integer idFuncionario = f.getIdFuncionario();
        
        DaoAgendamento daoAgend = new DaoAgendamento();
        
        ArrayList<Agendamento> lista = daoAgend.agendamentoPorIdFuncionarioIntervalo(idFuncionario, dataInicio, dataFim);
        
        DefaultTableModel model = (DefaultTableModel) tbl_novoServicosPorFuncionario.getModel();

        model.setNumRows(0);

        if( ! lista.isEmpty()){

            for(Agendamento a : lista){

                String nomeServico = daoFunc.pesquisaNomeServicoPorIdServico(a.getIdServico());

                Date data = FormatacaoData.convertToDate(a.getDataAgendamento());
                        
                String dataAgendamento = FormatacaoData.convertToString(data);
                        
                model.addRow(new Object[] {a.getIdAgendamento(),
                    f.getNome(), nomeServico, dataAgendamento, a.getHoraInicio(),
                    a.getHoraFim(), a.getStatus()});

            }
        }
        else{
            
            JOptionPane.showMessageDialog(rootPane, "O Funcionário não teve agendamentos no período solicitado");
            
        }
        
    }//GEN-LAST:event_btn_novoServicosPorFuncionarioPesquisarAgendamentosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        ArrayList<Funcionario> lista = new ArrayList<>();
        
        DaoFuncionario daoFunc = new DaoFuncionario();
        
        lista = daoFunc.pesquisaTodosFuncionarios();
        
        for(Funcionario f : lista){
            
            cbo_novoServicosPorFuncionarioFuncionarios.addItem(f.getNome());
            
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void btn_novoServicosPorFuncionarioGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoServicosPorFuncionarioGerarRelatorioActionPerformed
        
        Relatorios rel = new Relatorios();
        
        String dataInicio = FormatacaoData.convertToString(date_novoServicosPorFuncionarioDe.getDate());
        
        String dataFim = FormatacaoData.convertToString(date_novoServicosPorFuncionarioAte.getDate());
        
        DaoFuncionario daoFunc = new DaoFuncionario();
        
        String nomeFuncionario = cbo_novoServicosPorFuncionarioFuncionarios.getSelectedItem().toString();
        
        Funcionario f = daoFunc.pesquisaFuncionario(nomeFuncionario);
        
        Integer idFuncionario = f.getIdFuncionario();
        
        DaoAgendamento daoAgend = new DaoAgendamento();
        
        ArrayList<Agendamento> lista = daoAgend.agendamentoPorIdFuncionarioIntervalo(idFuncionario, dataInicio, dataFim);
        
        rel.gravarServicosPorFuncionario(lista);
        
    }//GEN-LAST:event_btn_novoServicosPorFuncionarioGerarRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(FormServicosPorFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormServicosPorFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormServicosPorFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormServicosPorFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormServicosPorFuncionario dialog = new FormServicosPorFuncionario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_novoServicosPorFuncionarioGerarRelatorio;
    private javax.swing.JButton btn_novoServicosPorFuncionarioPesquisarAgendamentos;
    private javax.swing.JComboBox cbo_novoServicosPorFuncionarioFuncionarios;
    private com.toedter.calendar.JDateChooser date_novoServicosPorFuncionarioAte;
    private com.toedter.calendar.JDateChooser date_novoServicosPorFuncionarioDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoRakusPeqNCli;
    private javax.swing.JTable tbl_novoServicosPorFuncionario;
    // End of variables declaration//GEN-END:variables
}
