package arvores;

public class MainArvoreRubroNegra {

	public static void main(String[] args) {
		
		int[] valores = {50, 30, 70, 20, 40, 60, 80};
		ArvoreRubroNegra arn = new ArvoreRubroNegra();
		
		for (int v : valores) {
			arn.inserir(v);
		}
		
		System.out.println("Percurso em ordem:");
		arn.mostrar();
	}

}
