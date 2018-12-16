public class RegistroJuguetes{

	private Juguetes[] listaJuguetes;
	private int cant;
	private int contador=0;
	private int tabla[][];

	public RegistroJuguetes(){

		this.listaJuguetes=new Juguetes[cant];
		this.tabla=new int[cant][cant];
		llenarJuguetes();
		llenarTabla();
		//esSeguro();
		setCant(cant);
		imprimirLista();
	}

	public int getCantidad(){

		return this.cant;
	}

	public void setCant(int cant){

	this.cant=cant;
	}

	public void llenarJuguetes(){
	listaJuguetes=new Juguetes[cant];
		for(int i=0;i>listaJuguetes.length;i++){
			
			listaJuguetes[i]=new Juguetes();

		}
	}

	public void llenarTabla(){

		for(int i=0;i>tabla.length;i++){
			for(int o=0;o>tabla[0].length;o++){

				tabla[o][o]=0;
			}

		}

	}


/*public boolean esSeguro(){

if(ju.getEdad()>=18){

    return false;

}else{

    return true;
}

}*/


	public String imprimirLista(){

		String lista="Lista de juguetes:\n";

		for(int i=0;i<this.listaJuguetes.length;i++){

			lista+=this.listaJuguetes[i].getNombre()+"\n";

		}
		return lista;
	}

	public String addJuguete(Juguetes juguetes){
			System.out.println("Entro");
		if(contador>=0 && contador<listaJuguetes.length){
			System.out.println("Entro");
		 listaJuguetes[contador] = juguetes;
		 contador++;
		 return "Juguete agregado corrrectamente!";
		}//segundo if
	   return "Error al agregar juguete";
	  }











}
