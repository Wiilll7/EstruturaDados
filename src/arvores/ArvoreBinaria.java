package arvores;

public class ArvoreBinaria {

	public class No {
		private char valor;
		private No esquerdo;
		private No direito;
		
		
		public No(char valor) {
			this.valor = valor;
		}
		
		
		public char getValor() {
			return valor;
		}
		public void setValor(char valor) {
			this.valor = valor;
		}
		public No getEsquerdo() {
			return esquerdo;
		}
		public void setEsquerdo(No esquerdo) {
			this.esquerdo = esquerdo;
		}
		public No getDireito() {
			return direito;
		}
		public void setDireito(No direito) {
			this.direito = direito;
		}
	}
	
	private No raiz;
	
	public No getRaiz() {
		return raiz;
	}

	public No criarRaiz(char valor) {
		raiz = new No(valor);
		return raiz;
	}
	
	public No adicionarEsquerda(No pai, char valor) {
		if (pai == null) {
			System.out.println("Nao foi possivel inserir, No pai inexistente");
			return null;
		}
		
		if (pai.esquerdo != null) {
			System.out.println("No pai ja possui filho esquerdo");
			return null;
		}
		
		pai.esquerdo = new No(valor);
		return pai.esquerdo;
	}
	
	public No adicionarDireita(No pai, char valor) {
		if (pai == null) {
			System.out.println("Nao foi possivel inserir, No pai inexistente");
			return null;
		}
		
		if (pai.direito != null) {
			System.out.println("No pai ja possui filho direito");
			return null;
		}
		
		pai.direito = new No(valor);
		return pai.direito;
	}
	
	public void preOrdem() {
		preOrdem(raiz);
		System.out.println();
	}
	
	public void preOrdem(No no) {
		if (no == null) {
			return;
		}
		
		System.out.println(no.valor+"");
		preOrdem(no.esquerdo);
		preOrdem(no.direito);
	}
	
	public void emOrdem() {
		emOrdem(raiz);
		System.out.println();
	}
	
	private void emOrdem(No no) {
		if (no == null) {
			return;
		}
		
		emOrdem(no.esquerdo);
		System.out.println(no.valor+"");
		emOrdem(no.direito);
	}
	
	
	public void posOrdem() {
		posOrdem(raiz);
		System.out.println();
	}
	
	public void posOrdem(No no) {
		if (no == null) {
			return;
		}
		
		posOrdem(no.esquerdo);
		posOrdem(no.direito);
		System.out.println(no.valor+"");
	}
}
