package classe;

public class Data {

	int dia, mes, ano;
	
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int dia, int mes, int anoI){
		dia = this.dia;
		mes = this.mes;
		ano = anoI;
	}
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes,ano);
		
		
	}
}
