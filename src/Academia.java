import java.util.*;

public class Academia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		ManterServicos[] arrayServicos = new ManterServicos[15];
		
		/*int fechar=1; int escolha=0;
		
		while(fechar==1){
			System.out.println("1-SERVIÇOS");
			escolha=in.nextInt();
			System.out.println("0-FECHAR");	
		}
		*/
				
		arrayServicos[0]  = new ManterServicos();
		arrayServicos[1]  = new ManterServicos();
		arrayServicos[2]  = new ManterServicos();
		
		arrayServicos[0].codDescricao=1;
		arrayServicos[0].nomeDescricao="Claiton";
		
		System.out.println(arrayServicos[0].nomeDescricao);
		
	}

}
