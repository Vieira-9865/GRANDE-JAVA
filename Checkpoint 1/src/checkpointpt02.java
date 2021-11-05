import java.util.ArrayList;



public class checkpointpt02 {
	
	ArrayList <checkpoint> lista;
	
	public static void imprimirpedidos() {
    	for (checkpoint pedido : lista) {
    		System.out.println("Todos os pedidos s�o esses: " + pedido.getPedidos());
		}
}
	public void inserirpedido(int numped, int quantcombo,  double vt, String obs  ) {
    	checkpoint pedido = new checkpoint();

    	pedido.setNumeroPedidos(numped);
    	pedido.setQuantidadeCombo(quantcombo);
    	pedido.setObserva��o(obs);
    	pedido.setValorTotal(vt);
    	        
    	lista.add(pedido);
	}
	public boolean atualizarPedido(int numped, int quantcombo, double vt, String obs) {
		for (checkpoint item : lista) {
			if (item.getNumeroPedidos() == numped)
				item.setNumeroPedidos(numped);
			if (item.getQuantidadeCombo() == numped)
				item.setQuantidadeCombo(quantcombo);
			if (item.getValorTotal() == vt)
				item.setValorTotal(vt);
			if (item.getObserva��o() == obs)
				item.setObserva��o(obs);
				return true;
			}
		
		return false;
	}
	
	public boolean removerPedido(int numped) {
		for (checkpoint item : lista) {
			if (item.getNumeroPedidos() == numped) {
				lista.remove(item);
				return true;
			}
		}
		return false;
	}
	
	public void imprimirClientes() {
    	for (checkpoint cliente : lista) {
    		System.out.println("Todos os clientes s�o esses: " + cliente.getPedidos());
		}
}
	public void inserircliente(String nome, double tel, String end) {
    	checkpoint cliente = new checkpoint();
    	cliente.setNome(nome);
    	cliente.setTelefone(tel);
    	cliente.setEndere�o(end);
    	
    	lista.add(cliente);
	}
	
	public boolean atualizarcliente(String nome, double tel, String end) {
		for (checkpoint cliente : lista) {
			if (cliente.getNome() == nome)
				cliente.setNome(nome);
			if (cliente.getTelefone() == tel)
				cliente.setTelefone(tel);
			if (cliente.getEndere�o() == end)
				cliente.setEndere�o(end);
				return true;
			}
		
		return false;
	}
	
	public boolean removerCliente(String nome) {
		for (checkpoint cliente : lista) {
			if (cliente.getNome() == nome) {
				lista.remove(cliente);
				return true;
			}
		}
		return false;
	}
}
