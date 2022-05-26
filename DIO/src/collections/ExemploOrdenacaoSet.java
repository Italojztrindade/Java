package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class ExemploOrdenacaoSet {
	static class Serie {
		private String nome;
		private String genero;
		private Integer tempoEpisodio;

		public Serie(String nome, String genero, Integer tempoEpisodio) {
			this.nome = nome;
			this.genero = genero;
			this.tempoEpisodio = tempoEpisodio;
		}

		public String getNome() {
			return nome;
		}

		public String getGenero() {
			return genero;
		}

		public Integer getTempoEpisodio() {
			return tempoEpisodio;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public void setTempoEpisodio(Integer tempoEpisodio) {
			this.tempoEpisodio = tempoEpisodio;
		}

		@Override
		public String toString() {
			return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(genero, nome, tempoEpisodio);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Serie other = (Serie) obj;
			return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
					&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
		}

		public static void main(String[] args) {

			System.out.println("Ordem aleatória \n");
			Set<Serie> minhasSeries = new HashSet<>() {
				{
					add(new Serie("Dark", "Ficção", 50));
					add(new Serie("This is Us", "Drama", 50));
					add(new Serie("TWD", "Sobrevivência", 60));
				}
			};
			
			for (Serie serie : minhasSeries) {
				System.out.println(serie.nome + " - " + serie.genero + " - " + 
			serie.tempoEpisodio + "min.");
			}
			
			
			System.out.println("\nOrdem de inserção \n");
			
			Set<Serie> minhasSeries1 = new LinkedHashSet<>() {
				{
					add(new Serie("Dark", "Ficção", 50));
					add(new Serie("This is Us", "Drama", 50));
					add(new Serie("TWD", "Sobrevivência", 60));
				}
			};
			
			for (Serie serie : minhasSeries1) {
				System.out.println(serie.nome + " - " + serie.genero + " - " + 
			serie.tempoEpisodio + "min.");
			}
			
			
			
		}
	}
}
