public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String cliente, int num_conta, float limite) {
        super(cliente, num_conta);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        float saldoComLimite = saldo + limite;
        if (valor <= saldoComLimite) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo restante: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
