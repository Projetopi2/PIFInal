
package piagendamentos;

import java.util.ArrayList;

public class DaoFuncionario extends Dao{

    
    public Funcionario pesquisaFuncionario(String nomeFuncionario){
        
        Funcionario f = new Funcionario();
        
        try{
        
            abrirConexao();

            String query = "SELECT * FROM FUNCIONARIO WHERE NOME LIKE ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setString(1, nomeFuncionario);
            
            rs = stmt.executeQuery();
            
            rs.next();
            
            f.setIdFuncionario(rs.getInt("ID_FUNC"));
            f.setNome(rs.getString("NOME"));
            f.setIdUnidade(rs.getInt("ID_UNIDADE"));
            f.setIdServico(rs.getInt("ID_SERVICO"));
            
            stmt.close();
            
            fecharConexao();
        
            return f;
        }
        catch(Exception e){
            
            System.out.println("Erro 11: " + e.getMessage());
            
            return null;
            
        }
    }
    
    
    public Funcionario pesquisaFuncionarioId(Integer idFuncionario){
        
        Funcionario f = new Funcionario();
        
        try{
        
            abrirConexao();

            String query = "SELECT * FROM FUNCIONARIO WHERE ID_FUNC LIKE ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setInt(1, idFuncionario);
            
            rs = stmt.executeQuery();
            
            rs.next();
            
            f.setIdFuncionario(rs.getInt("ID_FUNC"));
            f.setNome(rs.getString("NOME"));
            f.setIdUnidade(rs.getInt("ID_UNIDADE"));
            f.setIdServico(rs.getInt("ID_SERVICO"));
            
            stmt.close();
            
            fecharConexao();
        
            return f;
        }
        catch(Exception e){
            
            System.out.println("Erro 12: " + e.getMessage());
            
            return null;
            
        }
    }
    
    public ArrayList<Funcionario> pesquisaTodosFuncionarios(){
        
        ArrayList<Funcionario> lista = new ArrayList();
        
        try{
        
            abrirConexao();

            String query = "SELECT * FROM FUNCIONARIO";
            
            stmt = con.prepareStatement(query);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Funcionario f = new Funcionario();
                
                f.setIdFuncionario(rs.getInt("ID_FUNC"));
                f.setNome(rs.getString("NOME"));
                f.setIdUnidade(rs.getInt("ID_UNIDADE"));
                f.setIdServico(rs.getInt("ID_SERVICO"));
                
                lista.add(f);
                
            }
            stmt.close();
            
            fecharConexao();
        
            return lista;
        }
        catch(Exception e){
            
            System.out.println("Erro 12: " + e.getMessage());
            
            return null;
            
        }
    }
    
    public ArrayList<Funcionario> pesquisaFuncionariosIdUnidade(Integer idUnidade){
        
        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        
        try{
        
            abrirConexao();

            String query = "SELECT * FROM FUNCIONARIO WHERE ID_UNIDADE = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setInt(1, idUnidade);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Funcionario f = new Funcionario();
                
                f.setIdFuncionario(rs.getInt("ID_FUNC"));
                f.setNome(rs.getString("NOME"));
                f.setIdUnidade(rs.getInt("ID_UNIDADE"));
                f.setIdServico(rs.getInt("ID_SERVICO"));
                
                lista.add(f);
                
            }

            stmt.close();
            
            fecharConexao();
        
            return lista;
        }
        catch(Exception e){
            
            System.out.println("Erro 13: " + e.getMessage());
            
            return null;
            
        }
    }
    
    public ArrayList<String> pesquisaServicosPorUnidade(String nomeUnidade){
        
        ArrayList<String> lista = new ArrayList<>();
        
        String anterior = "";
        
        try{
        
            abrirConexao();

            String query = "select f.id_unidade, s.tipo_servico, u.nome_unidade from "
                    + "funcionario f inner join servico s on f.id_servico = s.id_servico "
                    + "inner join unidade u on f.id_unidade = u.id_unidade where "
                    + "u.nome_unidade = ? order by s.tipo_servico";
            
            stmt = con.prepareStatement(query);
            
            stmt.setString(1, nomeUnidade);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                if( ! rs.getString("tipo_servico").equals(anterior)){
                    
                    lista.add(rs.getString("tipo_servico"));
                    anterior = rs.getString("tipo_servico");
                }
                
            }

            stmt.close();
            
            fecharConexao();
        
            return lista;
        }
        catch(Exception e){
            
            System.out.println("Erro 14: " + e.getMessage());
            
            return null;
            
        }
    }
    
    public Integer pesquisaIdServicoPorNomeServico(String nomeServico){
        
        
        try{
        
            abrirConexao();

            String query = "select * from servico where id_servico = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setString(1, nomeServico);
            
            rs = stmt.executeQuery();
            
            rs.next();
                
            Integer idServico = rs.getInt("id_servico");

            stmt.close();
            
            fecharConexao();
        
            return idServico;
        }
        catch(Exception e){
            
            System.out.println("Erro 15: " + e.getMessage());
            
            return null;
            
        }
    }
    
    public String pesquisaNomeServicoPorIdServico(Integer idServico){
        
        
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
            
            System.out.println("Erro 16: " + e.getMessage());
            
            return null;
            
        }
    }
    
    public Integer pesquisaIdUnidadePorNomeUnidade(String nomeUnidade){
        
        
        try{
        
            abrirConexao();

            String query = "select * from unidade where id_unidade = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setString(1, nomeUnidade);
            
            rs = stmt.executeQuery();
            
            rs.next();
                
            Integer idUnidade = rs.getInt("id_unidade");

            stmt.close();
            
            fecharConexao();
        
            return idUnidade;
        }
        catch(Exception e){
            
            System.out.println("Erro 17: " + e.getMessage());
            
            return null;
            
        }
    }
    
    public ArrayList<String> pesquisaFuncionarioPorUnidade(String nomeUnidade){
        
        ArrayList<String> lista = new ArrayList<>();
        
        try{
        
            abrirConexao();

            String query = "select f.nome, u.nome_unidade, s.tipo_servico from funcionario f "
                    + "inner join servico s on f.id_servico = s.id_servico inner join unidade u "
                    + "on f.id_unidade = u.id_unidade where u.nome_unidade = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setString(1, nomeUnidade);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                lista.add(rs.getString("nome"));
                
            }

            stmt.close();
            
            fecharConexao();
        
            return lista;
        }
        catch(Exception e){
            
            System.out.println("Erro 18: " + e.getMessage());
            
            return null;
            
        }
    }
    
    public ArrayList<String> pesquisaFuncionarioPorUnidadeServico(String nomeUnidade, String nomeServico){
        
        ArrayList<String> lista = new ArrayList<>();
        
        try{
        
            abrirConexao();

            String query = "select f.nome, u.nome_unidade, s.tipo_servico from funcionario f "
                    + "inner join servico s on f.id_servico = s.id_servico inner join unidade u "
                    + "on f.id_unidade = u.id_unidade where u.nome_unidade = ? and s.tipo_servico = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setString(1, nomeUnidade);
            stmt.setString(2, nomeServico);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                lista.add(rs.getString("nome"));
                
            }

            stmt.close();
            
            fecharConexao();
        
            return lista;
        }
        catch(Exception e){
            
            System.out.println("Erro 19: " + e.getMessage());
            
            return null;
            
        }
    }
    
}
