import java.util.Scanner;
import java.util.Stack;

//falta agregar casos de prueba
public class Problema_141 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// System.out.println("ingresa una frase");
		while (entrada.hasNextLine()) {
			String frase = "";
			boolean comprobacionfinal = true;
			frase = entrada.nextLine();
			Stack<Character> caracteres = new Stack<Character>();
			for (int i = 0; i < frase.length(); i++) {
				// meter aperturas en la pila
				if (frase.charAt(i) == 40 || frase.charAt(i) == 91 || frase.charAt(i) == 123) {
					caracteres.push(frase.charAt(i));
				}

				else if (frase.charAt(i) == 41) {
					if (!caracteres.isEmpty() && caracteres.peek() == 40) {
						caracteres.pop();
						

					}

					else {
						comprobacionfinal = false;
						

					}
				} else if (frase.charAt(i) == 93) {
					if (!caracteres.isEmpty() && caracteres.peek() == 91) {
						caracteres.pop();
					} else {
						comprobacionfinal = false;
					
					}
				} else if (frase.charAt(i) == 125) {
					if (!caracteres.isEmpty() && caracteres.peek() == 123) {
						caracteres.pop();
					} else {
						comprobacionfinal = false;

					}
				}
			}
			

			if (!caracteres.isEmpty() || comprobacionfinal==false) {
				System.out.println("NO");
			} else {
				System.out.println("YES");

			}
		}
	}
}