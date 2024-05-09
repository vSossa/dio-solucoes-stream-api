import java.util.List;

public class Desafio09 {
	public static void solucao(List<Integer> l) {
		System.out.println("S09 -------------------------");
		System.out.println("Os números na lista são distintos? " + 
						   (l.stream()
							.distinct()
							.toArray().length == l.size()));
		System.out.printf("----------------------------%n%n");
	}
}
