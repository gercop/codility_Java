package codificacao_topico_01_geral;

public class atributo_final {

	public static final int valor = 12;
	
	public static void main(String[] args) {
		try {
			//valor = 13; //Propriedade com atributo final n�o pode ser alterado!
			System.out.println(valor);
			
		} catch (Exception e) {
			System.out.println("Nao pode alterar classe final!");
		}
		
	}

}
