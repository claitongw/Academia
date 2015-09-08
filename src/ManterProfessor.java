import java.util.ArrayList;

	public class ManterProfessor{
		public 	int 	codigo;
		public	String  nome;
		public	String 	cpf;
		public	String 	telefone;
		public	String 	email;
		ArrayList<ManterProfessor> arrayProfessores = new ArrayList<ManterProfessor>();//Incluir, alterar, excluir, consultar, LISTAR
		public static Mensagens msg = new Mensagens();
	
	public void incluirProfessores(int codigo, String nome, String cpf, String telefone, String email){	//nome, cpf, telefone, email
		ManterProfessor adiciona = new ManterProfessor();		
		adiciona.codigo=codigo;
		adiciona.nome=nome;
		adiciona.cpf=cpf;
		adiciona.telefone=telefone;
		adiciona.email=email;	
		arrayProfessores.add(adiciona);
		msg.mensagemPopUp("Professor "+adiciona.nome+" cadastrado com sucesso!");
	}
	
	public void listarProfessores(){
		for (ManterProfessor arrayProf : arrayProfessores) {
			System.out.println("|DADOS DO PROFESSOR "+arrayProf.nome+" ------------------------------");
			System.out.println("|CÓDIGO   : "+arrayProf.codigo);
			System.out.println("|NOME     : "+arrayProf.nome);
			System.out.println("|CPF      : "+arrayProf.cpf);
			System.out.println("|TELEFONE : "+arrayProf.telefone);
			System.out.println("|EMAIL    : "+arrayProf.email);
			System.out.println("|--------------------------------------------------------|");
		}
	}
	
	public void alterarProfessores(int cProfAlterar, int cProfNovo, String nProfNovo, String nProfCPF, String nProfTelefone, String nProfEmail){
		for (ManterProfessor arrayProf : arrayProfessores) {
			if(arrayProf.codigo==cProfAlterar){
				arrayProf.codigo=cProfNovo;
				arrayProf.nome=nProfNovo;
				arrayProf.cpf=nProfCPF;
				arrayProf.telefone=nProfTelefone;
				arrayProf.email=nProfEmail;
			}
		}
	}
}

	
