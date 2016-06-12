package piagendamentos;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DaoClientes extends Dao{

    
    private Cliente cliente;

        
    public void salvarCliente(Cliente cliente) {

        try {
            
            abrirConexao();

            String query = "INSERT INTO CLIENTE (NOME, TELEFONE, CPF, SEXO) VALUES (?,?,?,?)";

            stmt = con.prepareStatement(query);

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelFixo());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getSexo());

            stmt.execute();
            
            stmt.close();

            fecharConexao();

        } catch (SQLException ex) {
            System.out.println("Erro ao importar dados para o banco \nErro: " + ex.getMessage());
        }
    }

    
    
    public Cliente pesquisaCliente(String numeroCpf) {

        try {
            
            abrirConexao();
            
            Cliente c = new Cliente();

            String query = "SELECT * FROM CLIENTE WHERE CPF = ?";

            stmt = con.prepareStatement(query);

            stmt.setString(1, numeroCpf);

            rs = stmt.executeQuery();

            rs.next();

            c.setIdCliente(rs.getInt("ID_CLIENTE"));
            c.setNome(rs.getString("NOME"));
            c.setCpf(rs.getString("CPF"));
            c.setSexo(rs.getString("SEXO"));
            c.setTelFixo(rs.getString("TELEFONE"));

            stmt.close();
            
            fecharConexao();
            
            return c;

        } catch (SQLException ex) {
            System.out.println("CPF não encontrado");
            return null;
        }
    }
    
    
    public Cliente pesquisaClienteId(Integer idCliente) {

        try {
            
            abrirConexao();
            
            Cliente c = new Cliente();

            String query = "SELECT * FROM CLIENTE WHERE ID_CLIENTE = ?";

            stmt = con.prepareStatement(query);

            stmt.setInt(1, idCliente);

            rs = stmt.executeQuery();

            rs.next();

            c.setIdCliente(rs.getInt("ID_CLIENTE"));
            c.setNome(rs.getString("NOME"));
            c.setCpf(rs.getString("CPF"));
            c.setSexo(rs.getString("SEXO"));
            c.setTelFixo(rs.getString("TELEFONE"));

            stmt.close();
            
            fecharConexao();
            
            return c;

        } catch (SQLException ex) {
            System.out.println("CPF não encontrado");
            return null;
        }
    }
    
    
    public Cliente pesquisaClienteNome(String nomeCliente) {

        try {
            
            abrirConexao();
            
            Cliente c = new Cliente();

            String query = "SELECT * FROM CLIENTE WHERE NOME = ?";

            stmt = con.prepareStatement(query);

            stmt.setString(1, nomeCliente);

            rs = stmt.executeQuery();

            rs.next();

            c.setIdCliente(rs.getInt("ID_CLIENTE"));
            c.setNome(rs.getString("NOME"));
            c.setCpf(rs.getString("CPF"));
            c.setSexo(rs.getString("SEXO"));
            c.setTelFixo(rs.getString("TELEFONE"));

            stmt.close();
            
            fecharConexao();
            
            return c;

        } catch (SQLException ex) {
            System.out.println("Nome não encontrado");
            return null;
        }
    }
    
    
    public ArrayList<Cliente> findAll(){
        
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        
        try{
            
            abrirConexao();
        
            String query = "SELECT * FROM CLIENTE";
            
            stmt = con.prepareStatement(query);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Cliente c = new Cliente();
                
                c.setIdCliente(rs.getInt("id_cliente"));
                c.setNome(rs.getString("nome"));
                c.setTelFixo(rs.getString("telefone"));
                c.setCpf(rs.getString("cpf"));
                c.setSexo(rs.getString("sexo"));
                
                lista.add(c);
                
            }
            
            stmt.close();
            
            fecharConexao();

        }
        catch(Exception e){
            System.out.println("Erro 21: " + e.getMessage());
            //return null;
        }
        
        return lista;
    }
    
    
    public void alteraCliente(String cpf, String nome, String sexo, String telefone) {

        try {
            
            abrirConexao();
            
            String query = "UPDATE CLIENTE SET NOME = ?, SEXO = ?, TELEFONE = ? WHERE CPF = ?";
            
            stmt = con.prepareStatement(query);
            
            stmt.setString(1, nome);
            stmt.setString(2, sexo);
            stmt.setString(3, telefone);
            stmt.setString(4, cpf);
            
            stmt.execute();
            
            stmt.close();
            
            fecharConexao();
            

        } catch (SQLException ex) {
            System.out.println("Não foi possivel realizar a alteração de dados \nErro: " + ex.getMessage());
        }
        
    }
    

    public boolean verificaExistencia(String numeroCpf) {

        boolean existe = false;

        try {
            
            abrirConexao();

            String query = "SELECT * FROM CLIENTE WHERE CPF = ?";

            stmt = con.prepareStatement(query);

            stmt.setString(1, numeroCpf);

            rs = stmt.executeQuery();

            if(rs.next()){
                
                existe = true;
                
            }
            
            stmt.close();
            
            fecharConexao();
            
            return existe;

        } catch (SQLException ex) {
            System.out.println("Erro 22: " + ex.getMessage());
            
            return false;
        }
        
    }
    
    public void preencheTabela(JTable tabela){
        
        //Criando a tabela
            
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            
            model.setNumRows(0);

            try {
            
                DaoClientes dao = new DaoClientes();
            
                ArrayList<Cliente> lista = new ArrayList<>();
            
                lista = dao.findAll();
            
                if(lista != null){
                
                    for(Cliente c : lista){
                
                        model.addRow(new Object[] {c.getNome(), 
                        c.getCpf(), c.getSexo(), c.getTelFixo()});
                
                    }
                }


            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        
    }
}
