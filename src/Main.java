public class Main {
    public static void main(String[] args) {
        Cliente vinicius = new Cliente();
        vinicius.setNome("Vinícius");

        Conta cc = new ContaCorrente(vinicius);
        cc.deposita(300);
        Conta cp = new ContaPoupanca(vinicius);
        cc.transferePara(cp,279);


        cc.imprimeExtrato();
        cp.imprimeExtrato();
    }
}
