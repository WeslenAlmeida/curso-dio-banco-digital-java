public class Endereco {

    protected Cliente cliente;
    private String logadouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;

    public Endereco(Cliente cliente, String logadouro, String bairro, String cidade, String estado, String cep) {

        this.cliente = cliente;
        this.logadouro = logadouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
