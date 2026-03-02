package auxiliatura;

public class Instrumentos {
    public String nombre; 
    private String material; 
    private String tipo; 
    
    public Instrumentos(String x,String y, String z){
        this.nombre = x; 
        this.material = y; 
        this.tipo = z; 
    }
    public String toString(){
        return "nombre: " + this.nombre + " material: " + this.material + " tipo: " + this.tipo; 
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getMaterial(){
        return this.material;
    }
    public String gettipo(){
        return this.tipo;
    }
    public void setNombre(String x){
        this.nombre = x; 
    }
    public void setMaterial(String x){
        this.material = x; 
    }
    public void setTipo(String x){
        this.tipo = x; 
    }
}
