package institucioneseducativas;


public class Ejecutor {
    public static void main(String[] args) {
        
        // Creamos un objeto de tipo InstitucionesEducativas
        InstitucionesEducativas Institucion = new InstitucionesEducativas();
        
        // Valores de entrada
        String nombre = "Unidad Educativa 'Daniel Chalan'";
        String tipoInstitucion = "Publica";
        int numeroAlumnos = 350;
        int numeroDocentes = 30;
        int numeroSedes = 1;
        double gastoProyectado = 250;
        
        
        Institucion.establecerNombre(nombre);
        Institucion.establecerTipoInstitucion(tipoInstitucion);
        Institucion.establecerNumeroAlumnos(numeroAlumnos);
        Institucion.establecerNumeroDocentes(numeroDocentes);
        Institucion.establecerNumeroSedes(numeroSedes);
        Institucion.establecerGastoProyectado(gastoProyectado);
        
        Institucion.calcularPresupuesto();
        
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
        System.out.printf("\tDatos Institucionales\n"
                + "\nNombre: %s\n"
                + "Tipo de institucion: %s\n"
                + "Numero de alumnos: %d\n"
                + "Numero de docentes: %d\n"
                + "Numero de Sedes: %d\n"
                + "Gasto proyectado por estudiante: %.2f\n"
                + "Presupuesto: %.2f\n"
                , Institucion.obtenerNombre(),
                Institucion.obtenerTipoInstitucion(), 
                Institucion.obtenerNumeroAlumnos(),
                Institucion.obtenerNumeroDocentes(),
                Institucion.obtenerNumeroSedes(),
                Institucion.obtenerGastoProyectado(),
                Institucion.obtenerCalcularPresupuesto());
        
    }
}
