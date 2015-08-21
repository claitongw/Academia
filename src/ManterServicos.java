public class ManterServicos {
	int codDescricao;
	String nomeDescricao;
	ManterServicos[] arrayServicos = new ManterServicos[15];
	
	
	void incluirServicos(int codDescricao, String nomeDescricao){
		arrayServicos[codDescricao].codDescricao=codDescricao;
		arrayServicos[codDescricao].nomeDescricao=nomeDescricao;
		System.out.println(nomeDescricao+" Incluido com sucesso!");
	}
	

}
