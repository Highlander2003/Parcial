package modelo;


public class Departamento {
    private String nombre;
    private Departamento[] departamento;

    public Departamento(String nombre, int numDepartamento) {
        departamento = new Departamento[numDepartamento];
        for (int i = 0; i < numDepartamento; i++) {
            departamento[i] = new Departamento("Departamento " + (i + 1));
        }
    }
    public Departamento (String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public Departamento[] getDepartamento() {
        return departamento;
    }
    
}
