
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
    
    private int xclicado;//a posição do mouse em que houve o click
    private int yclicado;
    int verificador = 0; //verificador click mouse
    
     
   
    public JanelaemJogo(){
        
        
        
        setFocusable(true);
        setDoubleBuffered(true);
        
       
        ImageIcon referencia  = new ImageIcon("imagens/fundoprovisoriohd.jpg");
        background = referencia.getImage();
        
        ImageIcon referencia2  = new ImageIcon("imagens/celulahd54.png");
        celula = referencia2.getImage();
        
        ImageIcon referencia4  = new ImageIcon("imagens/celula2hd54.png");
        celula2 = referencia4.getImage();
        
        ImageIcon referencia3  = new ImageIcon("imagens/ovnihd.png");
        et = referencia3.getImage();
        
        ImageIcon referencia5  = new ImageIcon("imagens/navehd.png");
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
        
        //graficos.drawImage(celula, 327, 88, this);
        //graficos.drawImage(et, 604, 120, this);
        
       
       
       
       
       
      // if(((this.x-484)/76==0)&&((this.y-154)/76==0)){
        //   graficos.drawImage(celula, 484, 154, this);
      // }
      
     if((this.x>=327) && (this.x<=1135) && (this.y<=517) && (this.y>=88)){
       
       graficos.drawImage(celula, 327+((this.x-327)/54)*54, 88+((this.y-88)/54)*54, this);
       
       //printando as celulas vermelhas
       
       /*
       for(int i=1;i<16;i++){
      
       if(327+((this.x-327)/54)*54-54*i>=327){
       graficos.drawImage(celula2, 327+((this.x-327)/54)*54-54*i, 88+((this.y-88)/54)*54, this);
       }
       
       if(327+((this.x-327)/54)*54+54*i<1135){
       graficos.drawImage(celula2, 327+((this.x-327)/54)*54+54*i, 88+((this.y-88)/54)*54, this);
       }
       
       if(88+((this.y-88)/54)*54-54*i>=88){
            graficos.drawImage(celula2, 327+((this.x-327)/54)*54, 88+((this.y-88)/54)*54-54*i, this);
       }
       
       if(88+((this.y-88)/54)*54+54*i<517){
            graficos.drawImage(celula2, 327+((this.x-327)/54)*54, 88+((this.y-88)/54)*54+54*i, this);
       }
     
      }
       
      */
       
     }
     
     //constante faz mexer o png
       
     if(1200-constante>759){    
       constante++;
      
     }
     
     graficos.drawImage(et, 1200-constante, 304, null);
       
       //System.out.print("contante = "+constante);
     
     
     
       
       ///// printando o número do quadrante 
     
     Tabuleiro tabuleiro = new Tabuleiro(this.x, this.y);
     
     
     g.setFont(new Font("TimesRoman", Font.PLAIN, 15));
     
     g.setColor(Color.white);
     
     g.drawString(tabuleiro.determinandoquadrante(), 20, 700);
    
     
     //////////
        
     // printando os valores da posição do mouse    
        
     g.setFont(new Font("TimesRoman", Font.PLAIN, 15));
     
     g.setColor(Color.white);
     
     String teste1 = "x="+this.x;
     String teste2 = "y="+this.y;
     
     g.drawString(teste1, 20, 660);
     g.drawString(teste2, 20, 680);
     
     ///////
     
     //testando o arrastar do mouse
     
     /*
     if((this.xpressionado>=561) && (this.xpressionado<=810) && (this.ypressionado<=1016) && (this.ypressionado>=878)){
         //System.out.print("esta funcionando");
         
         graficos.drawImage(nave, 484+((this.xsolto-485)/76)*76, 154+((this.ysolto-155)/76)*76, this);
         
     }
     */
     
     //// testando click do mouse
     
     if((this.xclicado>=380) && (this.xclicado<=553) && (this.yclicado<=677) && (this.yclicado>=586)){
         //System.out.print("esta funcionando");
         
         verificador=1;
         
         graficos.drawImage(nave,this.x, this.y, this);
         
         //int p1 = this.xclicado;
         //int p2 = this.yclicado;
         
        // graficos.drawImage(nave, 484+((this.xclicado-485)/76)*76, 154+((this.yclicado-155)/76)*76, this);
         
     }else if (verificador == 1){
         graficos.drawImage(nave,327+((this.xclicado-327)/54)*54, 88+((this.yclicado-88)/54)*54, this);
         
         //verificador=0;
         
     }
     
     
     
     
     
     ////////
     
      repaint();  
        
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
        this.x = e.getX();
        this.y = e.getY();
          
    }
}
    
    