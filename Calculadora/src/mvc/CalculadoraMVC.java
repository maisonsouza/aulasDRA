/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controller.CalculadoraController;
import view.CalculadoraView;

/**
 *
 * @author maison
 */
public class CalculadoraMVC {
    
    public static void main(String[] args) {
        CalculadoraView view = new CalculadoraView();
        CalculadoraController controller = new CalculadoraController(view);
    }
    
}
