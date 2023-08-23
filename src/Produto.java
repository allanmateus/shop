import java.util.ArrayList;

public class Produto {
	static int contProduto = 0;
	static ArrayList<Produto> produtos = new ArrayList<Produto>();

	public int id;
	public int ean;
	public String descricao;
	public String marca;
	public double valor;
	
	public Produto(int ean, String descricao, String marca, double valor) {
		this.id = Produto.contProduto++;
		this.ean = ean;
		this.descricao = descricao;
		this.marca = marca;
		this.valor = valor;
	}
	
	public static ArrayList<Produto> cadastraProduto(int ean, String descricao, String marca, double valor) {
		Produto novoProduto = new Produto(ean, descricao, marca, valor);
		produtos.add(novoProduto);
		return produtos;
	}

	public static void listaProdutos() {
		for(Produto produto : produtos) {
			System.out.println(	
				" EAN: " + produto.ean + 
				" Descrição: " + produto.descricao +
				" Marca: " + produto.marca +
				" Valor: R$ " + produto.valor
			);	
		}
	}
}
