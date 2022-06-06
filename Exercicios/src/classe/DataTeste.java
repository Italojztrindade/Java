package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 23;
		d1.mes = 2;
		d1.ano = 1987;
		
		Data d2 = new Data(28,02,1989);
		d2.dia = 28;
		d2.mes = 02;
		d2.ano = 1989;
		
		Data d3 = new Data();
		
		System.out.println(d1.obterDataFormatada());
		System.out.println("\nSegunda data informada " + d2.obterDataFormatada());
		System.out.println("Data padrão " + d3.obterDataFormatada());
	}
}
