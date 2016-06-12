
package piagendamentos;

public class Funcionario {
    
    
    private Integer idFuncionario;
    private String nome;
    private Integer idUnidade;
    private Integer idServico;

    
    //Construtor default
    
    public Funcionario() {
    }
    
    //Sobrecarga com passagem de parâmetros
    
    public Funcionario(Integer idFuncionario, String nome, Integer idUnidade, Integer idServico){
        
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.idUnidade = idUnidade;
        this.idServico = idServico;
        
    }
    
    
    // Getters
    
    public Integer getIdFuncionario()
    {
        return idFuncionario;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public Integer getIdUnidade()
    {
        return idUnidade;
    }
    
    public Integer getIdServico()
    {
        return idServico;
    }
    
    
    //Setters
    
    public void setIdFuncionario(Integer idFuncionario)
    {
        this.idFuncionario = idFuncionario;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setIdUnidade(Integer idUnidade)
    {
        this.idUnidade = idUnidade;
    }
    
    public void setIdServico(Integer idServico)
    {
        this.idServico = idServico;
    }
    

    //Sobrescrita do toString
    
    @Override
    public String toString() {
        return "\nFuncionario: " + idFuncionario + "\nNome: " + nome;
    }
    
}
