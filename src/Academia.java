import java.util.*;

class Menu{
	int mostrarMenu(){
	Scanner lerEscolha = new Scanner(System.in);
	System.out.println("Menu-Selecione uma op��o: ");
	System.out.println("1 = Turmas:");
	System.out.println("2 = Clientes:");
	System.out.println("3 = Servicos:");
	System.out.println("4 = Servi�os:");
	int esc = lerEscolha.nextInt();
	return esc;
	}
}

public class Academia {

	public static void main(String[] args) {
		
		//Menu mMenu = new Menu();
		//int retornoEscolha = mMenu.mostrarMenu();
		//System.out.println(retornoEscolha);
		
		ManterServicos mServico = new ManterServicos();	
		mServico.incluirServicos(1, "Pilates");
		mServico.incluirServicos(2, "Running");
		mServico.incluirServicos(3, "Muscula��o");
		
		mServico.listarServicos();
		
		mServico.excluirServicos(2);
		
		mServico.listarServicos();

	}

}
