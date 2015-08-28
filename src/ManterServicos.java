public class ManterServicos {
	public int codDescricao;
	public String nomeDescricao;
	ManterServicos[] arrayServicos = new ManterServicos[999999];
	int incremento=0;
	//------------------------------------------
	public void incluirServicos(int c, String n){
		arrayServicos[incremento] = new ManterServicos();
		arrayServicos[incremento].codDescricao=c;
		arrayServicos[incremento].nomeDescricao=n;
		incremento=incremento+1;
	}
	//------------------------------------------
	public void alterarServicos(int cDescAlterar, int cDescNovo, String nDescNovo){
		int cont=0;
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao==cDescAlterar){
				arrayServicos[x].codDescricao=cDescNovo;
				arrayServicos[x].nomeDescricao=nDescNovo;
				cont=cont+1;
				System.out.println("SERVI�O ALTERADO COM SUCESSO!");
			}	
		}
		if(cont==0)
			System.out.println("O C�DIGO INFORMADO N�O EXISTE!");
	}
	//------------------------------------------
	public void consultarServicos(int cDescConsultar){//CONSULTA POR C�DIGO DO SERVI�O
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao==cDescConsultar){
				System.out.println(arrayServicos[x].codDescricao+" | "+arrayServicos[x].nomeDescricao);
			}
		}
		System.out.println("O C�DIGO INFORMADO N�O EXISTE!");
	}
	//------------------------------------------
	public void excluirServicos(int cDescExcluir){		
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao==cDescExcluir){
				arrayServicos[x]=new ManterServicos();
			}
		}
		System.out.println("SERVI�O EXCLUIDO COM SUCESSO!");
	}
	//------------------------------------------
	public void listarServicos(){
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao!=0)
			System.out.println(arrayServicos[x].codDescricao+" | "+arrayServicos[x].nomeDescricao);
		}
	}
	//------------------------------------------
}