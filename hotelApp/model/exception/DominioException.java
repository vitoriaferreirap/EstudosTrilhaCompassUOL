package hotelApp.model.exception;

// essa exceção pode ser uma extensão de RuntimeException
/*
 * Por que usar exceções que estendem RuntimeException?
 * Não obrigam o uso de try/catch ou throws nos métodos.
 * São usadas para erros de programação, como argumentos inválidos
 * (IllegalArgumentException), estados inválidos (IllegalStateException), etc.
 * Deixam o código mais limpo, pois só tratamos onde realmente faz sentido.
 */

public class DominioException extends Exception {
    private static final long serialVersionUID = 1L;

    // Construtor que recebe uma mensagem de erro
    public DominioException(String mensagem) {
        super(mensagem); // chama o construtor da classe pai (Exception)
    }

}