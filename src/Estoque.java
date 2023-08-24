import java.util.ArrayList;

public class Estoque {
	static int contEstoque = 0;
	static ArrayList<Estoque> estoqueDeProdutos = new ArrayList<Estoque>();
	
	
	int idEstoque;
	int idProduto;
	String lote;
	int quantidade;
	
	public Estoque(int idProduto, String lote, int quantidade) {
		this.idEstoque = Estoque.contEstoque++;
		this.idProduto = idProduto;
		this.lote = lote;
		this.quantidade = quantidade;
	}
	
	public static void cadastraEstoque(int idProduto, String lote, int quantidade) {
		Estoque novoEstoque = new Estoque(idProduto, lote, quantidade);
		estoqueDeProdutos.add(novoEstoque);
	}

	public static void listaEstoque() {
		for(Estoque estoque : estoqueDeProdutos) {
			System.out.println
			(	
				" Id: " + estoque.idEstoque +
				" Id do produto: " + estoque.idProduto + 
				" Lote: " + estoque.lote +
				" Quantidade: " + estoque.quantidade 
			);	
		}
	}
}
