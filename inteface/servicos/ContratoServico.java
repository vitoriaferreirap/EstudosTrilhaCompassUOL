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

        // TESTANDO MANUALMENTE LOGICA DO SERVIÇO
        // acessa lista de parcelamentos do contrato, add novo elemento a lista, cria um
        // novo objeto Parcelamento com data e valor
        contrato.getParcelamentos().add(new Parcelamento(LocalDate.of(2018, 7, 25), 206.06));
        contrato.getParcelamentos().add(new Parcelamento(LocalDate.of(2018, 8, 20), 300.06));

    }
}
