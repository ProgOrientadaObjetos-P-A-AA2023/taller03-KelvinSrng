package institucioneseducativas;


public class InstitucionesEducativas {
    
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastoProyectado;
    private double presupuesto;
    
    
    public void establecerNombre(String x){
        nombre = x;
    }
     
    public void establecerTipoInstitucion(String x){
        tipoInstitucion = x;
    }
    
    public void establecerNumeroAlumnos(int x){
        numeroAlumnos = x;
    }
    
    public void establecerNumeroDocentes(int x){
        numeroDocentes = x;
    }
    
    public void establecerNumeroSedes(int x){
        numeroSedes = x;
    }
    
    public void establecerGastoProyectado(double x){
        gastoProyectado = x;
    }
    
    public void calcularPresupuesto(){
        presupuesto = numeroAlumnos * gastoProyectado;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
     
    public String obtenerTipoInstitucion(){
        return tipoInstitucion;
    }
    
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
    
    public int obtenerNumeroDocentes(){
        return numeroDocentes;
    }
    
    public int obtenerNumeroSedes(){
        return numeroSedes;
    }
    
    public double obtenerGastoProyectado(){
        return gastoProyectado;
    }
    
    public double obtenerCalcularPresupuesto(){
        return presupuesto;
    }
}
