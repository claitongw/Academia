import java.util.ArrayList;

	class Atributos{
		public 	int 	codigo;
		public	String  nome;
		public	String 	cpf;
		public 	String 	telefone;
		public	String 	email;
		
	}

	class ManterProfessor{
	



	//public static Mensagens msg = new Mensagens();
	
	void incluirProfessores(int codigo, String nome, String cpf, String telefone, String email){	//nome, cpf, telefone, email
		ArrayList<Atributos> arrayProfessores = new ArrayList<Atributos>();
		Atributos adiciona = new Atributos();
		
		
		adiciona.codigo=codigo;
		adiciona.nome="Claiton";
		adiciona.cpf=cpf;
		adiciona.telefone=telefone;
		adiciona.email=email;
		
		arrayProfessores.add(adiciona);
		System.out.println(arrayProfessores.get(0));
		//	msg.mensagemPopUp("Professor "+adiciona.nome+" cadastrado com sucesso!");
		
	}
	
	public void listarProfessores(){
		
	}
}
