public class ManterServicos {
	public int codDescricao;
	public String nomeDescricao;
	public static Mensagens msg = new Mensagens();
	
	private int incremento=0;
	private int cont=0;
	
	ManterServicos[] arrayServicos = new ManterServicos[15];//máximo 15 serviços
	
	//------------------------------------------------------------------------------------
	public void incluirServicos(int c, String n){
		arrayServicos[incremento] = new ManterServicos();
		arrayServicos[incremento].codDescricao=c;
		arrayServicos[incremento].nomeDescricao=n;
		incremento=incremento+1;
		msg.mensagemPopUp("Incluido com Sucesso");
	}
	//------------------------------------------------------------------------------------
	public void alterarServicos(int cDescAlterar, int cDescNovo, String nDescNovo){
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao==cDescAlterar){
				arrayServicos[x].codDescricao=cDescNovo;
				arrayServicos[x].nomeDescricao=nDescNovo;
				cont=cont+1;
				msg.mensagemPopUp("Alterado com Sucesso");
			}	
		}
		if(cont==0)
			msg.mensagemPopUp("O código informado não existe!");
	}
	//--------------------------------------------------CONSULTA POR CÓDIGO DO SERVIÇO
	public void consultarServicos(int cDescConsultar){
		int cont2=1;
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao==cDescConsultar){
				System.out.println(arrayServicos[x].codDescricao+" | "+arrayServicos[x].nomeDescricao);
				
			}else{
				cont2=cont2+1;
			}
		}
		if(cont2>1)
		msg.mensagemPopUp("O Código informado não existe!");
	}
	//----------------------------------------------------CONSULTA POR NOME DO SERVIÇO
	public void consultarServicos(String nDescConsultar){
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].nomeDescricao.equals(nDescConsultar)){
				System.out.println(arrayServicos[x].codDescricao+" | "+arrayServicos[x].nomeDescricao);
			}else{
				cont=cont+1;
			}
		}
		if(cont==0)
		msg.mensagemPopUp("O Código informado não existe!");
	}
	//------------------------------------------------------------------------------------
	public void excluirServicos(int cDescExcluir){		
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao==cDescExcluir){
				arrayServicos[x]=new ManterServicos();
			}
		}
		msg.mensagemPopUp("Serviço excluido com sucesso!");
	}
	//------------------------------------------------------------------------------------
	public void listarServicos(){
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao!=0)
			System.out.println(arrayServicos[x].codDescricao+" | "+arrayServicos[x].nomeDescricao);
		}
	}
	//------------------------------------------------------------------------------------
	public int validaInclusao(int cDesc){
		int cont=0;
		for(int x=0;arrayServicos[x]!=null;x++){
			if(arrayServicos[x].codDescricao==cDesc){
				cont=cont+1;
			}
		}
		return cont;
	}
	//------------------------------------------------------------------------------------
}