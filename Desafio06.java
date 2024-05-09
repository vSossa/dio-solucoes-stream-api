import java.util.List;

public class Desafio06 {
	public static void solucao(List<Integer> l) {
		System.out.println("S06 -------------------------");
		System.out.println("Existe algum número maior que 10 na lista? " +
                           l.stream()
							.anyMatch((n) -> (n > 10)));
		System.out.printf("----------------------------%n%n");
	}
}
