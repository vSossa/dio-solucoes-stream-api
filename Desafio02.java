import java.util.List;

public class Desafio02 {
	public static void solucao(List<Integer> l) {
		System.out.println("S02 -------------------------");
		System.out.println("Soma dos valores pares: " +
	 				       l.stream()
							.filter((n) -> n % 2 == 0)
							.reduce(0, (n1, n2) -> (n1 + n2)));
		System.out.printf("----------------------------%n%n");
	}
}
