package inteface.servicos;

//interface não tem construtor
//interface não pode ser instanciada
//interface não pode ter atributos
//interface pode ter métodos abstratos e métodos default
//interface pode ter constantes (atributos estáticos e finais)
//interface não pode ter modificadores de acesso (public, private, protected)

public interface PagamentoOnline {

    Double taxaPagamentoDouble(double quantia);

    Double jurosPagamento(double quantia, int meses);

}
