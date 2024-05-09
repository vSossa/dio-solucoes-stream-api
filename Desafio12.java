import java.util.List;

public class Desafio12 {
	public static void solucao(List<Integer> l) {
		System.out.println("S12 -------------------------");
		System.out.println("Produto dos itens na lista: " +
						   l.stream()
							.reduce(1, (n1, n2) -> (n1 * n2)));
		System.out.printf("----------------------------%n%n");
	}
}
