public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String cliente, int num_conta, int diaRendimento) {
        super(cliente, num_conta);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxaRendimento) {
        float rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
        System.out.println("Rendimento aplicado. Novo saldo: " + getSaldo());
    }
}

