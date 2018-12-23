import java.util.Random;
public class ManejadorJuego{

private VistaJuego vista;
private Batallas batallas;
private Jugador jugador1;

public ManejadorJuego(){
this.vista=new VistaJuego();
this.batallas=new Batallas();
this.jugador1=new Jugador();
}


public void inicioJuego(){
    int opcion=0;
    opcion=vista.getMenu("Escoge una dificultad\n\n1.Facil\n2.Medio\n3.Dificil\n4.Leyenda");

    do{

    switch (opcion){
        case 1:
        int dificultad=40;
        batallas.setDificultad(dificultad);
        break;

        case 2:
        dificultad=50;
        batallas.setDificultad(dificultad);
        break;

        case 3:
        dificultad=60;
        batallas.setDificultad(dificultad);
        break;

        case 4:

        dificultad=100;
        batallas.setDificultad(dificultad);
        break;

        
    }}while(opcion>=5);

    String nom="";
    vista.mensaje("Te has perdido en estas oscuras y misteriosas ruinas.\nYa sabes lo que esto significa;sin embargo no piensas rendirte tan facilmente.\nEstas dispuesto a todo con tal de salir con vida de este lugar.\n\n\nPor culpa del panico al haber perdido a tu grupo de expedicion,casi has olvidado tu nombre");
    nom=vista.getM("Cual es tu nombre?");
    jugador1.setNombre(nom);
    juego();

 }


 public void juego(){
int opcion=0;
boolean jugador;
boolean avanzar=false;
int caminos=2;
int encuentros1=0;
int enemigos1=0;
int pos=0;
batallas.inicioMapa(caminos,pos);
Random random = new Random();
Random encuentros=new Random();
Random enemigos=new Random();
String direccion;
do{

direccion=vista.getM("Escoge una direccion para desplazarte");
caminos=random.nextInt(5);
avanzar=batallas.checkCamino(direccion, pos, caminos);
//batallas.avanceMapa(caminos, pos);
vista.mensaje(batallas.checkAvanzar(avanzar));
encuentros1=encuentros.nextInt(100);
}while(encuentros1<=80);
////////////////////////////////////////////
//if(encuentros1<=100){
vista.mensaje("Un enemigo ha aparecido!");
Batallas batalla1=new Batallas();
enemigos1=enemigos.nextInt(5);

    vista.mensaje(batalla1.eneInformacion(enemigos1));
    //batallas.llenarEnemigo(enemigos1,enemigo);
    batalla1.llenarJugador(jugador1);
    
    do{
    
    opcion=vista.getMenu("Escoge una accion:\n\n1.Atacar\n2.Huir");
    int atkE=batalla1.atkEnemigo(enemigos1);
    int atkJ=batalla1.atkJugador();
    boolean ganar=false;
    switch(opcion){

        case 1:
        while(ganar==false){
        jugador=true;
        vista.mensaje(batalla1.batalla(atkE, atkJ,enemigos1,jugador));
        ganar=batalla1.checkGanar(enemigos1,ganar);
        jugador=false;
        vista.mensaje(batalla1.batalla(atkE, atkJ,enemigos1,jugador));
        break;
        }
    

    while(ganar==true){
        vista.mensaje("Has vencido al enemigo!");
        juego();
        }
        break;


        case 2:
        
        vista.mensaje("Has logrado escapar!");
        juego();
        break;
    }

}while(opcion!=3);



}

}
