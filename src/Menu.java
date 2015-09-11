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
	ManterClientes mCliente = new ManterClientes();
	public static Mensagens msg = new Mensagens();
	
	void mostrarMenu(){
	System.out.println("Menu | Selecione uma op��o: ");
	System.out.println("1 = Turmas:");
	System.out.println("2 = Clientes:");
	System.out.println("3 = Professores:");
	System.out.println("4 = Servi�os:");
	int esc = lerEscolha.nextInt();
		
		switch(esc){
			case 2:{
				mostrarMenuClientes();
				break;
			}
			case 3:{
				mostrarMenuProfessores();
			}
			case 4:{
				mostrarMenuServicos();
				break;
			}
		}
	}
	
	//SERVI�OS-------------------------------------------------------------------------------------------------------------------------------------------------
	
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
				System.out.println("Digite o c�digo do servi�o que deseja alterar:");
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
	
	//PROFESSORES-------------------------------------------------------------------------------------------------------------------------------------------------
	
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
				System.out.println("Digite o C�DIGO do professor: ");
				int codProfIncluir = in.nextInt();
				
				System.out.println("Digite o NOME do professor: ");
				String nomeProfInluir = in2.nextLine();
				
				System.out.println("Digite o CPF do professor: ");
				String cpfProfIncluir = in2.nextLine();
								
				System.out.println("Digite o TELEFONE do professor: ");
				String telProfIncluir = in2.nextLine();
				
				System.out.println("Digite o EMAIL do professor: ");
				String emailProfIncluir = in2.nextLine();
				
				mProfessor.incluirProfessores(codProfIncluir, nomeProfInluir, cpfProfIncluir, telProfIncluir, emailProfIncluir);
				break;
			}
			case 2:{
				System.out.println("Digite o c�digo do professor que deseja alterar: ");
				int cProfAlterar = in.nextInt();
				
				System.out.println("Digite o novo C�DIGO desejado: ");
				int cProfNovo = in.nextInt();
				
				System.out.println("Digite o novo NOME: ");
				String nProfNovo = in2.nextLine();
				
				System.out.println("Digite o novo CPF: ");
				String nProfCPF = in2.nextLine();
				
				System.out.println("Digite o novo TELEFONE: ");
				String nProfTelefone = in2.nextLine();
				
				System.out.println("Digite o novo EMAIL: ");
				String nProfEmail = in2.nextLine();
				
				mProfessor.alterarProfessores(cProfAlterar, cProfNovo, nProfNovo, nProfCPF, nProfTelefone, nProfEmail);
				break;
			}
			case 3:{
				System.out.println("Digite o c�digo do professor que deseja consultar: ");
				int cProfConsultar = in.nextInt();
				
				mProfessor.consultarProfessores(cProfConsultar);
				break;
			}
			case 4:{
				mProfessor.listarProfessores();
				break;
			}
			case 5:{
				System.out.println("Digite o c�digo do professor que deseja excluir: ");
				int cProfExcluir = in.nextInt();
				
				mProfessor.excluirProfessores(cProfExcluir);
				break;
			}
		}
	}
	//CLIENTES-------------------------------------------------------------------------------------------------------------------------------------------------
	
	//codigo, nome, cpf, telefone, email, endereco, estadoCivil, sexo, situacao, nascimento.
	
	void mostrarMenuClientes(){
		System.out.println("Menu\\Clientes(Alunos) | Selecione uma op��o: ");
		System.out.println("1 = Incluir:");
		System.out.println("2 = Alterar:");
		System.out.println("3 = Consultar:");
		System.out.println("4 = Listar:");
		System.out.println("5 = Excluir:");
		System.out.println("6 =Voltar:");
		int esc = lerEscolha.nextInt();
		
		switch(esc){//
			case 1:{
//				System.out.println("Digite o C�DIGO do aluno: ");
//				int codClienteIncluir = in.nextInt();
//				
//				System.out.println("Digite o NOME do aluno: ");
//				String nomeClienteInluir = in2.nextLine();
//				
//				System.out.println("Digite o CPF do aluno: ");
//				String cpfClienteIncluir = in2.nextLine();
//								
//				System.out.println("Digite o TELEFONE do aluno: ");
//				String telClienteIncluir = in2.nextLine();
//				
//				System.out.println("Digite o EMAIL do aluno: ");
//				String emailClienteIncluir = in2.nextLine();
//				
//				System.out.println("Digite o ENDERE�O do aluno: ");
//				String enderecoClienteIncluir = in2.nextLine();
//				
//				System.out.println("Digite o ESTADO CIVIL do aluno: ");
//				String estadoCivilClienteIncluir = in2.nextLine();
//				
//				System.out.println("Digite o SEXO do aluno: M/F");
//				char sexoClienteIncluir = in2.nextLine().charAt(0);
//				
//				System.out.println("Digite o SITUA��O do aluno: A (ativo) | I (Inativo)");
//				char situacaoClienteIncluir = in2.nextLine().charAt(0);
//				
//				System.out.println("Digite a DATA DE NASCIMENTO do aluno: ");
//				String nascClienteIncluir = in2.nextLine();
								
				//mCliente.incluirClientes(codClienteIncluir, codClienteIncluir, sexoClienteIncluir, situacaoClienteIncluir, nomeClienteInluir, cpfClienteIncluir, telClienteIncluir,
					//	emailClienteIncluir, enderecoClienteIncluir, estadoCivilClienteIncluir);
				mCliente.incluirClientes(1, "12/10/2011", 'M', 'A', "Claiton", "37623278987", "877786687687", "dhsudahs@djsaijdais.com.ui", "Rua da amoreira", "Solteiro");
				break;
			}
			case 2:{
				System.out.println("Digite o c�digo do ALUNO que deseja alterar: ");
				int cProfAlterar = in.nextInt();
				
				System.out.println("Digite o novo C�DIGO desejado: ");
				int cProfNovo = in.nextInt();
				
				System.out.println("Digite o novo NOME: ");
				String nProfNovo = in2.nextLine();
				
				System.out.println("Digite o novo CPF: ");
				String nProfCPF = in2.nextLine();
				
				System.out.println("Digite o novo TELEFONE: ");
				String nProfTelefone = in2.nextLine();
				
				System.out.println("Digite o novo EMAIL: ");
				String nProfEmail = in2.nextLine();

				System.out.println("Digite o ENDERE�O do aluno: ");
				String enderecoClienteIncluir = in2.nextLine();
				
				System.out.println("Digite o ESTADO CIVIL do aluno: ");
				String estadoCivilClienteIncluir = in2.nextLine();
				
				System.out.println("Digite o SEXO do aluno: M/F");
				char sexoClienteIncluir = in2.nextLine().charAt(0);
				
				System.out.println("Digite o SITUA��O do aluno: A (ativo) | I (Inativo)");
				char situacaoClienteIncluir = in2.nextLine().charAt(0);
				
				System.out.println("Digite a DATA DE NASCIMENTO do aluno: ");
				String nascClienteIncluir = in2.nextLine();
				
				mProfessor.alterarProfessores(cProfAlterar, cProfNovo, nProfNovo, nProfCPF, nProfTelefone, nProfEmail);
				break;
			}
			case 3:{
				System.out.println("Digite o c�digo do professor que deseja consultar: ");
				int cProfConsultar = in.nextInt();
				
				mProfessor.consultarProfessores(cProfConsultar);
				break;
			}
			case 4:{
				mProfessor.listarProfessores();
				break;
			}
			case 5:{
				System.out.println("Digite o c�digo do professor que deseja excluir: ");
				int cProfExcluir = in.nextInt();
				
				mProfessor.excluirProfessores(cProfExcluir);
				break;
			}
		}
		
	}
}