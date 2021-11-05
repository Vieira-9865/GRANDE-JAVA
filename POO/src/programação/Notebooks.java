package programa��o;

import java.util.ArrayList;

public class Notebooks {

	ArrayList<Notebook> listaNotes = new ArrayList <Notebook>();
	
	public void inserirNovoNote(int Identificador,String descricao, String marca, String hd, double memoria, double preco) {
		Notebook note = new Notebook();
		note.setIdentificador(Identificador);
		note.setDescri�ao(descricao);
		note.setMarca(marca);
		note.setHD(hd);
		note.setDescri�ao(descricao);
		note.setMemoria(memoria);
		note.setPre�o(preco);
		listaNotes.add(note);
	}
	
	public boolean atualizarPrecoNotePeloId(int Identificador, double preco) {
		for (Notebook item : listaNotes) {
			if (item.getIdentificador() == Identificador) {
				item.setPre�o(preco);
				return true;
			}
		}
		return false;
	}

	public boolean removerNote(int Identificador) {
		for (Notebook item : listaNotes) {
			if (item.getIdentificador() == Identificador) {
				listaNotes.remove(item);
				return true;
			}
		}
		return false;
	}

	public  void imprimirTodosNotes() {
		for (Notebook notebook : listaNotes) {
			System.out.println("ID: " + notebook.getIdentificador());
			System.out.println("Descri��o: " + notebook.getDescri�ao());
			System.out.println("Marca: " + notebook.getMarca());
			System.out.println("HD: " + notebook.getHD());
			System.out.println("Processador: " + notebook.getProcessador());
			System.out.println("Memoria: " + notebook.getMemoria());
			System.out.println("Pre�o: " + notebook.getPre�o());
		}
	}

	public void imprimirNotePeloID(int Identificador) {
		for (Notebook notebook : listaNotes) {
			if (notebook.getIdentificador() == Identificador) {
				System.out.println("ID: " + notebook.getIdentificador());
				System.out.println("Descri��o: " + notebook.getDescri�ao());
				System.out.println("Marca: " + notebook.getMarca());
				System.out.println("HD: " + notebook.getHD());
				System.out.println("Processador: " + notebook.getProcessador());
				System.out.println("Memoria: " + notebook.getMemoria());
				System.out.println("Pre�o: " + notebook.getPre�o());
				
				
			}
		}
			
	}
}

