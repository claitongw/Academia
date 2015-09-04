import java.util.ArrayList;

	class Atributos{
		 	
		
	}

	public class ManterProfessor{
		public 	int 	codigo;
		public	String  nome;
		public	String 	cpf;
		public	String 	telefone;
		public	String 	email;
		ArrayList<ManterProfessor> arrayProfessores = new ArrayList<ManterProfessor>();
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
		int z=arrayProfessores.size();
		for(int x=0;x<z;x++){
			System.out.println(arrayProfessores.get(x).codigo);
			System.out.println(arrayProfessores.get(x).nome);
			System.out.println(arrayProfessores.get(x).cpf);
			System.out.println(arrayProfessores.get(x).telefone);
			System.out.println(arrayProfessores.get(x).email);
		}
		
	}
}
