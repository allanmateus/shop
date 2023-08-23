public class Main {
	public static void main(String[] args) {
	
		System.out.println("Olá, Mundo");
		
		
		Produto.cadastraProduto(102030, "Shouder Bag - cor: Preta", "Nike", 119.99);
		Produto.cadastraProduto(405060, "Camiseta Estampada - cor: Branca", "Diamond", 124.99);
		Produto.cadastraProduto(708090, "Boné Five Panel - cor: Roxa", "High", 99.90);
		
		Produto.listaProdutos();
	}
}
