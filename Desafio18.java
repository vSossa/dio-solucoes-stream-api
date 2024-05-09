import java.util.List;

public class Desafio18 {
	public static void solucao(List<Integer> l) {
		System.out.println("S18 -------------------------");
		System.out.println("Todos os números da lista são iguais? " + 
						   (l.stream()
							.distinct()
							.toArray().length == 1));  
		System.out.printf("----------------------------%n%n");
	}
}
