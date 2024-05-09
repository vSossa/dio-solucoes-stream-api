import java.util.List;

public class Desafio11 {
	public static void solucao(List<Integer> l) {
		System.out.println("S11 -------------------------");
		System.out.println("Soma dos quadrados dos itens na lista: " +
						   l.stream()
						    .map(n -> n*n)
							.reduce(0, (n1, n2) -> (n1 + n2)));
		System.out.printf("----------------------------%n%n");
	}
}
