import java.util.List;

public class Desafio04 {
	public static void solucao(List<Integer> l) {
		System.out.println("S04 -------------------------");
		System.out.println("Impressão dos valores pares na lista: ");
		l.stream()
		 .filter((n) -> (n % 2 == 0))
		 .forEach(System.out::println);
		System.out.printf("----------------------------%n%n");
	}
}
