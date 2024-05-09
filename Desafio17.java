import java.util.List;
import java.util.function.Predicate;

public class Desafio17 {
	public static void solucao(List<Integer> l) {
		System.out.println("S17 -------------------------");
		Predicate<Integer> eComposto = new Predicate<>() {
			@Override
			public boolean test(Integer n) {
				if (n == 1) return true;

				for (int i = 2; i < n; i++) {
					if (n % i == 0) return true;
				}

				return false;
			}
		};

		System.out.println("Números compostos da lista: ");
	    l.stream()
	 	 .distinct()
		 .filter(eComposto)
		 .forEach(System.out::println);
		System.out.printf("----------------------------%n%n");
	}
}
