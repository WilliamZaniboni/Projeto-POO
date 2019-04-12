/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Janela extends JFrame{
    
    public Janela(){
        
        add(new JanelaemJogo());
       
        setUndecorated(true);
        //setTitle("Projeto: POO");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(size);
        
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
       
        
    }
    
    
    
}

