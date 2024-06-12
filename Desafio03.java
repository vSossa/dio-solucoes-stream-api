import java.util.List;

public class Desafio03 {
	public static void solucao(List<Integer> l) {
		System.out.println("S03 -------------------------");
		System.out.println("Os valores são todos positivos? " + 
						   l.stream()
						    .anyMatch((n) -> (n < 0)));
		System.out.printf("----------------------------%n%n");
	}
}
