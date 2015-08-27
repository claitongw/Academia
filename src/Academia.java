import java.util.*;

public class Academia {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		ManterServicos mServico = new ManterServicos();	
		Menu tela = new Menu();
		
		int continuar=1;
		while(continuar==1){
			tela.mostrarMenu();
			System.out.println("Continuar 1:");
			continuar = ler.nextInt();
		}
		mServico.listarServicos();
		
		
	}
}