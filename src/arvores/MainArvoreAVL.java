package arvores;

public class MainArvoreAVL {

	public static void main(String[] args) {
		
		int[] valores = {30, 20, 40, 10, 25, 22, 50, 5, 35, 45, 60};
		
		ArvoreAVL avl = new ArvoreAVL();
		
		for (int v : valores) {
			avl.inserirNo(v);
		}
		
		avl.mostrar();
	}

}
