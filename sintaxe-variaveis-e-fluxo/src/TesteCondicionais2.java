
public class TesteCondicionais2 {
	public static void main(String[] args) {
		
		int idade = 18;
		int quantidadedePessoas = 2;
		
		boolean acompanhado = quantidadedePessoas >= 2;
		
		
		//if (idade >= 18 && quantidadedePessoas >= 2)
		
		if (idade >= 18 && acompanhado){
		
		System.out.println("Seja bem vindo");
		
		}else {
			
			System.out.println("Infelizmente você não pode entrar");
		}
	}

}
