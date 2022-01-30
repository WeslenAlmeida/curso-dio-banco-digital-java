public class Main {

    public static void main(String[] args) {

        Cliente weslen = new Cliente("Weslen Almeida", "000.000.000-00", "00.000.000-0");

        Endereco weslenEndereco = new Endereco(weslen, "Av 1, n 900", "Jd Mattos", "Araraquara",
                "SP","14800-000");

        Conta cc = new ContaCorrente(weslen);

        Conta poupanca = new ContaPoupanca(weslen);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirConta();
        poupanca.imprimirConta();
    }
}
