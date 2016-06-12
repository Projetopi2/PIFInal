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
import piagendamentos.util.FormatacaoData;
import piagendamentos.Funcionario;
import piagendamentos.util.Horarios;

/**
 *
 * @author Elder
 */
public class FormNovoAgendamento extends javax.swing.JDialog {

    /**
     * Creates new form FormNovoCliente
     */
    public FormNovoAgendamento(java.awt.Frame parent, boolean modal) {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbo_novoAgendamentoFuncionario = new javax.swing.JComboBox();
        cbo_novoAgendamentoServico = new javax.swing.JComboBox();
        cbo_novoAgendamentoHorario = new javax.swing.JComboBox();
        btn_novoAgendamentoBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_novoAgendamentoNomeCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        cbo_novoAgendamentoUnidade = new javax.swing.JComboBox();
        date_novoAgendamentoData = new com.toedter.calendar.JDateChooser();
        txt_CpfAgendamento = new javax.swing.JFormattedTextField();
        btn_novoAgendamentoVerificarAgenda = new javax.swing.JButton();
        btn_novoAgendamentoAgendar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btn_novoAgendamentoVerificarDisponibilidade = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_novoAgendamentoTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rankuspelus - Novo Agendamento");
        setResizable(false);

        logoRakusPeqNCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoRankupeluspequeno.gif"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados de Agendamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 16))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("CPF Cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Funcionário:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Horários Disponíveis:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Serviço:");

        cbo_novoAgendamentoFuncionario.setEnabled(false);

        cbo_novoAgendamentoServico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cera Feminina", "Cera Masculina", "Laser Feminino", "Laser Masculino", "Linha" }));
        cbo_novoAgendamentoServico.setEnabled(false);
        cbo_novoAgendamentoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_novoAgendamentoServicoActionPerformed(evt);
            }
        });

        cbo_novoAgendamentoHorario.setEnabled(false);

        btn_novoAgendamentoBuscar.setText("Buscar");
        btn_novoAgendamentoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoAgendamentoBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Data para Agendamento:");

        txt_novoAgendamentoNomeCliente.setEditable(false);
        txt_novoAgendamentoNomeCliente.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Cliente:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Unidade:");

        cbo_novoAgendamentoUnidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Interlagos", "Brooklin", "Faria Lima" }));
        cbo_novoAgendamentoUnidade.setEnabled(false);
        cbo_novoAgendamentoUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_novoAgendamentoUnidadeActionPerformed(evt);
            }
        });

        date_novoAgendamentoData.setEnabled(false);
        date_novoAgendamentoData.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_novoAgendamentoDataPropertyChange(evt);
            }
        });

        try {
            txt_CpfAgendamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_CpfAgendamento.setText("");

        btn_novoAgendamentoVerificarAgenda.setText("Verificar Agenda");
        btn_novoAgendamentoVerificarAgenda.setEnabled(false);
        btn_novoAgendamentoVerificarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoAgendamentoVerificarAgendaActionPerformed(evt);
            }
        });

        btn_novoAgendamentoAgendar.setText("Agendar");
        btn_novoAgendamentoAgendar.setEnabled(false);
        btn_novoAgendamentoAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoAgendamentoAgendarActionPerformed(evt);
            }
        });

        btn_novoAgendamentoVerificarDisponibilidade.setText("Verificar Disponibilidade");
        btn_novoAgendamentoVerificarDisponibilidade.setEnabled(false);
        btn_novoAgendamentoVerificarDisponibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoAgendamentoVerificarDisponibilidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbo_novoAgendamentoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbo_novoAgendamentoUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)
                                .addComponent(cbo_novoAgendamentoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)
                        .addComponent(btn_novoAgendamentoAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_CpfAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_novoAgendamentoBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date_novoAgendamentoData, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_novoAgendamentoVerificarDisponibilidade))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(36, 36, 36)
                        .addComponent(txt_novoAgendamentoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbo_novoAgendamentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_novoAgendamentoVerificarAgenda)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_novoAgendamentoBuscar)
                    .addComponent(txt_CpfAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_novoAgendamentoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbo_novoAgendamentoUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_novoAgendamentoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btn_novoAgendamentoVerificarAgenda)
                            .addComponent(cbo_novoAgendamentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date_novoAgendamentoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_novoAgendamentoVerificarDisponibilidade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbo_novoAgendamentoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_novoAgendamentoAgendar))
                .addContainerGap())
        );

        tbl_novoAgendamentoTable.setBackground(new java.awt.Color(204, 204, 204));
        tbl_novoAgendamentoTable.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        tbl_novoAgendamentoTable.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tbl_novoAgendamentoTable.setForeground(new java.awt.Color(0, 0, 102));
        tbl_novoAgendamentoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cód.", "Funcionário", "Serviço", "Data", "Horário Início", "Horário Fim", "Situação"
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
        tbl_novoAgendamentoTable.setFillsViewportHeight(true);
        tbl_novoAgendamentoTable.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_novoAgendamentoTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tbl_novoAgendamentoTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tbl_novoAgendamentoTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoRakusPeqNCli))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(logoRakusPeqNCli))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_novoAgendamentoVerificarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoAgendamentoVerificarAgendaActionPerformed

        if(cbo_novoAgendamentoFuncionario.getSelectedItem() != null){
        
            cbo_novoAgendamentoHorario.removeAllItems();
        
        
            String nomeFuncionario = cbo_novoAgendamentoFuncionario.getSelectedItem().toString();

        
            DefaultTableModel model = (DefaultTableModel) tbl_novoAgendamentoTable.getModel();
            
            model.setNumRows(0);
        
        
            DaoAgendamento daoAgend = new DaoAgendamento();
            DaoFuncionario daoFunc = new DaoFuncionario();
        
        
            Funcionario f = daoFunc.pesquisaFuncionario(nomeFuncionario);
        
            ArrayList<Agendamento> lista = daoAgend.agendamentoPorIdFuncionario(f.getIdFuncionario());
        
        
            if(lista != null){
        
                for(Agendamento a : lista){
            
                    String nomeServico = daoFunc.pesquisaNomeServicoPorIdServico(a.getIdServico());
                
                    model.addRow(new Object[] {a.getIdAgendamento(), 
                    f.getNome(), nomeServico, a.getDataAgendamento(), a.getHoraInicio(), 
                    a.getHoraFim(), a.getStatus()});
            
                }
            }
        
            btn_novoAgendamentoVerificarDisponibilidade.setEnabled(true);
            date_novoAgendamentoData.setEnabled(true);
        }
        else{
            
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar todos os campos: Unidade, Funcionário, Serviço");
            
        }
    }//GEN-LAST:event_btn_novoAgendamentoVerificarAgendaActionPerformed

    
    private void cbo_novoAgendamentoUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_novoAgendamentoUnidadeActionPerformed

        //Para que os itens não se acumulem infinitamente, a cada pesquisa de cliente,
        //deletamos seus dados para, no método abaixo, populá-lo novamente.

        cbo_novoAgendamentoServico.removeAllItems();
        
        cbo_novoAgendamentoFuncionario.removeAllItems();

        DaoFuncionario d = new DaoFuncionario();

        String nomeUnidade = cbo_novoAgendamentoUnidade.getSelectedItem().toString();
        
        ArrayList<String> lista = d.pesquisaServicosPorUnidade(nomeUnidade);
        
        for(String s : lista){
            
            cbo_novoAgendamentoServico.addItem(s);
            
        }

    }//GEN-LAST:event_cbo_novoAgendamentoUnidadeActionPerformed

    private void btn_novoAgendamentoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoAgendamentoBuscarActionPerformed

        
        
        //Instanciando a classe de DaoCLientes, utilizada para pesquisas, alterações e inclusões no banco.

        DaoClientes daoClientes = new DaoClientes();

        cbo_novoAgendamentoHorario.removeAllItems();
        
        String cpf = txt_CpfAgendamento.getText().replaceAll("[./-]", "");
        
        

        //Passa para o método "verificaExistencia" da classe DaoClientes, o cpf informado no textbox.
        //Se o método "verificaExistencia"retornar true, significa que o cpf foi encontrado no banco de dados

        if(daoClientes.verificaExistencia(cpf)){

            //Instanciando um cliente utilizando o método pesquisaCliente, passando como parêmatro o cpf
            //resgatado na textbox e recebendo como retorno um object Cliente.

            Cliente cliente = daoClientes.pesquisaCliente(cpf);

            //Setando o texto da textBox com o nome do cliente retornado no método "pesquisaCliente".

            txt_novoAgendamentoNomeCliente.setText(cliente.getNome());

            //Abrindo a visibilidade dos objetos de pesquisa.
            
            txt_novoAgendamentoNomeCliente.setEnabled(true);
            cbo_novoAgendamentoUnidade.setEnabled(true);
            cbo_novoAgendamentoFuncionario.setEnabled(true);
            cbo_novoAgendamentoServico.setEnabled(true);
            btn_novoAgendamentoVerificarAgenda.setEnabled(true);
            
            
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

    }//GEN-LAST:event_btn_novoAgendamentoBuscarActionPerformed

    private void btn_novoAgendamentoAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoAgendamentoAgendarActionPerformed
        
        String dataAtual = FormatacaoData.getDateTime();
        
        Date dataSistema = FormatacaoData.convertToDate(dataAtual);
        
        Date dataColetada = date_novoAgendamentoData.getDate();
        
        if(FormatacaoData.verificaDataAnterior(dataSistema, dataColetada)){
        
            String message = "Realizar o agendamento ?";
            String title = "Confirmação";

            int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);

            if(reply == JOptionPane.YES_OPTION){ 
                
                DaoFuncionario daoFunc = new DaoFuncionario();
        
                DaoClientes daoCli = new DaoClientes();
        
                DaoAgendamento daoAgend = new DaoAgendamento();
        
        
                String horarioSelecionado = cbo_novoAgendamentoHorario.getSelectedItem().toString();
        
                System.out.println(horarioSelecionado);
        
        
                Horarios h = daoAgend.horaInicioHoraFim(horarioSelecionado);

        
                String nomeFuncionario = cbo_novoAgendamentoFuncionario.getSelectedItem().toString();
        
                String nomeCliente = txt_novoAgendamentoNomeCliente.getText();
        
                Funcionario f = daoFunc.pesquisaFuncionario(nomeFuncionario);
            
                Cliente c = daoCli.pesquisaClienteNome(nomeCliente);
        
        
                Agendamento a = new Agendamento();

                a.setIdFuncionario(f.getIdFuncionario());
                a.setIdCliente(c.getIdCliente());
                a.setStatus("Agendado");
                a.setIdServico(f.getIdServico());
                a.setIdUnidade(f.getIdUnidade());
                a.setDataAgendamento(FormatacaoData.convertToString(date_novoAgendamentoData.getDate()));
                a.setHoraInicio(h.getHoraInicio());
                a.setHoraFim(h.getHoraFim());
        
                daoAgend.salvarAgendamento(a);
                
                
                DefaultTableModel model = (DefaultTableModel) tbl_novoAgendamentoTable.getModel();
            
                model.setNumRows(0);
                
                ArrayList<Agendamento> lista = daoAgend.agendamentoPorIdFuncionario(f.getIdFuncionario());
        
        
                if(lista != null){
        
                    for(Agendamento b : lista){
            
                        String nomeServico = daoFunc.pesquisaNomeServicoPorIdServico(b.getIdServico());
                
                        model.addRow(new Object[] {b.getIdAgendamento(), 
                        f.getNome(), nomeServico, b.getDataAgendamento(), b.getHoraInicio(), 
                        b.getHoraFim(), b.getStatus()});
            
                    }
                }
            }       
        }
        else{
            
            JOptionPane.showMessageDialog(rootPane, "A data escolhida não pode ser anterior à data de hoje");
            
        } 

    }//GEN-LAST:event_btn_novoAgendamentoAgendarActionPerformed

    private void cbo_novoAgendamentoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_novoAgendamentoServicoActionPerformed
        
        try{
        
            cbo_novoAgendamentoFuncionario.removeAllItems();
        
            String nomeUnidade = cbo_novoAgendamentoUnidade.getSelectedItem().toString();
            String nomeServico = cbo_novoAgendamentoServico.getSelectedItem().toString();
        
            DaoFuncionario d = new DaoFuncionario();
        
            ArrayList<String> lista = d.pesquisaFuncionarioPorUnidadeServico(nomeUnidade, nomeServico);
        
            for(String s : lista){
            
                cbo_novoAgendamentoFuncionario.addItem(s);
            
            }
        }
        catch(Exception e){
                
                System.out.println(e.getMessage());
                
        }
        
    }//GEN-LAST:event_cbo_novoAgendamentoServicoActionPerformed

    private void btn_novoAgendamentoVerificarDisponibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoAgendamentoVerificarDisponibilidadeActionPerformed
        
        if(date_novoAgendamentoData.getDate() != null){
        
            cbo_novoAgendamentoHorario.setEnabled(true);
            btn_novoAgendamentoAgendar.setEnabled(true);
        
            cbo_novoAgendamentoHorario.removeAllItems();
        
            String nomeFuncionario = cbo_novoAgendamentoFuncionario.getSelectedItem().toString();
        
            String data = FormatacaoData.convertToString(date_novoAgendamentoData.getDate());
        
        
            DaoAgendamento daoAgend = new DaoAgendamento();
        
            DaoFuncionario daoFunc = new DaoFuncionario();
        
        
            Funcionario f = daoFunc.pesquisaFuncionario(nomeFuncionario);
        
        
            ArrayList<String> horariosDisponiveis = daoAgend.verificaHorariosDisponiveisComSituacao(f.getIdFuncionario(), data);
        
            for(String s : horariosDisponiveis){
                
                cbo_novoAgendamentoHorario.addItem(s);
                
            }
        }
        else{
            
            JOptionPane.showMessageDialog(rootPane, "Selecione uma data");
            
        }
    }//GEN-LAST:event_btn_novoAgendamentoVerificarDisponibilidadeActionPerformed

    private void date_novoAgendamentoDataPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_novoAgendamentoDataPropertyChange
        
        cbo_novoAgendamentoHorario.setEnabled(false);
        btn_novoAgendamentoAgendar.setEnabled(false);
        
    }//GEN-LAST:event_date_novoAgendamentoDataPropertyChange

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
            java.util.logging.Logger.getLogger(FormNovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormNovoAgendamento dialog = new FormNovoAgendamento(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_novoAgendamentoAgendar;
    private javax.swing.JButton btn_novoAgendamentoBuscar;
    private javax.swing.JButton btn_novoAgendamentoVerificarAgenda;
    private javax.swing.JButton btn_novoAgendamentoVerificarDisponibilidade;
    private javax.swing.JComboBox cbo_novoAgendamentoFuncionario;
    private javax.swing.JComboBox cbo_novoAgendamentoHorario;
    private javax.swing.JComboBox cbo_novoAgendamentoServico;
    private javax.swing.JComboBox cbo_novoAgendamentoUnidade;
    private com.toedter.calendar.JDateChooser date_novoAgendamentoData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoRakusPeqNCli;
    private javax.swing.JTable tbl_novoAgendamentoTable;
    private javax.swing.JFormattedTextField txt_CpfAgendamento;
    private javax.swing.JTextField txt_novoAgendamentoNomeCliente;
    // End of variables declaration//GEN-END:variables
}
