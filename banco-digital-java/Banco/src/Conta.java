public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO =1001;
    private static int SEQUENCIAL = 100;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {

        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(double valor) {

        this.saldo -= valor;

    }

    @Override
    public void depositar(double valor) {

        this.saldo += valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    public void imprimirConta() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Número: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
        System.out.println();
    }
}
