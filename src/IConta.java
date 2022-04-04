public interface IConta {

    void deposita(double valor);

    void saca(double valor);

    void transferePara(Conta contaDestino, double valor);

    void imprimeExtrato();
}
