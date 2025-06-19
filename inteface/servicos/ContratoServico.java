package inteface.servicos;

import java.time.LocalDate;

import inteface.entidades.Contrato;
import inteface.entidades.Parcelamento;

public class ContratoServico {
    // serviço responsável por processar o contrato e as parcelas
    // ContratoServico depende de PagamentoOnline - declaração de dependência
    private PagamentoOnline pagamentoOnline;

    public ContratoServico(PagamentoOnline pagamentoOnline) {
        this.pagamentoOnline = pagamentoOnline;
    }

    // método que processa o contrato e gera as parcelas
    public void processarContrato(Contrato contrato, int nummeroParcelas) {

        double parcelaBasica = contrato.getTotalValor() / nummeroParcelas; // valor da parcela sem juros

        for (int i = 1; i <= nummeroParcelas; i++) {
            LocalDate dataVencimento = contrato.getData().plusMonths(i); // função add meses (data original mais um mes)

            double juro = pagamentoOnline.jurosPagamento(parcelaBasica, i); // juros de cada mês
            double taxa = pagamentoOnline.taxaPagamentoDouble(parcelaBasica + juro); // taxa de pagamento

            double cota = parcelaBasica + juro + taxa; // valor da parcela com juros e taxa

            // add a parcela na lista de parcelamentos do contrato
            // acessa o contrato e adiciona um novo objeto Parcelamento
            contrato.getParcelamentos().add(new Parcelamento(dataVencimento, cota));
        }

    }
}
