package academia.faccat.br;

//import academia.faccat.br.Menu;
//import java.time.LocalDate;
import java.util.ArrayList;

public class ManterTurmas{
	
	//private Menu menu;
	public ManterProfessor professor;
	public int codigo;
	public int codProfessor;
	public int codModalidade;
	public int codHorario;
	public int codAluno;
	public int diaSemanaValue;
	
	
	//Menu objMenu;

	public String diaSemana;
	public String horario;

	ManterTurmas[] arrayNumAlunos = new ManterTurmas[5];

	ArrayList<ManterTurmas> arrayTurmas = new ArrayList<ManterTurmas>();

	// incluir, excluir, listar por dia da semana

	Mensagens msg = new Mensagens();

	void incluirTurma(int codigo, int  codProfessor, int codModalidade, int codHorario, int diaSemanaValue, String diaSemana) {
		ManterTurmas adiciona = new ManterTurmas();

		adiciona.codigo = codigo;
		adiciona.codProfessor = codProfessor;
		adiciona.codModalidade = codModalidade;
		adiciona.codHorario = codHorario;
		adiciona.diaSemana = diaSemana;
		adiciona.diaSemanaValue = diaSemanaValue;
		adiciona.professor=professor;
		adiciona.arrayNumAlunos = null;

		int cont = 0;
		// verifica se é a primeira inclusão no array, se for, inclui direto.
		if (arrayTurmas.size() == 0) {
			arrayTurmas.add(adiciona);
			msg.mensagemPopUp("Turma " + adiciona.codigo
					+ " cadastrado com sucesso!");
		} else {
			// se não for a primeira testa se o código já existe, se não existe
			// cont=1 e no final se cont==1 ele adiciona
			for (ManterTurmas arrayTurma : arrayTurmas) {
				if (arrayTurma.codigo == codigo) {
					msg.mensagemPopUp("O Código já existe!");
				} else {
					cont = 1;
				}
			}
			if (cont == 1) {
				arrayTurmas.add(adiciona);
				msg.mensagemPopUp("Turma" + adiciona.codigo
						+ " cadastrada com sucesso!");
			}
		}
	}

	void alterarTurmas(int codAlterar, int codigo, int codProfessor, int codModalidade, int codHorario, int diaSemanaValue, String diaSemana){
		for (ManterTurmas arrayTurmas : arrayTurmas) {
			if(arrayTurmas.codigo==codAlterar){
				arrayTurmas.codigo=codigo;
				arrayTurmas.codProfessor=codProfessor;
				arrayTurmas.codModalidade=codModalidade;
				arrayTurmas.codHorario=codHorario;
				arrayTurmas.diaSemana=diaSemana;
			}
		}
	}

	void tabelaHorarios() {
		System.out.println("||===============================================||");
		System.out.println("||cód.Horarios   ||   Horarios                   ||");
		System.out.println("||===============================================||");
		System.out.println("||      1        ||      13:00-14:00             ||");
		System.out.println("||      2        ||      14:00-15:00             ||");
		System.out.println("||      3        ||      15:00-16:00             ||");
		System.out.println("||      4        ||      16:00-17:00             ||");
		System.out.println("||      5        ||      17:00-18:00             ||");
		System.out.println("||      6        ||      19:00-20:00             ||");
		System.out.println("||      7        ||      21:00-22:00             ||");
		System.out.println("||===============================================||");
	}
	void teste(){
		
		System.out.println(Academia.tela.mProfessor.arrayProfessores.get(0).nome);
	}
	
	
	void listarTurmas(){     //CONTINUAR AQUII
		int x=0;
		for (ManterTurmas arrayTurma : arrayTurmas) {
				System.out.println("Cód. Turma :"+arrayTurma.codigo);
				x++;
				if(arrayTurma.codProfessor==Academia.tela.mProfessor.arrayProfessores.get(x).codigo){
					System.out.println("Professor :"+Academia.tela.mProfessor.arrayProfessores.get(x).nome);
				}
				
				System.out.println(arrayTurma.codHorario);
				System.out.println(arrayTurma.diaSemana);
		}
	}

	void incluirModalidade() {

	}

	void listarModalidade() {

	}

}
