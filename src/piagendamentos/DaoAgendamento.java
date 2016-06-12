
package piagendamentos;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import piagendamentos.util.Horarios;

public class DaoAgendamento extends Dao{
    
    
    public void salvarAgendamento(Agendamento a){
        
        try{
            
            abrirConexao();
            
            String query = "INSERT INTO AGENDAMENTO(ID_FUNC, ID_CLIENTE, STATUS, ID_SERVICO, "
                    + "ID_UNIDADE, DATA_AGENDA, HORA_INICIO_AGENDA, HORA_FINAL_AGENDA) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            
            stmt = con.prepareStatement(query);
            
            stmt.setInt(1, a.getIdFuncionario());
            stmt.setInt(2, a.getIdCliente());
            stmt.setString(3, a.getStatus());
            stmt.setInt(4, a.getIdServico());
            stmt.setInt(5, a.getIdUnidade());
            stmt.setString(6, a.getDataAgendamento());
            stmt.setString(7, a.getHoraInicio());
            stmt.setString(8, a.getHoraFim());
            
            stmt.execute();
            
            stmt.close();
            
            fecharConexao();
            
            JOptionPane.showMessageDialog(null, "Agendamento realizado com sucesso.");
            
        }
        catch(Exception e){
            System.out.println("Erro 1: " + e.getMessage());
        } 
    }
    
    public void updateAgendamento(Agendamento a){
        
        try{
            
            abrirConexao();
            
            String query = "UPDATE AGENDAMENTO SET STATUS = ?, HORA_INICIO_AGENDA = ?, "
                    + "HORA_FINAL_AGENDA = ? WHERE ID_AGENDAMENTO = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setString(1, a.getStatus());
            stmt.setString(2, a.getHoraInicio());
            stmt.setString(3, a.getHoraFim());
            stmt.setInt(4, a.getIdAgendamento());
            
            stmt.execute();
            
            stmt.close();
            
            fecharConexao();
            
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso.");
            
        }
        catch(Exception e){
            System.out.println("Erro 1: " + e.getMessage());
        } 
    }
    
    
    public ArrayList<Agendamento> selectAll(){
        
        ArrayList<Agendamento> lista = new ArrayList<>();
        
        try{
            
            abrirConexao();
            
            String query = "select * from agendamento";
            
            stmt = con.prepareStatement(query);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Agendamento a = new Agendamento();
                
                a.setIdAgendamento(rs.getInt("id_agendamento"));
                a.setIdFuncionario(rs.getInt("id_func"));
                a.setIdCliente(rs.getInt("id_cliente"));
                a.setStatus(rs.getString("status"));
                a.setIdServico(rs.getInt("id_servico"));
                a.setIdUnidade(rs.getInt("id_unidade"));
                a.setDataAgendamento(rs.getString("data_agenda"));
                a.setHoraInicio(rs.getString("hora_inicio_agenda"));
                a.setHoraFim(rs.getString("hora_final_agenda"));
                
                lista.add(a);
                
            }
            
            stmt.close();
            
            fecharConexao();
            
            return lista;
            
        }
        catch(Exception e){
            System.out.println("Erro 2: " + e.getMessage());
            return null;
        }
        
    }
    
    public ArrayList<Agendamento> pesquisaAgendamentosEmExecucaoPorUnidade(String status, int idUnidade, String dataAtual){
        
        ArrayList<Agendamento> lista = new ArrayList<>();
        
        try{
            
            abrirConexao();
            
            String query = "select * from agendamento where data_agenda = ? and id_unidade = ? and status = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setString(1, dataAtual);
            stmt.setInt(2, idUnidade);
            stmt.setString(3, status);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Agendamento a = new Agendamento();
                
                a.setIdAgendamento(rs.getInt("id_agendamento"));
                a.setIdFuncionario(rs.getInt("id_func"));
                a.setIdCliente(rs.getInt("id_cliente"));
                a.setStatus(rs.getString("status"));
                a.setIdServico(rs.getInt("id_servico"));
                a.setIdUnidade(rs.getInt("id_unidade"));
                a.setDataAgendamento(rs.getString("data_agenda"));
                a.setHoraInicio(rs.getString("hora_inicio_agenda"));
                a.setHoraFim(rs.getString("hora_final_agenda"));
                
                lista.add(a);
                
            }
            
            stmt.close();
            
            fecharConexao();
            
            return lista;
            
        }
        catch(Exception e){
            System.out.println("Erro 2: " + e.getMessage());
            return null;
        }
        
    }
    
    public String nomeServiço(Integer idServico){
        
        try{
            
            abrirConexao();
            
            String query = "select * from servico where id_servico = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setInt(1, idServico);
            
            rs = stmt.executeQuery();
            
            rs.next();
                
            String nomeServico = rs.getString("tipo_servico");
            
            stmt.close();
            
            fecharConexao();
            
            return nomeServico;
            
        }
        catch(Exception e){
            System.out.println("Erro 2: " + e.getMessage());
            return null;
        }
        
    }
    
    public String nomeUnidade(Integer idUnidade){
        
        try{
            
            abrirConexao();
            
            String query = "select * from unidade where id_unidade = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setInt(1, idUnidade);
            
            rs = stmt.executeQuery();
            
            rs.next();
                
            String nomeUnidade = rs.getString("nome_unidade");
            
            stmt.close();
            
            fecharConexao();
            
            return nomeUnidade;
            
        }
        catch(Exception e){
            System.out.println("Erro 2: " + e.getMessage());
            return null;
        }
        
    }
    
    public ArrayList<Agendamento> pesquisaAgendamentosPorDataEFuncionario(String dataInicio, String dataFim, Integer idFuncionario, String status){
        
        ArrayList<Agendamento> lista = new ArrayList<>();
        
        try{
            
            abrirConexao();
            
            String query = "select * from agendamento where data_agenda between ? and ? "
                    + "and id_func = ? and status = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setString(1, dataInicio);
            stmt.setString(2, dataFim);
            stmt.setInt(3, idFuncionario);
            stmt.setString(4, status);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Agendamento a = new Agendamento();
                
                a.setIdAgendamento(rs.getInt("id_agendamento"));
                a.setIdFuncionario(rs.getInt("id_func"));
                a.setIdCliente(rs.getInt("id_cliente"));
                a.setStatus(rs.getString("status"));
                a.setIdServico(rs.getInt("id_servico"));
                a.setIdUnidade(rs.getInt("id_unidade"));
                a.setDataAgendamento(rs.getString("data_agenda"));
                a.setHoraInicio(rs.getString("hora_inicio_agenda"));
                a.setHoraFim(rs.getString("hora_final_agenda"));
                
                lista.add(a);
                
            }
            
            stmt.close();
            
            fecharConexao();
            
            return lista;
            
        }
        catch(Exception e){
            System.out.println("Erro 2: " + e.getMessage());
            return null;
        }
        
    }
    
    public Agendamento agendamentoPorIdAgendamento(Integer idAgendamento){
        
        
        try{
            
            abrirConexao();
            
            String query = "select * from agendamento where id_agendamento = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setInt(1, idAgendamento);
            
            rs = stmt.executeQuery();
            
            rs.next();
                
                Agendamento a = new Agendamento();
                
                a.setIdAgendamento(rs.getInt("id_agendamento"));
                a.setIdFuncionario(rs.getInt("id_func"));
                a.setIdCliente(rs.getInt("id_cliente"));
                a.setStatus(rs.getString("status"));
                a.setIdServico(rs.getInt("id_servico"));
                a.setIdUnidade(rs.getInt("id_unidade"));
                a.setDataAgendamento(rs.getString("data_agenda"));
                //a.setDataAgendamento(FormatacaoData.convertToString(rs.getDate("data_agenda")));
                a.setHoraInicio(rs.getString("hora_inicio_agenda"));
                a.setHoraFim(rs.getString("hora_final_agenda"));
                
            
            stmt.close();
            
            fecharConexao();
            
            return a;
            
        }
        catch(Exception e){
            System.out.println("Erro 3: " + e.getMessage());
            return null;
        }
        
    }
    
    public ArrayList<Agendamento> agendamentoPorIdFuncionario(Integer idFuncionario){
        
        ArrayList<Agendamento> lista = new ArrayList<>();
        
        try{
            
            abrirConexao();
            
            String query = "select * from agendamento where id_func = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setInt(1, idFuncionario);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Agendamento a = new Agendamento();
                
                a.setIdAgendamento(rs.getInt("id_agendamento"));
                a.setIdFuncionario(rs.getInt("id_func"));
                a.setIdCliente(rs.getInt("id_cliente"));
                a.setStatus(rs.getString("status"));
                a.setIdServico(rs.getInt("id_servico"));
                a.setIdUnidade(rs.getInt("id_unidade"));
                a.setDataAgendamento(rs.getString("data_agenda"));
                a.setHoraInicio(rs.getString("hora_inicio_agenda"));
                a.setHoraFim(rs.getString("hora_final_agenda"));
                
                lista.add(a);
                
            }
            
            stmt.close();
            
            fecharConexao();
            
            return lista;
            
        }
        catch(Exception e){
            System.out.println("Erro 4: " + e.getMessage());
            return null;
        }
        
    }
    
    public ArrayList<Agendamento> agendamentoPorIdClienteIntervalo(Integer idCliente, String dataInicio, String dataFim){
        
        ArrayList<Agendamento> lista = new ArrayList<>();
        
        try{
            
            abrirConexao();
            
            String query = "select * from agendamento where id_cliente = ? and data_agenda between ? and ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setInt(1, idCliente);
            stmt.setString(2, dataInicio);
            stmt.setString(3, dataFim);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Agendamento a = new Agendamento();
                
                a.setIdAgendamento(rs.getInt("id_agendamento"));
                a.setIdFuncionario(rs.getInt("id_func"));
                a.setIdCliente(rs.getInt("id_cliente"));
                a.setStatus(rs.getString("status"));
                a.setIdServico(rs.getInt("id_servico"));
                a.setIdUnidade(rs.getInt("id_unidade"));
                a.setDataAgendamento(rs.getString("data_agenda"));
                a.setHoraInicio(rs.getString("hora_inicio_agenda"));
                a.setHoraFim(rs.getString("hora_final_agenda"));
                
                lista.add(a);
                
            }
            
            stmt.close();
            
            fecharConexao();
            
            return lista;
            
        }
        catch(Exception e){
            System.out.println("Erro 4: " + e.getMessage());
            return null;
        }
        
    }
    
    public ArrayList<Agendamento> agendamentoPorIdFuncionarioIntervalo(Integer idFuncionario, String dataInicio, String dataFim){
        
        ArrayList<Agendamento> lista = new ArrayList<>();
        
        try{
            
            abrirConexao();
            
            String query = "select * from agendamento where id_func = ? and data_agenda between ? and ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setInt(1, idFuncionario);
            stmt.setString(2, dataInicio);
            stmt.setString(3, dataFim);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Agendamento a = new Agendamento();
                
                a.setIdAgendamento(rs.getInt("id_agendamento"));
                a.setIdFuncionario(rs.getInt("id_func"));
                a.setIdCliente(rs.getInt("id_cliente"));
                a.setStatus(rs.getString("status"));
                a.setIdServico(rs.getInt("id_servico"));
                a.setIdUnidade(rs.getInt("id_unidade"));
                a.setDataAgendamento(rs.getString("data_agenda"));
                a.setHoraInicio(rs.getString("hora_inicio_agenda"));
                a.setHoraFim(rs.getString("hora_final_agenda"));
                
                lista.add(a);
                
            }
            
            stmt.close();
            
            fecharConexao();
            
            return lista;
            
        }
        catch(Exception e){
            System.out.println("Erro 4: " + e.getMessage());
            return null;
        }
        
    }
    
    public ArrayList<Agendamento> agendamentoPorCliente(Cliente c){
        
        ArrayList<Agendamento> lista = new ArrayList<>();
        
        try{
            
            abrirConexao();
            
            String query = "select * from agendamento where id_cliente = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setInt(1, c.getIdCliente());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Agendamento a = new Agendamento();
                
                a.setIdAgendamento(rs.getInt("id_agendamento"));
                a.setIdFuncionario(rs.getInt("id_func"));
                a.setIdCliente(rs.getInt("id_cliente"));
                a.setStatus(rs.getString("status"));
                a.setIdServico(rs.getInt("id_servico"));
                a.setIdUnidade(rs.getInt("id_unidade"));
                a.setDataAgendamento(rs.getString("data_agenda"));
                a.setHoraInicio(rs.getString("hora_inicio_agenda"));
                a.setHoraFim(rs.getString("hora_final_agenda"));
                
                lista.add(a);
                
            }
            
            stmt.close();
            
            fecharConexao();
            
            return lista;
            
        }
        catch(Exception e){
            System.out.println("Erro 4: " + e.getMessage());
            return null;
        }
        
    }
    
    public ArrayList<String> verificaHorariosDisponiveisComSituacao(Integer idFuncionario, String data){
        
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> listaDisponivel = new ArrayList<>(Arrays.asList("08:00", "09:00", 
                "10:00", "11:00", "13:00", "14:00", "15:00", "16:00", "17:00"));
        
        
        try{
            
            abrirConexao();
            
            String query = "select * from agendamento where id_func = ? and data_agenda = ? and status = 'Agendado'";
            
            stmt = con.prepareStatement(query);
            
            stmt.setInt(1, idFuncionario);
            stmt.setString(2, data);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                if(rs.getString("status").equalsIgnoreCase("Agendado")){
                    
                    String hora = rs.getString("hora_inicio_agenda");
                
                    lista.add(hora);
                    
                }
                
            }
            
            stmt.close();
            
            fecharConexao();
            
            
            for(String a : lista){
                
                for(int i = 0; i < listaDisponivel.size(); i++){
                   
                    if(a.equals(listaDisponivel.get(i))){
                        
                        listaDisponivel.remove(i);
                        
                    }
                }
            }
                
            return listaDisponivel;
            
        }
        catch(Exception e){
            System.out.println("Erro 5: " + e.getMessage());
            return null;
        }
    }
    
    public ArrayList<String> verificaHorariosDisponiveis(Integer idFuncionario, String data){
        
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> listaDisponivel = new ArrayList<>(Arrays.asList("08:00", "09:00", 
                "10:00", "11:00", "13:00", "14:00", "15:00", "16:00", "17:00"));
        
        
        try{
            
            abrirConexao();
            
            String query = "select * from agendamento where id_func = ? and data_agenda = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setInt(1, idFuncionario);
            stmt.setString(2, data);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                String hora = rs.getString("hora_inicio_agenda");
                
                lista.add(hora);
                
            }
            
            stmt.close();
            
            fecharConexao();
            
            
            for(String a : lista){
                
                for(int i = 0; i < listaDisponivel.size(); i++){
                    
                    if(a.equals(listaDisponivel.get(i))){
                        
                        listaDisponivel.remove(i);
                        
                    }
                    
                }
                
            }
            
            
            return listaDisponivel;
            
        }
        catch(Exception e){
            System.out.println("Erro 6: " + e.getMessage());
            return null;
        }
        
    }
    
    public ArrayList<Agendamento> pesquisaAgendamentosPorIntervalo(String dataInicio, String dataFim, Integer idFuncionario){
        
        ArrayList<Agendamento> lista = new ArrayList<>();
        
        try{
            
            abrirConexao();
            
            String query = "select * from agendamento where data_agenda between date('?') and date('?') and id_func = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setString(1, dataInicio);
            stmt.setString(2, dataFim);
            stmt.setInt(3, idFuncionario);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Agendamento a = new Agendamento();
                
                a.setIdAgendamento(rs.getInt("id_agendamento"));
                a.setIdFuncionario(rs.getInt("id_func"));
                a.setIdCliente(rs.getInt("id_cliente"));
                a.setStatus(rs.getString("status"));
                a.setIdServico(rs.getInt("id_servico"));
                a.setIdUnidade(rs.getInt("id_unidade"));
                a.setDataAgendamento(rs.getString("data_agenda"));
                a.setHoraInicio(rs.getString("hora_inicio_agenda"));
                a.setHoraFim(rs.getString("hora_final_agenda"));
                
                lista.add(a);
                
            }
            
            stmt.close();
            
            fecharConexao();
            
            return lista;
            
        }
        catch(Exception e){
            System.out.println("Erro 4: " + e.getMessage());
            return null;
        }
        
    }
    
    public ArrayList<String> pesquisaUnidades(){
        
        ArrayList<String> lista = new ArrayList<>();
        
        try{
            
            abrirConexao();
            
            String query = "select * from unidade";
            
            stmt = con.prepareStatement(query);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                String nomeUnidade = rs.getString("nome_unidade");
                
                lista.add(nomeUnidade);
                
            }
            
            stmt.close();
            
            fecharConexao();
            
            return lista;
            
        }
        catch(Exception e){
            System.out.println("Erro 5: " + e.getMessage());
            return null;
        }
        
    }
    
    public Integer pesquisaUnidadePorNomeUnidade(String nomeUnidade){
        
        Integer idUnidade = null;
        
        try{
            
            abrirConexao();
            
            String query = "select * from unidade where nome_unidade = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setString(1, nomeUnidade);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                idUnidade = rs.getInt("id_unidade");
                
            }
            
            stmt.close();
            
            fecharConexao();
            
            return idUnidade;
            
        }
        catch(Exception e){
            System.out.println("Erro 5: " + e.getMessage());
            return null;
        }
        
    }
    
    public Horarios horaInicioHoraFim(String horarioSelecionado){
        
        Horarios h = new Horarios();
        
        if(horarioSelecionado.equals("08:00")){
            
            h.setHoraInicio("08:00");
            h.setHoraFim("09:00");
            
        }
        else if(horarioSelecionado.equals("09:00")){
            
            h.setHoraInicio("09:00");
            h.setHoraFim("10:00");
            
        }
        else if(horarioSelecionado.equals("10:00")){
            
            h.setHoraInicio("10:00");
            h.setHoraFim("11:00");
            
        }
        else if(horarioSelecionado.equals("11:00")){
            
            h.setHoraInicio("11:00");
            h.setHoraFim("12:00");
            
        }
        else if(horarioSelecionado.equals("13:00")){
            
            h.setHoraInicio("13:00");
            h.setHoraFim("14:00");
            
        }
        else if(horarioSelecionado.equals("15:00")){
            
            h.setHoraInicio("15:00");
            h.setHoraFim("16:00");
            
        }
        else if(horarioSelecionado.equals("16:00")){
            
            h.setHoraInicio("16:00");
            h.setHoraFim("17:00");
            
        }
        else{
            
            h.setHoraInicio("17:00");
            h.setHoraFim("18:00");
            
        }
        
        return h;
        
    }
    
    
    
}
