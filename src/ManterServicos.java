public class ManterServicos {
	public int codDescricao;
	public String nomeDescricao;
	ManterServicos[] arrayServicos = new ManterServicos[999999];
	int incremento=0;
	int cont=0;
	//------------------------------------------
	public void incluirServicos(int c, String n){
		arrayServicos[incremento] = new ManterServicos();
		arrayServicos[incremento].codDescricao=c;
		arrayServicos[incremento].nomeDescricao=n;
		incremento=incremento+1;
		//Mensagens mIncluir = new Mensagens();
		//mIncluir.incluidoSucesso();
		System.out.println("||=============================||");
		System.out.println("||SERVIÇO INCLUIDO COM SUCESSO!||");
		System.out.println("||=============================||");
		
	}
	//------------------------------------------
	public void alterarServicos(int cDescAlterar, int cDescNovo, String nDescNovo){
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
	//------------------------------------------
	public void consultarServicos(int cDescConsultar){//CONSULTA POR CÓDIGO DO SERVIÇO
		int cont2=1;
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao==cDescConsultar){
				System.out.println(arrayServicos[x].codDescricao+" | "+arrayServicos[x].nomeDescricao);
				
			}else{
				cont2=cont2+1;
			}
		}
		if(cont2>1)
		System.out.println("O CÓDIGO INFORMADO NÃO EXISTE!");
	}
	
	public void consultarServicos(String nDescConsultar){//CONSULTA POR NOME DO SERVIÇO
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].nomeDescricao.equals(nDescConsultar)){
				System.out.println(arrayServicos[x].codDescricao+" | "+arrayServicos[x].nomeDescricao);
			}else{
				cont=cont+1;
			}
		}
		if(cont==0)
		System.out.println("O CÓDIGO INFORMADO NÃO EXISTE!");
	}
	//------------------------------------------
	public void excluirServicos(int cDescExcluir){		
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao==cDescExcluir){
				arrayServicos[x]=new ManterServicos();
			}
		}
		System.out.println("SERVIÇO EXCLUIDO COM SUCESSO!");
	}
	//------------------------------------------
	public void listarServicos(){
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao!=0)
			System.out.println(arrayServicos[x].codDescricao+" | "+arrayServicos[x].nomeDescricao);
		}
	}
	//------------------------------------------
	public int validaInclusao(int cDesc){
		int cont=0;
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao==cDesc){
				cont=cont+1;
			}
		}
		return cont;
	}
	//------------------------------------------
}