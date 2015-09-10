import java.util.ArrayList;


/**
 * @author Sanvitron
 *
 */
public class ManterClientes {
	private int 	codigo;
	private int 	nascimento;
	
	private char 	sexo;
	private char 	situacao;
		
	private String  nome;
	private String 	cpf;
	private String 	telefone;
	private String 	email;
	private String 	endereço;
	private String 	estadoCivil;
		
	ArrayList<ManterClientes> arrayClientes = new ArrayList<ManterClientes>();//Incluir, alterar, excluir, consultar, LISTAR
	
	//codigo, nome, cpf, telefone, email, endereco, estadoCivil, sexo, situacao, nascimento.
	
	public static Mensagens msg = new Mensagens();
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNascimento() {
		return nascimento;
	}
	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public char getSituacao() {
		return situacao;
	}
	public void setSituacao(char situacao) {
		this.situacao = situacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
	
	
}
