
package colegio;

/**
 *
 * @author Celi Leandro
 */
public class Materia 
{
    private int idMateria;
    private String nombre;
    private  int anio;

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
