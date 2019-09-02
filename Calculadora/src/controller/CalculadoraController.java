package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CalculadoraModel;
import view.CalculadoraView;

/**
 *
 * @author maison
 */
public class CalculadoraController {
    
    private CalculadoraView view;

    public CalculadoraController(CalculadoraView view) {
        this.view = view;
        this.view.btnSomarListener(new SomarListener());
        this.view.setVisible(true);
    }
    
    class SomarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           try{
             double num1 = Double.parseDouble(view.getNumero1());
             double num2 = Double.parseDouble(view.getNumero2());
             CalculadoraModel model = new CalculadoraModel();
             model.setNum1(num1);
             model.setNum2(num2);
             double resultado = model.somar();
             view.setJtfresultado(Double.toString(resultado));
           }catch(NumberFormatException ex){
               view.DisplayMensagemDeErro("Entre com dois valores númericos");
               
           }
        }
        
    }


    
    
    
    
    
}
