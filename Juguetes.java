public class Juguetes{

private int precio;

private int edad;

private String nombre;

public Juguetes(){
this.nombre="";
this.edad=1;
this.precio=2;
}

public Juguetes(String nombre,int edad,int precio){

this.nombre=nombre;
this.edad=edad;
this.precio=precio;
}


public void setNombre(String nombre){
this.nombre=nombre;
}

public String getNombre(){

    return this.nombre;
}

public void setEdad(int edad){

    this.edad=edad;
}

public int getEdad(){
return this.edad;

}

public void setPrecio(int precio){
this.precio=precio;

}

public int getPrecio(){

    return this.precio;
}

public String informacion(){

    return "Juguete: "+this.nombre+"Edad recomendada: "+this.edad+"Precio: "+this.precio;
}



public static void main(String args[]){
ManejadorJuguetes manejador=new ManejadorJuguetes();
manejador.setInventario();
manejador.menu();


} 





}