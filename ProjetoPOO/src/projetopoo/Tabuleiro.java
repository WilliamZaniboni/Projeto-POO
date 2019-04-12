
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
        
        if(this.x<484 ){
            aviso = "Quadrante: null";
        }
        else if(this.x>1700){
            aviso = "Quadrante: null";
        }
        else if(this.y<154){
            aviso = "Quadrante: null";
        }
        else if(this.y>762){
            aviso = "Quadrante: null";
        }
        else{
           aviso = "Quadrante: ["+(this.x-484)/76+"]["+(this.y-154)/76+"}";
        }
        
        
        return aviso;
    }
    
   
    
    
}
