
package ramascontornos;

import javax.swing.JOptionPane;


public class RamasContornos {

  
    public static void main(String[] args) {
        float base;
        float altura;
        float area;
        
        base=Float.parseFloat(JOptionPane.showInputDialog("base"));
        altura=Float.parseFloat(JOptionPane.showInputDialog("altura"));
        area=base*altura/2;
        System.out.println("area es:"+(base*altura));
        
        //añado primer comentario
        //añado segundo comentario
        //añado tercer comentario
        //estoy hasta las narices de hacer commit
    }
    
}
