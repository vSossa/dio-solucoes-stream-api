import java.util.List;
import java.util.Comparator;

public class Desafio07 {
	public static void solucao(List<Integer> l) {
		System.out.println("S07 -------------------------");
		System.out.println("Este é o segundo maior número da lista? " +
						   l.stream()
							.sorted(Comparator.reverseOrder())
							.toArray()[1]);
		System.out.printf("----------------------------%n%n");
	}
}
