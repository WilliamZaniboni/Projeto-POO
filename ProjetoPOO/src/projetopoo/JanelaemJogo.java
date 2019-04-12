
package projetopoo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class JanelaemJogo extends JPanel implements MouseListener, MouseMotionListener{
    
    private Image background;
    private Image celula;
    private Image celula2;
    private Image et;
    private Image nave;
    
    private int x; //a posição do mouse percurso
    private int y; 
    
    private Tabuleiro tabuleiro;
    
    int constante=0; //conta os repaints (faz os ovnis se moverem)
    
    private int xpressionado; //a posição do mouse em que ele foi pressionado
    private int ypressionado; 
    
    private int xsolto; // a posição do mouse em que ele foi solto
    private int ysolto;
    
     
   
    public JanelaemJogo(){
        
        
        
        setFocusable(true);
        setDoubleBuffered(true);
        
       
        ImageIcon referencia  = new ImageIcon("imagens/provisorio.png");
        background = referencia.getImage();
        
        ImageIcon referencia2  = new ImageIcon("imagens/celula.png");
        celula = referencia2.getImage();
        
        ImageIcon referencia4  = new ImageIcon("imagens/celula2.png");
        celula2 = referencia4.getImage();
        
        ImageIcon referencia3  = new ImageIcon("imagens/ovni.png");
        et = referencia3.getImage();
        
        ImageIcon referencia5  = new ImageIcon("imagens/nave.png");
        nave = referencia5.getImage();
        
         addMouseListener( this );        
         addMouseMotionListener( this );
         
         
        
        
        //timer = new Timer(30, this);
       // timer.start();
       
       
        
    }
    
    @Override
    public void paint(Graphics g){
        
        
        Graphics2D graficos = (Graphics2D) g;
        
        
        graficos.drawImage(background, 0, 0, null);
        
        //graficos.drawImage(celula, 484, 154, this);
       // graficos.drawImage(et, 604, 120, this);
        
       
       
       
       
       
      // if(((this.x-484)/76==0)&&((this.y-154)/76==0)){
        //   graficos.drawImage(celula, 484, 154, this);
      // }
      
     if((this.x>=484) && (this.x<=1700) && (this.y<=762) && (this.y>=154)){
       
       graficos.drawImage(celula, 484+((this.x-485)/76)*76, 154+((this.y-155)/76)*76, this);
       
       //printando as celulas vermelhas
       
       /*
       for(int i=1;i<17;i++){
      
       if(484+((this.x-485)/76)*76-76*i>=484){
       graficos.drawImage(celula2, 484+((this.x-485)/76)*76-76*(i), 154+((this.y-155)/76)*76, this);
       }
       
       if(484+((this.x-485)/76)*76+76*i<1700){
       graficos.drawImage(celula2, 484+((this.x-485)/76)*76+76*(i), 154+((this.y-155)/76)*76, this);
       }
       
       if(154+((this.y-155)/76)*76-76*i>=154){
            graficos.drawImage(celula2, 484+((this.x-485)/76)*76, 154+((this.y-155)/76)*76-76*i, this);
       }
       
       if(154+((this.y-155)/76)*76+76*i<762){
            graficos.drawImage(celula2, 484+((this.x-485)/76)*76, 154+((this.y-155)/76)*76+76*i, this);
       }
     
      }
       */
      
       
     }
     
     //contante faz mexer o png
       
     if(1624-constante>1472){    
       constante++;
      
     }
     
     graficos.drawImage(et, 1624-constante, 458, null);
       
       //System.out.print("contante = "+constante);
     
     
     
       
       ///// printando o número do quadrante 
     
     Tabuleiro tabuleiro = new Tabuleiro(this.x, this.y);
     
     
     g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
     
     g.setColor(Color.white);
     
     g.drawString(tabuleiro.determinandoquadrante(), 30, 1030);
    
     
     //////////
        
     // printando os valores da posição do mouse    
        
     g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
     
     g.setColor(Color.white);
     
     String teste1 = "x="+this.x;
     String teste2 = "y="+this.y;
     
     g.drawString(teste1, 30, 970);
     g.drawString(teste2, 30, 1000);
     
     ///////
     
     //testando o arrastar do mouse
     
     
     if((this.xpressionado>=561) && (this.xpressionado<=810) && (this.ypressionado<=1016) && (this.ypressionado>=878)){
         //System.out.print("esta funcionando");
         
         graficos.drawImage(nave, 484+((this.xsolto-485)/76)*76, 154+((this.ysolto-155)/76)*76, this);
         
     }
     
     
     
     ////
     
     
      repaint();  
        
    }

   
    @Override
    public void mouseClicked(MouseEvent e) {
       System.out.println("x="+e.getX());
       System.out.println("y="+e.getY());
          
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
        this.x = e.getX();
        this.y = e.getY();
          
    }
    
    
    
    
}
