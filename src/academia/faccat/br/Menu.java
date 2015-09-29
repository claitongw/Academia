/*
 * NESTA CLASSE MOSTRAMOS AS OPÇÕES DOS MENUS PARA O USUÁRIO E FAZEMOS AS CHAMADAS PARA OS MÉTODOS.
 */
package academia.faccat.br;

//import java.util.Formatter;
import java.util.Scanner;
import java.time.LocalDate;

public class Menu {

	private Scanner lerEscolha = new Scanner(System.in);
	private Scanner in = new Scanner(System.in);
	private Scanner in2 = new Scanner(System.in);

	public ManterServicos mServico = new ManterServicos();
	public ManterProfessor mProfessor = new ManterProfessor();
	public ManterClientes mCliente = new ManterClientes();
	public ManterTurmas mTurma = new ManterTurmas();
	public static Mensagens msg = new Mensagens();

	void mostrarMenu() {
		System.out.println("Menu | Selecione uma opção: ");
		System.out.println("1 = Turmas:");
		System.out.println("2 = Clientes:");
		System.out.println("3 = Professores:");
		System.out.println("4 = Serviços:");
		System.out.println("5 = Agenda:");
		int esc = lerEscolha.nextInt();

		switch (esc) {
		case 1:{
			mostrarMenuTurmas();
		}
		case 2: {
			mostrarMenuClientes();
			break;
		}
		case 3: {
			mostrarMenuProfessores();
			break;
		}
		case 4: {
			mostrarMenuServicos();
			break;
		}
		case 5: {
			mostrarMenuTurmas();
			break;
		}
		}
	}

	// TURMAS-------------------------------------------------------------------------------------------------------------------------------------------------
	public void mostrarMenuTurmas() {
		System.out.println("Menu\\Turmas | Selecione uma opção: ");
		System.out.println("1 = Incluir:");
		System.out.println("2 = Alterar:");
		System.out.println("3 = Listar:");
		System.out.println("4 = Excluir:");
		System.out.println("5 =Voltar:");
		int esc = lerEscolha.nextInt();

		
		
		ManterProfessor prof = new ManterProfessor();
		switch (esc) {
			case 1: {
				System.out.println("Digite o codigo da turma: ");
				int codigo = in.nextInt();
				System.out.println("===============================================");
				System.out.println("Escolha a modalidade digitando o código dela:  ");
				mServico.listarServicos();
				int codModalidade = in.nextInt();
				System.out.println("===============================================");
				System.out.println("Digite o código do horário: ");
				mTurma.tabelaHorarios();
				int codHorario = in.nextInt();
				System.out.println("===============================================");
				System.out.println("Digite o código do professor: ");
				mProfessor.listarProfessores();
				int codProfessor = in.nextInt();
					for (ManterProfessor arrayProf : mProfessor.arrayProfessores) {
						if(arrayProf.codigo==codProfessor){
							prof=arrayProf;
						}
					}
				
				
				System.out.println("===============================================");
				System.out.println("Digite a nova data de incio da turma no seguinte formato DD/MM/YYYY - DIGITE O DIA E PRESSIONE ENTER, MÊS E ENTER, ANO E ENTER:");
				int dayOfMonth = in.nextInt();
				//System.out.println("Digite o mês do ano :");
				int month = in.nextInt();
				//System.out.println("Digite o dia :");
				int year = in.nextInt();
				LocalDate diaSemana = LocalDate.of(year, month, dayOfMonth);
				System.out.println("A turma é sempre em "+diaSemana.getDayOfWeek().name().toUpperCase());
				int diaSemanaValue = diaSemana.getDayOfWeek().getValue();
				String dSemana = diaSemana.getDayOfWeek().name().toUpperCase();
				mTurma.incluirTurma(codigo, codProfessor, codModalidade, codHorario, diaSemanaValue, dSemana, prof);
				
				break;
			}
			case 2:{
				System.out.println("Digite o código da turma que deseja alterar: ");
				int codAlterar = in.nextInt();
				System.out.println("Digite o novo codigo da turma: ");
				int codigo = in.nextInt();
				mServico.listarServicos();
				System.out.println("1-Musculação | 2-Corrida | 3-Pilates | 4-Zumba ");
				int codModalidade = in.nextInt();
				System.out.println("===============================================");
				System.out.println("Digite o novo código do horário: ");
				mTurma.tabelaHorarios();
				int codHorario = in.nextInt();
				System.out.println("===============================================");
				System.out.println("Digite o novo código do professor: ");
				mProfessor.listarProfessores();
				int codProfessor = in.nextInt();
				System.out.println("===============================================");
				System.out.println("Digite a nova data de incio da turma no seguinte formato DD/MM/YYYY - DIGITE O DIA E PRESSIONE ENTER, MÊS E ENTER, ANO E ENTER:");
				int dayOfMonth = in.nextInt();
				int month = in.nextInt();	
				int year = in.nextInt();
				LocalDate diaSemana = LocalDate.of(year, month, dayOfMonth);
				System.out.println("A turma é sempre em "+diaSemana.getDayOfWeek().name().toUpperCase());
				int diaSemanaValue = diaSemana.getDayOfWeek().getValue();
				String dSemana = diaSemana.getDayOfWeek().name().toUpperCase();
				mTurma.alterarTurmas(codAlterar, codigo, codProfessor, codModalidade, codHorario, diaSemanaValue, dSemana);
				break;
			}
			case 3:{
				mTurma.listarTurmas();
				break;
			}
			case 4:{
				mTurma.teste();
				break;
			}
		}
	}

	// SERVIÇOS-------------------------------------------------------------------------------------------------------------------------------------------------

	void mostrarMenuServicos() {
		System.out.println("Menu\\Serviços | Selecione uma opção: ");
		System.out.println("1 = Incluir:");
		System.out.println("2 = Alterar:");
		System.out.println("3 = Consultar:");
		System.out.println("4 = Listar:");
		System.out.println("5 = Excluir:");
		System.out.println("6 =Voltar:");
		int esc = lerEscolha.nextInt();

		switch (esc) {
		// add new service
		case 1: {
			int validar;
			System.out.println("Digite o código do Serviço:");
			int cDesc = in.nextInt();
			System.out.println("Digite o nome do Serviço");
			String nDesc = in2.nextLine();
			validar = mServico.validaInclusao(cDesc);
			if (validar == 0) {
				mServico.incluirServicos(cDesc, nDesc);
			} else {
				msg.mensagemPopUp("O código informado já existe!");
			}
			break;
		}
		// alter services
		case 2: {
			System.out
					.println("Digite o código do serviço que deseja alterar:");
			int cDescAlterar = in.nextInt();
			System.out.println("Digite o novo código:");
			int cDescNovo = in.nextInt();
			System.out.println("Digite o novo nome:");
			String nDescNovo = in2.nextLine();
			mServico.alterarServicos(cDescAlterar, cDescNovo, nDescNovo);
			break;
		}
		// consult services
		case 3: {
			System.out
					.println("Escolha o tipo de pesquisa: (1-Código | 2-Nome)");
			esc = lerEscolha.nextInt();
			if (esc == 1) {
				System.out.println("Qual código deseja consultar:");// if code
				int cDescConsultar = in.nextInt();
				mServico.consultarServicos(cDescConsultar);
			} else {
				if (esc == 2) {
					System.out
							.println("Qual o nome do serviço q deseja consultar?");// if
																					// name
					String nDescConsultar = in2.nextLine();
					mServico.consultarServicos(nDescConsultar);
				}
			}
			break;
		}
		// show all services
		case 4: {
			System.out.println("Listando serviços cadastrados");
			mServico.listarServicos();
			break;
		}
		// delete services
		case 5: {
			System.out.println("Qual o codigo do serviço que deseja excluir:");
			int cDescExcluir = in2.nextInt();
			mServico.excluirServicos(cDescExcluir);
			break;
		}
		case 6: {
			mostrarMenu();
			break;
		}

		}

	}

	// PROFESSORES-------------------------------------------------------------------------------------------------------------------------------------------------

	void mostrarMenuProfessores() {
		System.out.println("Menu\\Professores | Selecione uma opção: ");
		System.out.println("1 = Incluir:");
		System.out.println("2 = Alterar:");
		System.out.println("3 = Consultar:");
		System.out.println("4 = Listar:");
		System.out.println("5 = Excluir:");
		System.out.println("6 =Voltar:");
		int esc = lerEscolha.nextInt();

		switch (esc) {
		case 1: {
//			System.out.println("Digite o CÓDIGO do professor: ");
//			int codProfIncluir = in.nextInt();
//
//			System.out.println("Digite o NOME do professor: ");
//			String nomeProfInluir = in2.nextLine();
//
//			System.out.println("Digite o CPF do professor: ");
//			String cpfProfIncluir = in2.nextLine();
//
//			System.out.println("Digite o TELEFONE do professor: ");
//			String telProfIncluir = in2.nextLine();
//
//			System.out.println("Digite o EMAIL do professor: ");
//			String emailProfIncluir = in2.nextLine();
//			
//			
			mProfessor.incluirProfessores(12, "Claiton", "99999999", "99999999", "dgyasdgahsdusa@hduashdua.com");
//			mProfessor.incluirProfessores(codProfIncluir, nomeProfInluir, cpfProfIncluir, telProfIncluir, emailProfIncluir);
			break;
		}
		case 2: {
			System.out
					.println("Digite o código do professor que deseja alterar: ");
			int cProfAlterar = in.nextInt();

			System.out.println("Digite o novo CÓDIGO desejado: ");
			int cProfNovo = in.nextInt();

			System.out.println("Digite o novo NOME: ");
			String nProfNovo = in2.nextLine();

			System.out.println("Digite o novo CPF: ");
			String nProfCPF = in2.nextLine();

			System.out.println("Digite o novo TELEFONE: ");
			String nProfTelefone = in2.nextLine();

			System.out.println("Digite o novo EMAIL: ");
			String nProfEmail = in2.nextLine();

			mProfessor.alterarProfessores(cProfAlterar, cProfNovo, nProfNovo,
					nProfCPF, nProfTelefone, nProfEmail);
			break;
		}
		case 3: {
			System.out
					.println("Digite o código do professor que deseja consultar: ");
			int cProfConsultar = in.nextInt();

			mProfessor.consultarProfessores(cProfConsultar);
			break;
		}
		case 4: {
			mProfessor.listarProfessores();
			break;
		}
		case 5: {
			System.out
					.println("Digite o código do professor que deseja excluir: ");
			int cProfExcluir = in.nextInt();

			mProfessor.excluirProfessores(cProfExcluir);
			break;
		}
		case 6: {
			mostrarMenu();
			break;
		}
		}
	}

	// CLIENTES-------------------------------------------------------------------------------------------------------------------------------------------------

	// codigo, nome, cpf, telefone, email, endereco, estadoCivil, sexo,
	// situacao, nascimento.

	void mostrarMenuClientes() {
		System.out.println("Menu\\Clientes(Alunos) | Selecione uma opção: ");
		System.out.println("1 = Incluir:");
		System.out.println("2 = Alterar:");
		System.out.println("3 = Consultar:");
		System.out.println("4 = Listar:");
		System.out.println("5 = Excluir:");
		System.out.println("6 =Voltar:");
		int esc = lerEscolha.nextInt();

		switch (esc) {//
		case 1: {
			System.out.println("Digite o CÓDIGO do aluno: ");
			int codClienteIncluir = in.nextInt();

			System.out.println("Digite o NOME do aluno: ");
			String nomeClienteInluir = in2.nextLine();

			System.out.println("Digite o CPF do aluno: ");
			String cpfClienteIncluir = in2.nextLine();

			System.out.println("Digite o TELEFONE do aluno: ");
			String telClienteIncluir = in2.nextLine();

			System.out.println("Digite o EMAIL do aluno: ");
			String emailClienteIncluir = in2.nextLine();

			System.out.println("Digite o ENDEREÇO do aluno: ");
			String enderecoClienteIncluir = in2.nextLine();

			System.out.println("Digite o ESTADO CIVIL do aluno: ");
			String estadoCivilClienteIncluir = in2.nextLine();

			System.out.println("Digite o SEXO do aluno: M/F");
			String sexoClienteIncluir = in2.nextLine();

			System.out
					.println("Digite o SITUAÇÂO do aluno: A (ativo) | I (Inativo)");
			String situacaoClienteIncluir = in2.nextLine();

			System.out.println("Digite a DATA DE NASCIMENTO do aluno: ");
			String nascClienteIncluir = in2.nextLine();

			// mCliente.incluirClientes(codClienteIncluir, nascClienteIncluir,
			// sexo, situacao, nome, cpf, telefone, email, endereco,
			// estadoCivil);
			mCliente.incluirClientes(codClienteIncluir, nascClienteIncluir,
					sexoClienteIncluir, situacaoClienteIncluir,
					nomeClienteInluir, cpfClienteIncluir, telClienteIncluir,
					emailClienteIncluir, enderecoClienteIncluir,
					estadoCivilClienteIncluir);
			// mCliente.incluirClientes(1, "12/10/2011", "M", "A", "Claiton",
			// "37623278987", "877786687687", "dhsudahs@djsaijdais.com.ui",
			// "Rua da amoreira", "Solteiro");
			break;
		}
		case 2: {
			System.out.println("Digite o código do ALUNO que deseja alterar: ");
			int cClienteAlterar = in.nextInt();

			System.out.println("Digite o novo CÓDIGO desejado: ");
			int cClienteNovo = in.nextInt();

			System.out.println("Digite o novo NOME: ");
			String nClienteNovo = in2.nextLine();

			System.out.println("Digite o novo CPF: ");
			String nClienteCPF = in2.nextLine();

			System.out.println("Digite o novo TELEFONE: ");
			String nClienteTelefone = in2.nextLine();

			System.out.println("Digite o novo EMAIL: ");
			String nClienteEmail = in2.nextLine();

			System.out.println("Digite o ENDEREÇO do aluno: ");
			String enderecoClienteIncluir = in2.nextLine();

			System.out.println("Digite o ESTADO CIVIL do aluno: ");
			String estadoCivilClienteIncluir = in2.nextLine();

			System.out.println("Digite o SEXO do aluno: M/F");
			String sexoClienteIncluir = in2.nextLine();

			System.out
					.println("Digite o SITUAÇÂO do aluno: A (ativo) | I (Inativo)");
			String situacaoClienteIncluir = in2.nextLine();

			System.out.println("Digite a DATA DE NASCIMENTO do aluno: ");
			String nascClienteIncluir = in2.nextLine();

			mCliente.alterarClientes(cClienteAlterar, cClienteNovo,
					nascClienteIncluir, sexoClienteIncluir,
					situacaoClienteIncluir, nClienteNovo, nClienteCPF,
					nClienteTelefone, nClienteEmail, enderecoClienteIncluir,
					estadoCivilClienteIncluir);
			break;
		}
		case 3: {
			System.out
					.println("Digite o código do professor que deseja consultar: ");
			int cClienteConsultar = in.nextInt();

			mCliente.consultarClientes(cClienteConsultar);
			break;
		}
		case 4: {
			mCliente.listarClientes();
			break;
		}
		case 5: {
			System.out
					.println("Digite o código do professor que deseja excluir: ");
			int cClienteExcluir = in.nextInt();
			mCliente.excluirClientes(cClienteExcluir);
			break;
		}
		case 6: {
			mostrarMenu();
			break;
		}
		}

	}
}