
package ListasSimples;


public class Persona {
    private int id;
    private String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Persona(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString(){
     return "Persona{"+"id="+id+", nombre="+nombre+"}";   
    }
    
    
    
}
