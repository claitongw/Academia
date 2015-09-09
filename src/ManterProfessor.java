import java.util.ArrayList;

	public class ManterProfessor{
		public 	int 	codigo;
		public	String  nome;
		public	String 	cpf;
		public	String 	telefone;
		public	String 	email;
		
		public static Mensagens msg = new Mensagens();
			
		ArrayList<ManterProfessor> arrayProfessores = new ArrayList<ManterProfessor>();//Incluir, alterar, excluir, consultar, LISTAR
		
	public void incluirProfessores(int codigo, String nome, String cpf, String telefone, String email){	//nome, cpf, telefone, email
		ManterProfessor adiciona = new ManterProfessor();		
		adiciona.codigo=codigo;
		adiciona.nome=nome;
		adiciona.cpf=cpf;
		adiciona.telefone=telefone;
		adiciona.email=email;
		
		int cont=0;
		//verifica se é a primeira inclusão no array, se for, inclui direto.
		if(arrayProfessores.size()==0){
			arrayProfessores.add(adiciona);
			msg.mensagemPopUp("Professor "+adiciona.nome+" cadastrado com sucesso!");
		}else{
			//se não for a primeira testa se o código já existe, se não existe cont=1 e no final se cont==1 ele adiciona
			for (ManterProfessor arrayProf : arrayProfessores) {
				if(arrayProf.codigo==codigo){
					msg.mensagemPopUp("O Código já existe!");
				}else{
					cont=1;
				}
			}
			if(cont==1){
				arrayProfessores.add(adiciona);
				msg.mensagemPopUp("Professor "+adiciona.nome+" cadastrado com sucesso!");	
			}
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
		listarProfessores();
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
	
	public void consultarProfessores(int cProfConsultar){
		int cont=0;
		for (ManterProfessor arrayProf : arrayProfessores) {
			if(arrayProf.codigo==cProfConsultar){
				System.out.println("|DADOS DO PROFESSOR "+arrayProf.nome+" ------------------------------");
				System.out.println("|CÓDIGO   : "+arrayProf.codigo);
				System.out.println("|NOME     : "+arrayProf.nome);
				System.out.println("|CPF      : "+arrayProf.cpf);
				System.out.println("|TELEFONE : "+arrayProf.telefone);
				System.out.println("|EMAIL    : "+arrayProf.email);
				System.out.println("|--------------------------------------------------------|");
			}else{
				cont=cont+1;
			}
		}
		
		if(cont>0){
			msg.mensagemPopUp("O Código não existe!");
		}
	}
	
	public void excluirProfessores(int cProfExcluir){
		for(int x=0; x<=arrayProfessores.size();x++){
			if()
			
		}
		listarProfessores();
	}
		
		/*for (ManterProfessor arrayProf : arrayProfessores) {
			if(arrayProf.codigo==cProfExcluir){
				arrayProf.
			}
		}*/
		
}