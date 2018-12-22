import java.util.Random;
public class Batallas{

private Enemigos[] listaEnemigos;
private Jugador[] listaJugador;
private Caminos[] listaCaminos;
private Caminos[] mapa;
private int numero;

public Batallas(){
    listaJugador=new Jugador[1];
    listaCaminos=new Caminos[6];
    listaEnemigos=new Enemigos[5];
    mapa=new Caminos[numero];
    //////////////////////////////////Lista de diferentes tipos de pasillos
    listaCaminos[0]=new Caminos(false,false,false);
    listaCaminos[1]=new Caminos(true,false,false);
    listaCaminos[2]=new Caminos(false,true,false);
    listaCaminos[3]=new Caminos(false,false,true);
    listaCaminos[4]=new Caminos(true,true,false);
    listaCaminos[5]=new Caminos(false,false,true);
    ////////////////////////////////////////////////Lista de enemigos
    listaEnemigos[0]=new Enemigos("Esqueleto",500,20);
    listaEnemigos[1]=new Enemigos("Serpiente",500,20);
    listaEnemigos[2]=new Enemigos("Babosa",500,20);
    listaEnemigos[3]=new Enemigos("Fantasma",500,20);
    listaEnemigos[4]=new Enemigos("Cocodrilo",500,20);
    }

/////Dificultad del mapa
public void setDificultad(int numero){

    this.numero=numero;
}


public Enemigos getEnemigos(int random){

    return listaEnemigos[random];
}

///Muestra informacion de un enemigo
public String eneInformacion(int random){
String info="";
info=listaEnemigos[random].getInformacion();

return info;
}

///Declara el primer mapa como una escena para avanzar hacia adelante
public void inicioMapa(int caminos,int pos){

    listaCaminos[pos]=listaCaminos[caminos];
}

///retorna el ataque de un enemigo
public int atkEnemigo(int random){
int actual=0;
actual=listaEnemigos[random].getAtk();

return actual;
}

/*public void avanceMapa(int caminos,int pos){

    mapa[pos]=listaCaminos[caminos];
}*/


///Retorna el ataque base del jugador
public int atkJugador(){
    int actual=0;
    actual=listaJugador[0].getAtk();
    
    return actual;
    }

////Revisa si se cumplen las condiciones para ganar una batalla
public boolean checkGanar(int random,boolean ganar){

    if(listaEnemigos[random].getHp()>=1){
        return false;

    }else{
        return true;

    }
}

//

public boolean checkCamino(String direccion,int pos,int caminos){
boolean avanzar=false;
if(direccion=="a"||direccion=="w"||direccion=="d"||direccion=="s"){
    if(direccion=="w"){
        if(listaCaminos[caminos].getCentro()==true){
            pos++;

            return avanzar=true;
        }else{
            return avanzar=false;
        }

    }

    if(direccion=="a"){
        if(listaCaminos[caminos].getIzquierda()==true){
            pos++;

            return avanzar=true;
        }else{
            return avanzar=false;
        }

    }

    if(direccion=="d"){
        if(listaCaminos[caminos].getDerecha()==true){
            pos++;

            return avanzar=true;
        }else{
            return avanzar=false;
        }

    }


}
return avanzar;
}

public String checkAvanzar(boolean avanzar){

    if(avanzar=false){

        return "No puedes pasar por ese lugar";
    }else{

        return "Has avanzado por el pasadizo";
    }
}


/*public Enemigos llenarEnemigo(int random,Enemigos enemigo){

this.listaEnemigos[random]=enemigo;

return enemigo;
}*/

///Inicia al jugador
public Jugador llenarJugador(Jugador jugador){
    
    this.listaJugador[0]=jugador;
    return jugador;
    }


///Se encarga del procesamiento de las batallas   
public String batalla(int atkE,int atkJ,int random,boolean jugador){

if(jugador==true){

int vida=listaEnemigos[random].getHp();

vida=listaEnemigos[random].getHp()-atkJ;

listaEnemigos[random].setHp(vida);

return listaEnemigos[random].getNombre()+" ha recibido "+atkJ+" de dano!\n\nVida restante: "+listaEnemigos[random].getHp();

}else{
    int vidaJ=listaJugador[0].getHp();

    vidaJ=listaJugador[0].getHp()-atkE;

    listaJugador[0].setHp(vidaJ);

    return "Has recibido "+atkE+" de dano!\n\nVida restante: "+listaJugador[0].getHp();
}

}











}
