public class ContaCorrente extends Conta {

    public ContaCorrente( Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimeExtrato() {
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        super.imprimeInformacoesComuns();

    }
}
