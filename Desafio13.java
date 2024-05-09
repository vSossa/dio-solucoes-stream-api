import java.util.List;

public class Desafio13 {
	public static void solucao(List<Integer> l) {
		final int comeco = 5;
		final int fim = 10;
		System.out.println("S13 -------------------------");
		System.out.printf("Números entre %d e %d:%n", comeco, fim);
	    l.stream()
		 .filter(n -> (comeco <= n && n <= fim))
		 .distinct()
		 .forEach(System.out::println);
		System.out.printf("----------------------------%n%n");
	}
}
