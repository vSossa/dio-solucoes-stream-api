import java.util.List;

public class Desafio16 {
	public static void solucao(List<Integer> l) {
		System.out.println("S16 -------------------------");
		System.out.println("Pares: ");  
		l.stream()
		 .filter(n -> (n % 2 == 0))
		 .forEach(System.out::println);
		System.out.println("Impares: ");  
		l.stream()
		 .filter(n -> (n % 2 != 0))
		 .forEach(System.out::println);
		System.out.printf("----------------------------%n%n");
	}
}
