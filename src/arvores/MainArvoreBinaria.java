package arvores;

public class MainArvoreBinaria {

	public static void main(String[] args) {
		
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		ArvoreBinaria.No noA = arvore.criarRaiz('A');
		
		ArvoreBinaria.No noB = arvore.adicionarEsquerda(noA, 'B');
		ArvoreBinaria.No noC = arvore.adicionarDireita(noA, 'C');
		
		ArvoreBinaria.No noD = arvore.adicionarEsquerda(noB, 'D');
		ArvoreBinaria.No noE = arvore.adicionarDireita(noB, 'E');
		
		ArvoreBinaria.No noF = arvore.adicionarDireita(noC, 'F');

		System.out.println("Pre-Ordem");
		arvore.preOrdem();
		
		System.out.println("Em Ordem");
		arvore.emOrdem();
		
		System.out.println("Pos-Ordem");
		arvore.posOrdem();
		
	}

}
