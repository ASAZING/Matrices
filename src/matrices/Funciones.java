/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.ArrayList;

/**
 *
 * @author luffynando
 */
public class Funciones {
    private int valor;
    
    public void setMatrizIngresar(ArrayList<java.awt.TextField> campos, int tipo){
        this.valor = tipo;
        
        for (int i=0; i<campos.size();i++){
            campos.get(i).setVisible(false);
        }
        
        switch(tipo){
            case 1:
                //caso de 2x2
                campos.get(0).setVisible(true);//im11
                campos.get(1).setVisible(true);//im12
                campos.get(4).setVisible(true);//im21
                campos.get(5).setVisible(true);//im22
                break;
            case 2:
                //caso de 3x3
                campos.get(0).setVisible(true);
                campos.get(1).setVisible(true);
                campos.get(2).setVisible(true);
                campos.get(4).setVisible(true);
                campos.get(5).setVisible(true);
                campos.get(6).setVisible(true);
                campos.get(8).setVisible(true);
                campos.get(9).setVisible(true);
                campos.get(10).setVisible(true);
                break;
            case 3:
                for (int i=0; i<campos.size();i++){
                        campos.get(i).setVisible(true);
                }
                break;
        }
        
    }
    
    public int getTipo(){
        return valor;
    }
    
    
}
