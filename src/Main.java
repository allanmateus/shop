public class Main {
	public static void main(String[] args) {
	
		System.out.println("Lista de produtos\n");
		
		Produto.cadastraProduto("102030", "Shouder Bag - cor: Preta", "Nike", 119.99);
		Produto.cadastraProduto("405060", "Camiseta Estampada - cor: Branca", "Diamond", 124.99);
		Produto.cadastraProduto("708090", "Boné Five Panel - cor: Roxa", "High", 99.90);
		
		Produto.cadastraProduto("010203", "Meia cano alto - cor: Preta", "Nike", 59.99);
		Produto.cadastraProduto("040506", "Moletom - cor: Verde", "Approve", 299.90);
		Produto.cadastraProduto("070809", "Sandália Slider  - cor: Branca", "Puma", 89.90);
		
		Produto.listaProdutos();

		
		System.out.println("\nLista de estoques\n");
		
		Estoque.cadastraEstoque(102030, "e-123-cz", 250);
		Estoque.listaEstoque();
		
	}
}
