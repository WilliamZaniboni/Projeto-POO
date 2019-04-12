/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
  
public class MouseTracker  extends JFrame
implements MouseListener, MouseMotionListener {
  
    JLabel mousePosition;
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }
  
    @Override
    public void mouseEntered(MouseEvent e) {
       
    }
  
    @Override
    public void mouseExited(MouseEvent e) {
         
    }
  
    @Override
    public void mousePressed(MouseEvent e) {
         
    }
  
    @Override
    public void mouseReleased(MouseEvent e) {
          
    }
  
    @Override
    public void mouseDragged(MouseEvent e) {
          
    }
  
    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();//pega as coordenadas do mouse
        int y = e.getY();
        System.out.printf("x", x);  
    }
  
   
    public void start()
    {
       //  mousePosition = new JanelaemJogo();
         addMouseListener( this );        // listens for own mouse and
         addMouseMotionListener( this );  // mouse-motion events
        
          add(mousePosition);
          
          setUndecorated(true);
          setVisible( true );
          setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}