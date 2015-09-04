import java.util.ArrayList;

	class Atributos{
		 	int 	codigo;
			String  nome;
			String 	cpf;
		 	String 	telefone;
			String 	email;
		
	}

	public class ManterProfessor{

		//public static Mensagens msg = new Mensagens();
	
	void incluirProfessores(int codigo, String nome, String cpf, String telefone, String email){	//nome, cpf, telefone, email
	
		ArrayList<Atributos> arrayProfessores = new ArrayList<Atributos>();
		Atributos adiciona = new Atributos();
		
		adiciona.codigo=codigo;
		adiciona.nome=nome;
		adiciona.cpf=cpf;
		adiciona.telefone=telefone;
		adiciona.email=email;
		
		arrayProfessores.add(adiciona);
		System.out.println( arrayProfessores );
		
		//	msg.mensagemPopUp("Professor "+adiciona.nome+" cadastrado com sucesso!");
		
	}
	
	public void listarProfessores(){
		
	}
}
