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
		
		//Adicionando alguem na posição desejada
		list.add(2, "Freya");
		
		
		// Tamanho da lista
		System.out.println(list.size());
		
		
		//laço for each passando o tipo "String" dando o apelido "x", 
		// buscando pelos itens do list. 
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		//Removendo um dado da lista
		//list.remove("Rebekah");
		
		//Removendo por posição
		//list.remove(1);
		
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		//indexOf procurando por posição
		System.out.println("Index Klaus: " + list.indexOf("Klaus"));
		
		//Quando indexOf não encontra o elemento ele retorna -1
		System.out.println("Index Maria: " + list.indexOf("Maria"));
		
		System.out.println("-----------------");
		
		//Trazendo da lista só os nomes com a letra "E", nisso o stream não e compativel
		//com o list então tem que usar o collect(Collectors.toList());
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		
		//Buscando pelo primeiro elemento que contem a primeira letra "E" caso não encontre ele retornara null.
		String name = list.stream().filter(x -> x.charAt(0) == 'E').findFirst().orElse(null);
		System.out.println(name);
	}
}
