package bestPracticesJune08;

import java.util.Scanner;

public class StringManipulationPoor {

	public static void main(String[] args) {
		int c = 0, comp = 0;
		String str1 = "", STRINGTWO = "", result = "";
		Scanner input = new Scanner(System.in); do {
			System.out.println("1. Concatenar");
System.out.println("2. Comparar");
			System.out.println("3. Reemplazar");
				System.out.println("4. Convertir a array de caracteres");
			System.out.println("5. StringBuilder");
		System.out.println("6. Salir");
			System.out.println("Ingresa tu opción: ");
c = input.nextInt();
			if (c >= 1 && c < 6) {
			System.out.println("Ingresa 1ra cadena de caracteres: ");
			    	str1 = input.next();
	System.out.println("Ingresa 2da cadena de caracteres: ");
	STRINGTWO = input.next();		} if(c == 1) {
						
						
				result = str1.concat(STRINGTWO);
				System.out.println("Cadena de caracteres concatenados: "+result); } else if(c == 2) {
						
					comp = str1.toLowerCase().compareTo(STRINGTWO.toLowerCase());
				if(comp > 0) {
					
					
					
					System.out.println("no es igual");
				} else if (comp < 0 ) {
					System.out.println("es igual");
				}
				
				
				System.out.println(result);
} else if(c == 3) {
				result = str1.replace('o', 'a').concat(STRINGTWO.replace('a', 'o'));
				System.out.println(result);
			} else if(c == 4) {
				char[] res1 = str1.toCharArray();
				char[] res2 = STRINGTWO.toCharArray();
			for(char c1 : res1) {
					System.out.println(c1);
				}
				for(char c2 : res2) {
					System.out.println(c2);
				}
} else if(c == 5) {
				StringBuilder builder1 = new StringBuilder(str1);
		StringBuilder b2 = new StringBuilder(STRINGTWO);
				StringBuilder resultBuilder = builder1.append(b2);			resultBuilder.reverse();
						resultBuilder.deleteCharAt(0);
				resultBuilder.setCharAt(2, '?');
				System.out.println(resultBuilder);
			} else if(c == 6) {
				System.out.println("Saliendo de la aplicación.");
				System.exit(0);} } while (c > 0 && c < 6);	}}
