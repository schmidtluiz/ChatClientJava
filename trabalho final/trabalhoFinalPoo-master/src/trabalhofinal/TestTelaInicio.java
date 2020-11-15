/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

/**
 *
 * @author Gustavo
 */
public class TestTelaInicio {
    public static void main(String args[]){
        String nomeUsuario = "Gustavo";
        JanelaPrincipal janela;
        janela = new JanelaPrincipal(nomeUsuario);

        janela.setVisible(true);

    }
 }
