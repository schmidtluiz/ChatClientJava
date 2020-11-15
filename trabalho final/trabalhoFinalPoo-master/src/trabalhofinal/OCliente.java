package trabalhofinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JFrame;

/**
 *
 * @author old_adam
 */
public class OCliente {
    /**
     * Ponto de entrada da execucao do app.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelaLogin tela = new TelaLogin();
        JFrame frame = new JFrame();
        frame.setSize(539, 389); // Set the size of the window
        frame.add(tela);
        frame.setVisible(true);
        
    }
    
}
