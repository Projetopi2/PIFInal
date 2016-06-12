
package piagendamentos;


public class Agendamento {
    
    
    private Integer idAgendamento;
    private Integer idFuncionario;
    private Integer idCliente;
    private String status;
    private Integer idServico;
    private Integer idUnidade;
    private String dataAgendamento;
    private String horaInicio;
    private String horaFim;

    
    //Construdor default
    
    public Agendamento() {
    }
    
    //Sobrecarga com passagem de parâmetros
    
    public Agendamento(Integer idAgendamento, Integer idFuncionario, Integer idCliente, 
            String status, Integer idServico, Integer idUnidade, String dataAgendamento, 
            String horaInicio, String horaFim){
        
        this.idAgendamento = idAgendamento;
        this.idFuncionario = idFuncionario;
        this.idCliente = idCliente;
        this.status = status;
        this.idServico = idServico;
        this.idUnidade = idUnidade;
        this.dataAgendamento = dataAgendamento;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        
    }
    
    // Getters
    
    public Integer getIdAgendamento()
    {
        return idAgendamento;
    }
    
    public Integer getIdFuncionario()
    {
        return idFuncionario;
    }
    
    public Integer getIdCliente()
    {
        return idCliente;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public Integer getIdServico()
    {
        return idServico;
    }
    
    public Integer getIdUnidade()
    {
        return idUnidade;
    }
    
    public String getDataAgendamento()
    {
        return dataAgendamento;
    }
    
    public String getHoraInicio()
    {
        return horaInicio;
    }
    
    public String getHoraFim()
    {
        return horaFim;
    }
    
    
    //Setters
    
    public void setIdAgendamento(Integer idAgendamento)
    {
        this.idAgendamento = idAgendamento;
    }
    
    public void setIdFuncionario(Integer idFuncionario)
    {
        this.idFuncionario = idFuncionario;
    }
    
    public void setIdCliente(Integer idCliente)
    {
        this.idCliente = idCliente;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public void setIdServico(Integer idServico)
    {
        this.idServico = idServico;
    }
    
    public void setIdUnidade(Integer idUnidade)
    {
        this.idUnidade = idUnidade;
    }
    
    public void setDataAgendamento(String dataAgendamento)
    {
        this.dataAgendamento = dataAgendamento;
    }
    
    public void setHoraInicio(String horaInicio)
    {
        this.horaInicio = horaInicio;
    }
    
    public void setHoraFim(String horaFim)
    {
        this.horaFim = horaFim;
    }

    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
