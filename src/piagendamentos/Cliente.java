
package piagendamentos;


public class Cliente 
{
    
    private Integer idCliente;
    private String nome;
    private String sexo;
    private String cpf;
    private String telefoneFixo;

    
    //Construtor default
    
    public Cliente() {
    }
    
    //Sobrecarga com passagem de parâmetros
    
    public Cliente(String nome, String cpf, String sexo, String telefone){
        
        this.nome = nome;
        this.telefoneFixo = telefone;
        this.sexo = sexo;
        this.cpf = cpf;
        
    }
    
    
    // Getters

    public Integer getIdCliente(){
        return idCliente;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getCpf()
    {
        return cpf;
    }
    
    public String getSexo()
    {
        return sexo;
    }
    
    public String getTelFixo()
    {
        return telefoneFixo;
    }
    
    
    //Setters
    
    public void setIdCliente(Integer idCliente)
    {
        this.idCliente = idCliente;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    
    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }
    
    public void setTelFixo(String telFixo)
    {
        this.telefoneFixo = telFixo;
    }
    
    
    //Sobrescrita do ToString
    
    @Override
    public String toString() {
        return "\nCliente: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefoneFixo + "\nSexo: " + sexo;
    }
    
}
