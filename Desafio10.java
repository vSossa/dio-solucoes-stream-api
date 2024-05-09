import java.util.List;

public class Desafio10 {
	public static void solucao(List<Integer> l) {
		System.out.println("S10 -------------------------");
		System.out.println("Números ímpares múltiplos de 3 ou de 5: ");  
		l.stream()
		 .filter(n -> (n % 2 != 0) && (n % 3 == 0 || n % 5 == 0))
		 .distinct()
		 .forEach(System.out::println);
		System.out.printf("----------------------------%n%n");
	}
}
