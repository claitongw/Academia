public class ManterServicos {
	public int codDescricao;
	public String nomeDescricao;
	
	
	ManterServicos[] arrayServicos = new ManterServicos[15];
	


	public void incluirServicos(int cDesc, String nDesc){
		int incremento=0;
		arrayServicos[incremento] = new ManterServicos();
		arrayServicos[incremento].codDescricao=cDesc;
		arrayServicos[incremento].nomeDescricao=nDesc;
		System.out.println("Gravado!\nCód: "+cDesc+"|"+nDesc);
		incremento++;
	}
	

}
