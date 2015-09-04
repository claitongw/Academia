/*
 * NESTA CLASSE MOSTRAMOS AS OP��ES DOS MENUS PARA O USU�RIO E FAZEMOS AS CHAMADAS PARA OS M�TODOS.
 */
import java.util.Scanner;
public class Menu {
	
	Scanner lerEscolha = new Scanner(System.in);
	Scanner in = new Scanner(System.in);
	Scanner in2 = new Scanner(System.in);
	
	ManterServicos mServico = new ManterServicos();
	ManterProfessor mProfessor = new ManterProfessor();
	public static Mensagens msg = new Mensagens();
	
	void mostrarMenu(){
	System.out.println("Menu | Selecione uma op��o: ");
	System.out.println("1 = Turmas:");
	System.out.println("2 = Clientes:");
	System.out.println("3 = Professores:");
	System.out.println("4 = Servi�os:");
	int esc = lerEscolha.nextInt();
		
	switch(esc){
		case 4:{
			mostrarMenuServicos();
			break;
		}
		case 3:{
			mostrarMenuProfessores();
		}
	}
	
	}
	
	void mostrarMenuServicos(){
		System.out.println("Menu\\Servi�os | Selecione uma op��o: ");
		System.out.println("1 = Incluir:");
		System.out.println("2 = Alterar:");
		System.out.println("3 = Consultar:");
		System.out.println("4 = Listar:");
		System.out.println("5 = Excluir:");
		System.out.println("6 =Voltar:");
		int esc = lerEscolha.nextInt();
		
		switch(esc){
			//add new service
			case 1:{
				int validar;
				System.out.println("Digite o c�digo do Servi�o:");
				int cDesc = in.nextInt();
				System.out.println("Digite o nome do Servi�o");
				String nDesc = in2.nextLine();
				validar=mServico.validaInclusao(cDesc);
				if(validar==0){
					mServico.incluirServicos(cDesc, nDesc);
				}else{
					msg.mensagemPopUp("O c�digo informado j� existe!");
				}
				
				break;
			}
			//alter services
			case 2:{
				System.out.println("Digite o c�digo do evento que deseja alterar:");
				int cDescAlterar = in.nextInt();
				System.out.println("Digite o novo c�digo:");
				int cDescNovo = in.nextInt();
				System.out.println("Digite o novo nome:");
				String nDescNovo = in2.nextLine();						
				mServico.alterarServicos(cDescAlterar, cDescNovo, nDescNovo);
				break;
			}
			//consult services
			case 3:{
				System.out.println("Escolha o tipo de pesquisa: (1-C�digo | 2-Nome)");
				esc = lerEscolha.nextInt();
				if(esc==1){
					System.out.println("Qual c�digo deseja consultar:");//if code
					int cDescConsultar = in.nextInt();
					mServico.consultarServicos(cDescConsultar);
				}else{
					if(esc==2){
					System.out.println("Qual o nome do servi�o q deseja consultar?");//if name
					String nDescConsultar = in2.nextLine();
					mServico.consultarServicos(nDescConsultar);
					}
				}
				break;
			}
			//show all services
			case 4:{ 
				System.out.println("Listando servi�os cadastrados");
				mServico.listarServicos();
				break;
			}
			// delete services
			case 5:{
				System.out.println("Qual o codigo do servi�o que deseja excluir:");
				int cDescExcluir = in2.nextInt();
				mServico.excluirServicos(cDescExcluir);
			}
				
		}
		
	}
	void mostrarMenuProfessores(){
		System.out.println("Menu\\Professores | Selecione uma op��o: ");
		System.out.println("1 = Incluir:");
		System.out.println("2 = Alterar:");
		System.out.println("3 = Consultar:");
		System.out.println("4 = Listar:");
		System.out.println("5 = Excluir:");
		System.out.println("6 =Voltar:");
		int esc = lerEscolha.nextInt();
		
		switch(esc){
			case 1:{
				mProfessor.incluirProfessores(1, "Claiton", "4456", "56546", "clasda");
				break;
			}
			case 2:{
				
			}
			case 3:{
				
			}
			case 4:{
				mProfessor.listarProfessores();
				break;
			}
			case 5:{
				
			}
		}
	}
	
}