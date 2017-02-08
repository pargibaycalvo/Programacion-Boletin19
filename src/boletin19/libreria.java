/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import milibreria.Milibreria;

/**
 *
 * @author ped90
 */
public class libreria {
    
    ArrayList<libros> lista = new ArrayList();

    public void añadirlibros(libros b) {

        lista.add(b);
    }
    public void mostrar(){
        Iterator <libros> ped=lista.iterator();
    while(ped.hasNext()){
            System.out.println(ped.next());
}
    }
    public void venta(libros lib){
        for(int i=0;i<lista.size();i++){
           if(lib.ISBN.equals(lista.get(i).ISBN)){  
             if(lista.get(i).getUnidades()>=lib.unidades){
                 lista.get(i).setUnidades((lista.get(i).unidades -lib.unidades ));
             }else
                 System.out.println("No se puede realizar la opración deseada");
        }
        }
    }
    public void baja(libros lib){
        if (lista.size() == 0) {
            JOptionPane.showMessageDialog(null, "No hay libros para borrar.");
        }
        for(int i=0;i<lista.size();i++){
        if(lista.get(i).getUnidades()==0)
            lista.remove(i);

    }
}
    public void consulta(){
        if(lista.contains(new libros(Milibreria.añadirtitulo(),Milibreria.añadirautor(),Milibreria.añadirisbn(),Milibreria.añadirprecio(),Milibreria.añadirunidades()))){
            System.out.println("Este libro está disponible");
        }
        else 
            System.out.println("Este libro no está disponible");
  
    }
    
      

   
    }
    

