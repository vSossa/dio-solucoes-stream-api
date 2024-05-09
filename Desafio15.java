import java.util.List;

public class Desafio15 {
	public static void solucao(List<Integer> l) {
		System.out.println("S15 -------------------------");
		System.out.println("Existe algum número negativo na lista? " + 
						   l.stream()
							.anyMatch(n -> n < 0));  
		System.out.printf("----------------------------%n%n");
	}
}
