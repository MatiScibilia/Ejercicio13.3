package arbolBinario;

public class gato {

    String Nombre, Raza;
   

    public gato(String Nombre, String Dueño){
        
        this.Nombre=Nombre;
        this.Raza=Raza;
        
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return this.Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    
    public String toString() {
        return " Nombre:'" + getNombre() + "'" + ",Raza:'" + getRaza() + "'";
    }
}
