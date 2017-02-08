/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;
import milibreria.Milibreria;
import javax.swing.JOptionPane;

/**
 *
 * @author ped90
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        libreria cliente = new libreria();
        
        int opcion;
        do{
        opcion= Integer.parseInt(JOptionPane.showInputDialog("1) Añadir libros.\n2) Stock de libros.\n3) Dar de baja un libro. \n4) Venta. \n5) Consulta. \n0) Salir."));
        switch(opcion){
            case 1:
                cliente.añadirlibros(new libros(Milibreria.añadirtitulo(),Milibreria.añadirautor(),Milibreria.añadirisbn(),Milibreria.añadirprecio(),Milibreria.añadirunidades()));
                break;
            case 2:
                cliente.mostrar();
                break;
            case 3:
                cliente.baja(new libros(Milibreria.añadirtitulo(),Milibreria.añadirautor(),Milibreria.añadirisbn(),Milibreria.añadirprecio(),Milibreria.añadirunidades()));
                break;
            case 4:
                cliente.venta(new libros(Milibreria.añadirtitulo(),Milibreria.añadirautor(),Milibreria.añadirisbn(),Milibreria.añadirprecio(),Milibreria.añadirunidades()));
                break;
            case 5:
                cliente.consulta();     
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Pulse aceptar para salir");
                System.exit(0); 
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error");
        }
    }while(opcion!=0);
    }
    
    
    
    
    
}
    

