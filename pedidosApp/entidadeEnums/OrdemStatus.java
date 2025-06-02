package pedidosApp.entidadeEnums;

public enum OrdemStatus {
  //conjunto fixo de constantes
    AGUARDANDO_PAGAMENTO(0),
    PROCESSANDO(1),
    ENVIADO(2),
    ENTREGUE(3);

  /*Cada constante do enum tem um campo codigo associado,
    que guarda o valor passado no construtor.*/
    private int codigo;

    // Construtor do enum (privado)
    OrdemStatus(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}