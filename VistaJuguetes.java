import javax.swing.JOptionPane;

public class VistaJuguetes{


    public void outM(String msj){

     JOptionPane.showMessageDialog(null,msj);   
    }

    public String inM(String msj){

        return JOptionPane.showInputDialog(msj);
    }

    public int inNum(String msj){

        return Integer.parseInt(JOptionPane.showInputDialog(msj));
    }














}