import java.util.List;

public class Desafio19 {
	public static void solucao(List<Integer> l) {
		System.out.println("S19 -------------------------");
		System.out.println("Soma dos números divisíveis por 3 e 5: " + 
						   l.stream()
							.filter(n -> (n % 15 == 0))
							.reduce(0, (n1, n2) -> (n1 + n2)));  
		System.out.printf("----------------------------%n%n");
	}
}
