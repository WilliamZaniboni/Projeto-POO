
package projetopoo;

public class Tabuleiro {
    
    private int x;
    private int y;
    

    public Tabuleiro(int xmatriz, int ymatriz) {
        this.x = xmatriz;
        this.y = ymatriz;
    }
    
    public String determinandoquadrante(){
        
        String aviso ;
        
        if(this.x<327 ){
            aviso = "Quadrante: null";
        }
        else if(this.x>1135){
            aviso = "Quadrante: null";
        }
        else if(this.y<88){
            aviso = "Quadrante: null";
        }
        else if(this.y>517){
            aviso = "Quadrante: null";
        }
        else{
           aviso = "Quadrante: ["+(this.x-327)/54+"]["+(this.y-88)/54+"]";
        }
        
        
        return aviso;
    }
    
   
    
    
}
