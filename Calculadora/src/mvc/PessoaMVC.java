/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mvc;

import controller.PessoaController;
import view.PessoaView;

/**
 *
 * @author maiso
 */
public class PessoaMVC {
    
    public static void main(String[] args) {
        PessoaView view = new PessoaView();
        PessoaController controller = new PessoaController(view);
        view.setVisible(true);
    }
    
}
