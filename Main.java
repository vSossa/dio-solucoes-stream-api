import java.util.List;
import java.util.Arrays;

public class Main {
	static final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
	public static void main(String[] args) {
		final int len = args.length;
		if (len == 0) {
			System.out.printf("ERROR: expected at least one argument%n");	
			System.out.printf("TIP: do `./build -h` or `./build --help` for help%n"); 
		} else if ((len == 1 && args[0].equals("-h")) || 
                   (len == 1 && args[0].equals("--help"))) {
			usage();
		} else if ((len == 1 && args[0].equals("-a")) ||
			       (len == 1 && args[0].equals("--all"))) {
			runAll();
		} else {
			runEach(args, len);
		}
	}

	public static int[] init(String[] indexes, int len) {
		int[] array = new int[len];
		for (int i = 0; i < len; ++i) {
			try {
				array[i] = Integer.parseInt(indexes[i]);
			} catch (NumberFormatException e) {
				System.out.printf("ERROR: %d-argument is not an integer: `%s`%n",
								  i, indexes[i]);
				System.exit(1);
			}

			if (array[i] < 1 || array[i] > 19) {
				usage();
				System.out.printf("ERROR: %d-argument is not a valid integer: `%d`%n",
								  i, array[i]);
				System.exit(1);
			}
		}

		return array;
	}

	public static void runEach(String[] args, int len) {
		int[] indexes = init(args, len);

		int j = 0;
		while (j < len) {
			switch (indexes[j]) {
			case 1: { 
				Desafio01.solucao(numeros); 
				++j;
				break;
			}
			case 2: { 
				Desafio02.solucao(numeros); 
				++j;
				break;
			}
			case 3: { 
				Desafio03.solucao(numeros); 
				++j;
				break;
			}
			case 4: { 
				Desafio04.solucao(numeros); 
				++j;
				break;
			}
			case 5: { 
				Desafio05.solucao(numeros); 
				++j;
				break;
			}
			case 6: { 
				Desafio06.solucao(numeros); 
				++j;
				break;
			}
			case 7: { 
				Desafio07.solucao(numeros); 
				++j;
				break;
			}
			case 8: { 
				Desafio08.solucao(numeros); 
				++j;
				break;
			}
			case 9: { 
				Desafio09.solucao(numeros); 
				++j;
				break;
			}
			case 10: { 
				Desafio10.solucao(numeros); 
				++j;
				break;
			}

			case 11: { 
				Desafio11.solucao(numeros); 
				++j;
				break;
			}

			case 12: { 
				Desafio12.solucao(numeros); 
				++j;
				break;
			}

			case 13: { 
				Desafio13.solucao(numeros); 
				++j;
				break;
			}

			case 14: { 
				Desafio14.solucao(numeros); 
				++j;
				break;
			}

			case 15: { 
				Desafio15.solucao(numeros); 
				++j;
				break;
			}

			case 16: { 
				Desafio16.solucao(numeros); 
				++j;
				break;
			}

			case 17: { 
				Desafio17.solucao(numeros); 
				++j;
				break;
			}

			case 18: { 
				Desafio18.solucao(numeros); 
				++j;
				break;
			}

			case 19: { 
				Desafio19.solucao(numeros); 
				++j;
				break;
			}
			}
		}
	}

	public static void runAll() {
		Desafio01.solucao(numeros);
		Desafio02.solucao(numeros);
		Desafio03.solucao(numeros);
		Desafio04.solucao(numeros);
		Desafio05.solucao(numeros);
		Desafio06.solucao(numeros);
		Desafio07.solucao(numeros);
		Desafio08.solucao(numeros); 
		Desafio09.solucao(numeros);
		Desafio10.solucao(numeros);
		Desafio11.solucao(numeros);
		Desafio12.solucao(numeros);
		Desafio13.solucao(numeros);
		Desafio14.solucao(numeros);
		Desafio15.solucao(numeros);
		Desafio16.solucao(numeros);
		Desafio17.solucao(numeros);
		Desafio18.solucao(numeros);
		Desafio19.solucao(numeros);
	}

	public static void usage() {
		System.out.println("Usage: ./build [index ... | -a | --all | -h | --help]");
		System.out.println("    index     numbers between 1 and 19");	
		System.out.println("    -a        show all solutions");	
		System.out.println("    --all     alias for `-a` subcommand");
		System.out.println("    -h        show this message");
		System.out.println("    --help    alias for `-h` subcommand");
	}
}
