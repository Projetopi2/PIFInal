
package piagendamentos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Relatorios {

    
	private FileWriter arquivo;
	

	public void gravarServicosEmExecucao(ArrayList<Agendamento> lista) {
		
            //Montando o txt, linha a linha
		
            try{
                
                arquivo = new FileWriter(new File("c:\\temp\\servicosEmExecucao.txt"), true);
            
                for(Agendamento a : lista){
                    
                    DaoFuncionario daoFunc = new DaoFuncionario();
                    DaoClientes daoCli = new DaoClientes();
                    
                    DaoAgendamento daoAgend = new DaoAgendamento();
                    
                    Funcionario f = daoFunc.pesquisaFuncionarioId(a.getIdFuncionario());
                    Cliente c = daoCli.pesquisaClienteId(a.getIdCliente());
                    
                    arquivo.write("\nDados do Agendamento:");
                    arquivo.write("\nId do Agendamento..........: " + a.getIdAgendamento());
                    arquivo.write("\nFuncionário................: " + f.getNome());
                    arquivo.write("\nCliente....................: " + c.getNome());
                    arquivo.write("\nStatus.....................: " + a.getStatus());
                    arquivo.write("\nServiço....................: " + daoAgend.nomeServiço(a.getIdServico()));
                    arquivo.write("\nUnidade....................: " + daoAgend.nomeUnidade(a.getIdUnidade()));
                    arquivo.write("\nData Agendamento...........: " + a.getDataAgendamento());
                    arquivo.write("\nHora Início................: " + a.getHoraInicio());
                    arquivo.write("\nHora Fim...................: " + a.getHoraFim());
                    arquivo.write("\n");
                    
                }
                
                arquivo.close();
                
            }
            catch(Exception e){
                        
                System.out.println("Erro: Salvar arquivo 1" + e.getMessage());
                        
            }

        }
        
        public void gravarServicosPorCliente(ArrayList<Agendamento> lista) {
		
            //Montando o txt, linha a linha
		
            try{
                
                arquivo = new FileWriter(new File("c:\\temp\\servicosPorCliente.txt"), true);
            
                for(Agendamento a : lista){
                    
                    DaoFuncionario daoFunc = new DaoFuncionario();
                    DaoClientes daoCli = new DaoClientes();
                    
                    DaoAgendamento daoAgend = new DaoAgendamento();
                    
                    Funcionario f = daoFunc.pesquisaFuncionarioId(a.getIdFuncionario());
                    Cliente c = daoCli.pesquisaClienteId(a.getIdCliente());
                    
                    arquivo.write("\nDados do Agendamento:");
                    arquivo.write("\nId do Agendamento..........: " + a.getIdAgendamento());
                    arquivo.write("\nFuncionário................: " + f.getNome());
                    arquivo.write("\nCliente....................: " + c.getNome());
                    arquivo.write("\nStatus.....................: " + a.getStatus());
                    arquivo.write("\nServiço....................: " + daoAgend.nomeServiço(a.getIdServico()));
                    arquivo.write("\nUnidade....................: " + daoAgend.nomeUnidade(a.getIdUnidade()));
                    arquivo.write("\nData Agendamento...........: " + a.getDataAgendamento());
                    arquivo.write("\nHora Início................: " + a.getHoraInicio());
                    arquivo.write("\nHora Fim...................: " + a.getHoraFim());
                    arquivo.write("\n");
                    
                }
                
                arquivo.close();
                
            }
            catch(Exception e){
                        
                System.out.println("Erro: Salvar arquivo 2" + e.getMessage());
                        
            }

        }
        
        public void gravarServicosPorFuncionario(ArrayList<Agendamento> lista) {
		
            //Montando o txt, linha a linha
		
            try{
                
                arquivo = new FileWriter(new File("c:\\temp\\servicosPorFuncionario.txt"), true);
            
                for(Agendamento a : lista){
                    
                    DaoFuncionario daoFunc = new DaoFuncionario();
                    DaoClientes daoCli = new DaoClientes();
                    
                    DaoAgendamento daoAgend = new DaoAgendamento();
                    
                    Funcionario f = daoFunc.pesquisaFuncionarioId(a.getIdFuncionario());
                    Cliente c = daoCli.pesquisaClienteId(a.getIdCliente());
                    
                    arquivo.write("\nDados do Agendamento:");
                    arquivo.write("\nId do Agendamento..........: " + a.getIdAgendamento());
                    arquivo.write("\nFuncionário................: " + f.getNome());
                    arquivo.write("\nCliente....................: " + c.getNome());
                    arquivo.write("\nStatus.....................: " + a.getStatus());
                    arquivo.write("\nServiço....................: " + daoAgend.nomeServiço(a.getIdServico()));
                    arquivo.write("\nUnidade....................: " + daoAgend.nomeUnidade(a.getIdUnidade()));
                    arquivo.write("\nData Agendamento...........: " + a.getDataAgendamento());
                    arquivo.write("\nHora Início................: " + a.getHoraInicio());
                    arquivo.write("\nHora Fim...................: " + a.getHoraFim());
                    arquivo.write("\n");
                    
                }
                
                arquivo.close();
                
            }
            catch(Exception e){
                        
                System.out.println("Erro: Salvar arquivo 2" + e.getMessage());
                        
            }

        }
}

    

