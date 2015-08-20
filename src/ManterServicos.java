public class ManterServicos {
	int codDescricao;
	String nomeDescricao;
	ManterServicos[] arrayServicos = new ManterServicos[15];
	
	
	void incluirServicos(int cDescricao, String nDescricao){
		this.arrayServicos[codDescricao].codDescricao=cDescricao;
		this.arrayServicos[codDescricao].nomeDescricao=nDescricao;
	}
	

}
