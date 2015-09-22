import java.util.ArrayList;


public class ManterClientes {
	public int 	 	codigo;
		
	public String 	sexo;
	public String	situacao;
	public String 	nascimento;
	public String   nome;
	public String 	cpf;
	public String 	telefone;
	public String 	email;
	public String 	endereco;
	public String 	estadoCivil;
		
	ArrayList<ManterClientes> arrayClientes = new ArrayList<ManterClientes>();//Incluir, alterar, excluir, consultar, LISTAR
	
	//codigo, nome, cpf, telefone, email, endereco, estadoCivil, sexo, situacao, nascimento.
	
	public static Mensagens msg = new Mensagens();	
	
	public void incluirClientes(int codigo, String nascimento, String sexo, String situacao, String nome, String cpf,
								String telefone, String email, String endereco, String estadoCivil){
	
		ManterClientes adiciona = new ManterClientes();
		
		adiciona.codigo=codigo;
		adiciona.nascimento=nascimento;
		adiciona.sexo=sexo;
		adiciona.situacao=situacao;
		adiciona.nome=nome;
		adiciona.cpf=cpf;
		adiciona.telefone=telefone;
		adiciona.email=email;
		adiciona.endereco=endereco;
		adiciona.estadoCivil=estadoCivil;
		
		int cont=0;
		//verifica se é a primeira inclusão no array, se for, inclui direto.
		if(arrayClientes.size()==0){
			arrayClientes.add(adiciona);
			msg.mensagemPopUp("Aluno "+adiciona.nome+" cadastrado com sucesso!");
		}else{
			//se não for a primeira testa se o código já existe, se não existe cont=1 e no final se cont==1 ele adiciona
			for (ManterClientes arrayAluno : arrayClientes) {
				if(arrayAluno.codigo==codigo){
					msg.mensagemPopUp("O Código já existe!");
				}else{
					cont=1;
				}
			}
			if(cont==1){
				arrayClientes.add(adiciona);
				msg.mensagemPopUp("Aluno "+adiciona.nome+" cadastrado com sucesso!");	
			}
		}
	}
	

	public void alterarClientes(int codAlterar, int codigo, String nascimento, String sexo, String situacao, String nome, String cpf,
			String telefone, String email, String endereco, String estadoCivil){	
		for (ManterClientes arrayAluno : arrayClientes) {
			if(arrayAluno.codigo==codAlterar){
				arrayAluno.codigo=codigo;
				arrayAluno.nome=nome;
				arrayAluno.cpf=cpf;
				arrayAluno.telefone=telefone;
				arrayAluno.email=email;
				arrayAluno.nascimento=nascimento;
				arrayAluno.sexo=sexo;
				arrayAluno.situacao=situacao;
				arrayAluno.endereco=endereco;
				arrayAluno.estadoCivil=estadoCivil;
			}
		}
		listarClientes();
	}
	
	public void listarClientes(){
		for (ManterClientes arrayAluno : arrayClientes) {
			System.out.println("|DADOS DO CLIENTE "+arrayAluno.nome+" ------------------------------");
			System.out.println("|CÓDIGO     : "+arrayAluno.codigo);
			System.out.println("|NOME       : "+arrayAluno.nome);
			System.out.println("|CPF        : "+arrayAluno.cpf);
			System.out.println("|TELEFONE   : "+arrayAluno.telefone);
			System.out.println("|EMAIL      : "+arrayAluno.email);
			System.out.println("|NASCIMENTO : "+arrayAluno.nascimento);
			System.out.println("|TELEFONE   : "+arrayAluno.sexo);
			System.out.println("|EMAIL      : "+arrayAluno.situacao);
			System.out.println("|NASCIMENTO : "+arrayAluno.endereco);
//			System.out.println("|SEXO		: "+arrayAluno.sexo);
//			System.out.println("|SITUACAO	: "+arrayAluno.situacao);
//			System.out.println("|ENDEREÇO	: "+arrayAluno.endereco);
			System.out.println("|Est. Civil : "+arrayAluno.estadoCivil);
			System.out.println("|--------------------------------------------------------|");
		}
	}
	
	public void consultarClientes(int cClienteConsultar){
		int cont=0;
		for (ManterClientes arrayAluno : arrayClientes) {
			if(arrayAluno.codigo==cClienteConsultar){
				System.out.println("|DADOS DO CLIENTE "+arrayAluno.nome+" ------------------------------");
				System.out.println("|CÓDIGO     : "+arrayAluno.codigo);
				System.out.println("|NOME       : "+arrayAluno.nome);
				System.out.println("|CPF        : "+arrayAluno.cpf);
				System.out.println("|TELEFONE   : "+arrayAluno.telefone);
				System.out.println("|EMAIL      : "+arrayAluno.email);
				System.out.println("|NASCIMENTO : "+arrayAluno.nascimento);
				System.out.println("|SEXO 		: "+arrayAluno.sexo);
				System.out.println("|SITUACAO 	: "+arrayAluno.situacao);
				System.out.println("|ENDEREÇO 	: "+arrayAluno.endereco);
				System.out.println("|Est. Civil : "+arrayAluno.estadoCivil);
				System.out.println("|--------------------------------------------------------|");
			}else{
				cont=cont+1;
			}
		}
		
		if(cont>0){
			msg.mensagemPopUp("O Código não existe!");
		}
	}
	
	public void excluirClientes(int cClienteExcluir){
		for (ManterClientes arrayAluno : arrayClientes) {
			if(arrayAluno.codigo==cClienteExcluir){
				arrayClientes.remove(arrayAluno);
				msg.mensagemPopUp("removido");
			return;
			}
		}
			msg.mensagemPopUp("O Código não existe!");
	}	
}

