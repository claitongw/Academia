package academia.faccat.br;

//import academia.faccat.br.Menu;
//import java.time.LocalDate;
import java.util.ArrayList;

public class ManterTurmas{

	protected int codigo;
	protected int codProfessor;
	protected int codModalidade;
	protected int codHorario;
	protected int codAluno;
	protected static int qntAluno=0;
	protected int diaSemanaValue;
	
	protected ManterProfessor prof;
	
	public String diaSemana;
	public String horario;

	ArrayList<ManterTurmas> arrayTurmas = new ArrayList<ManterTurmas>();

	// incluir, excluir, listar por dia da semana

	Mensagens msg = new Mensagens();

	void incluirTurma(int codigo, int  codProfessor, int codModalidade, int codHorario, int diaSemanaValue, String diaSemana, ManterProfessor professor) {
		ManterTurmas adiciona = new ManterTurmas();
		
	//	qntAluno=qntAluno+1;

		adiciona.codigo = codigo;
		adiciona.codProfessor = codProfessor;
		adiciona.codModalidade = codModalidade;
		adiciona.codHorario = codHorario;
		adiciona.diaSemana = diaSemana;
		adiciona.diaSemanaValue = diaSemanaValue;
		adiciona.prof=professor;
		//adiciona.arrayNumAlunos = null;
	
		int cont = 0;
		// verifica se é a primeira inclusão no array, se for, inclui direto.

			if (arrayTurmas.size() == 0) {
				arrayTurmas.add(adiciona);
				msg.mensagemPopUp("Turma " + adiciona.codigo+ " cadastrado com sucesso!");
			} 
			
			else {
				
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
					msg.mensagemPopUp("Turma" + adiciona.codigo+ " cadastrada com sucesso!");
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
		System.out.println("||      6        ||      18:00-19:00             ||");
		System.out.println("||      7        ||      19:00-20:00             ||");
		System.out.println("||===============================================||");
	}
	
	void listarTurmas(){
		int x=0;
		System.out.println("=============================================================================");
		for (ManterTurmas arrayTurma : arrayTurmas) {
				System.out.println("Cód. Turma :"+arrayTurma.codigo);
				
				if(arrayTurmas.get(x).codProfessor==Academia.tela.mProfessor.arrayProfessores.get(x).codigo){
					System.out.println("Professor :"+Academia.tela.mProfessor.arrayProfessores.get(x).nome);
				}
								
				switch(arrayTurma.codHorario){
					case 1:{
						System.out.println("Horário: 13:00-14:00 ");
						break;
					}
					case 2:{
						System.out.println("Horário: 14:00-15:00 ");
						break;
					}
					case 3:{
						System.out.println("Horário: 15:00-16:00 ");
						break;
					}
					case 4:{
						System.out.println("Horário: 16:00-17:00 ");
						break;
					}
					case 5:{
						System.out.println("Horário: 17:00-18:00 ");
						break;
					}
					case 6:{
						System.out.println("Horário: 18:00-19:00 ");
						break;
					}
					case 7:{
						System.out.println("Horário: 19:00-20:00 ");
						break;
					}
					
				}
				System.out.println("Dia da Semana"+arrayTurma.diaSemana);
				System.out.println("=============================================================================");
				x++;
		}
	}

}
