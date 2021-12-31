package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		
		//Adicionando pessoas no list
		list.add("Eduardo");
		list.add("Klaus");
		list.add("Maria");
		list.add("Kol");
		list.add("Milena");
		list.add("Edu");
		list.add("Edudu");
		
		//Adicionando alguem na posi��o desejada
		list.add(2, "Freya");
		
		
		// Tamanho da lista
		System.out.println(list.size());
		
		
		//la�o for each passando o tipo "String" dando o apelido "x", 
		// buscando pelos itens do list. 
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		//Removendo um dado da lista
		//list.remove("Rebekah");
		
		//Removendo por posi��o
		//list.remove(1);
		
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		//indexOf procurando por posi��o
		System.out.println("Index Klaus: " + list.indexOf("Klaus"));
		
		//Quando indexOf n�o encontra o elemento ele retorna -1
		System.out.println("Index Maria: " + list.indexOf("Maria"));
		
		System.out.println("-----------------");
		
		//Trazendo da lista s� os nomes com a letra "E", nisso o stream n�o e compativel
		//com o list ent�o tem que usar o collect(Collectors.toList());
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		
		//Buscando pelo primeiro elemento que contem a primeira letra "E" caso n�o encontre ele retornara null.
		String name = list.stream().filter(x -> x.charAt(0) == 'E').findFirst().orElse(null);
		System.out.println(name);
	}
}
