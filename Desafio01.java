import java.util.List;

public class Desafio01 {
	public static void solucao(List<Integer> l) {
		System.out.println("S01 -------------------------");
		System.out.println("Lista ordenada: ");
		l.stream()
		 .sorted()
		 .forEach(System.out::println);	
		System.out.printf("----------------------------%n%n");
	}
}
