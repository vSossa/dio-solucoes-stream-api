import java.util.List;

public class Desafio05 {
	public static void solucao(List<Integer> l) {
		System.out.println("S05 -------------------------");
		System.out.println("Média dos valores maiores que 5: " +
                           l.stream()
						    .filter((n) -> (n > 5))
						    .mapToDouble((n) -> (n))
						    .average()
						    .getAsDouble());
		System.out.printf("----------------------------%n%n");
	}
}
