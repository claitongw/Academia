package academia.faccat.br;

import java.util.*;


public class Academia {

	static Menu tela;
	
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);

		tela = new Menu();
		int continuar=1;
		while(continuar==1){
			tela.mostrarMenu();
			//System.out.println("Continuar 1:");
			//continuar = ler.nextInt();
		}
	}
}