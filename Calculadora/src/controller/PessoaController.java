/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import model.PessoaModel;
import view.PessoaView;

/**
 *
 * @author maiso
 */
public class PessoaController {
    
    private PessoaView view;
    
    public PessoaController(PessoaView view) {
        this.view = view;
        this.view.btnCalcularidadeListener(new CalcularIdadeListener());
        this.view.setVisible(true);
    }
    
    class CalcularIdadeListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           try{
             String txtdataNascimento = view.getJtfdatanascimento();
             DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
             LocalDate dataNascimento = LocalDate.parse(txtdataNascimento,formatador);
             
             PessoaModel model = new PessoaModel();
             model.setDataNascimento(dataNascimento);
             
             int anoAtual = LocalDate.now().getYear();
             int idade = model.calcIdade(anoAtual);
             double resultado = model.calcIdade(2019);
             view.setJtfresultado(Integer.toString(idade));
           }catch(NumberFormatException ex){
               view.DisplayMensagemDeErro("Entre com dois valores númericos");
               
           }
        }
        
    }
    
}
