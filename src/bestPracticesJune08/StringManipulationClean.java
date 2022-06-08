package bestPracticesJune08;

import java.util.Scanner; // ctrl + shift + f (indentación), VS Code: Prettier

public class StringManipulationClean{ // Camel case

	public static void main(String[] args) {
		int choice = 0, comp = 0; // alt + shift + r: Encuentra y reemplaza
		String str1 = "", str2 = "", result = "";

		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("1. Concatenar");
			System.out.println("2. Reemplazar");
			System.out.println("3. Replace");
			System.out.println("4. Convertir a array de caracteres");
			System.out.println("5. StringBuilder");
			System.out.println("6. Salir");
			System.out.println("Ingresa tu opción:");
			choice = input.nextInt();
			if (choice >= 1 && choice < 6) {
				System.out.println("Ingresa 1ra cadena de caracteres: ");
				str1 = input.next();
				System.out.println("Ingresa 2da cadena de caracteres: ");
				str2 = input.next();
			}
			switch (choice) { // DRY = Don't Repeat Yourself
			case 1:
				result = str1.concat(str2);
				System.out.println("Cadena de caracteres concatenados: "+result);
				break;

				case 2:
				comp = str1.toLowerCase().compareTo(str2.toLowerCase());
				// KISS = Keep It Simple Stupid
				result = comp > 0 || comp < 0 ? "no es igual" : "es igual"; // reemplacé por operador ternario en lugar de if-else
				System.out.println(result);
				break;

			case 3:
				result = str1.replace('o', 'a').concat(str2.replace('a', 'o'));
				System.out.println(result);
				break;
			case 4:
				char[] res1 = str1.toCharArray();
				char[] res2 = str2.toCharArray();
				for(char c1 : res1) {
					System.out.println(c1);
				}
				for(char c2 : res2) {
					System.out.println(c2);
				}
				break;
			case 5: 
				StringBuilder builder1 = new StringBuilder(str1);
				StringBuilder builder2 = new StringBuilder(str2);
				StringBuilder resultBuilder = builder1.append(builder2);
				resultBuilder.reverse();
				resultBuilder.deleteCharAt(0);
				resultBuilder.setCharAt(2, '?');
				System.out.println(resultBuilder);
				break;
			case 6:
				System.out.println("Saliendo de la aplicación.");
				System.exit(0);
			}
		} while (choice > 0 && choice < 6);
	}
}
