public class ContaBancaria {
    private String cliente;
    private int num_conta;
    protected float saldo;

    public ContaBancaria(String cliente, int num_conta) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = 0.0f;
    }

    public String getCliente() {
        return cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void sacar(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo restante: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Novo saldo: " + saldo);
    }
}
