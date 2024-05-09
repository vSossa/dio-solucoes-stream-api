import java.util.List;
import java.util.function.Predicate;
import java.util.Comparator;

public class Desafio14 {
	public static void solucao(List<Integer> l) {
		System.out.println("S14 -------------------------");
		Predicate<Integer> ePrimo = new Predicate<>() {
			@Override
			public boolean test(Integer n) {
				if (n == 1) return false;

				for (int i = 2; i < n; i++) {
					if (n % i == 0) return false;
				}

				return true;
			}
		};

		System.out.print("O maior número primo da lista: ");
	    l.stream()
	 	 .distinct()
		 .filter(ePrimo)
		 .max(Integer::compare)
		 .ifPresent(System.out::print);
		System.out.printf("%n----------------------------%n%n");
	}
}
