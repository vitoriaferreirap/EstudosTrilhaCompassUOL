package inteface.servicos;

public class PaypalServico implements PagamentoOnline {

    // implementação dos métodos da interface PagamentoOnline
    @Override
    public Double taxaPagamentoDouble(double quantia) {
        return quantia * 0.02; // taxa de 2%
    }

    @Override
    public Double jurosPagamento(double quantia, int meses) {
        return quantia * 0.01 * meses; // juros de 1% ao mês
    }

}
