import java.util.List;
import java.util.Arrays;

public class Desafio08 {
	public static void solucao(List<Integer> l) {
		System.out.println("S08 -------------------------");
		System.out.println("Soma dos digitos de todos os números na lista: " + 
						   l.stream()
							.map(n -> Integer.toString(n))
							.map(s -> Arrays.asList(s.split(""))
										    .stream()
										    .map(d -> Integer.parseInt(d))
										    .reduce(0, (n1, n2) -> (n1 + n2)))
							.reduce(0, (n1, n2) -> (n1 + n2)));
		System.out.printf("----------------------------%n%n");
	}
}
