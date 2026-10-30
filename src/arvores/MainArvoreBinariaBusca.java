package arvores;

public class MainArvoreBinariaBusca {

	public static void main(String[] args) {
		
		ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
		
		arvore.inserir(50);
		arvore.inserir(30);
		arvore.inserir(70);
		arvore.inserir(20);
		arvore.inserir(40);
		arvore.inserir(60);
		arvore.inserir(80);
		arvore.inserir(50);
		arvore.inserir(75);

		
		System.out.println("Percurso em Ordem");
		arvore.emOrdem();
		
		System.out.println();
		System.out.println("Buscas");
		System.out.println("Existe 60? "+arvore.buscar(60));
		System.out.println("Existe 35? "+arvore.buscar(35));
		
		System.out.println();
		System.out.println("Removendo um no folha");
		arvore.remover(20);
		arvore.emOrdem();
		
		System.out.println();
		System.out.println("Removendo um no com 2 filhos");
		arvore.remover(50);
		arvore.emOrdem();
		
		System.out.println();
		System.out.println("Percorrer por nivel");
		arvore.mostrarPorNivel();
		
		
		arvore.calcularAltura();
	}

}
