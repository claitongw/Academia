import java.util.Scanner;

public class Menu {
	Scanner lerEscolha = new Scanner(System.in);
<<<<<<< HEAD
	void mostrarMenu(){
	System.out.println("Menu | Selecione uma opção: ");
	System.out.println("1 = Turmas:");
	System.out.println("2 = Clientes:");
	System.out.println("3 = Professores:");
	System.out.println("4 = Serviços:");
	int esc = lerEscolha.nextInt();
		
	switch(esc){
		case 4:{
			mostrarMenuServicos();
		}
	}
	
}
	
	void mostrarMenuServicos(){
		Scanner lerEscolha = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		ManterServicos mServico = new ManterServicos();
		System.out.println("Menu\\Serviços | Selecione uma opção: ");
		System.out.println("1 = Incluir:");
		System.out.println("2 = Alterar:");
		System.out.println("3 = Consultar:");
		System.out.println("4 = Excluir:");
		System.out.println("5 = Voltar:");
		int esc = lerEscolha.nextInt();
		
		switch(esc){
			case 1:{
				System.out.println("Digite o código do Serviço:");
				int cDesc = in.nextInt();
				System.out.println("Digite o nome do Serviço");
				String nDesc = in2.nextLine();
				
				mServico.incluirServicos(cDesc, nDesc);
				break;
			}case 2:{
			//	mServico.alterarServicos(cDescAlterar, cDescNovo, nDescNovo);();
			}
				
		}
		
	}
	
	 
	
}
=======

	void mostrarMenu(){
	System.out.println("Menu | Selecione uma opção: ");
	System.out.println("1 = Turmas:");
	System.out.println("2 = Clientes:");
	System.out.println("3 = Professores:");
	System.out.println("4 = Serviços:");
	int esc = lerEscolha.nextInt();
		
	switch(esc){
		case 4:{
			mostrarMenuServicos();
		}
	}
	
}
	
	void mostrarMenuServicos(){
		Scanner in = new Scanner(System.in);
		ManterServicos mServico = new ManterServicos();
		System.out.println("Menu\\Serviços | Selecione uma opção: ");
		System.out.println("1 = Incluir:");
		System.out.println("2 = Alterar:");
		System.out.println("3 = Consultar:");
		System.out.println("4 = Excluir:");
		System.out.println("5 = Voltar:");
		int esc = lerEscolha.nextInt();
		
		switch(esc){
			case 1:{
				mServico.incluirServicos(1, "Claiton");
				break;
			}case 3:{
				mServico.listarServicos();
			}
				
		}
		
	}
	
	 
	
}
>>>>>>> branch 'master' of https://github.com/claitongw/Academia.git
