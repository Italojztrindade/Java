package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
	CarroFilter c1 = new CarroFilter(200, "Preto", "Popular");
	CarroFilter c2 = new CarroFilter(220, "Vermelho", "Popular");
	CarroFilter c3 = new CarroFilter(180, "Prata", "Popular");
	CarroFilter c4 = new CarroFilter(325, "Preto", "Esportivo");
	CarroFilter c5 = new CarroFilter(300, "Vermelho", "Esportivo");
	CarroFilter c6 = new CarroFilter(290, "Prata", "Esportivo");
	
	List<CarroFilter> carros = Arrays.asList(c1, c2, c3, c4,c5,c6);
	Predicate<CarroFilter> velMax = v -> v.velocidadeMax >= 220;
	Predicate<CarroFilter> validandoACor = v -> v.cor.equalsIgnoreCase("vermelho");
	Predicate<CarroFilter> validandoTipo = v -> v.modelo.equalsIgnoreCase("Esportivo");
	Function<CarroFilter, String> confirmacao = c -> "O carro é um " + c.modelo + " "+ c.cor + 
			" e pode chegar na velocidade máxima de " + c.velocidadeMax;
	
	carros.stream().filter(validandoACor)
					.filter(velMax)
					.filter(validandoTipo)
					.map(confirmacao)
					.forEach(System.out::println);
	
	}
}
