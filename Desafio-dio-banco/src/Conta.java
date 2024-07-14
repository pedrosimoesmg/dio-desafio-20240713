public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO=1;
    private static int SEQUENCIAL=1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    public Conta() {
        this.agencia=AGENCIA_PADRAO;
        this.numero=SEQUENCIAL++;
    }


    public int getAgencia(){
        return agencia;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -=valor;
    }

    @Override
    public void depositar(double valor) {
        saldo +=valor;
    }

    public void tranferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacaoComum(){
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
