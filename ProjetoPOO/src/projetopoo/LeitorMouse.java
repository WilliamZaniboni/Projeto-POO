/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;


public class LeitorMouse extends JPanel implements MouseListener, MouseMotionListener {
    
    private int xmov=55; //a posição do mouse percurso
    private int ymov; 
    
    
    
    private int xpressionado; //a posição do mouse em que ele foi pressionado
    private int ypressionado; 
    
    private int xsolto; // a posição do mouse em que ele foi solto
    private int ysolto;
    
    private int xclicado;//a posição do mouse em que houve o click
    private int yclicado;
    int verificador = 0; //verificador click mouse

    public LeitorMouse() {
        
        
       //setFocusable(true);
       //setDoubleBuffered(true);
        
       addMouseListener( this );        
       addMouseMotionListener( this );
       
       System.out.println("Entrou no construtor");
       
       
    
    }
    
    public void startMouse(){
        
        
       
       
       System.out.println("x no mouse="+this.xmov);
    }

  
    public int getXmov() {
        return xmov;
    }

    
    public int getYmov() {
        return ymov;
    }

   

    public int getXpressionado() {
        return xpressionado;
    }

    

    public int getYpressionado() {
        return ypressionado;
    }

    

    public int getXsolto() {
        return xsolto;
    }

   

    public int getYsolto() {
        return ysolto;
    }

    

    public int getXclicado() {
        return xclicado;
    }

    

    public int getYclicado() {
        return yclicado;
    }

    

    public int getVerificador() {
        return verificador;
    }

    public void setVerificador(int verificador) {
        this.verificador = verificador;
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
      this.xclicado=e.getX();
      this.yclicado=e.getY();
          
    }
  
    @Override
    public void mouseEntered(MouseEvent e) {
        
          
    }
  
    @Override
    public void mouseExited(MouseEvent e) {
       
          
    }
  
    @Override
    public void mousePressed(MouseEvent e) {
        
        this.xpressionado = e.getX();
        this.ypressionado = e.getY();
        
      // System.out.println("Mouse pressionado em x="+e.getX());
      // System.out.println("Mouse pressionado em y="+e.getY());
          
    }
  
    @Override
    public void mouseReleased(MouseEvent e) {
        
        this.xsolto = e.getX();
        this.ysolto = e.getY();
        
       //System.out.println("Mouse solto em x="+e.getX());
       // System.out.println("Mouse solto em y="+e.getY());
          
    }
  
    @Override
    public void mouseDragged(MouseEvent e) {
       
          
    }
  
    @Override
    public void mouseMoved(MouseEvent e) {
        //System.out.println("x="+e.getX());
        this.xmov = e.getX();
        this.ymov = e.getY();
        System.out.println("Entrou no evento");  
    }
    
    
    
    
    
    
    
}
