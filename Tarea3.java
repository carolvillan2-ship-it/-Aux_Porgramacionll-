
package auxiliatura;

public class Television {
    private String marca; 
    private int resolucion; 
    private String tipo; 
    
    public Television(String x, int y, String z){
        this.marca = x; 
        this.resolucion = y; 
        this.tipo = z ; 
    }
    public Television(){
        
    }
    public String toString(){
        return "marca: " + this.marca + " resolucion: " + this.resolucion + " tipo: " + this.tipo;
    }
    
    
}
