public abstract class Conta implements IConta {

    //  Atributos
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 100;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    //  Comportamentos

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
    public void deposita(double valor) {
        this.saldo += valor;

    }

    @Override
    public void saca(double valor) {
        this.saldo -= valor;

    }

    @Override
    public void transferePara(Conta contaDestino, double valor) {
        this.saca(valor);
        contaDestino.deposita(valor);

    }


    protected void imprimeInformacoesComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
