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
		for (ManterProfessor manterProfessor : arrayProfessores) {
			System.out.println("|DADOS DO PROFESSOR "+manterProfessor.nome+" ------------------------------");
			System.out.println("|CÓDIGO   : "+manterProfessor.codigo);
			System.out.println("|NOME     : "+manterProfessor.nome);
			System.out.println("|CPF      : "+manterProfessor.cpf);
			System.out.println("|TELEFONE : "+manterProfessor.telefone);
			System.out.println("|EMAIL    : "+manterProfessor.email);
			System.out.println("|--------------------------------------------------------|");
		}
	}
	
	public void alterarProfessores(){
		
	}
}

	
