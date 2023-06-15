package parte6EnumeracaoComposicaoEntities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import parte6EnumeracaoComposicaoEntities.enums.StatusPedido;

public class Pedido {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date momento;
	private StatusPedido status;
	
	private Cliente cliente;
	private List <ItemDoPedido> itens = new ArrayList<>();
	
	public Pedido() {

	}
	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public StatusPedido getStatus() {
		return status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<ItemDoPedido> getItens() {
		return itens;
	}
	public void addItem(ItemDoPedido item) {
		itens.add(item);
	}
	public void removeItem(ItemDoPedido item) {
		itens.remove(item);
	}
	public double total() {
		double soma =0.0;
		for (ItemDoPedido it : itens) {
			soma += it.subTotal();	
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do Pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do pedido :\n");
		for (ItemDoPedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço Total : $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
