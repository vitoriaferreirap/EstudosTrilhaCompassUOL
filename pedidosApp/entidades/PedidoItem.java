package pedidosApp.entidades;

public class PedidoItem {
  private int qtd;
  private double preco;
  private Produto produto; //objeto do tipo Produto associado ao PedidoItem

  public PedidoItem(int qtd, double preco, Produto produto) {
    this.qtd = qtd;
    this.preco = preco;
  }

  public double subTotal() {
    return qtd * preco;
  }

  public int getQtd() {
    return qtd;
  }

  public void setQtd(int qtd) {
    this.qtd = qtd;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }
  
}
