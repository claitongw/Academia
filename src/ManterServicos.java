public class ManterServicos {
	public int codDescricao;
	public String nomeDescricao;
	ManterServicos[] arrayServicos = new ManterServicos[999999];
	int incremento=0;
	
	public void incluirServicos(int cDesc, String nDesc){
		arrayServicos[incremento] = new ManterServicos();
		arrayServicos[incremento].codDescricao=cDesc;
		arrayServicos[incremento].nomeDescricao=nDesc;
		incremento=incremento+1;
		System.out.println("Incluido com sucesso");
	}
	
	public void alterarServicos(int cDescAlterar, int cDescNovo, String nDescNovo){
		int cont=0;
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao==cDescAlterar){
				arrayServicos[x].codDescricao=cDescNovo;
				arrayServicos[x].nomeDescricao=nDescNovo;
				cont=cont+1;
				System.out.println("SERVIÇO ALTERADO COM SUCESSO!");
			}	
		}
		if(cont==0)
			System.out.println("O CÓDIGO INFORMADO NÃO EXISTE!");
	}
	
	public void excluirServicos(int cDescExcluir){		
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao==cDescExcluir){
				arrayServicos[x]=new ManterServicos();
			}
		}
		System.out.println("SERVIÇO EXCLUIDO COM SUCESSO!");
	}
	
	public void listarServicos(){
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao>0)
			System.out.println(arrayServicos[x].codDescricao+" | "+arrayServicos[x].nomeDescricao);
		}
	}

}