public class ContasJava {
    public static void main(String[] args) {
        // Exemplo de uso das classes
        ContaPoupanca poupanca = new ContaPoupanca("João", 123, 10);
        ContaEspecial especial = new ContaEspecial("Maria", 456, 1000);

        poupanca.depositar(1000);
        especial.depositar(2000);

        poupanca.sacar(500);
        especial.sacar(1500);

        poupanca.calcularNovoSaldo(0.05f);

        System.out.println("Saldo da conta poupança de " + poupanca.getCliente() + ": " + poupanca.getSaldo());
        System.out.println("Saldo da conta especial de " + especial.getCliente() + ": " + especial.getSaldo());
    }
}