public class Main {
    public static void main(String[] args) {
        IConta cc = new ContaCorrente();
        IConta cp = new ContaPoupanca();
        Cliente cliente = new Cliente();
        cliente.setCPF(999999999);
        cliente.setNome("Pedro Simões");
        cc.depositar(100);
        cc.tranferir(40,cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}