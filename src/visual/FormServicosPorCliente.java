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
public class FormServicosPorCliente extends javax.swing.JDialog {

    /**
     * Creates new form FormNovoCliente
     */
    public FormServicosPorCliente(java.awt.Frame parent, boolean modal) {
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
        jLabel2 = new javax.swing.JLabel();
        txt_novoServicosPorCLienteNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_novoServicosPorCLienteBucar = new javax.swing.JButton();
        txt_novoServicosPorCLienteCpf = new javax.swing.JFormattedTextField();
        btn_novoServicosPorCLienteGerarRelatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_novoServicosPorCLiente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        date_novoServicosPorCLienteDe = new com.toedter.calendar.JDateChooser();
        date_novoServicosPorCLienteAte = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        btn_novoServicosPorCLientePesquisarAgendamentos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rankuspelus - Relatório por Cliente");

        logoRakusPeqNCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoRankupeluspequeno.gif"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serviços por Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 0, 18))); // NOI18N

        jLabel2.setText("CPF Cliente:");

        jLabel3.setText("Cliente:");

        btn_novoServicosPorCLienteBucar.setText("Buscar");
        btn_novoServicosPorCLienteBucar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoServicosPorCLienteBucarActionPerformed(evt);
            }
        });

        try {
            txt_novoServicosPorCLienteCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_novoServicosPorCLienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_novoServicosPorCLienteBucar))
                    .addComponent(txt_novoServicosPorCLienteNomeCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btn_novoServicosPorCLienteBucar)
                    .addComponent(txt_novoServicosPorCLienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_novoServicosPorCLienteNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31))
        );

        btn_novoServicosPorCLienteGerarRelatorio.setText("Gerar Relatório");
        btn_novoServicosPorCLienteGerarRelatorio.setEnabled(false);
        btn_novoServicosPorCLienteGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoServicosPorCLienteGerarRelatorioActionPerformed(evt);
            }
        });

        tbl_novoServicosPorCLiente.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_novoServicosPorCLiente.setFillsViewportHeight(true);
        tbl_novoServicosPorCLiente.setFocusable(false);
        tbl_novoServicosPorCLiente.setInheritsPopupMenu(true);
        tbl_novoServicosPorCLiente.setRequestFocusEnabled(false);
        tbl_novoServicosPorCLiente.setRowSelectionAllowed(false);
        tbl_novoServicosPorCLiente.setUpdateSelectionOnSort(false);
        tbl_novoServicosPorCLiente.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(tbl_novoServicosPorCLiente);

        jLabel1.setText("Período de:");

        date_novoServicosPorCLienteDe.setEnabled(false);
        date_novoServicosPorCLienteDe.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_novoServicosPorCLienteDePropertyChange(evt);
            }
        });

        date_novoServicosPorCLienteAte.setEnabled(false);
        date_novoServicosPorCLienteAte.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_novoServicosPorCLienteAtePropertyChange(evt);
            }
        });

        jLabel5.setText("até");

        btn_novoServicosPorCLientePesquisarAgendamentos.setText("Pesquisar Agendamentos");
        btn_novoServicosPorCLientePesquisarAgendamentos.setEnabled(false);
        btn_novoServicosPorCLientePesquisarAgendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoServicosPorCLientePesquisarAgendamentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoRakusPeqNCli))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date_novoServicosPorCLienteDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_novoServicosPorCLienteAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_novoServicosPorCLientePesquisarAgendamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_novoServicosPorCLienteGerarRelatorio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(date_novoServicosPorCLienteAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(date_novoServicosPorCLienteDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_novoServicosPorCLientePesquisarAgendamentos)
                        .addComponent(btn_novoServicosPorCLienteGerarRelatorio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoRakusPeqNCli))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void date_novoServicosPorCLienteDePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_novoServicosPorCLienteDePropertyChange


    }//GEN-LAST:event_date_novoServicosPorCLienteDePropertyChange

    private void date_novoServicosPorCLienteAtePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_novoServicosPorCLienteAtePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_date_novoServicosPorCLienteAtePropertyChange

    private void btn_novoServicosPorCLienteBucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoServicosPorCLienteBucarActionPerformed
        
        //Instanciando a classe de DaoCLientes, utilizada para pesquisas, alterações e inclusões no banco.

        DaoClientes daoClientes = new DaoClientes();
        
        String cpf = txt_novoServicosPorCLienteCpf.getText().replaceAll("[./-]", "");

        //Passa para o método "verificaExistencia" da classe DaoClientes, o cpf informado no textbox.
        //Se o método "verificaExistencia"retornar true, significa que o cpf foi encontrado no banco de dados

        if(daoClientes.verificaExistencia(cpf)){

            //Instanciando um cliente utilizando o método pesquisaCliente, passando como parêmatro o cpf
            //resgatado na textbox e recebendo como retorno um object Cliente.

            Cliente cliente = daoClientes.pesquisaCliente(cpf);

            //Setando o texto da textBox com o nome do cliente retornado no método "pesquisaCliente".

            txt_novoServicosPorCLienteNomeCliente.setText(cliente.getNome());

            //Abrindo a visibilidade dos objetos de pesquisa.
            
            date_novoServicosPorCLienteDe.setEnabled(true);
            date_novoServicosPorCLienteAte.setEnabled(true);
            btn_novoServicosPorCLientePesquisarAgendamentos.setEnabled(true);
            btn_novoServicosPorCLienteGerarRelatorio.setEnabled(true);
            
            
        }
        else{

            //Se o if retornar negativo, significa que não foi encontrado um cliente com o cpf informado.

            //Exibe uma caixa de dialogo solicitando confirmação ou não.
            //Se o usuário clicar em "Sim" retorna 0 pra variavel reply, se informado não retorna 1

            String message = "Cliente não cadastrado. Deseja cadastrar novo Cliente ?";
            String title = "Confirmação";

            int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);

            if(reply == JOptionPane.YES_OPTION)
            {
                //Se escolhida a opção "Sim", abrimos a janela de cadastro "FormNovoCliente".

                FormNovoCliente form = new FormNovoCliente(null, rootPaneCheckingEnabled);
                form.setVisible(true);
            }

        }
        
    }//GEN-LAST:event_btn_novoServicosPorCLienteBucarActionPerformed

    private void btn_novoServicosPorCLientePesquisarAgendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoServicosPorCLientePesquisarAgendamentosActionPerformed
        
        DaoClientes daoClientes = new DaoClientes();
        
        String cpf = txt_novoServicosPorCLienteCpf.getText().replaceAll("[./-]", "");
        
        if(daoClientes.verificaExistencia(cpf)){
            
            String dataInicio = FormatacaoData.convertToString(date_novoServicosPorCLienteDe.getDate());
        
            String dataFim = FormatacaoData.convertToString(date_novoServicosPorCLienteAte.getDate());
        
            DaoClientes daoCli = new DaoClientes();
        
            DaoFuncionario daoFunc = new DaoFuncionario();
        
            Cliente c = daoCli.pesquisaClienteNome(txt_novoServicosPorCLienteNomeCliente.getText());
        
            Integer idCliente = c.getIdCliente();
        
            DaoAgendamento daoAgend = new DaoAgendamento();
        
            ArrayList<Agendamento> lista = daoAgend.agendamentoPorIdClienteIntervalo(idCliente, dataInicio, dataFim);
        
            DefaultTableModel model = (DefaultTableModel) tbl_novoServicosPorCLiente.getModel();

            model.setNumRows(0);

            if( ! lista.isEmpty()){

                for(Agendamento a : lista){
                    
                    Funcionario f = daoFunc.pesquisaFuncionarioId(a.getIdFuncionario());

                    String nomeServico = daoFunc.pesquisaNomeServicoPorIdServico(a.getIdServico());

                    Date data = FormatacaoData.convertToDate(a.getDataAgendamento());
                        
                    String dataAgendamento = FormatacaoData.convertToString(data);
                        
                    model.addRow(new Object[] {a.getIdAgendamento(),
                        f.getNome(), nomeServico, dataAgendamento, a.getHoraInicio(),
                        a.getHoraFim(), a.getStatus()});

                }
            }
            else{
            
                JOptionPane.showMessageDialog(rootPane, "O Cliente não realizou agendamentos no período solicitado");
            
            }
            
        }
        else{
            
            String message = "Cliente não cadastrado. Deseja cadastrar novo Cliente ?";
            String title = "Confirmação";

            int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);

            if(reply == JOptionPane.YES_OPTION)
            {
                //Se escolhida a opção "Sim", abrimos a janela de cadastro "FormNovoCliente".

                FormNovoCliente form = new FormNovoCliente(null, rootPaneCheckingEnabled);
                form.setVisible(true);
            }
            
        }
        
        
        
    }//GEN-LAST:event_btn_novoServicosPorCLientePesquisarAgendamentosActionPerformed

    private void btn_novoServicosPorCLienteGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoServicosPorCLienteGerarRelatorioActionPerformed
        
        Relatorios rel = new Relatorios();
        
        DaoClientes daoClientes = new DaoClientes();
        
        String cpf = txt_novoServicosPorCLienteCpf.getText().replaceAll("[./-]", "");
        
        String dataInicio = FormatacaoData.convertToString(date_novoServicosPorCLienteDe.getDate());
        
        String dataFim = FormatacaoData.convertToString(date_novoServicosPorCLienteAte.getDate());
        
        DaoClientes daoCli = new DaoClientes();
        
        DaoFuncionario daoFunc = new DaoFuncionario();
        
        Cliente c = daoCli.pesquisaClienteNome(txt_novoServicosPorCLienteNomeCliente.getText());
        
        Integer idCliente = c.getIdCliente();
        
        DaoAgendamento daoAgend = new DaoAgendamento();
        
        ArrayList<Agendamento> lista = daoAgend.agendamentoPorIdClienteIntervalo(idCliente, dataInicio, dataFim);
        
        rel.gravarServicosPorCliente(lista);
        
    }//GEN-LAST:event_btn_novoServicosPorCLienteGerarRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(FormServicosPorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormServicosPorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormServicosPorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormServicosPorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormServicosPorCliente dialog = new FormServicosPorCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_novoServicosPorCLienteBucar;
    private javax.swing.JButton btn_novoServicosPorCLienteGerarRelatorio;
    private javax.swing.JButton btn_novoServicosPorCLientePesquisarAgendamentos;
    private com.toedter.calendar.JDateChooser date_novoServicosPorCLienteAte;
    private com.toedter.calendar.JDateChooser date_novoServicosPorCLienteDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoRakusPeqNCli;
    private javax.swing.JTable tbl_novoServicosPorCLiente;
    private javax.swing.JFormattedTextField txt_novoServicosPorCLienteCpf;
    private javax.swing.JTextField txt_novoServicosPorCLienteNomeCliente;
    // End of variables declaration//GEN-END:variables
}