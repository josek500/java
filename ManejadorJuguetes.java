public class ManejadorJuguetes{

    private VistaJuguetes vista;
    private RegistroJuguetes registro;



public ManejadorJuguetes(){
    
this.registro=new RegistroJuguetes();    
this.vista=new VistaJuguetes();
setInventario();
menu();
}

public void setInventario(){

    registro.setCant(this.vista.inNum("Escriba la cantidad de juguetes para el inventario"));
    System.out.println("dfdf"+registro.getCantidad());
}


public void menu(){

Juguetes ju=new Juguetes();

int opcion=0;


do{

    opcion=vista.inNum("Escoja una opcion:\n1.Agregar juguete.\n2.Ver lista de jueguetes");

switch(opcion){

    case 1:

    registro.llenarJuguetes();
    ju.setNombre(this.vista.inM("Escriba el nombre del juguete"));
    ju.setEdad(this.vista.inNum("Ingrese la edad recomendada para usar el juguete"));
    ju.setPrecio(this.vista.inNum("Ingrese el precio del juguete"));
    this.vista.outM(this.registro.addJuguete(ju));


    break;

    case 2:

    this.vista.outM(registro.imprimirLista());

    break;
}

}while(opcion!=5);


}

}
