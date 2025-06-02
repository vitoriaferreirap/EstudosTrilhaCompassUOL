package pedidosApp.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import pedidosApp.entidadeEnums.OrdemStatus;

public class Pedido {
  
  private Date momento;
  private OrdemStatus status;
  private Cliente cliente;// objeto do tipo Cliente associado ao Pedido
  
  // Lista de itens do pedido, cada item é do tipo PedidoItem
  private List<PedidoItem> itens = new ArrayList<>();


 public Pedido(Date momento, OrdemStatus status, Cliente cliente) {
    this.momento = momento;
    this.status = status;
    this.cliente = cliente;
    this.itens = new ArrayList<>();
}

  public void addItem(PedidoItem item) {
    itens.add(item);
  }

  public void removerItem(PedidoItem item) { 
    itens.remove(item);
  }

  public double total() {
    double total = 0.0;
    for (PedidoItem item : itens) {
      total += item.subTotal();
    }
    return total;
  }

  public Date getMomento() {
    return momento;
  }

  public void setMomento(Date momento) {
    this.momento = momento;
  }

  public OrdemStatus getStatus() {
    return status;
  }

  public void setStatus(OrdemStatus status) {
    this.status = status;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  @Override
  public String toString() {
    return String.format("Pedido momento: %s - Status: %s - Cliente: %s - Total: %.2f",
        momento, status, cliente.getNome(), total());
  }
}
